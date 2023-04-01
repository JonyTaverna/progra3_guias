package Classes;

public class Author {
    private String name;
    private String lastName;
    private String email;
    private char gender;

    public Author(){}
    public Author (String name, String lastName, String email, char gender){
        this.name= name;
        this.lastName= lastName;
        this.email= email;
        this.gender= gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public char getGender(){
        return gender;
    }
    public  void viewAuthor (){
        System.out.println("Author Data ---");
        System.out.println(this.name);
        System.out.println(this.lastName);
        System.out.println(this.email);
        System.out.println(this.gender);
    }

    @Override
    public String toString() {
        return "\nAuthor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
