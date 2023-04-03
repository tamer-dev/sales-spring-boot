package com.warehouses.sales.repository;

import com.warehouses.sales.models.CustomerModel;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerModel,Integer> {


}
