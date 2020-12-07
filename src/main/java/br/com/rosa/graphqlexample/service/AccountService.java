package br.com.rosa.graphqlexample.service;

import br.com.rosa.graphqlexample.domain.Account;
import br.com.rosa.graphqlexample.repository.AccountRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account create(Account account) {
        return accountRepository.save(account);
    }

    public Optional<Account> findaByNumber(String number) {
        return accountRepository.findByNumber(number);
    }

}
