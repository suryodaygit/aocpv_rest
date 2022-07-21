package com.suryoday.aocpv.aocpv.controller;

import javax.servlet.http.HttpServletRequest;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suryoday.aocpv.aocpv.service.CustomerService;



@RestController
@RequestMapping("/customer")
public class CustomersController {

	@Autowired
	CustomerService customerService;
	
	
	@RequestMapping(value="/getData", method = RequestMethod.POST,produces = "application/json")
	public ResponseEntity<Object> getCustomerData(@RequestBody String bm,
			 @RequestHeader(name = "X-Request-ID", required = true) String X_REQUEST_ID,
			 @RequestHeader(name = "X-Transaction-ID", required = true) String X_TRANSACTION_ID,
			 @RequestHeader(name = "X-To-ID", required = true) String X_TO_ID,
			 @RequestHeader(name = "X-From-ID", required = true) String X_FORM_ID,
			 @RequestHeader(name = "Content-Type", required = true) String CONTEND_TYPE,HttpServletRequest req)  throws Exception{
		
		JSONObject Header= new JSONObject();
		 Header.put("X-Request-ID",X_REQUEST_ID );
		 Header.put("X-Transaction-ID",X_TRANSACTION_ID );
		 Header.put("X-To-ID",X_TO_ID );
		 Header.put("X-From-ID",X_FORM_ID );
		 Header.put("Content-TypeD",CONTEND_TYPE );
		 
		 
		 if(X_REQUEST_ID.equals("IBR")) {
			 
			 JSONObject jsonObject = new JSONObject(bm);
			 System.out.println(jsonObject.toString());
			 
			 JSONObject getResponse	=customerService.getData(jsonObject,Header);
			 HttpStatus  h=HttpStatus.BAD_GATEWAY;
			 if(getResponse!=null) {
				 
				 			String Data2 = getResponse.getString("data");
							 JSONObject Data1= new JSONObject(Data2);
							
				 
				// JSONObject jsonObject2 = getResponse.getJSONObject("data");
				// JSONObject jsonObject3 = jsonObject2.getJSONObject("Data");
				 if(Data1.has("Data")) {
					  h= HttpStatus.OK;
				 }
				 else if(Data1.has("Error"))
				 {
					 h= HttpStatus.BAD_REQUEST; 
				 }
				 
				 return new ResponseEntity<Object>(Data1.toString(), h);
			 }
			 else
			 {
				 return new ResponseEntity<Object>("timeout", HttpStatus.GATEWAY_TIMEOUT);
			 }
		 }
		 
		 else
			{ 
				return new ResponseEntity<Object>("Invalid Request ", HttpStatus.BAD_REQUEST);
				
			}
				
		
	}
}
