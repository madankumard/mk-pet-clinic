package mk.springframework.mkpetclinic.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PetType extends BaseEntity{
    private String name;

    @Builder
    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }
}
