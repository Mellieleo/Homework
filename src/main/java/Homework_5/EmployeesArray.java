package Homework_5;

public class EmployeesArray {
    public static void main(String[] args) {
        Employees[] Staff = new Employees[5];
        Staff[0] = new Employees("Ivan Braginsky", "Developer", "iv.brag@somemaildomain.meh", 1555786421, 35000, 28);
        Staff[1] = new Employees("Arthur Kirkland", "QA Engineer", "epictester@somemaildomain.meh", 1555565345, 35000, 30);
        Staff[2] = new Employees("Francis Bonnefoy", "HR", "bonnefoy@somemaildomain.meh", 1555473341, 30000, 42);
        Staff[3] = new Employees("Alfred Jones", "Team Leader", "alhero@somemaildomain.meh", 1555734168, 40000, 40);
        Staff[4] = new Employees("Feliciano Vargas", "Temp Developer", "fvargas@somemaildomain.meh", 1555423842, 15000, 18);
        for (Employees staff : Staff) {
            if (staff.getAge() >= 40) {
                System.out.println(staff);
                System.out.println();
            }
        }

    }
}
