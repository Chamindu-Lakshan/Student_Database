public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private String course;
    private int enrollmentYear;

    public Student(String studentId, String firstName, String lastName, int age, String gender,
                   String email, String phone, String address, String course, int enrollmentYear) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.course = course;
        this.enrollmentYear = enrollmentYear;
    }

    public String getStudentId() { return studentId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getCourse() { return course; }
    public int getEnrollmentYear() { return enrollmentYear; }
}
