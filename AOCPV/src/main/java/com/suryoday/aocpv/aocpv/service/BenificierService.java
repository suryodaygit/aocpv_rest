package com.suryoday.aocpv.aocpv.service;

import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.suryoday.aocpv.aocpv.pojo.Benificier;

@Service
public interface BenificierService {
	
	
	
//	insert Api
//	ALready exist NickName  Api
//	ALready exist Account  Api
//	delete api pid 
//	fetch by  accountid    confirmation
//	update api 
	
	public List<Benificier>  fetchAll(); 
	
	JSONObject saveBenificier(String paramString,String customerid);
	
	JSONObject modifyBenificier(String paramString,String customerid);
	
	
	JSONObject deleteBenificier(String paramString);
	
	
	public List<Benificier>  FindAllCustomer(String customerid);
	
	public List<Benificier>  viewcustmerbytype(String customerid,String accounttype);

	public void modifyBenificierStatus();
	

}
