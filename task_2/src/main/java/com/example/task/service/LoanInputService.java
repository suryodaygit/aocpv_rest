package com.example.task.service;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import com.example.task.entity.LoanDetails;
import com.example.task.mappingClass.LoanDetail;

public interface LoanInputService {

	void save(MultipartFile file);
	List<LoanDetails>  getAllProduct();
	List<LoanDetail> getByIdAndstatus(long branchId,String status);
	LoanDetails getByReferenceNo(String referenceNo);
	LoanDetails saveSingleData(LoanDetails loanDetails);
}
