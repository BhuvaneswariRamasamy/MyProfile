package com.jdbc1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class FirstJDBC {

	public FirstJDBC() {
		Connection connection = null;
		Statement statement = null;
//		ResultSet resultSet = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/attendence", "root", "");
			System.out.println(connection);
			statement = connection.createStatement();
			String sql = "update student set studentname='chandru'where studentid=2";
			int ret = statement.executeUpdate(sql);
			System.out.println(ret);


		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {

				if(statement!=null)
					statement.close();
				if(connection!=null)
					connection.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void prepareStatement() {
		Connection connection = null;
		PreparedStatement preparedstatement = null;


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/attendence", "root", "");
			System.out.println(connection);
			String sql="insert into student(studentname,studentid,age)values(?,?,?)";
			preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setString(1, "keerthi");
			preparedstatement.setInt(2, 7);
			preparedstatement.setInt(3, 27);
			int ret=preparedstatement.executeUpdate();
			System.out.println(ret);


		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {

				if(preparedstatement!=null)
					preparedstatement.close();
				if(connection!=null)
					connection.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void transcation () {
		Connection connection = null;
		PreparedStatement preparedstatementOne = null;


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/attendence", "root", "");
			System.out.println(connection);
			connection.setAutoCommit(false);
			String sql="update student set salary=? where studentid=?";
			preparedstatementOne = connection.prepareStatement(sql);
			preparedstatementOne.setDouble(1,3222);
			preparedstatementOne.setInt(2, 2);
			
			int ret=preparedstatementOne.executeUpdate();
			System.out.println(ret);
//			String sql1="update student "
			String sql1="update student set salary=? where studenti=?";
			PreparedStatement preparedstatementTwo = connection.prepareStatement(sql1);
			preparedstatementTwo.setDouble(1,4352);
			preparedstatementTwo.setString(2, "dd");
			
			int ret1=preparedstatementTwo.executeUpdate();
			System.out.println(ret1);
            connection.commit();
		} catch (Exception e) {
			try {
			connection.rollback();
			}catch(Exception e1){
				e.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			try {

				if(preparedstatementOne!=null)
					preparedstatementOne.close();
				if(connection!=null)
					connection.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void dbMetadata(){
	    Connection connection = null;
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
	      connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
	          .getConnection("jdbc:mysql://localhost:3306/attendence","root","");
	      System.out.println(connection);
	      DatabaseMetaData  dbMetaData = connection.getMetaData();
	      System.out.println(dbMetaData.getDatabaseProductName());
	      System.out.println(dbMetaData.getDatabaseProductVersion());
	      System.out.println(dbMetaData.getDatabaseMajorVersion());
	      System.out.println(dbMetaData.getDatabaseMinorVersion());
	    } catch (Exception e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        if(connection != null)
	          connection.close();
	      } catch (Exception e2) {
	        e2.printStackTrace();
	      }
	    }
	  }
	  public void resultsetMetaData(){
	    Connection connection = null;
	    Statement statement = null;
	    ResultSet resultSet = null;
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
	      connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
	          .getConnection("jdbc:mysql://localhost:3306/attendence","root","");
	      System.out.println(connection);
	      statement = connection.createStatement();
	      String sql = "select * from student";
	      resultSet = statement.executeQuery(sql);
	      System.out.println(statement);
	      System.out.println(resultSet);
	      ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
	      System.out.println(resultSetMetaData.getColumnCount());
	      while(resultSet.next()){
	        System.out.print(resultSet.getString("studentid")+resultSetMetaData.getColumnName(1)+resultSetMetaData.getColumnType(1)+"   ");
	        System.out.print(resultSet.getString("studentname")+resultSetMetaData.getColumnName(2)+resultSetMetaData.getColumnType(2)+"   ");
//	        System.out.print(resultSet.getString(3)+resultSetMetaData.getColumnName(3)+resultSetMetaData.getColumnType(3)+"   ");
	        System.out.print(resultSet.getString("age")+resultSetMetaData.getColumnName(3)+resultSetMetaData.getColumnType(3)+"\n");
	      }
	    
	    } catch (Exception e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        if(resultSet != null)
	          resultSet.close();
	        if(statement != null)
	          statement.close();
	        if(connection != null)
	          connection.close();
	      } catch (Exception e2) {
	        e2.printStackTrace();
	      }
	    }
	  }

	public static void main(String[] args) {
		FirstJDBC first = new FirstJDBC();
//		first.resultsetMetaData();
//		 first.dbMetadata();
//		first.prepareStatement();
		first.transcation();
	}

}
