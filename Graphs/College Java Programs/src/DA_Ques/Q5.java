package DA_Ques;
import java.io.*;
import java.util.*;

public class Q5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Employee emp1 = new Employee(1, "yash", 10000, "Yash@email", "123456");
        Employee emp2 = new Employee(2, "Alok", 50000, "Alok@email", "456789");
        Employee emp3 = new Employee(3, "Soham", 20000, "Soham@email", "23445");

        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);

        serializeEmployees(emp);

        ArrayList<Employee> filteredEmployees = deserializeEmployees(25000);
        for(Employee employee : filteredEmployees) {
            System.out.println(employee);
        }
    }

    private static void serializeEmployees(ArrayList<Employee> emp) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("emp.dat"));
        outputStream.writeObject(emp);
        System.out.println("Employees has been serialized");
    }

    private static ArrayList<Employee> deserializeEmployees(double minSalary) throws IOException, ClassNotFoundException{
        ArrayList<Employee> filteredEmployees = new ArrayList<>();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("emp.dat"));
        ArrayList<Employee> employees = (ArrayList<Employee>) inputStream.readObject();

        for(Employee employee : employees) {
            if(employee.getSalary() > minSalary) {
                filteredEmployees.add(employee);
            }
        }

        return filteredEmployees;
    }

}
