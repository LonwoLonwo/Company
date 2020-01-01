import java.util.ArrayList;
import java.util.List;

public class Loader {
    public static void main(String[] args) {
        Company companyFirst = new Company(1000001.0, 15000.0, 30000.0);

        Operator operator1 = new Operator(companyFirst);
        Manager manager1 = new Manager(companyFirst, 35000.0);
        TopManager topManager1 = new TopManager(companyFirst, 150000.0);

        companyFirst.hire(operator1);
        companyFirst.hire(manager1);
        companyFirst.hire(topManager1);

        System.out.println("Доход компании \"Магнитолы за 100, шуточки за 300\": " + companyFirst.getIncome());

        for(int i = 0; i < 180; i++){
            companyFirst.employees.add(new Operator(companyFirst));
        }

        for(int i = 0; i < 80; i++){
            companyFirst.employees.add(new Manager(companyFirst, Math.random()*70000));
        }

        ArrayList<Employee> topManagerList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            topManagerList.add(new TopManager(companyFirst, 50000.0 + Math.random()*100000));
        }
        companyFirst.hireAll(topManagerList);

        System.out.println("Размер компании: " + companyFirst.employees.size());

        List<Employee> top = companyFirst.getTopSalaryStaff(10);
        System.out.println("Топ-10 самых больших зарплат в компании:");
        for(Employee e : top){
            System.out.printf("%2.1f%n", e.getMonthSalary());
        }
        List<Employee> lowest = companyFirst.getLowestSalaryStaff(30);
        System.out.println("Топ-30 самых низкооплачиваемых сотрудников:");
        for(Employee e : lowest){
            System.out.printf("%2.1f%n", e.getMonthSalary());
        }

        System.out.println("Объявляется неделя экономического кризиса.");
        for(int i = 0; i < companyFirst.employees.size(); i = i + 1){
            companyFirst.fire(companyFirst.employees.get(i));
        }
        System.out.println("После репрессий сотрудников компании осталось: " + companyFirst.employees.size());

        List<Employee> top2 = companyFirst.getTopSalaryStaff(10);
        System.out.println("Топ-10 самых больших зарплат в компании:");
        for(Employee e : top2){
            System.out.printf("%2.1f%n", e.getMonthSalary());
        }
        List<Employee> lowest2 = companyFirst.getLowestSalaryStaff(30);
        System.out.println("Топ-30 самых низкооплачиваемых сотрудников:");
        for(Employee e : lowest2){
            System.out.printf("%2.1f%n", e.getMonthSalary());
        }
    }
}
