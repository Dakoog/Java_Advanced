package students;

import java.time.LocalDate;
import java.util.UUID;

public class Student {
    private String  id = UUID.randomUUID().toString();
    private String name;
    private String surname;
    private LocalDate birthday;
    private Address address;
    private int score;


}
