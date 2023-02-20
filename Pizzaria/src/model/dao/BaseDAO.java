import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {
    // https://www.youtube.com/watch?v=svJAlmL2ABA VER ESSE VIDEO PARA ENTENDER COMO FAZR A CONEXÃO COM O BANCO DE DADOS
    // https://www.youtube.com/watch?v=5X_oxyOaKfQ&t=707s VER ESSE VIDEO PARA TESTAR SE O BANCO DE DADOS ESTA FUNCIONANDO
    
    //Conexão com banco de dados
    Connection conn = null;
    //string de conexão
    String url = "jdbc:mariadb://localhost:3306";
    String user = "root";
    String senha = "root";

    //criar metodo getconnection
    public Connection getConnection(){
        if(conn == null){
            try {
                conn = DriverManager.getConnection(url, user, senha);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            return conn;
        }else{
            return conn;
        }
    }
}
