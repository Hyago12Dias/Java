package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoDAO {

    private Connection conexao;
    private String url = "jdbc:postgresql://localhost:5432/TsT";
    private String usuario = "postgres";
    private String senha = "king9977";
    private static ConexaoDAO instance;
    private Statement estado;

/**
    public ConexaoDAO (){
        try{
            Class.forName("org.postgresql.Driver");

            conexao = DriverManager.getConnection(url, usuario, senha);
        }
        catch (Exception e){
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
**/

    private ConexaoDAO (){

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conexao = DriverManager.getConnection(this.url, this.usuario, this.senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ConexaoDAO getInstance(){
        if (ConexaoDAO.instance == null){
            ConexaoDAO.instance = new ConexaoDAO();
        }
        return ConexaoDAO.instance;
    }

    public Connection getConexao() {
        return this.conexao;
    }

}
