package com.account.sample.repositories;

import com.account.sample.datamodel.AccountTransactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public  interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, Long> {

    /**
     *
     * @param id
     * @return
     */
    List<AccountTransactions> findAllTransactionsByAccountNumber(Long id);
}
