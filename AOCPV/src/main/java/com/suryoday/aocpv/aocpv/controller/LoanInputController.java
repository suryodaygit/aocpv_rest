package com.suryoday.aocpv.aocpv.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.suryoday.aocpv.aocpv.excelToDatabase.ExcelToJava;
import com.suryoday.aocpv.aocpv.pojo.LoanDetail;
import com.suryoday.aocpv.aocpv.pojo.LoanDetails;
import com.suryoday.aocpv.aocpv.service.LoanInputService;




@RestController
@CrossOrigin("*")
@RequestMapping("/aocpv/v1")
public class LoanInputController {

	@Autowired
	private LoanInputService loanInputService;
	
	
	@PostMapping("/LoanInput/upload")
	public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file,
			@RequestHeader(name = "X-Correlation-ID", required = true) String headerPersist,
			 @RequestHeader(name = "X-From-ID", required = true) String X_From_ID,
			 @RequestHeader(name = "X-To-ID", required = true) String X_To_ID,
			 @RequestHeader(name = "X-Transaction-ID", required = true) String X_Transaction_ID,
			 @RequestHeader(name = "X-User-ID", required = true) String X_User_ID,
			 @RequestHeader(name = "X-Request-ID", required = true) String X_Request_ID){
		if(ExcelToJava.checkExcelformat(file)) {
			this.loanInputService.save(file);
			
			return ResponseEntity.status(HttpStatus.OK).body("file is uploaded and data is save to db");
			
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please upload excel data");
	}
	
	@GetMapping("/getAll")
	public List<LoanDetails> getAllDetails(){
		return loanInputService.getAllProduct();
	}
	
	@PostMapping("/getByIdAndStatus")
	public ResponseEntity<List<LoanDetail>> getByIdAndstatus(@RequestBody String s,
			@RequestHeader(name = "X-Correlation-ID", required = true) String headerPersist,
			 @RequestHeader(name = "X-From-ID", required = true) String X_From_ID,
			 @RequestHeader(name = "X-To-ID", required = true) String X_To_ID,
			 @RequestHeader(name = "X-Transaction-ID", required = true) String X_Transaction_ID,
			 @RequestHeader(name = "X-User-ID", required = true) String X_User_ID,
			 @RequestHeader(name = "X-Request-ID", required = true) String X_Request_ID){
		
								JSONObject jsonObject=new JSONObject(s);
				
					 String branchId = jsonObject.getJSONObject("Data").getString("BranchID");
					 String status = jsonObject.getJSONObject("Data").getString("Status");
										
								long branchId1 = Long.parseLong(branchId);
		
//								Customer c=new Customer();
//									c.setBranchId(branchId1);
//									c.setStatus(status);
								
		List<LoanDetail> list=loanInputService.getByIdAndstatus(branchId1,status);
		
		return new  ResponseEntity<List<LoanDetail>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/updateStatus")
	public ResponseEntity<LoanDetails> updateStatus(@RequestBody String string,
			@RequestHeader(name = "X-Correlation-ID", required = true) String headerPersist,
			 @RequestHeader(name = "X-From-ID", required = true) String X_From_ID,
			 @RequestHeader(name = "X-To-ID", required = true) String X_To_ID,
			 @RequestHeader(name = "X-Transaction-ID", required = true) String X_Transaction_ID,
			 @RequestHeader(name = "X-User-ID", required = true) String X_User_ID,
			 @RequestHeader(name = "X-Request-ID", required = true) String X_Request_ID){
		
		JSONObject jsonObject=new JSONObject(string);
		
		 String branchId = jsonObject.getJSONObject("Data").getString("BranchID");
		 String status = jsonObject.getJSONObject("Data").getString("Status");
		 String customerID = jsonObject.getJSONObject("Data").getString("customerID");

		LoanDetails loanDetails=loanInputService.getByReferenceNo(customerID);
		loanDetails.setStatus(status);
		LocalDate date=LocalDate.now();
		loanDetails.setUpdatedate(date);
		LoanDetails details=loanInputService.saveSingleData(loanDetails);
		return new ResponseEntity<LoanDetails>(details,HttpStatus.OK);
	}
	
	
}
