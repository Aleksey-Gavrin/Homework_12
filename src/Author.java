public class Author {
   private final String firstName;
   private final String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getSecondName() {
        return this.secondName;
    }
    @Override
    public String toString() {
        return firstName + " " + secondName;
    }
}

