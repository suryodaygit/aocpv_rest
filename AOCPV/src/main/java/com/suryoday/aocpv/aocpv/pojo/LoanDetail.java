package com.suryoday.aocpv.aocpv.pojo;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class LoanDetail {

		private long mobilePhone;
		private String referenceNo;
		private Long customerID;
		private String memberName;
		private Date dateOfBirth;
		private String address;
		private String state;
		private long postal;
		private long branchId;
		private double amount;
		private String status;
		private LocalDate createDate;
		
		public LoanDetail() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public LoanDetail(long mobilePhone, String referenceNo, Long customerID, String memberName,
				Date dateOfBirth, String address, String state, long postal, long branchId, double amount,
				String status, LocalDate createDate) {
			super();
			this.mobilePhone = mobilePhone;
			this.referenceNo = referenceNo;
			this.customerID = customerID;
			this.memberName = memberName;
			this.dateOfBirth = dateOfBirth;
			this.address = address;
			this.state = state;
			this.postal = postal;
			this.branchId = branchId;
			this.amount = amount;
			this.status = status;
		}

		

		public long getMobilePhone() {
			return mobilePhone;
		}

		public void setMobilePhone(long mobilePhone) {
			this.mobilePhone = mobilePhone;
		}

		public String getReferenceNo() {
			return referenceNo;
		}

		public void setReferenceNo(String referenceNo) {
			this.referenceNo = referenceNo;
		}

		public Long getCustomerID() {
			return customerID;
		}

		public void setCustomerID(Long customerID) {
			this.customerID = customerID;
		}

		public String getMemberName() {
			return memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public long getPostal() {
			return postal;
		}

		public void setPostal(long postal) {
			this.postal = postal;
		}

		public long getBranchId() {
			return branchId;
		}

		public void setBranchId(long branchId) {
			this.branchId = branchId;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public LocalDate getCreateDate() {
			return createDate;
		}

		public void setCreateDate(LocalDate createDate) {
			this.createDate = createDate;
		}

	
		
		
		
		
		
		
}
