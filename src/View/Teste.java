package View;

import Controller.ControllerClasse;
import Model.Entidade.Classe;
import Model.Entidade.Classe.TIPO;
import Model.Entidade.Classe.ATRIBUTO;
import java.io.*;
import java.util.regex.Pattern;


public class Teste {

    private static BufferedReader in;
    private static String code;


    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader(new File("C:\\Users\\suporte\\Desktop\\Classe.txt"));
            in = new BufferedReader(reader);
            int i;
            int x;

            code = in.readLine();
            String teste[] = code.split(Pattern.quote(","));

            ControllerClasse add = new ControllerClasse();

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
    }
}

/**
 code = new String (in.readLine().getBytes(), "UTF8");
 System.out.println(System.getProperty("file.encoding"));
 System.out.println(code);

 code = new String (in.readLine().);
**/
