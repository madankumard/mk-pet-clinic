package mk.springframework.mkpetclinic.formatters;

import mk.springframework.mkpetclinic.model.PetType;
import mk.springframework.mkpetclinic.services.PetTypeService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

@Component
public class PetTpeFormatter implements Formatter<PetType> {

    public final PetTypeService petTypeService;

    public PetTpeFormatter(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public String print(PetType petType, Locale locale) {
        return petType.getName();
    }

    @Override
    public PetType parse(String text, Locale locale) throws ParseException {
        Collection<PetType> findPetTypes = petTypeService.findAll();

        for(PetType type: findPetTypes){
            if(type.getName().equals(text)){
                return type;
            }
        }
        throw new ParseException("type not found: " + text, 0);
    }
}
