import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Employee> ss= new TreeSet<Employee>(new NameComparator()) ;
        Employee e1=new Employee(1,"Aman",1000,"Engr");
        Employee e2= new Employee(2,"Richa",1500,"Teacher");
        Employee e3=new Employee(5,"bishal",1600,"Engr");
        Employee e4=new Employee(4,"Vikram",1400,"Devp");
        ss.add(e1);
        ss.add(e2);
        ss.add(e3);
        ss.add(e4);
          System.out.println("Output Sorted on basis of Name");
          for(Employee e:ss) {
          System.out.println(e);}
    }
}

class Employee {
  private int employeeId;
  private String name;
  private int salary;
  private String post;

    public Employee(int employeeId, String name, int salary, String post) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.post = post;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Employee{" +ad
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", post='" + post + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.employeeId-o.employeeId;
//    }
}

class NameComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2 ) {
        return e1.getName().compareTo(e2.getName());
    }
}