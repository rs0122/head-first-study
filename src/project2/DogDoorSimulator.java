package project2;

public class DogDoorSimulator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		DogDoor door = new DogDoor();
//		Remote remote = new Remote(door);
		BarkRecognizer recognizer = new BarkRecognizer(door);

		System.out.println("Fido barks to go outside...");
		recognizer.recognize("uhh..");
//		remote.pressButton();

		System.out.println("\nFido has gone outside...");
//		remote.pressButton();

		System.out.println("\nFido's all done...");
//		remote.pressButton();

		try {
			Thread.sleep(10000);
		} catch  (InterruptedException e) {
			
		}
		
		System.out.println("\nbut, Fido's still outside...");
		System.out.println("\nFido barks to go inside...");
		recognizer.recognize("uhh..");
//		System.out.println("\nthen, Gina grabs remote controller...");
//		remote.pressButton();
		System.out.println("\nFido's back inside...");
//		remote.pressButton();

	}

}
