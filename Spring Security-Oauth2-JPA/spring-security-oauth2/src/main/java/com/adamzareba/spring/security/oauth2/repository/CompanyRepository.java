package com.adamzareba.spring.security.oauth2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adamzareba.spring.security.oauth2.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{

    Company findById(Long id);

    Company findByName(String name);

    List<Company> findAll();

    //void create(Company company);

    //Company update(Company company);

    void delete(Long id);

    void delete(Company company);
}
