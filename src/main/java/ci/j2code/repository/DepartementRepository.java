/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ci.j2code.repository;

import ci.j2code.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sglo
 */
@Repository
public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}
