import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        if (e1.empSalary == e2.empSalary) {
            return 0;
        } else if (e1.empSalary > e2.empSalary) {
            return 1;
        } else {
            return -1;
        }
    }
}
