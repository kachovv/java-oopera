public class Person {
    private final String name;
    private final String surname;
    Gender gender;

    public enum Gender {
        MALE,
        FEMALE
    }

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
