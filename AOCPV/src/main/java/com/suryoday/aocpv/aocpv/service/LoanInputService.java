package com.suryoday.aocpv.aocpv.service;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;

import com.suryoday.aocpv.aocpv.pojo.LoanDetail;
import com.suryoday.aocpv.aocpv.pojo.LoanDetails;


public interface LoanInputService {

	void save(MultipartFile file);
	List<LoanDetails>  getAllProduct();
	List<LoanDetail> getByIdAndstatus(long branchId,String status);
	LoanDetails getByReferenceNo(String referenceNo);
	LoanDetails saveSingleData(LoanDetails loanDetails);
}
