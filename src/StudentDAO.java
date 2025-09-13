import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public void addStudent(Student student) throws SQLException {
        String sql = "INSERT INTO students (student_id, first_name, last_name, age, gender, email, phone, address, course, enrollment_year) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, student.getStudentId());
            stmt.setString(2, student.getFirstName());
            stmt.setString(3, student.getLastName());
            stmt.setInt(4, student.getAge());
            stmt.setString(5, student.getGender());
            stmt.setString(6, student.getEmail());
            stmt.setString(7, student.getPhone());
            stmt.setString(8, student.getAddress());
            stmt.setString(9, student.getCourse());
            stmt.setInt(10, student.getEnrollmentYear());

            stmt.executeUpdate();
            System.out.println("✅ Student added!");
        }
    }

    public List<Student> getAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Student s = new Student(
                        rs.getString("student_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getString("course"),
                        rs.getInt("enrollment_year")
                );
                students.add(s);
            }
        }
        return students;
    }

    public void updateStudent(Student student) throws SQLException {
        String sql = "UPDATE students SET first_name=?, last_name=?, age=?, gender=?, email=?, phone=?, address=?, course=?, enrollment_year=? WHERE student_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, student.getFirstName());
            stmt.setString(2, student.getLastName());
            stmt.setInt(3, student.getAge());
            stmt.setString(4, student.getGender());
            stmt.setString(5, student.getEmail());
            stmt.setString(6, student.getPhone());
            stmt.setString(7, student.getAddress());
            stmt.setString(8, student.getCourse());
            stmt.setInt(9, student.getEnrollmentYear());
            stmt.setString(10, student.getStudentId());

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Student updated!");
            } else {
                System.out.println("❌ Student not found!");
            }
        }
    }

    public void deleteStudent(String studentId) throws SQLException {
        String sql = "DELETE FROM students WHERE student_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, studentId);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Student deleted!");
            } else {
                System.out.println("❌ Student not found!");
            }
        }
    }
}
