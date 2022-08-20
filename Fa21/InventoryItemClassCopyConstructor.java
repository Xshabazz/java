public class InventoryItemClassCopyConstructor

{

	public static void main(String [] args) {

		InventoryItem item1 = new InventoryItem("Hammer", 20 );

		System.out.println("Item 1");
		System.out.println("Description: " + item1.getDescription());
		System.out.println("Units: " + item1.getUnits());
		System.out.println();

		InventoryItem copy = new InventoryItem(item1);
		System.out.println("Item 1 Copy");
		System.out.println("Description: " + item1.getDescription());
		System.out.println("Units: " + item1.getUnits());
	}

}