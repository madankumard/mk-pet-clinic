package mk.springframework.mkpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Pet extends BaseEntity{

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
    private Set<Visit> visits = new HashSet<>();

}
