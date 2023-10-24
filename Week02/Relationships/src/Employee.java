public class Employee {

    private int empNo;
    private Laptop laptop;

    public Employee(int empNo) {
        this.empNo = empNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", laptop=" + laptop +
                '}';
    }
}
