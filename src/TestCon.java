import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestCon {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) {

                Connection connection = getConn();
                if (null == connection) {
                    System.out.println("error");
                }else{
                    System.out.println("check");
                }
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static Connection getConn()
        throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver"); // classLoader,加载对应驱动
        return DriverManager.getConnection(
                "jdbc:oracle:thin:@192.168.2.114:1521:orcl", "gssjzx_hn",
                "gssjzx_hn");
    }

}
