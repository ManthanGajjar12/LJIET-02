import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(1, "manthan", 40000));
        al.add(new Employee(2, "rajat", 20000));
        al.add(new Employee(3, "jigar", 70000));
        al.add(new Employee(4, "xyz", 10000));

        System.out.println("Enter the 1 for sorting through NAME ");
        System.out.println("Enter the 2 for sorting through Salary ");
        System.out.println("Enter the way of sorting as mentioned above : ");
        Scanner sc = new Scanner(System.in);
        int way = sc.nextInt();
        switch (way) {
            case 1:
                Collections.sort(al, new NameComparator());
                System.out.println("Based on name sorting");
                for (Employee e : al) {
                    System.out.println("EMP_ID " + e.empId + " NAME : " + e.empName + " Salary : " + e.empSalary);
                }
                break;

            case 2:
                Collections.sort(al, new SalaryComparator());
                System.out.println("Based on salary sorting");
                for (Employee e : al) {
                    System.out.println("EMP_ID " + e.empId + " NAME : " + e.empName + " Salary : " + e.empSalary);
                }
                break;

            default:
                System.out.println("enter the way of sorting as mentioned above");
        }

    }
}
