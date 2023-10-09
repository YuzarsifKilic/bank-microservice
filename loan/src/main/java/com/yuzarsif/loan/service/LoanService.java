package com.yuzarsif.loan.service;

import com.yuzarsif.loan.dto.LoanDto;

public interface LoanService {

    void createLoan(String mobileNumber);

    LoanDto fetchLoan(String mobileNumber);

    boolean updateLoan(LoanDto loansDto);

    boolean deleteLoan(String mobileNumber);
}
