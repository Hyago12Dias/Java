package View;

import Controller.ControllerClasse;
import Model.Classe;
import Model.Classe.TIPO;

public class ASAdassd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double forca = 63;

		Classe per = new Classe("Hyago", "Teste", 18, 32, 15, TIPO.RANGE);
		Classe per2 = new Classe("Dias", "Teste", 30, 50, 20, TIPO.MELEE);

		ControllerClasse dd = new ControllerClasse();
		dd.adicionar(per);
		dd.adicionar(per2);

	}
}
