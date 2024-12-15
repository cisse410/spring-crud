package sn.cisse410.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.cisse410.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
