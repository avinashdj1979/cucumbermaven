package dbtest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;
 
public class DBTest {
    public DBTest() {
    }
    String jdbcUrl = null;
    String userid = null;
    String password = null; 
    Connection conn;
    public void getDBConnection() throws SQLException{
        OracleDataSource ds;
        ds = new OracleDataSource();
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:ORCL";
        ds.setURL(jdbcUrl);
        conn=ds.getConnection("c##01","sadu2006");
        String schema = conn.getSchema();
        System.out.println(schema);
        System.out.println(conn);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select empid, empname from employee");
        while(rs.next()) {
        	System.out.println(rs.getInt(1));
        	System.out.println(rs.getString(2));
        }
    }
    
    public static void main(String[] args) {
    	DBTest dt = new DBTest();
    	try {
			dt.getDBConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
