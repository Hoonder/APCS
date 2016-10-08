public class P2CStudent{
    private String firstname;
    private String lastname;
    private int grade;
    private int age;
    public P2CStudent(){
        firstname = new String ( "Microsoft" );
        lastname = new String ( "Sam" );
        int grade = 0;
        int age = 0;
    }
    public P2CStudent( String firstname, String lastname, int grade, int age ){
        this.firstname = firstname;
        this.lastname = lastname;
        this.grade = grade;
        this.age = age;
    }
    public String toString(){
        String output = new String();
        output = "Student name: " + firstname + " " +lastname + "\n" +
                 "Grade: " + grade + "\n" +
                 "Age: " + age;
                 return output;
    }
}