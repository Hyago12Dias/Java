package View;

import Controller.ControllerClasse;
import Model.Entidade.Classe;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;


public class Teste {

    private static BufferedReader in;
    private static String code;

    public static void main(String[] args) {

        ControllerClasse teste = new ControllerClasse();
        Classe classe = new Classe();

/**
 *
 * Inserção no banco a partir de um arquivo TXT
 *


        try {

            FileReader reader = new FileReader(new File("C:\\Users\\suporte\\Desktop\\naotemoqfazer.txt"));
            in = new BufferedReader(reader);
            int i;
            int x;

            code = in.readLine();
            String linha[] = code.split(Pattern.quote(","));

            for (i = 0; i < code.length(); i++){
                Classe p = new Classe();
                for (x = 0; x < linha.length; x++){
                    p.setNome(linha[0]);
                    p.setDescricao(linha[1]);

                    p.setTipo(TIPO.valueOf(linha[2]));

                    ATRIBUTO.AGILIDADE.setValor(Double.parseDouble(linha[3]));
                    ATRIBUTO.FORCA.setValor(Double.parseDouble(linha[4]));
                    ATRIBUTO.INTELIGENCIA.setValor(Double.parseDouble(linha[5]));
                }
                teste.adicionar(p);
                code = in.readLine();
                linha = code.split(Pattern.quote(","));
            }
        } catch (Exception e) {

        }
 **/

/**
 *
 * Listar: Retorna tudo que está no banco
 *
 **/
//        List<Classe> listaClasse = teste.listar(classe);
//        for (Classe item : listaClasse) {
//            System.out.println(item.getTipo());
//        }


/**
 *
 * Listar: Inserção em um arquivo TXT
 *
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


    try {
        List<Classe> listaClasse = teste.listar(classe);
        FileWriter arq = new FileWriter("C:\\Users\\suporte\\Desktop\\teste.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        for (Classe item : listaClasse) {
            gravarArq.println(item);
            System.out.println(item);
        }
        arq.close();
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
