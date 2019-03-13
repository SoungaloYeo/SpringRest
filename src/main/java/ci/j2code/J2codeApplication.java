package ci.j2code;

import ci.j2code.entities.Departement;
import ci.j2code.entities.Ville;
import ci.j2code.service.IDepartementService;
import ci.j2code.service.IVilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class J2codeApplication implements CommandLineRunner {

    @Autowired
    IVilleService villeService;

    @Autowired
    IDepartementService departementService;

    public static void main(String[] args) {
        SpringApplication.run(J2codeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        Departement dep = new Departement(null, "YAKRO", 500000, 20);
        //dep = this.departementService.createDep(dep);
        
        Departement dis = new Departement(null, "ABIDJAN", 500000, 20);
        //dis = this.departementService.createDep(dis);

        Ville v = new Ville(null, "Kouassikro", 500, dep);
        Ville v1 = new Ville(null, "Koffikro", 1000, dis);
        this.villeService.createVille(v);
        this.villeService.createVille(v1);

    }
}
