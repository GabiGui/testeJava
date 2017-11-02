//classe de conexao

import java.sql.*;

public class Conexao {
      public Connection getConnection(){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                Connection con = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;" + "databaseName=testeValemobi;", "sa", "141099");
                System.out.println("Conexão obtida com sucesso!");
                return con;
            }
            catch(SQLException err){
                System.out.println("SQLExcpetion " + err.getMessage());
            }
            catch(ClassNotFoundException clserr){
                System.out.println("ClassNotFoundException " + clserr.getMessage());
            }
            catch(IllegalAccessException | InstantiationException e){
                System.out.println("Exception " + e.getMessage());
            }
            return null;
    }
      public Statement createStatement(Connection con){
          
          try{
                Statement stm = con.createStatement();
          return stm;
          }
          catch(SQLException err){
                System.out.println("SQLExcpetion " + err.getMessage());
          }
          return null;
      }
   }
