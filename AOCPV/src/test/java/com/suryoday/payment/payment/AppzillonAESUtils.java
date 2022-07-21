package com.suryoday.payment.payment;

import java.security.MessageDigest;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.LogManager;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;

public class AppzillonAESUtils {

    private static final String SHA_1 = "SHA-1";
	private static final String UTF_8 = "UTF-8";
    private static final String AES = "AES";

    private static final  String PBS_PADDING = "AES/CBC/PKCS5padding";
	
	 private static Logger LOG = LoggerFactory.getLogger(AppzillonAESUtils.class);

    public static String encryptString(String pkey, String poriginalstring) {
    	LOG.debug("encryting String ");
        String encyptedstring = "";
        try {
            byte[] key = (pkey).getBytes(UTF_8);

            MessageDigest sha = MessageDigest.getInstance(SHA_1);
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16); // use only first 128 bit
            LOG.debug("Key for encrytion:" + new String(key));
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, AES);

            Cipher cipher = Cipher.getInstance(AES);
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            byte[] encrypted = cipher.doFinal((poriginalstring).getBytes());

            encyptedstring = Base64.encodeBase64String(encrypted);
            LOG.debug( "length encrypted string: "
                    + encyptedstring.length());

        } catch (UnsupportedEncodingException e) {
            LOG.error("UnsupportedEncodingException", e);
        } catch (InvalidKeyException e) {
        	LOG.error( "InvalidKeyException", e);
        } catch (NoSuchAlgorithmException e) {
        	LOG.error( "NoSuchAlgorithmException", e);
        } catch (BadPaddingException e) {
        	LOG.error("BadPaddingException", e);
        } catch (IllegalBlockSizeException e) {
        	LOG.error("IllegalBlockSizeException", e);
        } catch (NoSuchPaddingException e) {
        	LOG.error("NoSuchPaddingException", e);
        }
        return encyptedstring;
    }

    public static String decryptString(String pkey, String pencrypted) {
    	LOG.debug("Decrypting String ");
        String originalString = "";
        try {
            byte[] key = (pkey).getBytes(UTF_8);

            MessageDigest sha = MessageDigest.getInstance(SHA_1);
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16); // use only first 128 bit
            LOG.debug("Key for encrytion:" + new String(key));
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, AES);

            Cipher cipher = Cipher.getInstance(AES);
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            byte[] original = cipher.doFinal(Base64.decodeBase64(pencrypted));
            originalString = new String(original);
            LOG.debug("originalString: " + originalString);

        } catch (UnsupportedEncodingException e) {
            LOG.error( "UnsupportedEncodingException",e);
        } catch (InvalidKeyException e) {
        	LOG.error( "InvalidKeyException",e);
        } catch (NoSuchAlgorithmException e) {
        	LOG.error( "NoSuchAlgorithmException",e);
        } catch (BadPaddingException e) {
        	LOG.error( "BadPaddingException",e);
        } catch (IllegalBlockSizeException e) {
        	LOG.error("IllegalBlockSizeException",e);
        } catch (NoSuchPaddingException e) {
        	LOG.error( "NoSuchPaddingException",e);
        }
        return originalString;

    }

    
     public static String getExpirableKey(boolean eXPInMin,boolean eXPInHr,boolean eXPInDay) {

        Timestamp t = new Timestamp(new Date().getTime());

        Calendar lCalendar = Calendar.getInstance();
        lCalendar.setTimeInMillis(t.getTime());
        if( eXPInMin){
        lCalendar.set(Calendar.SECOND, 0);
        lCalendar.set(Calendar.MILLISECOND, 0);
        }else if ( eXPInHr){
        	 lCalendar.set(Calendar.MINUTE, 0);
             lCalendar.set(Calendar.SECOND, 0);
             lCalendar.set(Calendar.MILLISECOND, 0);
        	
        }else if ( eXPInDay){
        	 lCalendar.set(Calendar.HOUR_OF_DAY, 0);
             lCalendar.set(Calendar.MINUTE, 0);
             lCalendar.set(Calendar.SECOND, 0);
             lCalendar.set(Calendar.MILLISECOND, 0);
        }
        Timestamp date = new Timestamp(lCalendar.getTimeInMillis());
        return  date.toString();
    }
     
  // key generator method
 	public static byte[] hmacSha1(String salt, String key) {
 		SecretKeyFactory factory = null;
 		Key keyByte = null;
 		try {
 			factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
 			KeySpec keyspec = new PBEKeySpec(key.toCharArray(),
 					salt.getBytes("UTF-8"), 2, 128);
 			keyByte = factory.generateSecret(keyspec);
 		} catch (NoSuchAlgorithmException e) {
 			//e.printStackTrace();
 		} catch (InvalidKeySpecException e) {
 			//e.printStackTrace();
 		}
 		catch (UnsupportedEncodingException e) {
 			LOG.error("Exception",e);
 		}
 		return keyByte.getEncoded();
 	}

 	// encryption method
 	public  static String encryptString(String cypher, String key,String clearText, String salt,byte[] iv) {
 		SecretKeySpec skeySpec = null;
 		skeySpec = new SecretKeySpec(hmacSha1(salt, key), "AES");
 		try {
 			Cipher cipher = Cipher.getInstance(cypher);
 			//iv = ivText.getBytes();
 			// random.nextBytes(iv);
 			IvParameterSpec ivParams = new IvParameterSpec(iv);
 			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParams);
 			byte[] encryptedData = cipher.doFinal(clearText.getBytes("UTF-8"));
 			if (encryptedData == null)
 				return null;
 			return Base64.encodeBase64String(encryptedData);
 		} catch (Exception e) {
 			LOG.error( "Exception",e);
 		}
 		return null;
 		/**/
 	}

 	// decryption method
 	public  static String decryptString(String cypher, String key,
 			String textToDecrypt, String salt,byte[] iv) {
 		LOG.debug("Cipher -:" + cypher + ", key:"+ key + ", texToDecrypt :" + textToDecrypt + ", salt :" + salt + ", iv:" + iv + ", OS -:");
 		SecretKeySpec skeySpec = null;
 		
 		skeySpec = new SecretKeySpec(hmacSha1(salt, key), "AES");
 		
 		try {
 			Cipher cipher = Cipher.getInstance(cypher);
 			IvParameterSpec ivParams = new IvParameterSpec(iv);
 			cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParams);
 			byte[] plaintext = cipher.doFinal(Base64.decodeBase64(textToDecrypt));
 			String plainrStr = new String(plaintext, "UTF-8");
 			return new String(plainrStr);
 		} catch (Exception e) {
 			LOG.error("Exception",e);
 		}
 		return null;
 	}
 	/**
	 * prepares the IV from key
	 * @param key
	 * @return
	 */
	public static byte[] getIV(String key) {
		byte[]iv = new byte[16];
		java.util.Arrays.fill(iv, (byte)0);
		StringBuffer or = new StringBuffer(key);
		String nw = or.reverse().toString();
		byte[]keyBytes = null;
		try {
			keyBytes = nw.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			//e.printStackTrace();
		}
		byte[]rawIV = new byte[keyBytes.length];
		for (int i = 0; i < keyBytes.length; i++) {
			rawIV[i] = (byte)(keyBytes[i] >> 1);
		}
		for (int i = 0; i < iv.length; i++) {
			iv[i] = rawIV[i];
		}
		return iv;
	}
	
	/**
	 * Prepares the salt based on key
	 *
	 * @param key
	 * @return
	 */
	public static String getSalt(String key) {
		// TODO Auto-generated method stub
		String originalString = key;

		char[]c = originalString.toCharArray();

		// Replace with a "swap" function, if desired:
		char temp = c[0];
		c[0] = c[1];
		c[1] = temp;

		temp = c[c.length - 1];
		c[c.length - 1] = c[c.length - 2];
		c[c.length - 2] = temp;
		String swappedString = new String(c);
		return swappedString;
	}
	
	public static String decryptContainerString(String pCipherString, String pKey){
		String decryptedString = null;
		String lKey = getPaddedKey(pKey);
		LOG.debug(" decryptContainerString key for encryption after checking the length -:"
				+ lKey);
		byte[] iv = AppzillonAESUtils.getIV(lKey);
		String finalSalt = AppzillonAESUtils.getSalt(lKey);
		decryptedString = AppzillonAESUtils.decryptString(PBS_PADDING, lKey, pCipherString,
						finalSalt, iv);
//		LOG.debug(ServerConstants.LOGGER_PREFIX_RESTFULL
//				+ " decryptContainerString Decrypted AppzillonBody -:"+ decryptedString);
		return decryptedString;
	}

	private static String getPaddedKey(String pKey) {
		String lKey = pKey;
		String paddingMask = "$$$$$$$$$$$$$$$$";
		if (lKey.length() <= 16) {
			lKey += paddingMask.substring(0, 16 - lKey.length());
		}
		if (lKey.length() > 16) {
			lKey = lKey.substring(0, 16);
		}
		return lKey;
	}
	public static String encryptStringtoContainer(String pPlainText, String pKey){
		String encryptedString = null;
		String lKey = getPaddedKey(pKey);
		LOG.debug(" encryptStringtoContainer key for decryption after checking the length -:"
				+ lKey);
		
		byte[] iv = AppzillonAESUtils.getIV(lKey);
		String finalSalt = AppzillonAESUtils.getSalt(lKey);
		
		encryptedString = AppzillonAESUtils.encryptString(PBS_PADDING,
				lKey, pPlainText, finalSalt, iv);
		LOG.debug("encryptStringtoContainer Encrypted Body -:" + encryptedString);
		return encryptedString;
		
	}
	
	public static void main(String args[]){
		
		String key = "";
		

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, dd MM yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String todayDate = dtf.format(now);
		LOG.debug("got todayDate " + todayDate);
		if (key.isEmpty()) {
			key = todayDate;
		}

		LOG.debug("Create session Id");

	
		String sessionId = getRandomString();
		LOG.debug("got session Id" + sessionId);

		LOG.debug("Create Auth Key");



		String requestId = getRandomSessionKey();
		LOG.debug("got requestId " + requestId);

		
		
		String encryptedText = "nDUj5wBV+rIf3a3WyQhyiBommrLQI9fWPkujl5O8LoI=";
		// key = "12345com.iexceed.qateam" ;
		String paddingMask = "$$$$$$$$$$$$$$$$";
		String planReq = "{\"ChannelId2\":\"BALANCEINQ_REQ\"}";
		System.out.println("key.length() -:" + key.length());
		if (key.length() <= 16) {
			key += paddingMask.substring(0, 16 - key.length());
		}
		if(key.length()>16){
			key = key.substring(0,16);
		}
		System.out.println("key -:" +  key);
		byte[]iv = AppzillonAESUtils.getIV(key);
		String finalSalt = AppzillonAESUtils.getSalt(key);
		String PBS_PADDING = "AES/CBC/PKCS5padding";
		String encryptS = AppzillonAESUtils.encryptString(PBS_PADDING, key, planReq, finalSalt, iv);
		System.out.println("encryptS -:" + encryptS);
		String decryptedString = AppzillonAESUtils.decryptString(PBS_PADDING, key, "\\/2KoqoVQ8NER9KJciRAUAQ==", finalSalt, iv);
		System.out.println("decryptedString -:" + decryptedString);
	}	
	
	
	private static String getRandomString() {
		LOG.debug("getRandomString");

		byte[] randomByte = getRandomByte();
		return Base64.encodeBase64String(randomByte);
	}

	private static String getRandomSessionKey() {
		LOG.debug("getRandomSessionKey");

		SecureRandom lSecRand = new SecureRandom();
		Double lRand = lSecRand.nextDouble();

		return "" + lRand;

	}

	private static byte[] getRandomByte() {
		LOG.debug("getRandomByte");

		byte[] randomByte = new byte[24];
		SecureRandom secRand = new SecureRandom();
		randomByte = new byte[24];
		secRand.nextBytes(randomByte);
		return randomByte;
	}
	


}