package Model.DAO;

import Model.Entidade.Classe;
import Model.Entidade.Classe.ATRIBUTO;
import Model.Entidade.Classe.TIPO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClasseDAO implements InterfaceDAO<Classe> {

    PreparedStatement create;
    PreparedStatement insert;
    PreparedStatement update;
    PreparedStatement delete;
    PreparedStatement search;

    @Override
    public void adicionarDAO(Classe t) {


        try {

            String createSQL = ""
                    + "CREATE TABLE IF NOT EXISTS \"TESTE\" ("
                    + "\"ID\" serial primary key not null,"
                    + "\"Nome\" char (20),"
                    + "\"Descricao\" char(500),"
                    + "\"Tipo\" char(7),"
                    + "\"AtributoAgilidade\" double precision not null,"
                    + "\"AtributoForca\" double precision not null,"
                    + "\"AtributoInteligencia\" double precision not null"
                    + ");";

            create = ConexaoDAO.getInstance().getConexao().prepareStatement(createSQL);
            create.executeUpdate();
            create.close();

            String insertSQL = ""
                    + "INSERT INTO \"TESTE\" ("
//					+ "\"ID\","
                    + "\"Nome\","
                    + "\"Descricao\","
                    + "\"Tipo\","
                    + "\"AtributoAgilidade\","
                    + "\"AtributoForca\","
                    + "\"AtributoInteligencia\""
                    + ")"
                    + "Values("
//					+ "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ");";

            insert = ConexaoDAO.getInstance().getConexao().prepareStatement(insertSQL);

//			insert.setInt(1, t.getId());
            insert.setString(1, t.getNome());
            insert.setString(2, t.getDescricao());
            insert.setString(3, t.getTipo().getValor());
            insert.setObject(4, ATRIBUTO.AGILIDADE.getValor());
            insert.setObject(5, ATRIBUTO.FORCA.getValor());
            insert.setObject(6, ATRIBUTO.INTELIGENCIA.getValor());
            insert.executeUpdate();
            insert.close();

            /**
             *
             * Inserção em um arquivo TXT
             *

             FileWriter arq = new FileWriter("C:\\Users\\suporte\\Desktop\\teste.txt");
             PrintWriter gravarArq = new PrintWriter(arq);
             for (int i=0; i<5; i++) {
             gravarArq.print(t.getNome() + ", ");
             gravarArq.print(t.getDescricao() + " ");
             gravarArq.print(t.getTipo().getValor() + ", ");
             gravarArq.print(ATRIBUTO.AGILIDADE.getValor() + ", ");
             gravarArq.print(ATRIBUTO.FORCA.getValor() + ", ");
             gravarArq.println(ATRIBUTO.INTELIGENCIA.getValor());
             }

             arq.close();
             System.out.println(t);
             **/

        } catch (SQLException e) {
            e.getMessage();
        }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void atualizarDAO(Classe t, int id) {

        try {

            String updateSQL = ""
                    + "UPDATE \"TESTE\" SET "
                    + "\"Nome\" = ?"
                    + "\"Descricao\" = ?"
                    + "\"Tipo\" = ?"
                    + "\"AtributoAgilidade\" = ?"
                    + "\"AtributoForca\" = ?"
                    + "\"AtributoInteligencia\" = ?"
                    + "WHERE \"ID\" = ?";

            update = ConexaoDAO.getInstance().getConexao().prepareStatement(updateSQL);

            update.setString(1, t.getNome());
            update.setString(2, t.getDescricao());
            update.setString(3, t.getTipo().getValor());
//            update.setString(3, String.valueOf(t.getTipo()));
            update.setObject(4, ATRIBUTO.AGILIDADE.getValor());
            update.setObject(5, ATRIBUTO.FORCA.getValor());
            update.setObject(6, ATRIBUTO.INTELIGENCIA.getValor());
            update.setInt(7, t.getId());
            update.executeUpdate();

        } catch (SQLException e) {
            e.getMessage();
        }
    }

    @Override
    public void removerDAO(Classe t, int id) {

        try {

            String deleteSQL = "DELETE FROM \"TESTE\" WHERE \"ID\" = ?";

            PreparedStatement delete = ConexaoDAO.getInstance().getConexao().prepareStatement(deleteSQL);
            delete.setInt(1, t.getId());
            delete.executeUpdate();

        } catch (SQLException e) {
            e.getMessage();

        }
    }

    @Override
    public List<Classe> listarDAO(Classe t) {

        List<Classe> listaClasse = new ArrayList<>();

        try {

            String exibirSQL = "SELECT * FROM \"TESTE\"";

            PreparedStatement exibir = ConexaoDAO.getInstance().getConexao().prepareStatement(exibirSQL);

            ResultSet rs = exibir.executeQuery();

            while (rs.next()) {
                Classe classe = new Classe();
                classe.setId(rs.getInt("ID"));
                classe.setNome(rs.getString("Nome"));
                classe.setDescricao(rs.getString("Descricao"));

                classe.setTipo(TIPO.valueOf(rs.getString("Tipo")));
                
                ATRIBUTO.AGILIDADE.setValor(rs.getInt("AtributoAgilidade"));
                ATRIBUTO.FORCA.setValor(rs.getInt("AtributoForca"));
                ATRIBUTO.INTELIGENCIA.setValor(rs.getInt("AtributoInteligencia"));
                listaClasse.add(classe);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return listaClasse;
    }

    @Override
    public List<Classe> buscarDAO(Classe t) {

        List<Classe> listaClasse = new ArrayList();

        try {

            String exibirSQL = "SELECT * FROM \"TESTE\" WHERE \"ID\" = ?";

            PreparedStatement exibir = ConexaoDAO.getInstance().getConexao().prepareStatement(exibirSQL);
            exibir.setInt(1, t.getId());

            ResultSet rs = exibir.executeQuery();

            while (rs.next()) {
                t.setId(rs.getInt("\"ID\""));
                t.setNome(rs.getString("\"Nome\""));
                t.setDescricao(rs.getString("\"Descricao\""));
                ATRIBUTO.AGILIDADE.setValor(rs.getInt("\"AtributoAgilidade\""));
                ATRIBUTO.FORCA.setValor(rs.getInt("\"AtributoForca\""));
                ATRIBUTO.INTELIGENCIA.setValor(rs.getInt("\"AtributoInteligencia\""));
                listaClasse.add(t);
            }

        } catch (SQLException e) {

            e.getMessage();

        }
        return listaClasse;
    }
}
