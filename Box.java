package Week3;

public class Box {
	int size = 0;

	// Constructor
	public Box() {

	}

	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.size = 5;
		myBox.printBox();
	}

	public void printBox() {
		for (int row = 1; row <= size; row++) {
			for (int star = 1; star <= size; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
