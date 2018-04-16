package eg.edu.alexu.csd.oop.db.cs53;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MainController {
	/*
	 * static ParserFiltrer parser = new ParserFiltrer(); static Adapter ad = ne
	 * Adapter(); public String currentDB = null; public Map<String,Object> str
	 * = new HashMap<String, Object>();
	 * 
	 * public Object getOutput(String quary){ //Map<String,Object> str = new
	 * HashMap<String, Object>(); str = parser.getInfo(quary); str.put("DBName",
	 * currentDB); Object output = ad.getOutput(str); if (((String)
	 * str.get("Operation")).equals("CreateDB")){ currentDB = (String)output; }
	 * //System.out.println(output); //System.out.println(currentDB); return
	 * output; }
	 */

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * MainController con = new MainController(); String quary = "o";
		 * while(!quary.equals("l")){ Scanner s = new Scanner(System.in); quary
		 * = s.nextLine(); System.out.println(con.getOutput(quary)); }
		 */
		/*
		 * MyDatabase d = new MyDatabase(); d.createDatabase("data", true);
		 * System.out.println(d.executeStructureQuery("create database data2 ;")
		 * ); System.out.println(d.
		 * executeStructureQuery("CREATE TABLE table_name1(column_name1 varchar , column_name2 int, column_name3 varchar)"
		 * )); System.out.println(d.
		 * executeUpdateQuery("INSErT INTO mytable (name , phone ) VALUES ( 'mohamed' ,   660 )  ;"
		 * )); System.out.println(d.
		 * executeUpdateQuery("INSErT INTO mytable (name , phone ) VALUES ( 'ahmed' ,   1000 )  ;"
		 * )); //System.out.println(d.createDatabase("data2", true)); Object[][]
		 * result = d.executeQuery("Select * from  mytable ;"); for (Object[] a
		 * : result) { for (Object x : a) { try { int y = (int)x;
		 * System.out.println(y); } catch (Exception e) { System.out.println(x);
		 * } } }
		 * 
		 * 
		 * 
		 * System.out.println(d.
		 * executeUpdateQuery("update  mytable sEt name= 'ali', phone  = 500 whERe name = 'mohamed' ;"
		 * )); System.out.println(d.
		 * executeQuery("Select gh from  mytable where name = 'ali';"));
		 */ // System.out.println(d.executeUpdateQuery("DELETE FROM mytable WHERE
			// name = 'ali' ;"));
			// System.out.println(d.executeUpdateQuery("DELETE FROM mytable
			// WHERE name = 'mohamed' ;"));
			// System.out.println(d.executeQuery("Select * from mytable where
			// name = 'ali';"));
			// System.out.println(d.executeStructureQuery("drop database data2
			// ;"));
			// System.out.println(d.executeStructureQuery("drop table data2
			// ;"));

		/*
		 * String []z = new String[8]; z[0] =
		 * "update  myt_able sEt name= 'alia  -  &^^$  hmed', phone  = 500 whERe name> 'moham'  ;"
		 * ;
		 * 
		 * z[1]= "Select colll from  mtable ;";
		 * 
		 * z[2] =
		 * "INSErT INTO table_name (column1 , column2 , column3) VALUES ( 'value1' ,   '660' , \"value3\" )  ;"
		 * ;
		 * 
		 * z [3]= "Create  databasE   mydata;";
		 * 
		 * z[4] = "Drop  databasE   mydata;";
		 * 
		 * z [5]= "Create  table   mydata(cool varchar(255),ffff int(11));";
		 * 
		 * z[6] = "drOp      table   mydata;";
		 * 
		 * z[7] = "DELETE FROM table_name		WHERE name> 'moha m' ;";
		 */
		/*
		 * for(int i = 0; i < z.length; i++){ Map<String,Object> str = new
		 * HashMap<String, Object>(); str=x.getInfo(z[i]); String ew = (String)
		 * str.get("Operation"); System.out.println(ew +
		 * " \n ========================"); for (Entry<String, Object> entry :
		 * str.entrySet()) { System.out.println(entry.getKey() + "/" +
		 * entry.getValue()); }
		 * System.out.println("================================="); }
		 */

		/*
		 * Map<String,Object> str = new HashMap<String, Object>(); str =
		 * x.getInfo(z[1]); Object output = ad.getOutput(str);
		 * System.out.println(output);
		 */
		// casting as need for

		// System.out.println(x.ismatch(z));
		// x.parse(z);

		/*
		 * Create y = new Create(); z =
		 * "crEAte     table mytable    (       name varchar ( 255  )  ,  Phone int (  11 ) ) ;"
		 * ; System.out.println("###############");
		 * System.out.println(y.ismatch(z)); y.parse(z);
		 */
		// System.out.println(q.ismatch(z));
		// q.parse(z);
		
		MyDatabase d = new MyDatabase();
	//	d.executeStructureQuery("CREATE TABLE table_name0(column_name1 varchar , column_name2 int, column_name3 varchar ) ")/* ); */;
	
		d.createDatabase("hahah", true);
		 System.out.println(d.executeStructureQuery("CREATE DATABASE TestDB"));
		 System.out.println(d.executeStructureQuery("CREATE TABLE table_name1(column_name1 varchar, column_name2 int, column_name3 varchar)"));
		System.out.println(d.executeUpdateQuery("INSERT INTO table_name1(column_name1, column_name3, column_name2) VALUES ('value1', 'value3', 6);"));
		 System.out.println(d.executeQuery("SELECT column_name1 FROM table_name1 ;").toString());
		 
		 System.out.println(d.executeStructureQuery("DROP DATABASE TestDB"));
		 System.out.println(d.executeStructureQuery("CREATE DATABASE TestDB"));
		// System.out.println(d.executeUpdateQuery("INSERT INTO ta.ble_name9(column_NAME1, COLUMN_name3, column_name.2) VALUES ('value1', 'value3', 4)"));
		// System.out.println("1-"+MyDatabase.tables.get("table_name1"));
		// System.out.println("2-"+MyDatabase.tables.get("table_name1"));
		// System.out.println(MyDatabase.tables.get("table_name1"));
		//System.out.println(d.executeUpdateQuery("update  table_name1 sEt column_name1= 'ali', column_name2  = 500 ;"));
		//d.executeStructureQuery("drop database hahah ;");
		System.out.println(d.executeStructureQuery("CREATE TABLE table_name9(column_name1 varchar, column_name2 int, column_name3 varchar)"));/* ); */;
		System.out.println(d.executeStructureQuery("CREATE TABLE table_name9(column_name1 varchar, column_name2 int, column_name3 varchar)"));/* ); */;
		System.out.println(d.executeUpdateQuery("UPDATE table_name9 SET column_name1='value1', column_name2=15, column_name3='value2'"));

		/*d.executeUpdateQuery("INSERT INTO table_name1(column_name1, column_name3, column_name2) VALUES ('value1', 'value3', 4)");
				d.executeUpdateQuery("INSERT INTO table_name1(column_name1, column_name3, column_name2) VALUES ('value1', 'value3', 5)");
		d.executeUpdateQuery("INSERT INTO table_name1(column_name1, column_name3, column_name2) VALUES ('value1', 'value3', 6)");
		d.executeUpdateQuery("DELETE From table_name1 WHERE column_name2=6");
		d.executeQuery("SELECT * FROM table_name1 WHERE column_name2 < 6")	;
*/
		// System.out.println(MyDatabase.tables.get("table_name1"));
		/*
		 * Object[][]result =
		 * d.executeQuery("SELECT column_name1 FROM table_name1 ;"); for
		 * (Object[] a : result) { for (Object x : a) { try { int y = (int)x;
		 * System.out.println(y); } catch (Exception e) { System.out.println(x);
		 * } } }
		 */
		// System.out.println(d.executeUpdateQuery("DELETE FROM table_name1
		// WHERE column_name1 = 'ali' ;"));
		// System.out.println(MyDatabase.tables.get("table_name1"));
	}

}
