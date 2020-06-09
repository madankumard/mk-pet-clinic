package mk.springframework.mkpetclinic.repositories;

import mk.springframework.mkpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
