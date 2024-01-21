package DA_Ques;
import java.io.Serializable;

class Employee implements Serializable{
    private int id;
    private String name;
    private int salary;
    private String email;
    private String mobNo;

    public Employee (int id, String name, int salary, String email, String mobNo) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.mobNo = mobNo;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobNo;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobNo = mobileNumber;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + ", mobileNumber=" + mobNo + "]";
    }
}
