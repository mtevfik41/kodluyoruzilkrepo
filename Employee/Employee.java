package kodluyoruzilkrepo.Employee;

public class Employee {
    String firstName;
    String lastName;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String firstName, String lastName, double salary, double workHours, int hireYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        }

        return (salary * 3) / 100;
    }

    public double bonus() {
        double x = workHours - 40;
        if (x < 0)
            workHours = 40;
        return x * 30;
    }

    public double raiseSalary() {
        int years = 2021 - hireYear;
        if (years <= 9) {
            return (salary * 5) / 100;
        } else if (years > 9 && years <= 19) {
            return (salary * 10) / 100;
        }
        return (salary * 15) / 100;
    }

    @Override
    public String toString() {
        return "İsim = " + firstName + "\n" + "Soyisim = " + lastName + "\n" + "Maaş = " + salary + "\nÇalışma Saati = "
                + workHours + "\nBaşlangıç yılı = " + hireYear + "\nVergi = " + tax() + "\nBonus = " + bonus()
                + "\nMaaş Artışı = " + raiseSalary() + "\nVergi ve bonuslarla ile birlikte maaş: "
                + (salary - tax() + bonus() + raiseSalary());
    }
}
