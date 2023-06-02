/*Create a class "Student.java" with a variable "Name".
Write two functions:
getName() that returns "Name" from state.
setName() that takes an argument and updates the state variable "Name".*/
public class Student {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        public static void main(String[] args) {
            Student student = new Student();
            student.setName("Chinmai Kolisetty");
            System.out.println(student.getName());
    }
}