package lu.space.api.exercieAPI.repository;


import lu.space.api.exercieAPI.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account,Long> {
    List<Account> findAll();
}