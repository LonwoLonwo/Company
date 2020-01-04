public class Manager extends EmployeeImpl {
    protected double managerProfit;
    protected double managerSalary;

    public Manager(Company company, double managerProfit) {
        super(company);
        this.managerProfit = managerProfit;
        managerSalary = 30000.0 + Math.random()*10000;
    }

    @Override
    public double getMonthSalary() {
        return managerSalary + managerProfit*0.05;
    }
}
