/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ci.j2code.service.impl;

import ci.j2code.entities.Departement;
import ci.j2code.repository.DepartementRepository;
import ci.j2code.service.IDepartementService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sglo
 */
@Service
public class DepartementService implements IDepartementService {

    @Autowired
    private DepartementRepository departementRepository;

    @Override
    public Departement createDep(Departement dep) {
        return this.departementRepository.save(dep);
    }

    @Override
    public Optional<Departement> readOne(int id) {
        return this.departementRepository.findById(id);
    }

    @Override
    public Departement update(Departement dep) {
        return this.departementRepository.save(dep);
    }

    @Override
    public void delete(int id) {
        this.departementRepository.deleteById(id);
    }

    @Override
    public List<Departement> readAll() {
        return this.departementRepository.findAll();
    }

}
