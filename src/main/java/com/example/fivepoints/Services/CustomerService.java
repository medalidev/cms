package com.example.fivepoints.Services;

import com.example.fivepoints.Dao.DAO;
import com.example.fivepoints.Model.Customer;
import com.example.fivepoints.exception.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {
     @Autowired
     private DAO customerDAO;

    /**private int customerIdCount=1;
       private List<Customer> customerList= new CopyOnWriteArrayList<>();*/

    public Customer addCustomer(Customer customer){
       /** customer.setCustomerID(customerIdCount);
        customerList.add(customer);
        customerIdCount++;
        return customer;*/
        return customerDAO.save(customer);
    }

    public List<Customer> getCustomers(){
       /**return customerList;*/
        return  customerDAO.findAll();
    }

    public Customer getCustomer(int CustomerId){
       /** return customerList
                .stream()
                .filter(c -> c.getCustomerID()==CustomerId)
                .findFirst()
                .get();*/
        Optional<Customer> optionalCustomer=customerDAO.findById(CustomerId);
        if(!optionalCustomer.isPresent())
            throw new CustomerNotFoundException("Not available...");
        return  optionalCustomer.get();
    }

    public Customer updateCustomer(int customerId, Customer customer){
        /** customerList
         .stream()
         .forEach(c-> {
         if (c.getCustomerId() == customerId) {
         c.setCustomerFirstname(customer.getCustomerFirstname());
         c.setCustomerLastname(customer.getCustomerLastname());
         c.setCustomerEmail(customer.getCustomerEmail());
         }
         } );
         return customerList
         .stream()
         .filter(c->c.getCustomerId()==customerId)
         .findFirst()
         .get();
         */
        customer.setCustomerID(customerId);
        return customerDAO.save(customer);
    }

    public void deleteCustomer(int customerId){
       /** customerList
                .stream()
                .forEach(c -> {
                    if(c.getCustomerID()==customerId){
                        customerList.remove(c);
                    }
                });*/
        customerDAO.deleteById(customerId);
    }
}
