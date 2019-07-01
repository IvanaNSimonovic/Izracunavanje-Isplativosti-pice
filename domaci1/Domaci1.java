package domaci1;

public class Domaci1 {

	public static void main(String[] args) {
		int cenaMala = 170;
		int cenaParce = 150;
		int rMala = 23, rVelika = 40;

		double povrsinaMala = (Math.pow(rMala, 2)* Math.PI);
		double povrsinaVelika = (Math.pow(rVelika, 2) * Math.PI);
		double povrsinaParce = (povrsinaVelika / 5);

		double isplativostMala = (povrsinaMala / cenaMala);
		double isplativostParce = (povrsinaParce / cenaParce);

		System.out.printf("povrsina male: %.2f cm2 cena: %d din cm2 po dinaru %.2f cm2\n",
				povrsinaMala, cenaMala, isplativostMala);
		System.out.printf("povrsina parceta: %.2f cm2 cena: %d din cm2 po dinaru: %.2f cm2\n", povrsinaParce,cenaParce,isplativostParce);

		if (isplativostMala > isplativostParce) {
			System.out.println("mala pizza je isplativija!");
		} else {
			System.out.println("mala pizza nije isplativija!");

		}

	}

}
