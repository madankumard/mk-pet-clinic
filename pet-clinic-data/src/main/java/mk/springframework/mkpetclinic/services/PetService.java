package mk.springframework.mkpetclinic.services;

import mk.springframework.mkpetclinic.model.Pet;

public interface PetService extends CrudService<Pet, Long> {

    public default void me1(){
        System.out.println("hello1");
    }
    public default void me2(){
        System.out.println("hello1");
    }
}
