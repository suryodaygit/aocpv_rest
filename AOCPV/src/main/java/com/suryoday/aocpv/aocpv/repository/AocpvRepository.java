package com.suryoday.aocpv.aocpv.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.suryoday.aocpv.aocpv.pojo.Benificier;
import com.suryoday.aocpv.aocpv.pojo.Preapproval;

@Repository
public interface AocpvRepository  extends  JpaRepository<Preapproval,Long>{ 
	
	
	     
	@Query(value = "SELECT * FROM Preapproval_tbl",  nativeQuery = true)
	      public List<Preapproval>    findAlla();
	   
	
//	@Query(value ="SELECT COUNT(*) FROM tbl_benificier u WHERE u.customer_id=:customernumber ",nativeQuery = true)
//    long totolcustomer(@Param("customernumber") String customernumber);
//	
//	@Query(value ="select TOP 1 sequence from Tbl_Benificier u where u.customer_id=:customernumber order by sequence desc",nativeQuery = true)
//    long totolcustomer1(@Param("customernumber") String customernumber);
//	
//	
//	@Query(value = "SELECT * FROM Tbl_Benificier u where u.customer_id=:customernumber",  nativeQuery = true)
//	  List<Benificier> findByCustomerId(@Param("customernumber")  String customerId);
//	
//	@Query(value = "SELECT * FROM Tbl_Benificier u where u.status=:customernumber",  nativeQuery = true)
//	  List<Benificier> findByStatus(@Param("customernumber")  String customerId);
//	
//	@Query(value = "SELECT * FROM Tbl_Benificier u where u.customer_id=:customernumber and u.type=:acounttype",  nativeQuery = true)
//	  List<Benificier> viewCustomerId(@Param("customernumber")  String customerId,@Param("acounttype")  String acounttype);

}
