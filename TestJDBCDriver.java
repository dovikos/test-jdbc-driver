import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Utilitary class to test JDBC driver.
 * 
 * @author Ludovic Heitz
 */
public class TestJDBCDriver {

	/**
	 * Testing connection with the following arguments:
	 * <ul><li>url</li><li>driver</li><li>user</li><li>password</li></ul>
	 * 
	 * @param args the arguments
	 * @throws ClassNotFoundException when failing to load driver
	 * @throws SQLException when database access occurs or url is null
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		final String url = args[0];
		final String driver = args[1];
		final String user = args[2];
		final String password = args[3];

		System.out.println("URL = " + url);
		System.out.println("DRIVER = " + driver);
		System.out.println("USER = " + user);
		System.out.println("PASSWORD = " + password);

		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, user, password);

		if (connection == null) {
			System.err.println("Connection is null");
		} else {
			System.out.println("Connection OK");
		}
	}

}
