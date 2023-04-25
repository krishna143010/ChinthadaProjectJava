package com.krushna.accountservice.repository;

//import com.javalearning.springbootdemo.entity.Clients;
import com.krushna.accountservice.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepo extends JpaRepository<Clients, Long> {
    //fund manager by name
    public Clients findByclientName(String name);
}
