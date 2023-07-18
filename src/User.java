import java.util.Comparator;

public class User {

    private int id;
    private String name;
    private String surname;
    private String mail;

    public User(int id, String name, String surname, String mail) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    //    @Override
//    public int compareTo(User o) {
//        return name.compareTo(o.name);
//    }
    Comparator<User> compareByid = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.id - o2.id;
        }
    };

    Comparator<User> compareByMail = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.mail.compareTo(o2.mail);
        }
    };
}




