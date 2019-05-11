package Package01;

public class MyPetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet myPet = new Pet();
		
		myPet.setName("Fido");
		
		System.out.println(myPet.getName());
		
		Pet myPet2 = new Pet("Bert");
		
		System.out.println(myPet2.getName());
		
		Betta myBetta01 = new Betta();
		myBetta01.setName("myBettaFish");
		myBetta01.blowBubbles();
			
		System.out.println(myBetta01.getName());

		Betta myBetta02 = new Betta("MYBETTA02");
		
		System.out.println(myBetta02.getName());
	}

}
