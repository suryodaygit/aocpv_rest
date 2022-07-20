package com.example.task.entity;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

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
			private int customerID;
			
			
			
			
			
			
			
			
			
			
	
		
}
