public class Employee {
    String name;
    int salary;
    int workHours;      // weekly working hours
    int hireYear;
    int time;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        raiseSalary();
        bonus();
        tax();
        ttoString();
    }

    public void ttoString(){
        System.out.println("Employee's name: " + this.name + "\n" +
                "Total earnings of the employee: " + this.salary + "\n" +
                "Hours worked per week: " + this.workHours + "\n" +
                "Employee's date of employment: " + this.hireYear);
    }

    public double raiseSalary(){
        this.time = 2021 - this.hireYear;
        if (this.time < 10){
            this.salary += (this.salary * 0.05);
            return this.salary;
        }
        else if (this.time > 9 && this.time < 20){
            this.salary += (this.salary * 0.1);
            return this.salary;
        }
        else{
            this.salary += (this.salary * 0.15);
            return this.salary;
        }
    }

    public int bonus(){
        if (this.workHours > 40){
            this.salary += (this.workHours - 40) * 30;
            return this.salary;
        }
        else{
            return this.salary;
        }
    }

    public int tax(){
        if (this.salary < 1000){
            return this.salary;
        }
        else{
            this.salary -= (this.salary * 0.3);
            return this.salary;
        }
    }
}
