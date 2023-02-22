package Seminar003;



public class User implements Comparable<User>{

    private final String firstname;

    private final String secondName;

    private final int age;

    private Personal personal = new Personal();

    public User(String firstname, String secondName, int age) {
        this.firstname = firstname;
        this.secondName = secondName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        int compareFirstname = this.firstname.compareTo(o.firstname);
        if(compareFirstname != 0){
            return compareFirstname;
        }
        int compareSecondname = this.secondName.compareTo(o.secondName);
        if(compareSecondname != 0){
            return compareSecondname;
        }
        return this.age - o.age;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal() {
        return personal;
    }
}
