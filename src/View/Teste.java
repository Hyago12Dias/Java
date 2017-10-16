package View;

import Controller.ControllerClasse;
import Model.DAO.ClasseDAO;
import Model.Entidade.Classe;
import Model.Entidade.Classe.TIPO;
import Model.Entidade.Classe.ATRIBUTO;
import java.io.*;
import java.util.List;
import java.util.regex.Pattern;


public class Teste {

    private static BufferedReader in;
    private static String code;

    public static void main(String[] args) {

        ControllerClasse add = new ControllerClasse();
        Classe classe = new Classe();
        ClasseDAO listar = new ClasseDAO();

/**
 *
 * Inserção no banco a partir de um arquivo TXT
 *

        try {

            FileReader reader = new FileReader(new File("C:\\Users\\suporte\\Desktop\\Classe.txt"));
            in = new BufferedReader(reader);
            int i;
            int x;

            code = in.readLine();
            String teste[] = code.split(Pattern.quote(","));

            for (i = 0; i < code.length(); i++){
                Classe p = new Classe();
                for (x = 0; x < teste.length; x++){
                    p.setNome(teste[0]);
                    p.setDescricao(teste[1]);
                    p.setTipo(TIPO.valueOf(String.valueOf(teste[2])));
                    ATRIBUTO.AGILIDADE.setValor(Double.parseDouble(teste[3]));
                    ATRIBUTO.FORCA.setValor(Double.parseDouble(teste[4]));
                    ATRIBUTO.INTELIGENCIA.setValor(Double.parseDouble(teste[5]));
                }
                add.adicionar(p);
                code = in.readLine();
                teste = code.split(Pattern.quote(","));
            }
        } catch (Exception e) {

        }
**/
        List<Classe> listaClasse = add.listar(classe);
        for (Classe item : listaClasse) {
            System.out.println(item);
        }

/**
        try {
            FileWriter arq = new FileWriter("C:\\Users\\suporte\\Desktop\\teste.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            for (int i=0; i<1; i++) {
                gravarArq.println(t.getNome() + ", ");
                gravarArq.println(t.getDescricao() + " ");
                gravarArq.println(String.valueOf(t.getTipo()) + ", ");
                gravarArq.println(ATRIBUTO.AGILIDADE.getValor() + ", ");
                gravarArq.println(ATRIBUTO.FORCA.getValor() + ", ");
                gravarArq.println(ATRIBUTO.INTELIGENCIA.getValor());
            }
            arq.close();
            System.out.println(t);
        }catch (Exception e){

        }
**/

//        add.listar(t);

    }
}

/**
 code = new String (in.readLine().getBytes(), "UTF8");
 System.out.println(System.getProperty("file.encoding"));
 System.out.println(code);

 code = new String (in.readLine().);
**/
