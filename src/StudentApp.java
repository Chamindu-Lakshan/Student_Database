import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n--- Student Database Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Student ID: ");
                        String sid = sc.nextLine();
                        System.out.print("First name: ");
                        String fname = sc.nextLine();
                        System.out.print("Last name: ");
                        String lname = sc.nextLine();
                        System.out.print("Age: ");
                        int age = sc.nextInt(); sc.nextLine();
                        System.out.print("Gender (Male/Female/Other): ");
                        String gender = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        System.out.print("Phone: ");
                        String phone = sc.nextLine();
                        System.out.print("Address: ");
                        String address = sc.nextLine();
                        System.out.print("Course: ");
                        String course = sc.nextLine();
                        System.out.print("Enrollment Year: ");
                        int year = sc.nextInt(); sc.nextLine();

                        Student s = new Student(sid, fname, lname, age, gender, email, phone, address, course, year);
                        dao.addStudent(s);
                        break;

                    case 2:
                        List<Student> list = dao.getAllStudents();
                        System.out.println("\n--- Student List ---");
                        for (Student st : list) {
                            System.out.println(st.getStudentId() + " | " +
                                    st.getFirstName() + " " + st.getLastName() + " | " +
                                    st.getAge() + " | " +
                                    st.getGender() + " | " +
                                    st.getEmail() + " | " +
                                    st.getPhone() + " | " +
                                    st.getAddress() + " | " +
                                    st.getCourse() + " | " +
                                    st.getEnrollmentYear());
                        }
                        break;

                    case 3:
                        System.out.print("Enter Student ID to update: ");
                        String upId = sc.nextLine();
                        System.out.print("First name: ");
                        String uFname = sc.nextLine();
                        System.out.print("Last name: ");
                        String uLname = sc.nextLine();
                        System.out.print("Age: ");
                        int uAge = sc.nextInt(); sc.nextLine();
                        System.out.print("Gender: ");
                        String uGender = sc.nextLine();
                        System.out.print("Email: ");
                        String uEmail = sc.nextLine();
                        System.out.print("Phone: ");
                        String uPhone = sc.nextLine();
                        System.out.print("Address: ");
                        String uAddress = sc.nextLine();
                        System.out.print("Course: ");
                        String uCourse = sc.nextLine();
                        System.out.print("Enrollment Year: ");
                        int uYear = sc.nextInt(); sc.nextLine();

                        Student u = new Student(upId, uFname, uLname, uAge, uGender, uEmail, uPhone, uAddress, uCourse, uYear);
                        dao.updateStudent(u);
                        break;

                    case 4:
                        System.out.print("Enter Student ID to delete: ");
                        String delId = sc.nextLine();
                        dao.deleteStudent(delId);
                        break;

                    case 5:
                        System.out.println("👋 Exiting...");
                        return;

                    default:
                        System.out.println("❌ Invalid choice!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
