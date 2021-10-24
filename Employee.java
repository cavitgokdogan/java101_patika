public class Employee {
    String name;
    int salary;
    int rsalary;
    int workHours;      // weekly working hours
    int hireYear;
    int time;
    int bonus;
    double ssalary;
    double tax;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.rsalary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        raiseSalary();
        bonus();
        tax();
        ttoString();
    }

    public void ttoString(){
        System.out.println("Employee's name: " + this.name + "\n" +
                "Salary: " + this.rsalary + "\n" +
                "Hours worked per week: " + this.workHours + "\n" +
                "Employee's date of employment: " + this.hireYear + "\n" +
                "Tax: " + this.tax + "\n" +
                "Bonus: " + this.bonus + "\n" +
                "Salary increase: " + (this.ssalary + this.bonus) + "\n" +
                "Total salary: " + this.salary);
    }

    public double raiseSalary(){
        this.time = 2021 - this.hireYear;
        if (this.time < 10){
            this.ssalary = (this.salary * 0.05);
            this.salary += (this.salary * 0.05);
            return this.salary;
        }
        else if (this.time > 9 && this.time < 20){
            this.ssalary = (this.salary * 0.1);
            this.salary += (this.salary * 0.1);
            return this.salary;
        }
        else{
            this.ssalary = (this.salary * 0.15);
            this.salary += (this.salary * 0.15);
            return this.salary;
        }
    }

    public int bonus(){
        if (this.workHours > 40){
            this.salary += (this.workHours - 40) * 30;
            this.bonus = (this.workHours - 40) * 30;
            return this.salary;
        }
        else{
            this.bonus = 0;
            return this.salary;
        }
    }

    public int tax(){
        if (this.salary < 1000){
            this.tax = 0;
            return this.salary;
        }
        else{
            this.tax = this.salary * 0.3;
            this.salary -= (this.salary * 0.3);
            return this.salary;
        }
    }
}
