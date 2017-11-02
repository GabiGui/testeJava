//classe de métodos

import java.sql.*;

public class Metodos {
    public String query, nm, cpf, status;
    public float vl;
    public int id;
    public boolean active;
    public ResultSet rs;
    public void Average(Connection con, Statement stmt){
        try {
            query = "select AVG(vl_total) as average from tb_customer_account where  id_customer between 1500 and 2700 and vl_total > 560.00 "; 
            rs = stmt.executeQuery(query);
            if(rs.next()){
                System.out.println("A média feita com os registros que possuem id entre 1500 e 2700 e saldo maior que 560 é " + rs.getFloat(1));
            }
        }
        catch (SQLException ex) {
            System.out.println("SQLException " + ex);
        }
    }
     public void Customer(Connection con, Statement stmt){
         try{
             query = "select * from tb_customer_account where  id_customer between 1500 and 2700 and vl_total > 560.00  order by vl_total desc";
             rs = stmt.executeQuery(query);
             while(rs.next()){
                 id = rs.getInt("id_customer");
                 cpf = rs.getString("cpf_cnpj");
                 nm = rs.getString("nm_customer");
                 active = rs.getBoolean("is_active");
                 vl = rs.getFloat("vl_total");

                 if(active = true)status = "ativo"; else status = "inativo";
                 System.out.println("ID: " + id + " | CPF/CNPJ: " + cpf + " | NOME:  " + nm + " | STATUS: " + status + " | SALDO: " + String.format("R$%.2f", vl));
             }
         }
         catch(SQLException ex){
             System.out.println("SQLException " + ex);
         }
     }
}
