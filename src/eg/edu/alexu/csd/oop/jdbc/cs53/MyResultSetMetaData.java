package eg.edu.alexu.csd.oop.jdbc.cs53;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class MyResultSetMetaData implements ResultSetMetaData {
	Object[][] columns;
	String tableName;
	ArrayList<String> columnsNames;

	public MyResultSetMetaData(Object[][] columns, String tableName, ArrayList<String> columnsNames) {
		this.columns=columns;
		this.tableName=tableName;
		this.columnsNames=columnsNames;
	}

	@Override
	public int getColumnCount() throws SQLException {
		if(columns==null)
			throw new SQLException();
		return columns[0].length;
	}

	@Override
	public String getColumnLabel(int column) throws SQLException {
		if(columns==null)
			throw new SQLException();
		return columnsNames.get(column-1);

	}

	@Override
	public String getColumnName(int column) throws SQLException {
		// TODO Auto-generated method stub
		if(columns==null)
			throw new SQLException();
		return columnsNames.get(column-1);
	}

	@Override
	public int getColumnType(int column) throws SQLException {
		// TODO Auto-generated method stub
		if(columns==null)
			throw new SQLException();
		try{
			return java.sql.Types.INTEGER;
			
		}
		catch(Exception e)
		{
			return java.sql.Types.VARCHAR;
		}
	}

	@Override
	public String getTableName(int column) throws SQLException {
		// TODO Auto-generated method stub
		if(columns==null)
			throw new SQLException();
		return tableName;
	}

	/** *************************************************END ***********************************************************/

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public String getCatalogName(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public String getColumnClassName(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();

	}

	/*
	 * @Override public int getColumnCount() throws SQLException { // TODO
	 * Auto-generated method stub return 0; }
	 */

	@Override
	public int getColumnDisplaySize(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();

	}

	/*
	 * @Override public String getColumnLabel(int arg0) throws SQLException { //
	 * TODO Auto-generated method stub return null; }
	 */

	/*
	 * @Override public String getColumnName(int arg0) throws SQLException { //
	 * TODO Auto-generated method stub return null; }
	 */

	/*
	 * @Override public int getColumnType(int arg0) throws SQLException { //
	 * TODO Auto-generated method stub return 0; }
	 */

	@Override
	public String getColumnTypeName(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public int getPrecision(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public int getScale(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public String getSchemaName(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	/*
	 * @Override public String getTableName(int arg0) throws SQLException { //
	 * TODO Auto-generated method stub return null; }
	 */

	@Override
	public boolean isAutoIncrement(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isCaseSensitive(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isCurrency(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isDefinitelyWritable(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public int isNullable(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();

	}

	@Override
	public boolean isReadOnly(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();

	}

	@Override
	public boolean isSearchable(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isSigned(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isWritable(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
