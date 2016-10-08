public class Student{
    private String name;
    private int gradYear;
    private double[] classGrades;
    
    public Student(){ //zero arg construct
        name = new String ("");
        gradYear = 0;
        classGrades = new double [5]; //creating array
    }
    public Student ( String name, int gradYear, double gradeEnglish, double gradeMath, double gradeScience, double gradeFineArts, double gradeSocialScience ){ // 7 arg construct
        this.name = name;
        this.gradYear = gradYear;
        this.classGrades = new double [5]; //creats an array with no doubles
        this.classGrades[0] = gradeEnglish;
        this.classGrades[1] = gradeMath;
        this.classGrades[2] = gradeScience;
        this.classGrades[3] = gradeFineArts;
        this.classGrades[4] = gradeSocialScience;
    }
    
    
    public double calcGPA(){ //add a processor method (tell computer how to calculate someones GPA)
        double total = 0.0;
        
        for ( int index = 0; index < classGrades.length; ++index ){
            // total = total + classgrades[ index ]; // same as below
            total += classGrades[ index ]; //telling computer to add element in array to old total then store in the variable called 'total'
        }
        total /= classGrades.length; //divides total by amount of classes
        return total;
    }
    
    public String toString(){
        String studentInfo = new String(); //stringifying output
            studentInfo = "Student's name is " + name + "\n" +
                          "Student's GPA is " + calcGPA() + "\n" +
                          "Student's Graduation Year is " + gradYear;
            return studentInfo; //return string you created/stringified
    }
}
