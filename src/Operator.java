public class Operator extends EmployeeImpl {
    public Operator(Company company) {
        super(company);
    }

    @Override
    public double getMonthSalary() {
        return company.operatorSalary;
    }
}
