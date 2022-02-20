package com.rinformatiks.ai.repository;

import com.rinformatiks.ai.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
