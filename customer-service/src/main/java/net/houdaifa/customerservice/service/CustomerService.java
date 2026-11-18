package net.houdaifa.customerservice.service;

import net.houdaifa.customerservice.entities.Customer;
import net.houdaifa.customerservice.repository.CustomerRepository;
import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.ai.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @McpTool(description = "Get all costumors")
    public List <Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @McpTool(description = "Get a custumor by id")
    public Customer findCustomerById(@McpToolParam(description = "The custumor id") Long id){
        return customerRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Custumor not found"));
    }

    @McpTool(description = "Save a new custumor")
    public Customer saveCustomer(@McpToolParam(description = "The custumor to save (name, email)") Customer customer){
        return customerRepository.save(customer);
    }
}
