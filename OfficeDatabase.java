class Employee {

    int empCode;
    String empName;
    String address;
    String phone;

    double DA = 10;
    double HRA = 20;

    Employee(int empCode, String empName,
             String address, String phone) {

        this.empCode = empCode;
        this.empName = empName;
        this.address = address;
        this.phone = phone;
    }

    void displayEmployee() {

        System.out.println("Employee Code : " + empCode);
        System.out.println("Employee Name : " + empName);
        System.out.println("Address       : " + address);
        System.out.println("Phone         : " + phone);
    }

    void salaryStatement(double basicPay) {

        double da = basicPay * DA / 100;
        double hra = basicPay * HRA / 100;

        double grossSalary = basicPay + da + hra;

        System.out.println("Basic Pay     : " + basicPay);
        System.out.println("DA (10%)      : " + da);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("Gross Salary  : " + grossSalary);
    }
}


// --------------------------------------------------
// Teaching
// --------------------------------------------------

class Teaching extends Employee {

    String subjectSpecialization;
    String designation;

    Teaching(int empCode, String empName,
             String address, String phone,
             String subjectSpecialization,
             String designation) {

        super(empCode, empName, address, phone);

        this.subjectSpecialization = subjectSpecialization;
        this.designation = designation;
    }

    void displayTeaching() {

        displayEmployee();

        System.out.println(
            "Subject Specialization : "
            + subjectSpecialization
        );

        System.out.println(
            "Designation             : "
            + designation
        );
    }
}


// --------------------------------------------------
// Faculty
// --------------------------------------------------

class Faculty extends Teaching {

    String researchArea;
    double basicPay;

    Faculty(int empCode, String empName,
            String address, String phone,
            String subjectSpecialization,
            String designation,
            String researchArea,
            double basicPay) {

        super(empCode, empName, address, phone,
              subjectSpecialization, designation);

        this.researchArea = researchArea;
        this.basicPay = basicPay;
    }

    void display() {

        System.out.println("\n===== FACULTY =====");

        displayTeaching();

        System.out.println(
            "Research Area           : "
            + researchArea
        );

        salaryStatement(basicPay);
    }
}


// --------------------------------------------------
// Technical
// --------------------------------------------------

class Technical extends Teaching {

    String techExpertArea;
    double basicPay;

    Technical(int empCode, String empName,
              String address, String phone,
              String subjectSpecialization,
              String designation,
              String techExpertArea,
              double basicPay) {

        super(empCode, empName, address, phone,
              subjectSpecialization, designation);

        this.techExpertArea = techExpertArea;
        this.basicPay = basicPay;
    }

    void display() {

        System.out.println("\n===== TECHNICAL =====");

        displayTeaching();

        System.out.println(
            "Tech Expert Area       : "
            + techExpertArea
        );

        salaryStatement(basicPay);
    }
}


// --------------------------------------------------
// Office
// --------------------------------------------------

class Office extends Employee {

    String position;

    Office(int empCode, String empName,
           String address, String phone,
           String position) {

        super(empCode, empName, address, phone);

        this.position = position;
    }

    void displayOffice() {

        displayEmployee();

        System.out.println(
            "Position      : " + position
        );
    }
}


// --------------------------------------------------
// Administrative
// --------------------------------------------------

class Administrative extends Office {

    double basicPay;

    Administrative(int empCode, String empName,
                   String address, String phone,
                   String position,
                   double basicPay) {

        super(empCode, empName, address, phone, position);

        this.basicPay = basicPay;
    }

    void display() {

        System.out.println("\n===== ADMINISTRATIVE =====");

        displayOffice();

        salaryStatement(basicPay);
    }
}


// --------------------------------------------------
// Accounts
// --------------------------------------------------

class Accounts extends Office {

    double basicPay;

    Accounts(int empCode, String empName,
             String address, String phone,
             String position,
             double basicPay) {

        super(empCode, empName, address, phone, position);

        this.basicPay = basicPay;
    }

    void display() {

        System.out.println("\n===== ACCOUNTS =====");

        displayOffice();

        salaryStatement(basicPay);
    }
}


// --------------------------------------------------
// Main class
// --------------------------------------------------

public class OfficeDatabase {

    public static void main(String[] args) {

        Faculty f = new Faculty(
            101,
            "Rahul",
            "Kolkata",
            "9876543210",
            "Computer Science",
            "Professor",
            "Artificial Intelligence",
            50000
        );

        Technical t = new Technical(
            102,
            "Amit",
            "Delhi",
            "9876501234",
            "Computer Science",
            "Technical Officer",
            "Networking",
            40000
        );

        Administrative a = new Administrative(
            103,
            "Priya",
            "Mumbai",
            "9876512345",
            "Office Manager",
            35000
        );

        Accounts ac = new Accounts(
            104,
            "Sneha",
            "Chennai",
            "9876523456",
            "Accountant",
            30000
        );

        // Display employee information
        f.display();

        t.display();

        a.display();

        ac.display();
    }
}