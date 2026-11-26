package net.houdaifa.ebankservice.controllers;

import net.houdaifa.ebankservice.entities.BankAccount;
import net.houdaifa.ebankservice.services.EbankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EbankRestController {

    private EbankService ebankService;

    public EbankRestController(EbankService ebankService){
        this.ebankService = ebankService;
    }

    @GetMapping("/accounts")
    public List<BankAccount> getAllBankAccounts(){
        return ebankService.getAllBankAccounts();
    }

    @GetMapping("/accounts/{id}")
    public BankAccount getAccountById(@PathVariable String id){
        return ebankService.getAccountById(id);
    }

    @PostMapping("/accounts")
    public BankAccount save(@RequestBody BankAccount bankAccount){
        return ebankService.save(bankAccount);
    }
}
