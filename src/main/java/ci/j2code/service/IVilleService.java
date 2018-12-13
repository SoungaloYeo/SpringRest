/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ci.j2code.service;

import ci.j2code.entities.Ville;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author sglo
 */
public interface IVilleService {
    
    public Ville createVille(Ville ville);
    
    public Optional<Ville> readOne(int id);
    
    public Ville update(Ville ville);
    
    public void delete(int id);
    
    public List<Ville> readAll();
    
    
}
