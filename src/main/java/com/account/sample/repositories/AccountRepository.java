package com.account.sample.repositories;

import com.account.sample.datamodel.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {
    List<Account> findAllAccountDetailsByUserId(Long userId);
}
