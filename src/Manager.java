public class Manager extends EmployeeImpl {
    protected double managerProfit;
    protected double managerSalary;

    public Manager(Company company, double managerProfit) {
        super(company);
        this.managerProfit = managerProfit;
        this.managerSalary = company.managerSalary + Math.random()*10000;
    }

    @Override
    public double getMonthSalary() {
        return company.managerSalary + managerProfit*0.05;
    }
}
