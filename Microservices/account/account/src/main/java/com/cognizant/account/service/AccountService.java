package com.cognizant.account.service;

import com.cognizant.account.model.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    private final List<Account> accounts = new ArrayList<>();

    public AccountService() {
        accounts.add(new Account(1001L, "Savings",  "Active",  25000.00));
        accounts.add(new Account(1002L, "Current",  "Active",  75000.00));
        accounts.add(new Account(1003L, "Savings",  "Inactive", 5000.00));
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }

    public Account getAccount(long accountNumber) {
        return accounts.stream()
                .filter(a -> a.getAccountNumber() == accountNumber)
                .findFirst()
                .orElse(null);
    }

}
