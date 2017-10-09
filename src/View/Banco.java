package View;

import Controller.ControllerClasse;
import Model.Entidade.Classe;
import Model.Entidade.Classe.TIPO;

import java.io.IOException;

public class Banco {
    public static void main(String[] args) throws IOException {
        Classe p = new Classe("Ladino",
                "Ladino é um tipo de classe de ladrão " +
                        "e muito furtivos, se o ladinos não estão roubando algo,  " +
                        "estão trabalhando numa busca por tesouro, " +
                        "que antes de repartir os lucros com seus" +
                        " \"parceiros\" ele já os roubou.", TIPO.MELEE, 25, 15, 10);

        ControllerClasse dd = new ControllerClasse();
        dd.adicionar(p);

    }





}
