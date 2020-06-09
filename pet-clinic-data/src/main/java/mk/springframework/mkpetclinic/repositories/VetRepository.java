package mk.springframework.mkpetclinic.repositories;

import mk.springframework.mkpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
