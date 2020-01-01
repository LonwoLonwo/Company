public class TopManager extends EmployeeImpl {
    protected double topManagerSalary;

    public TopManager(Company company, double topManagerSalary) {
        super(company);
        this.topManagerSalary = topManagerSalary;
    }

    @Override
    public double getMonthSalary() {
        if(company.getIncome() > 1000000.0){
            return topManagerSalary*2.5;
        }
        else {
            return topManagerSalary;
        }
    }
}
