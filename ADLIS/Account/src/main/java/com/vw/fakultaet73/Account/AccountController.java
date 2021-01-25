package com.vw.fakultaet73.Account;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private AccountService accountService;
	
	private String accountServiceEnvVar = System.getenv("Account_Service_IP");
	private final String GET_URL = "http://" + this.accountServiceEnvVar + ":8083";

	@CrossOrigin("*")
	@GetMapping("/newAccount")
	@ResponseStatus(HttpStatus.OK)
	public Account saveAccount(@RequestBody Account account) {
		System.out.println("neu klappt");
		return this.accountRepository.save(account);
	}
	
	@CrossOrigin("*")
	@GetMapping("/login")
	@ResponseStatus(HttpStatus.OK)
	public boolean checkLogin(@RequestBody Account account) {
		System.out.println("login klappt");
		return this.accountService.checkLoginData(account);
	}

}
