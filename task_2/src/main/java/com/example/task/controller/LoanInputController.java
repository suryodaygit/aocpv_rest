package com.example.task.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.example.task.entity.LoanDetails;
import com.example.task.excelFile.ExcelToJava;
import com.example.task.mappingClass.LoanDetail;
import com.example.task.service.LoanInputService;

@RestController
@CrossOrigin("*")
public class LoanInputController {

	@Autowired
	private LoanInputService loanInputService;
	
	
	@PostMapping("/LoanInput/upload")
	public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file){
		if(ExcelToJava.checkExcelformat(file)) {
			this.loanInputService.save(file);
			
			return ResponseEntity.ok(Map.of("massage", "file is uploaded and data is save to db"));
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please upload excel data");
	}
	
	@GetMapping("/getAll")
	public List<LoanDetails> getAllDetails(){
		return loanInputService.getAllProduct();
	}
	
	@PostMapping("/getByIdAndStatus")
	public ResponseEntity<List<LoanDetail>> getByIdAndstatus(@RequestBody String s){
		
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
	public ResponseEntity<LoanDetails> updateStatus(@RequestBody String string){
		
		JSONObject jsonObject=new JSONObject(string);
		
		 String branchId = jsonObject.getJSONObject("Data").getString("BranchID");
		 String status = jsonObject.getJSONObject("Data").getString("Status");
		 String referenceNo = jsonObject.getJSONObject("Data").getString("reference_NUMBER");

		LoanDetails loanDetails=loanInputService.getByReferenceNo(referenceNo);
		loanDetails.setStatus(status);
		LocalDate date=LocalDate.now();
		loanDetails.setUpdatedate(date);
		LoanDetails details=loanInputService.saveSingleData(loanDetails);
		return new ResponseEntity<LoanDetails>(details,HttpStatus.OK);
	}
	
	
}
