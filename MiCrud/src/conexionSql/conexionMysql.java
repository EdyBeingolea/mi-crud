
package conexionSql;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexionMysql {
    
    Connection conectar=null;
    public Connection conexion(){
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/clientes","root","admin");
            
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"error de conexion" +e.getMessage());
        }
        return conectar;
    }
}
