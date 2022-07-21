package com.example.task.serviceImpl;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.apache.poi.EmptyFileException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.task.entity.LoanDetails;

import com.example.task.excelFile.ExcelToJava;
import com.example.task.mappingClass.LoanDetail;
import com.example.task.repo.LoanInputRepositery;
import com.example.task.service.LoanInputService;

@Service
public class LoanInputServiceImpl implements LoanInputService {

	@Autowired
	private LoanInputRepositery loanInputRepositery;
	
	
	@Override
	public void save(MultipartFile file) {
		
		try {
			
			List<LoanDetails>  loanDetails=ExcelToJava.convertExcelToList(file.getInputStream());
			loanInputRepositery.saveAll(loanDetails);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public List<LoanDetails>  getAllProduct(){
		return this.loanInputRepositery.findAll();
	}
	@Override
	public List<LoanDetail> getByIdAndstatus(long branchId,String status) {
		if(branchId==0 || status==null) {
			throw new EmptyFileException();
		}
		Optional<List<LoanDetail>> byIdAndStatus = loanInputRepositery.getByIdAndStatus(branchId, status);
		if(byIdAndStatus.isPresent()){
			return byIdAndStatus.get();
		}

		throw new NoSuchElementException();
	}
	@Override
	public LoanDetails getByReferenceNo(String referenceNo) {
		Optional<LoanDetails> byReferenceNo = loanInputRepositery.getByReferenceNo(referenceNo);
		if(byReferenceNo.isPresent()) {
			return byReferenceNo.get();
		}
		throw new NoSuchElementException();
	}
	@Override
	public LoanDetails saveSingleData(LoanDetails loanDetails) {
		
		return loanInputRepositery.save(loanDetails);
	}
	
	
}
