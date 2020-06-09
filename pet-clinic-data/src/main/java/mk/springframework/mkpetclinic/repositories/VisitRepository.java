package mk.springframework.mkpetclinic.repositories;

import mk.springframework.mkpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
