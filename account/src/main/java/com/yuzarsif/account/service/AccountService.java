package com.yuzarsif.account.service;

import com.yuzarsif.account.dto.CustomerDto;
import org.springframework.stereotype.Service;

public interface AccountService {

    void createAccount(CustomerDto customer);
    CustomerDto fetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);
}
