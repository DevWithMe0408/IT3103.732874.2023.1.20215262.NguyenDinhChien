package lap_03.AimesProject;


public class StoreTest {

    public static void main(String[] args) {
        // Create a new store
        Store store = new Store();

        //Create new dvd objects and add them to the store
        System.out.println("Adding items to the store");

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        store.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        store.addDigitalVideoDisc(dvd3);
        store.print();
        // Removing items from the cart
        System.out.println("Deleting items to the store. After deletion: ");
        store.removeDigitalVideoDisc(dvd2);
        store.print();
    }

}