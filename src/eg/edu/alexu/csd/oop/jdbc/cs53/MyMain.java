package eg.edu.alexu.csd.oop.jdbc.cs53;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JFileChooser;

import eg.edu.alexu.csd.oop.db.cs53.MyDatabase;

public class MyMain {
	static JFileChooser plugChooser = new JFileChooser();


	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
/*		int userselection = plugChooser.showSaveDialog(new Frame());
		if (userselection == JFileChooser.APPROVE_OPTION) {
			String path = plugChooser.getSelectedFile().getAbsolutePath();
			JarReflection x = new JarReflection();
			Driver driver =x.returnDrive(path);*/
		MyDatabase DB = new MyDatabase();
		MyDriver driver = new MyDriver();
		driver.acceptsURL("jdbc:xmldb://localhost");
		Properties info = new Properties();
		String loc = DB.createDatabase("data1", true);
		File dbDir = new File(loc);
		info.put("path", dbDir);
		Connection connection = driver.connect("jdbc:xmldb://localhost", info);
		MyStatement sta = (MyStatement) connection.createStatement();
		//System.out.println(sta.execute("create database mohamedData"));
		sta.executeUpdate("CREATE TABLE table_name9(column_name1 varchar, column_name2 int, column_name3 varchar)");
		sta.executeUpdate(
				"INSERT INTO table_name9(column_NAME1, COLUMN_name3, column_name2) VALUES ('value1', 'value3', 4)");
		sta.executeUpdate(
				"INSERT INTO table_name9(column_NAME1, COLUMN_name3, column_name2) VALUES ('value2', 'value4', 5)");
		sta.executeUpdate(
				"update table_name9 set column_NAME1='mohamed' , COLUMN_name3 = \"ali\"  where column_name2 = 5");
		MyResultset r =(MyResultset) sta.executeQuery("select * from table_name9;");
		MyResultSetMetaData t = (MyResultSetMetaData) r.getMetaData();
		r.beforeFirst();
		for(int i = 0;i <=  1;i++) {
			for(int j = 0;j <= 2;j++) {
				System.out.print(r.getObject(j+1) + " ");
			}
			System.out.println();
			r.next();
		}
		System.out.println(t.getColumnCount());
		
		//System.out.println(sta.executeUpdate("drop TABLE table_name9"));
	
		}
}

