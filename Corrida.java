public class Corrida {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Carro c2 = new Carro();

		boolean fimcorrida1 = false;
		boolean fimcorrida2 = false;

		do {
			c1.setNomeDoCarro('#');
			int velocidade1 = c1.sortearVelocidade();
			c1.calcularDistancia(velocidade1);

			c2.setNomeDoCarro('@');
			int velocidade2 = c2.sortearVelocidade();
			c2.calcularDistancia(velocidade2);

			System.out.println("*****************************");	

			String dist1 = "";
			for (int i = 0; i <= c1.getDistancia(); i++) { 
				dist1 += " ";
			}

			System.out.println(dist1 + c1.getNomeDoCarro());

			System.out.println("----------|");

			String dist2 = "";
			for (int i = 0; i <= c2.getDistancia(); i++) {
				dist2 += " ";
			}

			System.out.println(dist2 + c2.getNomeDoCarro());

			System.out.println("----------|");	

			fimcorrida1 = c1.verificarVencedor();
			fimcorrida2 = c2.verificarVencedor();

			if (fimcorrida1 == true | fimcorrida2 == true) {
				if (c1.getDistancia() > c2.getDistancia())
					System.out.println(c1.getNomeDoCarro() + " Venceu a corrida");
				else if (c2.getDistancia() > c1.getDistancia())
					System.out.println(c2.getNomeDoCarro() + " Venceu a corrida");
				else 
					System.out.println("Empate");
			}	

		} while (fimcorrida1 == false && fimcorrida2 == false); 
	}
}