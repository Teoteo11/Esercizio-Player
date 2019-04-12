

public class Player extends Person{
    public String role;
    public int numberOfUniform;

    public Player(String name, String surname, String role, int numberOfUniform) {
        super(name,surname);
        this.role=role;
        this.numberOfUniform=numberOfUniform;
    }

    public String getRole() {
        return role;
    }


    @Override
    public String toString() {
        return "Name: " +getName()+
                "\nSurname: " +getSurname()+
                "\nRole: " +role+
                "\nNumberOfUniform: " +numberOfUniform;
    }
}
