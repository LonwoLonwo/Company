public class Operator extends EmployeeImpl {
    protected double operatorSalary;

    public Operator(Company company) {
        super(company);
        operatorSalary = 15000.0;
    }

    public Operator(Company company, double operatorSalary) {
        super(company);
        this.operatorSalary = operatorSalary;
    }

    @Override
    public double getMonthSalary() {
        return operatorSalary;
    }
}
