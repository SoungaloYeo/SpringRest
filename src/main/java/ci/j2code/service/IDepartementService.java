/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ci.j2code.service;

import ci.j2code.entities.Departement;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author sglo
 */
public interface IDepartementService {
    
    public Departement createDep(Departement dep);
    
    public Optional<Departement> readOne(int id);
    
    public Departement update(Departement dep);
    
    public void delete(int id);
    
    public List<Departement> readAll();
    
}
