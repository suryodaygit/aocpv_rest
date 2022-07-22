package com.suryoday.aocpv.aocpv.pojo;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "Star_Loan_Input_field")

public class LoanDetails {
			@Id
			@Column(length = 40)
			private String referenceNo;
			@Column(length = 50)
			private String memberName;
			@Column(length = 24)
			private Date dateOfBirth;
			@Column(length = 100)
			private String address;
			@Column(length = 20)
			private String state;
			@Column(length = 24)
			private long postal;
			@Column(length = 24)
			private String landPhoneNumber;
			@Column(length = 24)
			private long mobilePhone;
			private int numOpenAccount;
			private int numOpenAccountOwn;
			private int numOpenAccountNonOwn;
			private double sumOutstandingBalance;
			private double sumOutstandingBalanceOwn;
			private double sumOutstandingBalanceNonOwn;
			private double sumInstallmentAmountopen;
			//@Column(nullable = true)
			private double sumInstallmentAmountopenOwn;
			//@Column(nullable = true)
			private double sumInstallmentAmountOpenNonOwn;
			@Column(length = 24)
			private int rightOfChargeOfTag;
			@Column(length = 24)
			private int restructureTag;
			@Column(length = 24)
			private Date earliestOpenDate;
			@Column(length = 24)
			private Date latestOpenDate;
			@Column(length = 24)
			private Date earliestCloseDate;
			@Column(length = 24)
			private Date latestCloseDate;
			@Column(length = 24)
			private Date earliestOpenDateOwn;
			@Column(length = 24)
			private Date latestOpenDateOwn;
			@Column(length = 24)
			private Date earliestOpenDateNonOwn;
			@Column(length = 24)
			private Date latestOpenDateNonOwn;
			@Column(length = 24)
			private Date earliestCloseDateOwn;
			@Column(length = 24)
			private Date latestCloseDateOwn;
			@Column(length = 24)
			private Date earliestCloseDateNonOwn;
			@Column(length = 24)
			private Date latestCloseDateNonOwn;
			@Column(length = 40)
			private String latestMfiInstitution;
			@Column(length = 24)
			private int isActiveInMfi;
			@Column(length = 24)
			private int IS_ACTIVE_WITH_SSFB;
			@Column(length = 24)
			private int IS_WITH_SSFB_ONLY;
			@Column(length = 24)
			private int MFI_VINTAGE;
			@Column(length = 24)
			private int MFI_VINTAGE_MARKET;
			@Column(length = 24)
			private int MFI_VINTAGE_SSFB;
			@Column(length = 24)
			private int MFI_1_30DPD;
			@Column(length = 24)
			private int MFI_1_60DPD;
			@Column(length = 24)
			private int MFI_NPA_TAG;
			@Column(length = 40)
			private String MFI_MAX_DELQ_STATUS;
			@Column(length = 24)
			private int MFI_BUREAU_VINTAGE;
			//@Column(nullable = true)
			private double MAX_MFI_EMI;
			//@Column(nullable = true)
			private double MAX_MFI_EMI_OPEN;
			//@Column(nullable = true)
			private double MAX_LOAN_AMOUNT_MFI;
			//@Column(nullable = true)
			private double MAX_LOAN_AMOUNT_MFI_OPEN;
			@Column(length = 50)
			private String LATEST_ACCOUNTSTATUS_MFI;
			@Column(length = 24)
			private int RETAIL_RESTRUCTURED_TAG;
			@Column(length = 24)
			private int RETAIL_WRITEOFF_TAG;
			@Column(length = 24)
			private int RETAIL_DELQ_STATUS_RANKED;
			@Column(length = 50)
			private String RETAIL_MAX_DELQ_STATUS;
			@Column(length = 24)
			private double RETAIL_BALANCE;
			@Column(length = 24)
			private double RETAIL_sanctionamount;
			@Column(length = 24)
			private double SECURED_DISBURSED;
			@Column(length = 24)
			private double UNSECURED_DISBURSED;
			@Column(length = 24)
			private double SECURED_POS;
			@Column(length = 24)
			private double UNSECURED_POS;
			@Column(length = 24)
			private double HL_POS;
			@Column(length = 24)
			private double LAP_POS;
			@Column(length = 24)
			private int ACTIVE_IN_HL;
			@Column(length = 24)
			private int ACTIVE_IN_LAP;
			@Column(length = 24)
			private Date RETAIL_EARLIEST_OPEN_DATE;
			@Column(length = 24)
			private Date RETAIL_LATEST_OPEN_DATE;
			@Column(length = 24)
			private Date HL_LATEST_OPEN_DATE;
			@Column(length = 24)
			private Date LAP_LATEST_OPEN_DATE;
			@Column(length = 24)
			private double HL_DISBURSED;
			@Column(length = 24)
			private double LAP_DISBURSED;
			@Column(length = 24)
			private double RETAIL_IMPUTED_EMI_WO_CCOD_CURRENT;
			@Column(length = 24)
			private double RETAIL_IMPUTED_EMI_CURRENT;
			@Column(length = 24)
			private int NPA_TAG;
			@Column(length = 24)
			private int RETAIL_1_30DPD;
			@Column(length = 24)
			private int RETAIL_1_60DPD;
			@Column(length = 24)
			private double OTHERS_POS;
			@Column(length = 24)
			private int NUM_RETAIL_ACTIVE_ACCTS;
			@Column(length = 24)
			private int NUM_SECURED_ACCTS;
			@Column(length = 24)
			private int NUM_UNSECURED_ACCTS;
			@Column(length = 24)
			private int RETAIL_BUREAU_VINTAGE;
			@Column(length = 24)
			private int NUM_LIVE_RETAIL;
			@Column(length = 24)
			private int NUM_CLOSED_RETAIL;
			@Column(length = 24)
			private int NUM_ACCTS_RETAIL;
			//@Column(nullable = true)
			private double MAX_CURRENT_EMI;
			//@Column(nullable = true)
			private double MAX_EMI;
			//@Column(nullable = true)
			private double MAX_LOAN_AMOUNT;
			//@Column(nullable = true)
			private double MAX_CURRENT_LOAN_AMOUNT;
			@Column(nullable = true)
			private int MAX_RETAIL_LOAN_TENURE;
			//@Column(nullable = true)
			private int MAX_RETAIL_LOAN_TENURE_CURRENT;
			@Column(length = 24)
			private Date RETAIL_LATEST_CLOSED_DATE;
			@Column(length = 24)
			private int NUM_SECURED_CLOSED_ACCTS;
			@Column(length = 24)
			private int NUM_UNSECURED_CLOSED_ACCTS;
			@Column(length = 24)
			private int NUM_SECURED_LIVE_ACCTS;
			@Column(length = 24)
			private int NUM_UNSECURED_LIVE_ACCTS;
			@Column(length = 24)
			private int NUM_PL_LIVE;
			@Column(length = 24)
			private int NUM_PL_CLOSED;
			@Column(length = 24)
			private int NUM_BL_LIVE;
			@Column(length = 24)
			private int NUM_BL_CLOSED;
			@Column(length = 24)
			private int NUM_HL_LAP_LIVE;
			@Column(length = 24)
			private int NUM_HL_LAP_CLOSED;
			@Column(length = 40)
			private String LATEST_ACCOUNTSTATUS_RETAIL;
			@Column(length = 40)
			private String LATEST_ACCOUNTSTATUS_PL;
			@Column(length = 40)
			private String LATEST_ACCOUNTSTATUS_BL;
			@Column(length = 50)
			private String LATEST_ACCOUNTSTATUS_HL_LAP;
			@Column(length = 24)
			private double TOTAL_DISB_PL;
			@Column(length = 24)
			private double TOTAL_DISB_BL;
			@Column(length = 24)
			private double TOTAL_DISB_HL_LAP;
			@Column(length = 24)
			private double BL_POS;
			@Column(length = 24)
			private double PL_POS;
			@Column(length = 24)
			private int BUREAU_VINTAGE_PL;
			@Column(length = 24)
			private int BUREAU_VINTAGE_BL;
			@Column(length = 24)
			private int BUREAU_VINTAGE_HL_LAP;
			@Column(length = 24)
			private Date LATEST_CLOSEDATE_PL;
			@Column(length = 24)
			private Date LATEST_CLOSEDATE_BL;
			@Column(length = 24)
			private Date LATEST_CLOSEDATE_HL_LAP;
			@Column(length = 24)
			private Date LATEST_CLOSEDATE_SECURED;
			@Column(length = 24)
			private Date LATEST_CLOSEDATE_UNSECURED;
			//@Column(nullable = true)
			private double MAX_EMI_PL;
			//@Column(nullable = true)
			private double MAX_EMI_BL;
			//@Column(nullable = true)
			private double MAX_EMI_SECURED;
			//@Column(nullable = true)
			private double MAX_EMI_UNSECURED;
			//@Column(nullable = true)
			private double MAX_EMI_HL_LAP;
			//@Column(nullable = true)
			private int MAX_LOAN_TENURE_HL_LAP;
			//@Column(nullable = true)
			private int MAX_LOAN_TENURE_PL;
			//@Column(nullable = true)
			private int MAX_LOAN_TENURE_BL;
			//@Column(nullable = true)
			private int MAX_LOAN_TENURE_SECURED;
			//@Column(nullable = true)
			private int MAX_LOAN_TENURE_UNSECURED;
			//@Column(nullable = true)
			private double MAX_LOAN_AMOUNT_UNSECURED;
			//@Column(nullable = true)
			private double MAX_LOAN_AMOUNT_SECURED;
			//@Column(nullable = true)
			private double MAX_LOAN_AMOUNT_PL;
			//@Column(nullable = true)
			private double MAX_LOAN_AMOUNT_BL;
			@Column(nullable = true)
			private double MAX_LOAN_AMOUNT_HL_LAP;
			//@Column(nullable = true)
			private int RETAIL_VINTAGE;
			@Column(length = 40)
			private long branchId;
			@Column(length = 24)
			private double amount;
			@Column(length = 24)
			private String status;
			private LocalDate createDate;
			private LocalDate updatedate;
			private Long customerID;
			public String getReferenceNo() {
				return referenceNo;
			}
			public void setReferenceNo(String referenceNo) {
				this.referenceNo = referenceNo;
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
			public String getLandPhoneNumber() {
				return landPhoneNumber;
			}
			public void setLandPhoneNumber(String landPhoneNumber) {
				this.landPhoneNumber = landPhoneNumber;
			}
			public long getMobilePhone() {
				return mobilePhone;
			}
			public void setMobilePhone(long mobilePhone) {
				this.mobilePhone = mobilePhone;
			}
			public int getNumOpenAccount() {
				return numOpenAccount;
			}
			public void setNumOpenAccount(int numOpenAccount) {
				this.numOpenAccount = numOpenAccount;
			}
			public int getNumOpenAccountOwn() {
				return numOpenAccountOwn;
			}
			public void setNumOpenAccountOwn(int numOpenAccountOwn) {
				this.numOpenAccountOwn = numOpenAccountOwn;
			}
			public int getNumOpenAccountNonOwn() {
				return numOpenAccountNonOwn;
			}
			public void setNumOpenAccountNonOwn(int numOpenAccountNonOwn) {
				this.numOpenAccountNonOwn = numOpenAccountNonOwn;
			}
			public double getSumOutstandingBalance() {
				return sumOutstandingBalance;
			}
			public void setSumOutstandingBalance(double sumOutstandingBalance) {
				this.sumOutstandingBalance = sumOutstandingBalance;
			}
			public double getSumOutstandingBalanceOwn() {
				return sumOutstandingBalanceOwn;
			}
			public void setSumOutstandingBalanceOwn(double sumOutstandingBalanceOwn) {
				this.sumOutstandingBalanceOwn = sumOutstandingBalanceOwn;
			}
			public double getSumOutstandingBalanceNonOwn() {
				return sumOutstandingBalanceNonOwn;
			}
			public void setSumOutstandingBalanceNonOwn(double sumOutstandingBalanceNonOwn) {
				this.sumOutstandingBalanceNonOwn = sumOutstandingBalanceNonOwn;
			}
			public double getSumInstallmentAmountopen() {
				return sumInstallmentAmountopen;
			}
			public void setSumInstallmentAmountopen(double sumInstallmentAmountopen) {
				this.sumInstallmentAmountopen = sumInstallmentAmountopen;
			}
			public double getSumInstallmentAmountopenOwn() {
				return sumInstallmentAmountopenOwn;
			}
			public void setSumInstallmentAmountopenOwn(double sumInstallmentAmountopenOwn) {
				this.sumInstallmentAmountopenOwn = sumInstallmentAmountopenOwn;
			}
			public double getSumInstallmentAmountOpenNonOwn() {
				return sumInstallmentAmountOpenNonOwn;
			}
			public void setSumInstallmentAmountOpenNonOwn(double sumInstallmentAmountOpenNonOwn) {
				this.sumInstallmentAmountOpenNonOwn = sumInstallmentAmountOpenNonOwn;
			}
			public int getRightOfChargeOfTag() {
				return rightOfChargeOfTag;
			}
			public void setRightOfChargeOfTag(int rightOfChargeOfTag) {
				this.rightOfChargeOfTag = rightOfChargeOfTag;
			}
			public int getRestructureTag() {
				return restructureTag;
			}
			public void setRestructureTag(int restructureTag) {
				this.restructureTag = restructureTag;
			}
			public Date getEarliestOpenDate() {
				return earliestOpenDate;
			}
			public void setEarliestOpenDate(Date earliestOpenDate) {
				this.earliestOpenDate = earliestOpenDate;
			}
			public Date getLatestOpenDate() {
				return latestOpenDate;
			}
			public void setLatestOpenDate(Date latestOpenDate) {
				this.latestOpenDate = latestOpenDate;
			}
			public Date getEarliestCloseDate() {
				return earliestCloseDate;
			}
			public void setEarliestCloseDate(Date earliestCloseDate) {
				this.earliestCloseDate = earliestCloseDate;
			}
			public Date getLatestCloseDate() {
				return latestCloseDate;
			}
			public void setLatestCloseDate(Date latestCloseDate) {
				this.latestCloseDate = latestCloseDate;
			}
			public Date getEarliestOpenDateOwn() {
				return earliestOpenDateOwn;
			}
			public void setEarliestOpenDateOwn(Date earliestOpenDateOwn) {
				this.earliestOpenDateOwn = earliestOpenDateOwn;
			}
			public Date getLatestOpenDateOwn() {
				return latestOpenDateOwn;
			}
			public void setLatestOpenDateOwn(Date latestOpenDateOwn) {
				this.latestOpenDateOwn = latestOpenDateOwn;
			}
			public Date getEarliestOpenDateNonOwn() {
				return earliestOpenDateNonOwn;
			}
			public void setEarliestOpenDateNonOwn(Date earliestOpenDateNonOwn) {
				this.earliestOpenDateNonOwn = earliestOpenDateNonOwn;
			}
			public Date getLatestOpenDateNonOwn() {
				return latestOpenDateNonOwn;
			}
			public void setLatestOpenDateNonOwn(Date latestOpenDateNonOwn) {
				this.latestOpenDateNonOwn = latestOpenDateNonOwn;
			}
			public Date getEarliestCloseDateOwn() {
				return earliestCloseDateOwn;
			}
			public void setEarliestCloseDateOwn(Date earliestCloseDateOwn) {
				this.earliestCloseDateOwn = earliestCloseDateOwn;
			}
			public Date getLatestCloseDateOwn() {
				return latestCloseDateOwn;
			}
			public void setLatestCloseDateOwn(Date latestCloseDateOwn) {
				this.latestCloseDateOwn = latestCloseDateOwn;
			}
			public Date getEarliestCloseDateNonOwn() {
				return earliestCloseDateNonOwn;
			}
			public void setEarliestCloseDateNonOwn(Date earliestCloseDateNonOwn) {
				this.earliestCloseDateNonOwn = earliestCloseDateNonOwn;
			}
			public Date getLatestCloseDateNonOwn() {
				return latestCloseDateNonOwn;
			}
			public void setLatestCloseDateNonOwn(Date latestCloseDateNonOwn) {
				this.latestCloseDateNonOwn = latestCloseDateNonOwn;
			}
			public String getLatestMfiInstitution() {
				return latestMfiInstitution;
			}
			public void setLatestMfiInstitution(String latestMfiInstitution) {
				this.latestMfiInstitution = latestMfiInstitution;
			}
			public int getIsActiveInMfi() {
				return isActiveInMfi;
			}
			public void setIsActiveInMfi(int isActiveInMfi) {
				this.isActiveInMfi = isActiveInMfi;
			}
			public int getIS_ACTIVE_WITH_SSFB() {
				return IS_ACTIVE_WITH_SSFB;
			}
			public void setIS_ACTIVE_WITH_SSFB(int iS_ACTIVE_WITH_SSFB) {
				IS_ACTIVE_WITH_SSFB = iS_ACTIVE_WITH_SSFB;
			}
			public int getIS_WITH_SSFB_ONLY() {
				return IS_WITH_SSFB_ONLY;
			}
			public void setIS_WITH_SSFB_ONLY(int iS_WITH_SSFB_ONLY) {
				IS_WITH_SSFB_ONLY = iS_WITH_SSFB_ONLY;
			}
			public int getMFI_VINTAGE() {
				return MFI_VINTAGE;
			}
			public void setMFI_VINTAGE(int mFI_VINTAGE) {
				MFI_VINTAGE = mFI_VINTAGE;
			}
			public int getMFI_VINTAGE_MARKET() {
				return MFI_VINTAGE_MARKET;
			}
			public void setMFI_VINTAGE_MARKET(int mFI_VINTAGE_MARKET) {
				MFI_VINTAGE_MARKET = mFI_VINTAGE_MARKET;
			}
			public int getMFI_VINTAGE_SSFB() {
				return MFI_VINTAGE_SSFB;
			}
			public void setMFI_VINTAGE_SSFB(int mFI_VINTAGE_SSFB) {
				MFI_VINTAGE_SSFB = mFI_VINTAGE_SSFB;
			}
			public int getMFI_1_30DPD() {
				return MFI_1_30DPD;
			}
			public void setMFI_1_30DPD(int mFI_1_30DPD) {
				MFI_1_30DPD = mFI_1_30DPD;
			}
			public int getMFI_1_60DPD() {
				return MFI_1_60DPD;
			}
			public void setMFI_1_60DPD(int mFI_1_60DPD) {
				MFI_1_60DPD = mFI_1_60DPD;
			}
			public int getMFI_NPA_TAG() {
				return MFI_NPA_TAG;
			}
			public void setMFI_NPA_TAG(int mFI_NPA_TAG) {
				MFI_NPA_TAG = mFI_NPA_TAG;
			}
			public String getMFI_MAX_DELQ_STATUS() {
				return MFI_MAX_DELQ_STATUS;
			}
			public void setMFI_MAX_DELQ_STATUS(String mFI_MAX_DELQ_STATUS) {
				MFI_MAX_DELQ_STATUS = mFI_MAX_DELQ_STATUS;
			}
			public int getMFI_BUREAU_VINTAGE() {
				return MFI_BUREAU_VINTAGE;
			}
			public void setMFI_BUREAU_VINTAGE(int mFI_BUREAU_VINTAGE) {
				MFI_BUREAU_VINTAGE = mFI_BUREAU_VINTAGE;
			}
			public double getMAX_MFI_EMI() {
				return MAX_MFI_EMI;
			}
			public void setMAX_MFI_EMI(double mAX_MFI_EMI) {
				MAX_MFI_EMI = mAX_MFI_EMI;
			}
			public double getMAX_MFI_EMI_OPEN() {
				return MAX_MFI_EMI_OPEN;
			}
			public void setMAX_MFI_EMI_OPEN(double mAX_MFI_EMI_OPEN) {
				MAX_MFI_EMI_OPEN = mAX_MFI_EMI_OPEN;
			}
			public double getMAX_LOAN_AMOUNT_MFI() {
				return MAX_LOAN_AMOUNT_MFI;
			}
			public void setMAX_LOAN_AMOUNT_MFI(double mAX_LOAN_AMOUNT_MFI) {
				MAX_LOAN_AMOUNT_MFI = mAX_LOAN_AMOUNT_MFI;
			}
			public double getMAX_LOAN_AMOUNT_MFI_OPEN() {
				return MAX_LOAN_AMOUNT_MFI_OPEN;
			}
			public void setMAX_LOAN_AMOUNT_MFI_OPEN(double mAX_LOAN_AMOUNT_MFI_OPEN) {
				MAX_LOAN_AMOUNT_MFI_OPEN = mAX_LOAN_AMOUNT_MFI_OPEN;
			}
			public String getLATEST_ACCOUNTSTATUS_MFI() {
				return LATEST_ACCOUNTSTATUS_MFI;
			}
			public void setLATEST_ACCOUNTSTATUS_MFI(String lATEST_ACCOUNTSTATUS_MFI) {
				LATEST_ACCOUNTSTATUS_MFI = lATEST_ACCOUNTSTATUS_MFI;
			}
			public int getRETAIL_RESTRUCTURED_TAG() {
				return RETAIL_RESTRUCTURED_TAG;
			}
			public void setRETAIL_RESTRUCTURED_TAG(int rETAIL_RESTRUCTURED_TAG) {
				RETAIL_RESTRUCTURED_TAG = rETAIL_RESTRUCTURED_TAG;
			}
			public int getRETAIL_WRITEOFF_TAG() {
				return RETAIL_WRITEOFF_TAG;
			}
			public void setRETAIL_WRITEOFF_TAG(int rETAIL_WRITEOFF_TAG) {
				RETAIL_WRITEOFF_TAG = rETAIL_WRITEOFF_TAG;
			}
			public int getRETAIL_DELQ_STATUS_RANKED() {
				return RETAIL_DELQ_STATUS_RANKED;
			}
			public void setRETAIL_DELQ_STATUS_RANKED(int rETAIL_DELQ_STATUS_RANKED) {
				RETAIL_DELQ_STATUS_RANKED = rETAIL_DELQ_STATUS_RANKED;
			}
			public String getRETAIL_MAX_DELQ_STATUS() {
				return RETAIL_MAX_DELQ_STATUS;
			}
			public void setRETAIL_MAX_DELQ_STATUS(String rETAIL_MAX_DELQ_STATUS) {
				RETAIL_MAX_DELQ_STATUS = rETAIL_MAX_DELQ_STATUS;
			}
			public double getRETAIL_BALANCE() {
				return RETAIL_BALANCE;
			}
			public void setRETAIL_BALANCE(double rETAIL_BALANCE) {
				RETAIL_BALANCE = rETAIL_BALANCE;
			}
			public double getRETAIL_sanctionamount() {
				return RETAIL_sanctionamount;
			}
			public void setRETAIL_sanctionamount(double rETAIL_sanctionamount) {
				RETAIL_sanctionamount = rETAIL_sanctionamount;
			}
			public double getSECURED_DISBURSED() {
				return SECURED_DISBURSED;
			}
			public void setSECURED_DISBURSED(double sECURED_DISBURSED) {
				SECURED_DISBURSED = sECURED_DISBURSED;
			}
			public double getUNSECURED_DISBURSED() {
				return UNSECURED_DISBURSED;
			}
			public void setUNSECURED_DISBURSED(double uNSECURED_DISBURSED) {
				UNSECURED_DISBURSED = uNSECURED_DISBURSED;
			}
			public double getSECURED_POS() {
				return SECURED_POS;
			}
			public void setSECURED_POS(double sECURED_POS) {
				SECURED_POS = sECURED_POS;
			}
			public double getUNSECURED_POS() {
				return UNSECURED_POS;
			}
			public void setUNSECURED_POS(double uNSECURED_POS) {
				UNSECURED_POS = uNSECURED_POS;
			}
			public double getHL_POS() {
				return HL_POS;
			}
			public void setHL_POS(double hL_POS) {
				HL_POS = hL_POS;
			}
			public double getLAP_POS() {
				return LAP_POS;
			}
			public void setLAP_POS(double lAP_POS) {
				LAP_POS = lAP_POS;
			}
			public int getACTIVE_IN_HL() {
				return ACTIVE_IN_HL;
			}
			public void setACTIVE_IN_HL(int aCTIVE_IN_HL) {
				ACTIVE_IN_HL = aCTIVE_IN_HL;
			}
			public int getACTIVE_IN_LAP() {
				return ACTIVE_IN_LAP;
			}
			public void setACTIVE_IN_LAP(int aCTIVE_IN_LAP) {
				ACTIVE_IN_LAP = aCTIVE_IN_LAP;
			}
			public Date getRETAIL_EARLIEST_OPEN_DATE() {
				return RETAIL_EARLIEST_OPEN_DATE;
			}
			public void setRETAIL_EARLIEST_OPEN_DATE(Date rETAIL_EARLIEST_OPEN_DATE) {
				RETAIL_EARLIEST_OPEN_DATE = rETAIL_EARLIEST_OPEN_DATE;
			}
			public Date getRETAIL_LATEST_OPEN_DATE() {
				return RETAIL_LATEST_OPEN_DATE;
			}
			public void setRETAIL_LATEST_OPEN_DATE(Date rETAIL_LATEST_OPEN_DATE) {
				RETAIL_LATEST_OPEN_DATE = rETAIL_LATEST_OPEN_DATE;
			}
			public Date getHL_LATEST_OPEN_DATE() {
				return HL_LATEST_OPEN_DATE;
			}
			public void setHL_LATEST_OPEN_DATE(Date hL_LATEST_OPEN_DATE) {
				HL_LATEST_OPEN_DATE = hL_LATEST_OPEN_DATE;
			}
			public Date getLAP_LATEST_OPEN_DATE() {
				return LAP_LATEST_OPEN_DATE;
			}
			public void setLAP_LATEST_OPEN_DATE(Date lAP_LATEST_OPEN_DATE) {
				LAP_LATEST_OPEN_DATE = lAP_LATEST_OPEN_DATE;
			}
			public double getHL_DISBURSED() {
				return HL_DISBURSED;
			}
			public void setHL_DISBURSED(double hL_DISBURSED) {
				HL_DISBURSED = hL_DISBURSED;
			}
			public double getLAP_DISBURSED() {
				return LAP_DISBURSED;
			}
			public void setLAP_DISBURSED(double lAP_DISBURSED) {
				LAP_DISBURSED = lAP_DISBURSED;
			}
			public double getRETAIL_IMPUTED_EMI_WO_CCOD_CURRENT() {
				return RETAIL_IMPUTED_EMI_WO_CCOD_CURRENT;
			}
			public void setRETAIL_IMPUTED_EMI_WO_CCOD_CURRENT(double rETAIL_IMPUTED_EMI_WO_CCOD_CURRENT) {
				RETAIL_IMPUTED_EMI_WO_CCOD_CURRENT = rETAIL_IMPUTED_EMI_WO_CCOD_CURRENT;
			}
			public double getRETAIL_IMPUTED_EMI_CURRENT() {
				return RETAIL_IMPUTED_EMI_CURRENT;
			}
			public void setRETAIL_IMPUTED_EMI_CURRENT(double rETAIL_IMPUTED_EMI_CURRENT) {
				RETAIL_IMPUTED_EMI_CURRENT = rETAIL_IMPUTED_EMI_CURRENT;
			}
			public int getNPA_TAG() {
				return NPA_TAG;
			}
			public void setNPA_TAG(int nPA_TAG) {
				NPA_TAG = nPA_TAG;
			}
			public int getRETAIL_1_30DPD() {
				return RETAIL_1_30DPD;
			}
			public void setRETAIL_1_30DPD(int rETAIL_1_30DPD) {
				RETAIL_1_30DPD = rETAIL_1_30DPD;
			}
			public int getRETAIL_1_60DPD() {
				return RETAIL_1_60DPD;
			}
			public void setRETAIL_1_60DPD(int rETAIL_1_60DPD) {
				RETAIL_1_60DPD = rETAIL_1_60DPD;
			}
			public double getOTHERS_POS() {
				return OTHERS_POS;
			}
			public void setOTHERS_POS(double oTHERS_POS) {
				OTHERS_POS = oTHERS_POS;
			}
			public int getNUM_RETAIL_ACTIVE_ACCTS() {
				return NUM_RETAIL_ACTIVE_ACCTS;
			}
			public void setNUM_RETAIL_ACTIVE_ACCTS(int nUM_RETAIL_ACTIVE_ACCTS) {
				NUM_RETAIL_ACTIVE_ACCTS = nUM_RETAIL_ACTIVE_ACCTS;
			}
			public int getNUM_SECURED_ACCTS() {
				return NUM_SECURED_ACCTS;
			}
			public void setNUM_SECURED_ACCTS(int nUM_SECURED_ACCTS) {
				NUM_SECURED_ACCTS = nUM_SECURED_ACCTS;
			}
			public int getNUM_UNSECURED_ACCTS() {
				return NUM_UNSECURED_ACCTS;
			}
			public void setNUM_UNSECURED_ACCTS(int nUM_UNSECURED_ACCTS) {
				NUM_UNSECURED_ACCTS = nUM_UNSECURED_ACCTS;
			}
			public int getRETAIL_BUREAU_VINTAGE() {
				return RETAIL_BUREAU_VINTAGE;
			}
			public void setRETAIL_BUREAU_VINTAGE(int rETAIL_BUREAU_VINTAGE) {
				RETAIL_BUREAU_VINTAGE = rETAIL_BUREAU_VINTAGE;
			}
			public int getNUM_LIVE_RETAIL() {
				return NUM_LIVE_RETAIL;
			}
			public void setNUM_LIVE_RETAIL(int nUM_LIVE_RETAIL) {
				NUM_LIVE_RETAIL = nUM_LIVE_RETAIL;
			}
			public int getNUM_CLOSED_RETAIL() {
				return NUM_CLOSED_RETAIL;
			}
			public void setNUM_CLOSED_RETAIL(int nUM_CLOSED_RETAIL) {
				NUM_CLOSED_RETAIL = nUM_CLOSED_RETAIL;
			}
			public int getNUM_ACCTS_RETAIL() {
				return NUM_ACCTS_RETAIL;
			}
			public void setNUM_ACCTS_RETAIL(int nUM_ACCTS_RETAIL) {
				NUM_ACCTS_RETAIL = nUM_ACCTS_RETAIL;
			}
			public double getMAX_CURRENT_EMI() {
				return MAX_CURRENT_EMI;
			}
			public void setMAX_CURRENT_EMI(double mAX_CURRENT_EMI) {
				MAX_CURRENT_EMI = mAX_CURRENT_EMI;
			}
			public double getMAX_EMI() {
				return MAX_EMI;
			}
			public void setMAX_EMI(double mAX_EMI) {
				MAX_EMI = mAX_EMI;
			}
			public double getMAX_LOAN_AMOUNT() {
				return MAX_LOAN_AMOUNT;
			}
			public void setMAX_LOAN_AMOUNT(double mAX_LOAN_AMOUNT) {
				MAX_LOAN_AMOUNT = mAX_LOAN_AMOUNT;
			}
			public double getMAX_CURRENT_LOAN_AMOUNT() {
				return MAX_CURRENT_LOAN_AMOUNT;
			}
			public void setMAX_CURRENT_LOAN_AMOUNT(double mAX_CURRENT_LOAN_AMOUNT) {
				MAX_CURRENT_LOAN_AMOUNT = mAX_CURRENT_LOAN_AMOUNT;
			}
			public int getMAX_RETAIL_LOAN_TENURE() {
				return MAX_RETAIL_LOAN_TENURE;
			}
			public void setMAX_RETAIL_LOAN_TENURE(int mAX_RETAIL_LOAN_TENURE) {
				MAX_RETAIL_LOAN_TENURE = mAX_RETAIL_LOAN_TENURE;
			}
			public int getMAX_RETAIL_LOAN_TENURE_CURRENT() {
				return MAX_RETAIL_LOAN_TENURE_CURRENT;
			}
			public void setMAX_RETAIL_LOAN_TENURE_CURRENT(int mAX_RETAIL_LOAN_TENURE_CURRENT) {
				MAX_RETAIL_LOAN_TENURE_CURRENT = mAX_RETAIL_LOAN_TENURE_CURRENT;
			}
			public Date getRETAIL_LATEST_CLOSED_DATE() {
				return RETAIL_LATEST_CLOSED_DATE;
			}
			public void setRETAIL_LATEST_CLOSED_DATE(Date rETAIL_LATEST_CLOSED_DATE) {
				RETAIL_LATEST_CLOSED_DATE = rETAIL_LATEST_CLOSED_DATE;
			}
			public int getNUM_SECURED_CLOSED_ACCTS() {
				return NUM_SECURED_CLOSED_ACCTS;
			}
			public void setNUM_SECURED_CLOSED_ACCTS(int nUM_SECURED_CLOSED_ACCTS) {
				NUM_SECURED_CLOSED_ACCTS = nUM_SECURED_CLOSED_ACCTS;
			}
			public int getNUM_UNSECURED_CLOSED_ACCTS() {
				return NUM_UNSECURED_CLOSED_ACCTS;
			}
			public void setNUM_UNSECURED_CLOSED_ACCTS(int nUM_UNSECURED_CLOSED_ACCTS) {
				NUM_UNSECURED_CLOSED_ACCTS = nUM_UNSECURED_CLOSED_ACCTS;
			}
			public int getNUM_SECURED_LIVE_ACCTS() {
				return NUM_SECURED_LIVE_ACCTS;
			}
			public void setNUM_SECURED_LIVE_ACCTS(int nUM_SECURED_LIVE_ACCTS) {
				NUM_SECURED_LIVE_ACCTS = nUM_SECURED_LIVE_ACCTS;
			}
			public int getNUM_UNSECURED_LIVE_ACCTS() {
				return NUM_UNSECURED_LIVE_ACCTS;
			}
			public void setNUM_UNSECURED_LIVE_ACCTS(int nUM_UNSECURED_LIVE_ACCTS) {
				NUM_UNSECURED_LIVE_ACCTS = nUM_UNSECURED_LIVE_ACCTS;
			}
			public int getNUM_PL_LIVE() {
				return NUM_PL_LIVE;
			}
			public void setNUM_PL_LIVE(int nUM_PL_LIVE) {
				NUM_PL_LIVE = nUM_PL_LIVE;
			}
			public int getNUM_PL_CLOSED() {
				return NUM_PL_CLOSED;
			}
			public void setNUM_PL_CLOSED(int nUM_PL_CLOSED) {
				NUM_PL_CLOSED = nUM_PL_CLOSED;
			}
			public int getNUM_BL_LIVE() {
				return NUM_BL_LIVE;
			}
			public void setNUM_BL_LIVE(int nUM_BL_LIVE) {
				NUM_BL_LIVE = nUM_BL_LIVE;
			}
			public int getNUM_BL_CLOSED() {
				return NUM_BL_CLOSED;
			}
			public void setNUM_BL_CLOSED(int nUM_BL_CLOSED) {
				NUM_BL_CLOSED = nUM_BL_CLOSED;
			}
			public int getNUM_HL_LAP_LIVE() {
				return NUM_HL_LAP_LIVE;
			}
			public void setNUM_HL_LAP_LIVE(int nUM_HL_LAP_LIVE) {
				NUM_HL_LAP_LIVE = nUM_HL_LAP_LIVE;
			}
			public int getNUM_HL_LAP_CLOSED() {
				return NUM_HL_LAP_CLOSED;
			}
			public void setNUM_HL_LAP_CLOSED(int nUM_HL_LAP_CLOSED) {
				NUM_HL_LAP_CLOSED = nUM_HL_LAP_CLOSED;
			}
			public String getLATEST_ACCOUNTSTATUS_RETAIL() {
				return LATEST_ACCOUNTSTATUS_RETAIL;
			}
			public void setLATEST_ACCOUNTSTATUS_RETAIL(String lATEST_ACCOUNTSTATUS_RETAIL) {
				LATEST_ACCOUNTSTATUS_RETAIL = lATEST_ACCOUNTSTATUS_RETAIL;
			}
			public String getLATEST_ACCOUNTSTATUS_PL() {
				return LATEST_ACCOUNTSTATUS_PL;
			}
			public void setLATEST_ACCOUNTSTATUS_PL(String lATEST_ACCOUNTSTATUS_PL) {
				LATEST_ACCOUNTSTATUS_PL = lATEST_ACCOUNTSTATUS_PL;
			}
			public String getLATEST_ACCOUNTSTATUS_BL() {
				return LATEST_ACCOUNTSTATUS_BL;
			}
			public void setLATEST_ACCOUNTSTATUS_BL(String lATEST_ACCOUNTSTATUS_BL) {
				LATEST_ACCOUNTSTATUS_BL = lATEST_ACCOUNTSTATUS_BL;
			}
			public String getLATEST_ACCOUNTSTATUS_HL_LAP() {
				return LATEST_ACCOUNTSTATUS_HL_LAP;
			}
			public void setLATEST_ACCOUNTSTATUS_HL_LAP(String lATEST_ACCOUNTSTATUS_HL_LAP) {
				LATEST_ACCOUNTSTATUS_HL_LAP = lATEST_ACCOUNTSTATUS_HL_LAP;
			}
			public double getTOTAL_DISB_PL() {
				return TOTAL_DISB_PL;
			}
			public void setTOTAL_DISB_PL(double tOTAL_DISB_PL) {
				TOTAL_DISB_PL = tOTAL_DISB_PL;
			}
			public double getTOTAL_DISB_BL() {
				return TOTAL_DISB_BL;
			}
			public void setTOTAL_DISB_BL(double tOTAL_DISB_BL) {
				TOTAL_DISB_BL = tOTAL_DISB_BL;
			}
			public double getTOTAL_DISB_HL_LAP() {
				return TOTAL_DISB_HL_LAP;
			}
			public void setTOTAL_DISB_HL_LAP(double tOTAL_DISB_HL_LAP) {
				TOTAL_DISB_HL_LAP = tOTAL_DISB_HL_LAP;
			}
			public double getBL_POS() {
				return BL_POS;
			}
			public void setBL_POS(double bL_POS) {
				BL_POS = bL_POS;
			}
			public double getPL_POS() {
				return PL_POS;
			}
			public void setPL_POS(double pL_POS) {
				PL_POS = pL_POS;
			}
			public int getBUREAU_VINTAGE_PL() {
				return BUREAU_VINTAGE_PL;
			}
			public void setBUREAU_VINTAGE_PL(int bUREAU_VINTAGE_PL) {
				BUREAU_VINTAGE_PL = bUREAU_VINTAGE_PL;
			}
			public int getBUREAU_VINTAGE_BL() {
				return BUREAU_VINTAGE_BL;
			}
			public void setBUREAU_VINTAGE_BL(int bUREAU_VINTAGE_BL) {
				BUREAU_VINTAGE_BL = bUREAU_VINTAGE_BL;
			}
			public int getBUREAU_VINTAGE_HL_LAP() {
				return BUREAU_VINTAGE_HL_LAP;
			}
			public void setBUREAU_VINTAGE_HL_LAP(int bUREAU_VINTAGE_HL_LAP) {
				BUREAU_VINTAGE_HL_LAP = bUREAU_VINTAGE_HL_LAP;
			}
			public Date getLATEST_CLOSEDATE_PL() {
				return LATEST_CLOSEDATE_PL;
			}
			public void setLATEST_CLOSEDATE_PL(Date lATEST_CLOSEDATE_PL) {
				LATEST_CLOSEDATE_PL = lATEST_CLOSEDATE_PL;
			}
			public Date getLATEST_CLOSEDATE_BL() {
				return LATEST_CLOSEDATE_BL;
			}
			public void setLATEST_CLOSEDATE_BL(Date lATEST_CLOSEDATE_BL) {
				LATEST_CLOSEDATE_BL = lATEST_CLOSEDATE_BL;
			}
			public Date getLATEST_CLOSEDATE_HL_LAP() {
				return LATEST_CLOSEDATE_HL_LAP;
			}
			public void setLATEST_CLOSEDATE_HL_LAP(Date lATEST_CLOSEDATE_HL_LAP) {
				LATEST_CLOSEDATE_HL_LAP = lATEST_CLOSEDATE_HL_LAP;
			}
			public Date getLATEST_CLOSEDATE_SECURED() {
				return LATEST_CLOSEDATE_SECURED;
			}
			public void setLATEST_CLOSEDATE_SECURED(Date lATEST_CLOSEDATE_SECURED) {
				LATEST_CLOSEDATE_SECURED = lATEST_CLOSEDATE_SECURED;
			}
			public Date getLATEST_CLOSEDATE_UNSECURED() {
				return LATEST_CLOSEDATE_UNSECURED;
			}
			public void setLATEST_CLOSEDATE_UNSECURED(Date lATEST_CLOSEDATE_UNSECURED) {
				LATEST_CLOSEDATE_UNSECURED = lATEST_CLOSEDATE_UNSECURED;
			}
			public double getMAX_EMI_PL() {
				return MAX_EMI_PL;
			}
			public void setMAX_EMI_PL(double mAX_EMI_PL) {
				MAX_EMI_PL = mAX_EMI_PL;
			}
			public double getMAX_EMI_BL() {
				return MAX_EMI_BL;
			}
			public void setMAX_EMI_BL(double mAX_EMI_BL) {
				MAX_EMI_BL = mAX_EMI_BL;
			}
			public double getMAX_EMI_SECURED() {
				return MAX_EMI_SECURED;
			}
			public void setMAX_EMI_SECURED(double mAX_EMI_SECURED) {
				MAX_EMI_SECURED = mAX_EMI_SECURED;
			}
			public double getMAX_EMI_UNSECURED() {
				return MAX_EMI_UNSECURED;
			}
			public void setMAX_EMI_UNSECURED(double mAX_EMI_UNSECURED) {
				MAX_EMI_UNSECURED = mAX_EMI_UNSECURED;
			}
			public double getMAX_EMI_HL_LAP() {
				return MAX_EMI_HL_LAP;
			}
			public void setMAX_EMI_HL_LAP(double mAX_EMI_HL_LAP) {
				MAX_EMI_HL_LAP = mAX_EMI_HL_LAP;
			}
			public int getMAX_LOAN_TENURE_HL_LAP() {
				return MAX_LOAN_TENURE_HL_LAP;
			}
			public void setMAX_LOAN_TENURE_HL_LAP(int mAX_LOAN_TENURE_HL_LAP) {
				MAX_LOAN_TENURE_HL_LAP = mAX_LOAN_TENURE_HL_LAP;
			}
			public int getMAX_LOAN_TENURE_PL() {
				return MAX_LOAN_TENURE_PL;
			}
			public void setMAX_LOAN_TENURE_PL(int mAX_LOAN_TENURE_PL) {
				MAX_LOAN_TENURE_PL = mAX_LOAN_TENURE_PL;
			}
			public int getMAX_LOAN_TENURE_BL() {
				return MAX_LOAN_TENURE_BL;
			}
			public void setMAX_LOAN_TENURE_BL(int mAX_LOAN_TENURE_BL) {
				MAX_LOAN_TENURE_BL = mAX_LOAN_TENURE_BL;
			}
			public int getMAX_LOAN_TENURE_SECURED() {
				return MAX_LOAN_TENURE_SECURED;
			}
			public void setMAX_LOAN_TENURE_SECURED(int mAX_LOAN_TENURE_SECURED) {
				MAX_LOAN_TENURE_SECURED = mAX_LOAN_TENURE_SECURED;
			}
			public int getMAX_LOAN_TENURE_UNSECURED() {
				return MAX_LOAN_TENURE_UNSECURED;
			}
			public void setMAX_LOAN_TENURE_UNSECURED(int mAX_LOAN_TENURE_UNSECURED) {
				MAX_LOAN_TENURE_UNSECURED = mAX_LOAN_TENURE_UNSECURED;
			}
			public double getMAX_LOAN_AMOUNT_UNSECURED() {
				return MAX_LOAN_AMOUNT_UNSECURED;
			}
			public void setMAX_LOAN_AMOUNT_UNSECURED(double mAX_LOAN_AMOUNT_UNSECURED) {
				MAX_LOAN_AMOUNT_UNSECURED = mAX_LOAN_AMOUNT_UNSECURED;
			}
			public double getMAX_LOAN_AMOUNT_SECURED() {
				return MAX_LOAN_AMOUNT_SECURED;
			}
			public void setMAX_LOAN_AMOUNT_SECURED(double mAX_LOAN_AMOUNT_SECURED) {
				MAX_LOAN_AMOUNT_SECURED = mAX_LOAN_AMOUNT_SECURED;
			}
			public double getMAX_LOAN_AMOUNT_PL() {
				return MAX_LOAN_AMOUNT_PL;
			}
			public void setMAX_LOAN_AMOUNT_PL(double mAX_LOAN_AMOUNT_PL) {
				MAX_LOAN_AMOUNT_PL = mAX_LOAN_AMOUNT_PL;
			}
			public double getMAX_LOAN_AMOUNT_BL() {
				return MAX_LOAN_AMOUNT_BL;
			}
			public void setMAX_LOAN_AMOUNT_BL(double mAX_LOAN_AMOUNT_BL) {
				MAX_LOAN_AMOUNT_BL = mAX_LOAN_AMOUNT_BL;
			}
			public double getMAX_LOAN_AMOUNT_HL_LAP() {
				return MAX_LOAN_AMOUNT_HL_LAP;
			}
			public void setMAX_LOAN_AMOUNT_HL_LAP(double mAX_LOAN_AMOUNT_HL_LAP) {
				MAX_LOAN_AMOUNT_HL_LAP = mAX_LOAN_AMOUNT_HL_LAP;
			}
			public int getRETAIL_VINTAGE() {
				return RETAIL_VINTAGE;
			}
			public void setRETAIL_VINTAGE(int rETAIL_VINTAGE) {
				RETAIL_VINTAGE = rETAIL_VINTAGE;
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
			public LocalDate getUpdatedate() {
				return updatedate;
			}
			public void setUpdatedate(LocalDate updatedate) {
				this.updatedate = updatedate;
			}
			public Long getCustomerID() {
				return customerID;
			}
			public void setCustomerID(Long customerID) {
				this.customerID = customerID;
			}
			@Override
			public String toString() {
				return "LoanDetails [referenceNo=" + referenceNo + ", memberName=" + memberName + ", dateOfBirth="
						+ dateOfBirth + ", address=" + address + ", state=" + state + ", postal=" + postal
						+ ", landPhoneNumber=" + landPhoneNumber + ", mobilePhone=" + mobilePhone + ", numOpenAccount="
						+ numOpenAccount + ", numOpenAccountOwn=" + numOpenAccountOwn + ", numOpenAccountNonOwn="
						+ numOpenAccountNonOwn + ", sumOutstandingBalance=" + sumOutstandingBalance
						+ ", sumOutstandingBalanceOwn=" + sumOutstandingBalanceOwn + ", sumOutstandingBalanceNonOwn="
						+ sumOutstandingBalanceNonOwn + ", sumInstallmentAmountopen=" + sumInstallmentAmountopen
						+ ", sumInstallmentAmountopenOwn=" + sumInstallmentAmountopenOwn
						+ ", sumInstallmentAmountOpenNonOwn=" + sumInstallmentAmountOpenNonOwn + ", rightOfChargeOfTag="
						+ rightOfChargeOfTag + ", restructureTag=" + restructureTag + ", earliestOpenDate="
						+ earliestOpenDate + ", latestOpenDate=" + latestOpenDate + ", earliestCloseDate="
						+ earliestCloseDate + ", latestCloseDate=" + latestCloseDate + ", earliestOpenDateOwn="
						+ earliestOpenDateOwn + ", latestOpenDateOwn=" + latestOpenDateOwn + ", earliestOpenDateNonOwn="
						+ earliestOpenDateNonOwn + ", latestOpenDateNonOwn=" + latestOpenDateNonOwn
						+ ", earliestCloseDateOwn=" + earliestCloseDateOwn + ", latestCloseDateOwn="
						+ latestCloseDateOwn + ", earliestCloseDateNonOwn=" + earliestCloseDateNonOwn
						+ ", latestCloseDateNonOwn=" + latestCloseDateNonOwn + ", latestMfiInstitution="
						+ latestMfiInstitution + ", isActiveInMfi=" + isActiveInMfi + ", IS_ACTIVE_WITH_SSFB="
						+ IS_ACTIVE_WITH_SSFB + ", IS_WITH_SSFB_ONLY=" + IS_WITH_SSFB_ONLY + ", MFI_VINTAGE="
						+ MFI_VINTAGE + ", MFI_VINTAGE_MARKET=" + MFI_VINTAGE_MARKET + ", MFI_VINTAGE_SSFB="
						+ MFI_VINTAGE_SSFB + ", MFI_1_30DPD=" + MFI_1_30DPD + ", MFI_1_60DPD=" + MFI_1_60DPD
						+ ", MFI_NPA_TAG=" + MFI_NPA_TAG + ", MFI_MAX_DELQ_STATUS=" + MFI_MAX_DELQ_STATUS
						+ ", MFI_BUREAU_VINTAGE=" + MFI_BUREAU_VINTAGE + ", MAX_MFI_EMI=" + MAX_MFI_EMI
						+ ", MAX_MFI_EMI_OPEN=" + MAX_MFI_EMI_OPEN + ", MAX_LOAN_AMOUNT_MFI=" + MAX_LOAN_AMOUNT_MFI
						+ ", MAX_LOAN_AMOUNT_MFI_OPEN=" + MAX_LOAN_AMOUNT_MFI_OPEN + ", LATEST_ACCOUNTSTATUS_MFI="
						+ LATEST_ACCOUNTSTATUS_MFI + ", RETAIL_RESTRUCTURED_TAG=" + RETAIL_RESTRUCTURED_TAG
						+ ", RETAIL_WRITEOFF_TAG=" + RETAIL_WRITEOFF_TAG + ", RETAIL_DELQ_STATUS_RANKED="
						+ RETAIL_DELQ_STATUS_RANKED + ", RETAIL_MAX_DELQ_STATUS=" + RETAIL_MAX_DELQ_STATUS
						+ ", RETAIL_BALANCE=" + RETAIL_BALANCE + ", RETAIL_sanctionamount=" + RETAIL_sanctionamount
						+ ", SECURED_DISBURSED=" + SECURED_DISBURSED + ", UNSECURED_DISBURSED=" + UNSECURED_DISBURSED
						+ ", SECURED_POS=" + SECURED_POS + ", UNSECURED_POS=" + UNSECURED_POS + ", HL_POS=" + HL_POS
						+ ", LAP_POS=" + LAP_POS + ", ACTIVE_IN_HL=" + ACTIVE_IN_HL + ", ACTIVE_IN_LAP=" + ACTIVE_IN_LAP
						+ ", RETAIL_EARLIEST_OPEN_DATE=" + RETAIL_EARLIEST_OPEN_DATE + ", RETAIL_LATEST_OPEN_DATE="
						+ RETAIL_LATEST_OPEN_DATE + ", HL_LATEST_OPEN_DATE=" + HL_LATEST_OPEN_DATE
						+ ", LAP_LATEST_OPEN_DATE=" + LAP_LATEST_OPEN_DATE + ", HL_DISBURSED=" + HL_DISBURSED
						+ ", LAP_DISBURSED=" + LAP_DISBURSED + ", RETAIL_IMPUTED_EMI_WO_CCOD_CURRENT="
						+ RETAIL_IMPUTED_EMI_WO_CCOD_CURRENT + ", RETAIL_IMPUTED_EMI_CURRENT="
						+ RETAIL_IMPUTED_EMI_CURRENT + ", NPA_TAG=" + NPA_TAG + ", RETAIL_1_30DPD=" + RETAIL_1_30DPD
						+ ", RETAIL_1_60DPD=" + RETAIL_1_60DPD + ", OTHERS_POS=" + OTHERS_POS
						+ ", NUM_RETAIL_ACTIVE_ACCTS=" + NUM_RETAIL_ACTIVE_ACCTS + ", NUM_SECURED_ACCTS="
						+ NUM_SECURED_ACCTS + ", NUM_UNSECURED_ACCTS=" + NUM_UNSECURED_ACCTS
						+ ", RETAIL_BUREAU_VINTAGE=" + RETAIL_BUREAU_VINTAGE + ", NUM_LIVE_RETAIL=" + NUM_LIVE_RETAIL
						+ ", NUM_CLOSED_RETAIL=" + NUM_CLOSED_RETAIL + ", NUM_ACCTS_RETAIL=" + NUM_ACCTS_RETAIL
						+ ", MAX_CURRENT_EMI=" + MAX_CURRENT_EMI + ", MAX_EMI=" + MAX_EMI + ", MAX_LOAN_AMOUNT="
						+ MAX_LOAN_AMOUNT + ", MAX_CURRENT_LOAN_AMOUNT=" + MAX_CURRENT_LOAN_AMOUNT
						+ ", MAX_RETAIL_LOAN_TENURE=" + MAX_RETAIL_LOAN_TENURE + ", MAX_RETAIL_LOAN_TENURE_CURRENT="
						+ MAX_RETAIL_LOAN_TENURE_CURRENT + ", RETAIL_LATEST_CLOSED_DATE=" + RETAIL_LATEST_CLOSED_DATE
						+ ", NUM_SECURED_CLOSED_ACCTS=" + NUM_SECURED_CLOSED_ACCTS + ", NUM_UNSECURED_CLOSED_ACCTS="
						+ NUM_UNSECURED_CLOSED_ACCTS + ", NUM_SECURED_LIVE_ACCTS=" + NUM_SECURED_LIVE_ACCTS
						+ ", NUM_UNSECURED_LIVE_ACCTS=" + NUM_UNSECURED_LIVE_ACCTS + ", NUM_PL_LIVE=" + NUM_PL_LIVE
						+ ", NUM_PL_CLOSED=" + NUM_PL_CLOSED + ", NUM_BL_LIVE=" + NUM_BL_LIVE + ", NUM_BL_CLOSED="
						+ NUM_BL_CLOSED + ", NUM_HL_LAP_LIVE=" + NUM_HL_LAP_LIVE + ", NUM_HL_LAP_CLOSED="
						+ NUM_HL_LAP_CLOSED + ", LATEST_ACCOUNTSTATUS_RETAIL=" + LATEST_ACCOUNTSTATUS_RETAIL
						+ ", LATEST_ACCOUNTSTATUS_PL=" + LATEST_ACCOUNTSTATUS_PL + ", LATEST_ACCOUNTSTATUS_BL="
						+ LATEST_ACCOUNTSTATUS_BL + ", LATEST_ACCOUNTSTATUS_HL_LAP=" + LATEST_ACCOUNTSTATUS_HL_LAP
						+ ", TOTAL_DISB_PL=" + TOTAL_DISB_PL + ", TOTAL_DISB_BL=" + TOTAL_DISB_BL
						+ ", TOTAL_DISB_HL_LAP=" + TOTAL_DISB_HL_LAP + ", BL_POS=" + BL_POS + ", PL_POS=" + PL_POS
						+ ", BUREAU_VINTAGE_PL=" + BUREAU_VINTAGE_PL + ", BUREAU_VINTAGE_BL=" + BUREAU_VINTAGE_BL
						+ ", BUREAU_VINTAGE_HL_LAP=" + BUREAU_VINTAGE_HL_LAP + ", LATEST_CLOSEDATE_PL="
						+ LATEST_CLOSEDATE_PL + ", LATEST_CLOSEDATE_BL=" + LATEST_CLOSEDATE_BL
						+ ", LATEST_CLOSEDATE_HL_LAP=" + LATEST_CLOSEDATE_HL_LAP + ", LATEST_CLOSEDATE_SECURED="
						+ LATEST_CLOSEDATE_SECURED + ", LATEST_CLOSEDATE_UNSECURED=" + LATEST_CLOSEDATE_UNSECURED
						+ ", MAX_EMI_PL=" + MAX_EMI_PL + ", MAX_EMI_BL=" + MAX_EMI_BL + ", MAX_EMI_SECURED="
						+ MAX_EMI_SECURED + ", MAX_EMI_UNSECURED=" + MAX_EMI_UNSECURED + ", MAX_EMI_HL_LAP="
						+ MAX_EMI_HL_LAP + ", MAX_LOAN_TENURE_HL_LAP=" + MAX_LOAN_TENURE_HL_LAP
						+ ", MAX_LOAN_TENURE_PL=" + MAX_LOAN_TENURE_PL + ", MAX_LOAN_TENURE_BL=" + MAX_LOAN_TENURE_BL
						+ ", MAX_LOAN_TENURE_SECURED=" + MAX_LOAN_TENURE_SECURED + ", MAX_LOAN_TENURE_UNSECURED="
						+ MAX_LOAN_TENURE_UNSECURED + ", MAX_LOAN_AMOUNT_UNSECURED=" + MAX_LOAN_AMOUNT_UNSECURED
						+ ", MAX_LOAN_AMOUNT_SECURED=" + MAX_LOAN_AMOUNT_SECURED + ", MAX_LOAN_AMOUNT_PL="
						+ MAX_LOAN_AMOUNT_PL + ", MAX_LOAN_AMOUNT_BL=" + MAX_LOAN_AMOUNT_BL
						+ ", MAX_LOAN_AMOUNT_HL_LAP=" + MAX_LOAN_AMOUNT_HL_LAP + ", RETAIL_VINTAGE=" + RETAIL_VINTAGE
						+ ", branchId=" + branchId + ", amount=" + amount + ", status=" + status + ", createDate="
						+ createDate + ", updatedate=" + updatedate + ", customerID=" + customerID + "]";
			}
			
			
			
			
			
			
			
			
			
			
	
		
}
