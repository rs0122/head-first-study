package project2;

public class DogDoorSimulator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);

		System.out.println("Fido barks to go outside...");
		remote.pressButton();

		System.out.println("\nFido has gone outside...");
		remote.pressButton();

		System.out.println("\nFido's all done...");
		remote.pressButton();

		System.out.println("\nFido's back inside...");
		remote.pressButton();

	}

}
