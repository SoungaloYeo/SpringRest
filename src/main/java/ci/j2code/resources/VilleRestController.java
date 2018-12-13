/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ci.j2code.resources;

import ci.j2code.entities.Ville;
import ci.j2code.service.IVilleService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author sglo
 */
@RestController
@RequestMapping("/api")
public class VilleRestController {

    @Autowired
    IVilleService iVilleService;
    
    @GetMapping("/villes/{id}")
    public Optional<Ville> getOne(@PathVariable Integer id) {
        return iVilleService.readOne(id);
    }
    
    @DeleteMapping("/villes/{id}")
    public void delete(@PathVariable Integer id) {
        this.iVilleService.delete(id);
    }
    
    @PostMapping("/villes")
    public Ville saveOrUpdate(@RequestBody Ville ville) {
        return this.iVilleService.createVille(ville);
    }
    
    @GetMapping("/villes")
    public List<Ville> getAllvilles() {
        return iVilleService.readAll();
    }
    
    
}
