package br.com.rosa.graphqlexample.repository;

import br.com.rosa.graphqlexample.domain.Account;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    Optional<Account> findByNumber(String number);
}
