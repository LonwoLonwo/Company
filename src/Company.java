import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company
{
    private double income;
    public ArrayList<Employee> employees = new ArrayList<>();
    protected double operatorSalary;
    protected double managerSalary;

    public Company(double income, double operatorSalary, double managerSalary){
        this.income = income;
        this.operatorSalary = operatorSalary;
        this.managerSalary = managerSalary;
    }

    public double getIncome() {
        return income;
    }

    public void hire(Employee empl){
        employees.add(empl);
    }

    public void hireAll(ArrayList<Employee> empl){
        employees.addAll(empl);
    }

    public void fire(Employee empl){
        if(employees.contains(empl)){
            employees.remove(empl);
        }
        else{
            System.out.println("Такого сотрудника нет в компании. Попробуйте уволить другого сотрудника.");
        }
    }

    public List<Employee> getTopSalaryStaff(int count){
        if(count > employees.size()){
            System.out.println("В компании недостаточно сотрудников для вывода результата данной операции.");
        }
        Collections.sort(employees, (o1, o2) -> {
            if(o1.getMonthSalary() > o2.getMonthSalary())
            {
                return -1;
            }
            else if(o1.getMonthSalary() < o2.getMonthSalary()){
                return 1;
            }
            return 0;
        });
        ArrayList<Employee> getTopSalaryStaffList = new ArrayList<>();
        for(int i = 0; i < count; i++){
            getTopSalaryStaffList.add(employees.get(i));
        }
        return getTopSalaryStaffList;
    }

    public List<Employee> getLowestSalaryStaff(int count){
        if(count > employees.size()){
            System.out.println("В компании недостаточно сотрудников для вывода результата данной операции");
        }
        Collections.sort(employees, (o1, o2) -> {
            if(o1.getMonthSalary() > o2.getMonthSalary())
            {
                return 1;
            }
            else if(o1.getMonthSalary() < o2.getMonthSalary()){
                return -1;
            }
            return 0;
        });
        ArrayList<Employee> getLowestSalaryStaffList = new ArrayList<>();
        for(int i = 0; i < count; i++){
            getLowestSalaryStaffList.add(employees.get(i));
        }
        return getLowestSalaryStaffList;
    }
}
