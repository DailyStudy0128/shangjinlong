package testbanking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		String url = "jdbc:postgresql://172.16.32.221:5432/db_demo11";
		String user = "artbase";
		String password = "123456";

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("数据库是否连接成功" + connection);
			String sql = "SELECT * FROM db_export.t_table LIMIT 10";
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				String n_bs = rs.getString(1);
				String c_xm = rs.getString(2);
				System.out.println(n_bs + "\t");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			try {
				rs.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}

	}

}
