/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ci.j2code.resources;

import ci.j2code.entities.Departement;
import ci.j2code.service.IDepartementService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sglo
 */
@RestController
@RequestMapping("/api")
public class DepartementRestController {

    @Autowired
    IDepartementService departementService;

    @PostMapping("/departements/")
    public Departement saveOrUpdate(@RequestBody Departement dep) {
        return this.departementService.createDep(dep);
    }

    @GetMapping("/departements/{id}")
    public Optional<Departement> getOne(@PathVariable Integer id) {
        System.out.println("************* in the Departement getOne");
        return departementService.readOne(id);
    }

    @DeleteMapping("/departements/{id}")
    public void delete(@PathVariable Integer id) {
        departementService.delete(id);
    }

    @GetMapping("/departements")
    public List<Departement> getAll() {
        return departementService.readAll();
    }
}
