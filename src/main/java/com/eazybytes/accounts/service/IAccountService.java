package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountService {
    /**
     *
     * @Param customerDto- CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
}
