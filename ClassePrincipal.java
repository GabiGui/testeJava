//classe principal

import java.sql.*;
import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String Args[]){
        Connection c = new Conexao().getConnection();
        Statement stm = new Conexao().createStatement(c);
        Metodos m = new Metodos();
        Scanner scan = new Scanner(System.in);
        int op=0;
        retorno:
        while(op!=3){
            System.out.println("--------------------------------------------------");
            System.out.println("Escolha uma opcão:");
            System.out.println("1 - Visualizar média");
            System.out.println("2 - Visualizar clientes que constituiram a média");
            System.out.println("3 - Sair");
            System.out.println("--------------------------------------------------");
            op = Integer.parseInt(scan.next());
            switch(op){
                case 1:
                    m.Average(c, stm);
                    break;
                case 2: 
                    m.Customer(c, stm);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Entrada incorreta. Tente novamente.");    
            }
        }
    } 
}
