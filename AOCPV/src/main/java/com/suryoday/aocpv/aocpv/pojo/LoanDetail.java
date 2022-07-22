package com.suryoday.aocpv.aocpv.pojo;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class LoanDetail {

		private String landPhoneNumber;
		private String referenceNo;
		private int customerID;
		private String memberName;
		private Date dateOfBirth;
		private String address;
		private String state;
		private long postal;
		private long branchId;
		private double amount;
		private String status;
		private LocalDate createDate;
		
		
}
