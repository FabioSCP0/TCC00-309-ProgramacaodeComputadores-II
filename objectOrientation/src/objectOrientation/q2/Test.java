package objectOrientation.q2;

public class Test {
	public static void main(String[] args) {
		Country c1 = new Country("Brasil","Brasilia",10000);
		Country c2 = new Country("Argentina","Buenos Aires",500);
		Country c3 = new Country("Uruguai","MonteVideo",100);
		Country c4 = new Country("Brasil","Brasilia",100);
		
		c1.addCrountryBorder(c2);
		c1.addCrountryBorder(c3);
		
		c2.addCrountryBorder(c1);
		c2.addCrountryBorder(c3);
		
		c3.addCrountryBorder(c2);
		c3.addCrountryBorder(c1);
		
		c1.presentCrountryBorders();
		c1.borderBetween(c3);
		if(c1.equals(c4)) {
			System.out.println("iguais");
		}else System.out.println("Não são");
	}
}
