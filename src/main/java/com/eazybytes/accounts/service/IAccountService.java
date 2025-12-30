package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountService {
    /**
     *
     * @Param customerDto- CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @Param Mobile Number
     * @return Account details based on a given mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @Param CustomerDto
     * @return boolean indicating if the update of account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);
}
