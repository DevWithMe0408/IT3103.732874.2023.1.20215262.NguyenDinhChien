package lap_02.AimesProject;

public class TessPassingParameter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle",
                "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella",
                "Science Fiction", "George Lucas", 87, 24.95f);

        swap(jungleDVD, cinderellaDVD.getTitle(), cinderellaDVD.getCategory(),
                cinderellaDVD.getDirector(), cinderellaDVD.getLength(), cinderellaDVD.getCost());
        System.out.println("jungle dvd: " + jungleDVD.getTitle() + ", " + jungleDVD.getCategory()
                + jungleDVD.getDirector() + ", " + jungleDVD.getLength() + jungleDVD.getCost() + ".");

//		swap(jungleDVD, cinderellaDVD);
//		System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
//		System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());
//
//		changeTitle(jungleDVD, cinderellaDVD.getTitle());
//		System.out.println("jungle dvd title: "+ jungleDVD.getTitle());

//		System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
    }
//	public static void swap(Object o1, Object o2) {
//		Object tmp = o1;
//		o1 = o2;
//		o2 = tmp;
//	}


    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);

    }

    public static void swap(DigitalVideoDisc dvd, String title, String category, String director, int length, float cost) {
        // Change the title
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);

        String oldCategory = dvd.getCategory();
        dvd.setCategory(category);

        String oldDirector = dvd.getDirector();
        dvd.setCategory(director);
        int oldLength = dvd.getLength();
        dvd.setLength(length);
        float oldCost = dvd.getCost();
        dvd.setCost(cost);

        dvd = new DigitalVideoDisc(oldTitle, oldCategory, oldDirector, oldLength, oldCost);
    }

}
