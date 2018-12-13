/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ci.j2code.service.impl;

import ci.j2code.entities.Ville;
import ci.j2code.repository.VilleRepository;
import ci.j2code.service.IVilleService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sglo
 */
@Service
public class VilleService implements IVilleService{
    
    @Autowired
    private VilleRepository villeRepository;

    @Override
    public Ville createVille(Ville ville) {
       return this.villeRepository.save(ville);
    }

    @Override
    public Optional<Ville> readOne(int id) {
        return this.villeRepository.findById(id);
    }

    @Override
    public Ville update(Ville ville) {
        return this.villeRepository.save(ville);
    }

    @Override
    public void delete(int id) {
      this.villeRepository.deleteById(id);
    }

    @Override
    public List<Ville> readAll() {
       return this.villeRepository.findAll();
    }
}
