package mk.springframework.mkpetclinic.repositories;

import mk.springframework.mkpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
