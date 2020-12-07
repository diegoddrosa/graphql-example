package br.com.rosa.graphqlexample.web.graphql;

import br.com.rosa.graphqlexample.domain.Account;
import br.com.rosa.graphqlexample.service.AccountService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class AccountGraphQL implements GraphQLMutationResolver, GraphQLQueryResolver {

    private AccountService accountService;

    public AccountGraphQL(AccountService accountService) {
        this.accountService = accountService;
    }

    public Optional<Account> findAccount(String number) {
        return accountService.findaByNumber(number);
    }

    public Account createAccount(Account account) {
        return accountService.create(account);
    }
}
