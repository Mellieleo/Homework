package Homework_5;

public class Employees {
    private final String fullName;
    private String occupation;
    private String email;
    private int phoneNum;
    private int salary;
    private int age;

    public Employees(String fullName, String occupation, String email, int phoneNum, int salary, int age) {
        this.fullName = fullName;
        this.occupation = occupation;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Full Name: " + fullName +
                "," + '\n' + "Occupation: " + occupation +
                "," + '\n' + "E-mail: " + email +
                "," + '\n' + "Phone Number: " + phoneNum +
                "," + '\n' + "Salary: " + salary +
                "," + '\n' + "Age: " + age;
    }
}
