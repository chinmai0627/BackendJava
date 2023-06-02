/*Create an Abstract class "Department.java" that contains abstract
method "getDepartmentSize" which returns an integer.
create a subclass to Department.java and implement the abstract method*/

abstract class Department{
    abstract int getDepartmentSize();
}
class SubDepartment extends Department{
    private int size;
    public SubDepartment(int size) {
        this.size = size;
    }
    public int getDepartmentSize() {
        return size;
    }
}
class AbstractionMain {
    public static void main(String[] args) {
        SubDepartment subDep = new SubDepartment(27);
        int departmentSize = subDep.getDepartmentSize();
        System.out.println("Department size: " + departmentSize);
    }
}
