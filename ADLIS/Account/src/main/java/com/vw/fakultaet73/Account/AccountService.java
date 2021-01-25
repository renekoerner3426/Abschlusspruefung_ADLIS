package com.vw.fakultaet73.Account;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public boolean checkLoginData(Account account) {
		Optional<Account> acc = this.accountRepository.findById(account.getFin());		
		return acc != null ? account.getPassword() == acc.get().getPassword() ? true : false : false;
	}
}
