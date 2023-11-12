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
    @Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        if (this == other) {
            return true;
        }
        Author otherAuthor = (Author) other;
        return (firstName.equals(otherAuthor.firstName) && secondName.equals(otherAuthor.secondName));
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(firstName) + java.util.Objects.hashCode(secondName);
    }
}

