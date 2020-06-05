package mk.springframework.mkpetclinic.model;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vet extends Person{
    private Set<Speciality> specialities = new HashSet<>();
}
