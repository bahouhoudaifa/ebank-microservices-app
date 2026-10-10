package net.houdaifa.ebankservice.repository;

import net.houdaifa.ebankservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    List<BankAccount> findCustomerById(Long id);
}
