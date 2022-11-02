package pe.todotic.demotaller;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin // error de dominio
@RepositoryRestResource(path = "Animales", collectionResourceRel = "Animales")
public interface AnimalsRepository extends CrudRepository<Animales, Integer>{
        
}
