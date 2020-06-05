package mk.springframework.mkpetclinic.model;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Visit extends BaseEntity{
    private LocalDate date;
    private String description;
    private Pet pet;
    public LocalDate getDate() {
        return date;
    }
}
