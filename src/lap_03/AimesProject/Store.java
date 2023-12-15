package lap_03.AimesProject;

public class Store {
    public static final int MAX_NUMBERS_ITEMS = 30;
    private DigitalVideoDisc itemsInStore[]  =
            new DigitalVideoDisc[MAX_NUMBERS_ITEMS];
    private int quantity = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc)  {
        if(this.quantity == MAX_NUMBERS_ITEMS){
            System.out.println("Items in store are full.");
            return;
        }
        itemsInStore[quantity] = disc;
        quantity += 1;
        System.out.println("The disc has been added");
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc)  {
        if(this.quantity == 0){
            System.out.println("The list is empty.");
            return;
        }
        else
        {
            for (int i = 0; i< this.quantity; i++) {
                if(itemsInStore[i] == disc) {
                    itemsInStore[i] = null;
                    System.out.println("The item has been removed.");
                }
            }
        }

    }
    public void print(){
        int number = this.itemsInStore.length;

        if(quantity == 0 ) System.out.println("Store is empty! Please add DVD to Store!");
        else {
            System.out.println("*******************************************STORE*********************************************************");
            System.out.println("All Items: ");
            for ( int i = 0; i < number; i++ )
            {
                if ( itemsInStore[i] == null )
                {
                    continue;
                }
                System.out.print((i + 1) + ".DVD  " + itemsInStore[i].toString());

            }
            System.out.println("********************************************************************************************************");
        }
    }
}