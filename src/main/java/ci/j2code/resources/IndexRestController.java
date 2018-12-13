/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ci.j2code.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sglo
 */
@RestController
@RequestMapping("/api")
public class IndexRestController {

    @GetMapping("/")
    public String index() {
        return "salut objis 10000 codeurs";
    }

}
