package mk.springframework.mkpetclinic.repositories;

import mk.springframework.mkpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
