package com.adamzareba.spring.security.oauth2.service;

import com.adamzareba.spring.security.oauth2.model.Company;

import java.util.List;

public interface CompanyService {

    Company getById(Long id);

    Company getByName(String name);

    List<Company> getAll();

    //void create(Company company);

    //Company update(Company company);

    void delete(Long id);

    void delete(Company company);
}
