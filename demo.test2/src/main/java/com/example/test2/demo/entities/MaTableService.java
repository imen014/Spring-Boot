package com.example.test2.demo.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaTableService {

    @Autowired
  private UserDataRepository maTableRepository;

    public void enregistrerMaTable(Employee2 maTable_emp) {
        maTableRepository.save(maTable_emp);
    }

    // Autres méthodes selon vos besoins
}