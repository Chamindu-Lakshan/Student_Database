import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", ""
            );
            System.out.println("✅ Connected to MySQL!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
