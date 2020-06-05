package mk.springframework.mkpetclinic.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Speciality extends BaseEntity{
    private String description;
}
