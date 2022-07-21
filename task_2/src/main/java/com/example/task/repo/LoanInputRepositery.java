package com.example.task.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.task.entity.LoanDetails;
import com.example.task.mappingClass.LoanDetail;

@Repository
public interface LoanInputRepositery extends JpaRepository<LoanDetails, String>{

		@Query(value = "SELECT new com.example.task.mappingClass.LoanDetail(l.landPhoneNumber, l.referenceNo, l.customerID, l.memberName, l.dateOfBirth, l.address, l.state, l.postal, l.branchId, l.amount, l.status, l.createDate) from LoanDetails l where l.branchId =:b and l.status =:s")
		Optional<List<LoanDetail>> getByIdAndStatus(@Param("b") long branchId ,@Param("s") String status);

		public Optional<LoanDetails> getByReferenceNo(String referenceNo);
}
