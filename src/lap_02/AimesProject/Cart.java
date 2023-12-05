package lap_02.AimesProject;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; // Mảng lưu trữ danh sách các DVD trong cart
    private int qtyOrdered = 0; // Số lượng DVD trong giỏ hàng

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtyOrdered == MAX_NUMBERS_ORDERED) { // Kiểm tra số lượng DVD hiện tại
            System.out.println("The order is full.");
            return;
        }
        itemsOrdered[qtyOrdered] = disc; // dvd thêm vào vị trí qtyOrdered hiện tại
        qtyOrdered += 1;
        System.out.println("The disc has been added");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtyOrdered == 0) { // Kiểm tra số lượng DVD hiện tại
            System.out.println("The list is empty.");
            return;
        } else {
            for (int i = 0; i < this.qtyOrdered; i++) {// duyệt mảng để tìm
                if (itemsOrdered[i] == disc) {
                    itemsOrdered[i] = null; // xóa
                    System.out.println("The item has been removed.");
                }
            }
        }

    }

    public float totalCost() { // Tính tổng các DVD trong giỏ hàng hiện tại
        float totalCost = 0;
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (itemsOrdered[i] == null) {
                continue;
            }
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }
}
