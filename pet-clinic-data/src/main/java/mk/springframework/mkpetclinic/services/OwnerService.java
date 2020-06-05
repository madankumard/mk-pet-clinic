package mk.springframework.mkpetclinic.services;

import mk.springframework.mkpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
