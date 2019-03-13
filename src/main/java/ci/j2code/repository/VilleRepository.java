/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ci.j2code.repository;

import ci.j2code.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sglo
 */
public interface VilleRepository extends JpaRepository<Ville, Integer>{
    
}
