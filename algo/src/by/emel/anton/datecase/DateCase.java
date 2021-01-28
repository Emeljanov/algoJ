package by.emel.anton.datecase;

import java.time.LocalDate;

public class DateCase {
    public String switchDate(LocalDate localDate) {
        int i = localDate.getMonth().getValue();

        switch (i){
            case (1) : return "Winter";
            case (2) : return "Winter";
            case (3) : return "Spring";
            case (4) : return "Spring";
            case (5) : return "Spring";
            case (6) : return "Summer";
            case (7) : return "Summer";
            case (8) : return "Summer";
            case (9) : return "Autumn";
            case (10) : return "Autumn";
            case (11) : return "Autumn";
            case (12) : return "Winter";
        }
        return null;
    }
}
