package arrays;

class Employee {
    private int empid;
    private String ename;
    private float sal;

    Employee(int eid, String name, float salary) {
        empid = eid;
        ename = name;
        sal = salary;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return ename;
    }

    public float getSal() {
        return sal;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(100, "a", 10000);
        System.out.println(e.getEmpid());
        System.out.println(e.getName());
        System.out.println(e.getSal());
    }
}
