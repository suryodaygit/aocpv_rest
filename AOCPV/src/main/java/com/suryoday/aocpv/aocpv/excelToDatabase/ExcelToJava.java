package com.suryoday.aocpv.aocpv.excelToDatabase;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.suryoday.aocpv.aocpv.pojo.LoanDetails;



public class ExcelToJava {
	
	private static MissingCellPolicy xRow;

	public static boolean checkExcelformat(MultipartFile file) {
		
		String contentType=file.getContentType();
		if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
			return true;
		}
		else
		return false;	
	}
	
	
	public static List<LoanDetails> convertExcelToList(InputStream is){
		List<LoanDetails> list =new ArrayList<>();
		
	
		try {
			//DataFormatter formatter = new DataFormatter();
			XSSFWorkbook workbook =new XSSFWorkbook(is);
			XSSFSheet sheet =workbook.getSheet("Sheet1");
			int rowNumber=0;
			
			Iterator<Row> iterator=sheet.iterator();
			while(iterator.hasNext()) {
				Row row=iterator.next();
				//it will skip the first row
				if(rowNumber==0) {
					rowNumber++;
					continue;
				}
				int lastColumn = Math.max(row.getLastCellNum(), 131);
				LoanDetails loanDetails=new LoanDetails();
				
				loanDetails.setStatus("initiated");
				LocalDate date=LocalDate.now();
				loanDetails.setCreateDate(date);
				
				for(int cn=0;cn<lastColumn;cn++) {
					//if cell is empty then it will return null
					Cell cell=row.getCell(cn,xRow.RETURN_BLANK_AS_NULL );
					//skip the empty cell
					if(cell==null) {
						continue;
					}
				
					
					//int cid=cell.getColumnIndex();
					// cell=row.getCell(cn);
					switch (cn) {
					case 0:loanDetails.setReferenceNo(cell.getStringCellValue());
					break;
					case 1:loanDetails.setMemberName(cell.getStringCellValue());
					break;
					case 2:loanDetails.setDateOfBirth(cell.getDateCellValue());
					break;
					case 3:loanDetails.setAddress(cell.getStringCellValue());
					break;
					case 4: loanDetails.setState(cell.getStringCellValue());
					break;
					case 5:loanDetails.setPostal((long) cell.getNumericCellValue());
					break;
					case 6:loanDetails.setLandPhoneNumber(cell.getStringCellValue());
					break;
					case 7:loanDetails.setMobilePhone((long) cell.getNumericCellValue());
					break;
					case 8:loanDetails.setNumOpenAccount((int) cell.getNumericCellValue());
					break;
					case 9:loanDetails.setNumOpenAccountOwn((int) cell.getNumericCellValue());
					break;
					case 10:loanDetails.setNumOpenAccountNonOwn((int) cell.getNumericCellValue());
					break;
					case 11:loanDetails.setSumOutstandingBalance(cell.getNumericCellValue());
					break;
					case 12:loanDetails.setSumOutstandingBalanceOwn(cell.getNumericCellValue());
					break;
					case 13:loanDetails.setSumOutstandingBalanceNonOwn(cell.getNumericCellValue());
					break;
					case 14:loanDetails.setSumInstallmentAmountopen(cell.getNumericCellValue());
					break;
					case 15:loanDetails.setSumInstallmentAmountopenOwn(cell.getNumericCellValue());
					break;
					case 16:loanDetails.setSumInstallmentAmountOpenNonOwn(cell.getNumericCellValue());
					break;
					case 17:loanDetails.setRightOfChargeOfTag((int) cell.getNumericCellValue());
					break;
					case 18:loanDetails.setRestructureTag((int) cell.getNumericCellValue());
					break;
					case 19:loanDetails.setEarliestOpenDate(cell.getDateCellValue());
					break;
					case 20:loanDetails.setLatestOpenDate(cell.getDateCellValue());		
					break;
					case 21:loanDetails.setEarliestCloseDate(cell.getDateCellValue());
					break;
					case 22:loanDetails.setLatestCloseDate(cell.getDateCellValue());
					break;
					case 23:loanDetails.setEarliestOpenDateOwn(cell.getDateCellValue());
					break;
					case 24:loanDetails.setLatestOpenDateOwn(cell.getDateCellValue());
					break;
					case 25:loanDetails.setEarliestOpenDateNonOwn(cell.getDateCellValue());
					break;
					case 26:loanDetails.setLatestOpenDateNonOwn(cell.getDateCellValue());
					break;
					case 27:loanDetails.setEarliestCloseDateOwn(cell.getDateCellValue());
					break;
					case 28:loanDetails.setLatestCloseDateOwn(cell.getDateCellValue());
					break;
					case 29:loanDetails.setEarliestCloseDateNonOwn(cell.getDateCellValue());
					break;
					case 30:loanDetails.setLatestCloseDateNonOwn(cell.getDateCellValue());
					break;
					case 31:loanDetails.setLatestMfiInstitution(cell.getStringCellValue());				
					break;
					case 32:loanDetails.setIsActiveInMfi((int) cell.getNumericCellValue());
					break;
					case 33:loanDetails.setIS_ACTIVE_WITH_SSFB((int) cell.getNumericCellValue());
					break;
					case 34:loanDetails.setIS_WITH_SSFB_ONLY((int) cell.getNumericCellValue());
					break;
					case 35:loanDetails.setMFI_VINTAGE((int) cell.getNumericCellValue());
					break;
					case 36:loanDetails.setMFI_VINTAGE_MARKET((int) cell.getNumericCellValue());
					break;
					case 37:loanDetails.setMFI_VINTAGE_SSFB((int) cell.getNumericCellValue());
					break;
					case 38:loanDetails.setMFI_1_30DPD((int) cell.getNumericCellValue());
					break;
					case 39:loanDetails.setMFI_1_60DPD((int) cell.getNumericCellValue());
					break;
					case 40:loanDetails.setMFI_NPA_TAG((int) cell.getNumericCellValue());
					break;
					case 41:loanDetails.setMFI_MAX_DELQ_STATUS(cell.getStringCellValue());
					break;
					case 42:loanDetails.setMFI_BUREAU_VINTAGE((int) cell.getNumericCellValue());
					break;
					case 43:loanDetails.setMAX_MFI_EMI(cell.getNumericCellValue());
					break;
					case 44:loanDetails.setMAX_MFI_EMI_OPEN(cell.getNumericCellValue());
					break;
					case 45:loanDetails.setMAX_LOAN_AMOUNT_MFI(cell.getNumericCellValue());
					break;
					case 46:loanDetails.setMAX_LOAN_AMOUNT_MFI_OPEN(cell.getNumericCellValue());
					break;
					case 47:loanDetails.setLATEST_ACCOUNTSTATUS_MFI(cell.getStringCellValue());
					break;
					case 48:loanDetails.setRETAIL_RESTRUCTURED_TAG((int) cell.getNumericCellValue());
					break;
					case 49:loanDetails.setRETAIL_WRITEOFF_TAG((int) cell.getNumericCellValue());
					break;
					case 50:loanDetails.setRETAIL_DELQ_STATUS_RANKED((int) cell.getNumericCellValue());
					break;
					case 51:loanDetails.setRETAIL_MAX_DELQ_STATUS(cell.getStringCellValue());
					break;
					case 52:loanDetails.setRETAIL_BALANCE(cell.getNumericCellValue());
					break;
					case 53:loanDetails.setRETAIL_sanctionamount(cell.getNumericCellValue());
					break;
					case 54:loanDetails.setSECURED_DISBURSED(cell.getNumericCellValue());
					break;
					case 55:loanDetails.setUNSECURED_DISBURSED(cell.getNumericCellValue());
					break;
					case 56:loanDetails.setSECURED_POS(cell.getNumericCellValue());
					break;
					case 57:loanDetails.setUNSECURED_POS(cell.getNumericCellValue());
					break;
					case 58:loanDetails.setHL_POS(cell.getNumericCellValue());
					break;
					case 59:loanDetails.setLAP_POS(cell.getNumericCellValue());
					break;
					case 60:loanDetails.setACTIVE_IN_HL((int) cell.getNumericCellValue());
					break;
					case 61:loanDetails.setACTIVE_IN_LAP((int) cell.getNumericCellValue());
					break;
					case 62:loanDetails.setRETAIL_EARLIEST_OPEN_DATE(cell.getDateCellValue());
					break;
					case 63:loanDetails.setRETAIL_LATEST_OPEN_DATE(cell.getDateCellValue());
					break;
					case 64:loanDetails.setHL_LATEST_OPEN_DATE(cell.getDateCellValue());
					break;
					case 65:loanDetails.setLAP_LATEST_OPEN_DATE(cell.getDateCellValue());
					break;
					case 66:loanDetails.setHL_DISBURSED(cell.getNumericCellValue());
					break;
					case 67:loanDetails.setLAP_DISBURSED(cell.getNumericCellValue());
					break;
					case 68:loanDetails.setRETAIL_IMPUTED_EMI_WO_CCOD_CURRENT(cell.getNumericCellValue());
					break;
					case 69:loanDetails.setRETAIL_IMPUTED_EMI_CURRENT(cell.getNumericCellValue());
					break;
					case 70:loanDetails.setNPA_TAG((int) cell.getNumericCellValue());
					break;
					case 71:loanDetails.setRETAIL_1_30DPD((int) cell.getNumericCellValue());
					break;
					case 72:loanDetails.setRETAIL_1_60DPD((int) cell.getNumericCellValue());
					break;
					case 73:loanDetails.setOTHERS_POS(cell.getNumericCellValue());
					break;
					case 74:loanDetails.setNUM_RETAIL_ACTIVE_ACCTS((int) cell.getNumericCellValue());
					break;
					case 75:loanDetails.setNUM_SECURED_ACCTS((int) cell.getNumericCellValue());
					break;
					case 76:loanDetails.setNUM_UNSECURED_ACCTS((int) cell.getNumericCellValue());
					break;
					case 77:loanDetails.setRETAIL_BUREAU_VINTAGE((int) cell.getNumericCellValue());
					break;
					case 78:loanDetails.setNUM_LIVE_RETAIL((int) cell.getNumericCellValue());
					break;
					case 79:loanDetails.setNUM_CLOSED_RETAIL((int) cell.getNumericCellValue());
					break;
					case 80:loanDetails.setNUM_ACCTS_RETAIL((int) cell.getNumericCellValue());
					break;
					case 81:loanDetails.setMAX_CURRENT_EMI(cell.getNumericCellValue());
					break;
					case 82:loanDetails.setMAX_EMI(cell.getNumericCellValue());
					break;
					case 83:loanDetails.setMAX_LOAN_AMOUNT(cell.getNumericCellValue());
					break;
					case 84:loanDetails.setMAX_CURRENT_LOAN_AMOUNT(cell.getNumericCellValue());
					break;
					case 85:loanDetails.setMAX_RETAIL_LOAN_TENURE((int) cell.getNumericCellValue());
					break;
					case 86:loanDetails.setMAX_RETAIL_LOAN_TENURE_CURRENT((int) cell.getNumericCellValue());
					break;
					case 87:loanDetails.setRETAIL_LATEST_CLOSED_DATE(cell.getDateCellValue());
					break;
					case 88:loanDetails.setNUM_SECURED_CLOSED_ACCTS((int) cell.getNumericCellValue());
					break;
					case 89:loanDetails.setNUM_UNSECURED_CLOSED_ACCTS((int) cell.getNumericCellValue());
					break;
					case 90:loanDetails.setNUM_SECURED_LIVE_ACCTS((int) cell.getNumericCellValue());
					break;
					case 91:loanDetails.setNUM_UNSECURED_LIVE_ACCTS((int) cell.getNumericCellValue());
					break;
					case 92:loanDetails.setNUM_PL_LIVE((int) cell.getNumericCellValue());
					break;
					case 93:loanDetails.setNUM_PL_CLOSED((int) cell.getNumericCellValue());
					break;
					case 94:loanDetails.setNUM_BL_LIVE((int) cell.getNumericCellValue());
					break;
					case 95:loanDetails.setNUM_BL_CLOSED((int) cell.getNumericCellValue());
					break;
					case 96:loanDetails.setNUM_HL_LAP_LIVE((int) cell.getNumericCellValue());
					break;
					case 97:loanDetails.setNUM_HL_LAP_CLOSED((int) cell.getNumericCellValue());
					break;
					case 98:loanDetails.setLATEST_ACCOUNTSTATUS_RETAIL(cell.getStringCellValue());
					break;
					case 99:loanDetails.setLATEST_ACCOUNTSTATUS_PL(cell.getStringCellValue());
					break;
					case 100:loanDetails.setLATEST_ACCOUNTSTATUS_BL(cell.getStringCellValue());
					break;
					case 101:loanDetails.setLATEST_ACCOUNTSTATUS_HL_LAP(cell.getStringCellValue());
					break;
					case 102:loanDetails.setTOTAL_DISB_PL(cell.getNumericCellValue());
					break;
					case 103:loanDetails.setTOTAL_DISB_BL(cell.getNumericCellValue());
					break;
					case 104:loanDetails.setTOTAL_DISB_HL_LAP(cell.getNumericCellValue());
					break;
					case 105:loanDetails.setBL_POS(cell.getNumericCellValue());
					break;
					case 106:loanDetails.setPL_POS(cell.getNumericCellValue());
					break;
					case 107:loanDetails.setBUREAU_VINTAGE_PL((int) cell.getNumericCellValue());
					break;
					case 108:loanDetails.setBUREAU_VINTAGE_BL((int) cell.getNumericCellValue());
					break;
					case 109:loanDetails.setBUREAU_VINTAGE_HL_LAP((int) cell.getNumericCellValue());
					break;
					case 110:loanDetails.setLATEST_CLOSEDATE_PL(cell.getDateCellValue());
					break;
					case 111:loanDetails.setLATEST_CLOSEDATE_BL(cell.getDateCellValue());
					break;
					case 112:loanDetails.setLATEST_CLOSEDATE_HL_LAP(cell.getDateCellValue());
					break;
					case 113:loanDetails.setLATEST_CLOSEDATE_SECURED(cell.getDateCellValue());
					break;
					case 114:loanDetails.setLATEST_CLOSEDATE_UNSECURED(cell.getDateCellValue());
					break;
					case 115:loanDetails.setMAX_EMI_PL(cell.getNumericCellValue());
					break;
					case 116:loanDetails.setMAX_EMI_BL(cell.getNumericCellValue());
					break;
					case 117:loanDetails.setMAX_EMI_SECURED(cell.getNumericCellValue());
					break;
					case 118:loanDetails.setMAX_EMI_UNSECURED(cell.getNumericCellValue());
					break;
					case 119:loanDetails.setMAX_EMI_HL_LAP(cell.getNumericCellValue());
					break;
					case 120:loanDetails.setMAX_LOAN_TENURE_HL_LAP((int) cell.getNumericCellValue());
					break;
					case 121:loanDetails.setMAX_LOAN_TENURE_PL((int) cell.getNumericCellValue());
					break;
					case 122:loanDetails.setMAX_LOAN_TENURE_BL((int) cell.getNumericCellValue());
					break;
					case 123:loanDetails.setMAX_LOAN_TENURE_SECURED((int) cell.getNumericCellValue());
					break;
					case 124:loanDetails.setMAX_LOAN_TENURE_UNSECURED((int) cell.getNumericCellValue());
					break;
					case 125:loanDetails.setMAX_LOAN_AMOUNT_UNSECURED(cell.getNumericCellValue());
					break;
					case 126:loanDetails.setMAX_LOAN_AMOUNT_SECURED(cell.getNumericCellValue());
					break;
					case 127:loanDetails.setMAX_LOAN_AMOUNT_PL(cell.getNumericCellValue());
					break;
					case 128:loanDetails.setMAX_LOAN_AMOUNT_BL(cell.getNumericCellValue());
					break;
					case 129:loanDetails.setMAX_LOAN_AMOUNT_HL_LAP(cell.getNumericCellValue());
					break;
					case 130:loanDetails.setRETAIL_VINTAGE((int) cell.getNumericCellValue());
					break;
					case 131:loanDetails.setBranchId((long) cell.getNumericCellValue());
					break;
					case 132:loanDetails.setAmount(cell.getNumericCellValue());
					break;	
					default:
						break;
						
						}
				
				
				}
				
			//	System.out.println(loanDetails);
					list.add(loanDetails);
		
		}
		}
		catch (Exception e) {
			e.fillInStackTrace();
		}
		
		
		return list;
	}
		
		
		
}
