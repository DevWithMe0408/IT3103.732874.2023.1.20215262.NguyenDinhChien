package lap_04.AimesProject;

import java.util.Scanner;
import lap_04.AimesProject.Cart;
import lap_04.AimesProject.Media.Book;
import lap_04.AimesProject.Media.CompactDisc;
import lap_04.AimesProject.Media.DigitalVideoDisc;
import lap_04.AimesProject.Media.Disc;
import lap_04.AimesProject.Media.Media;
import lap_04.AimesProject.Media.Playable;
import lap_04.AimesProject.Media.Track;
import lap_04.AimesProject.Store;

// AIMS PROJECT

public class Aims {
    boolean exit;
    Scanner kb = new Scanner(System.in);
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("----------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("----------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("----------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("----------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("----------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("----------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("----------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("----------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    public static void UpdateStore() {
        System.out.println("------------------------");
        System.out.println("1. Add media to store");
        System.out.println("2. Remove media to store");
        System.out.println("0. Back");
        System.out.println("------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void addStoreMenu() {
        System.out.println("------------------------");
        System.out.println("1. Add Book");
        System.out.println("2. Add CD");
        System.out.println("3. Add DVD");
        System.out.println("0. Back");
        System.out.println("------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public void runMenu(Cart cart,Store store) {
        while(!exit) {
            boolean loop = true;
            showMenu();
            int choice = getInput(3);
            switch(choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    storeMenu();
                    loop = true;
                    int choice1 = getInput(4);
                    label0: while(loop==true) {
                        switch(choice1) {
                            case 0: loop = false; break;
                            case 1: mediaDetails(store,cart); break label0;
                            case 2: addCart(cart, store); break label0;
                            case 3: playMediaStore(store); break label0;
                            case 4: currentCart(cart); break label0;
                        }
                    }
                    break;
                case 2:
                    UpdateStore();
                    loop = true;
                    int choice2 = getInput(2);
                    label1:	while(loop==true) {
                        switch(choice2) {
                            case 0:
                                loop = false;
                                break;
                            case 1:
                                addMediaStore(store);
                                break label1;
                            case 2:
                                removeMediaStore(store);
                                break label1;
                        }
                    }
                    break;
                case 3:
                    currentCart(cart);
            }
        }
    }
    private int getInput(int x) {
        int choice = -1;
        while(choice<0 || choice >x) {
            try {
                choice = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
            }
        }

        return choice;
    }

    //-------------------------------------------
    //	function STORE MENU
    //	FUNCTION: ouputTitle
    //	Lưu title từ bàn phím
    //	@return title
    private String outputTitle() {
        System.out.println("Nhap title: ");
        return(kb.nextLine());
    }
    // 1.1 See a media's details
    //	Xem một thông tin media và in menu tiếp theo
    // 	input: title in store
    //	output: print media information
    //	output: media's details menu
    private void mediaDetails(Store store, Cart cart) {
        String title = outputTitle();
        Media media = store.findMedia(title);
        if(media!=null) {
            System.out.println(media.toString());

            mediaDetailsMenu();
            int x = getInput(2);
            if(x==1) {
                cart.addMedia(media); // 1.1.1 addCart tương đương 1.2
            } else if(x==2) { //// 1.2.1 playMedia tương đương 1.3
                if(media instanceof Playable) {
                    ((Playable)media).play();
                } else System.out.println("Can't find the media to play");
            }
        }
    }
    // 1.2. Add a media to cart
    // input: title of media in store
    // output: add to cart
    // output: print numbers of dvd in cart
    private void addCart(Cart cart,Store store) {
        String title = outputTitle();
        Media media = store.findMedia(title);
        if(media!=null) {
            cart.addMedia(media);
            System.out.println("You have added a media in cart");
            cart.printSize();
        }
    }
    // 1.3. Play a media in store
    // input: title of media in store
    // output: play media
    private void playMediaStore(Store store) {
        String title = outputTitle();
        Media media = store.findMedia(title);
        if(media instanceof Playable) {
            ((Playable)media).play();
        } else System.out.println("Can't find the media to play");
    }
    // 1.4. See current cart
    // Tuong tu see current cart in showMenu
    // END FUNCTION STORE
    //------------------------------------


    // -----------------------------------
    // 2. UPDATE STORE
    // Function: InsertMedia
    // set Title, Category, Cost for media
    // use for addMedia
    private void insertMedia(Media media) {
        System.out.println("Nhap title: ");
        media.setTitle(kb.nextLine());
        System.out.println("Nhap category: ");
        media.setCategory(kb.nextLine());
        System.out.println("Nhap cost: ");
        media.setCost(Float.parseFloat(kb.nextLine()));
    }
    //FUNCTION: InsertDisc
    // set Director and Length for DVD
    private void insertDisc(Disc disc) {
        System.out.println("Nhap director: ");
        disc.setDirector(kb.nextLine());
        System.out.println("Nhap length: ");
        disc.setLength(Integer.parseInt(kb.nextLine()));
    }
    // 2.1 Add a media to store
    // three Option: add Book, add CD or add DVD
    // Book: Title, Category, Cost, Authors_List
    // CD: Title, Category, Cost, Director, Length, Tracks_List(titleTrack, length)
    // DVD: Title, Category, Cost, Director, Length
    private void addMediaStore(Store store) {
        addStoreMenu();
        boolean loop = true;
        int choice = getInput(3);
        label: while(loop== true) {
            switch(choice) {
                case 0: loop = false; break;
                // add book
                case 1:
                    Book bk = new Book();
                    insertMedia(bk);
                    boolean x=true;
                    while(x==true) {
                        System.out.println("Nhap author:");
                        bk.addAuthor(kb.nextLine());
                        System.out.println("Ban co muon nhap author tiep khong?(True/False)");
                        x =Boolean.parseBoolean(kb.nextLine());
                    }
                    store.addMedia(bk);
                    break label;
                // add cd
                case 2:
                    CompactDisc cd = new CompactDisc();
                    insertMedia(cd);
                    System.out.println("Nhap director: ");
                    cd.setDirector(kb.nextLine());
                    System.out.println("Nhap tracks:");
                    int i=1;
                    x=true;
                    while(x==true) {
                        System.out.println("Tracks "+i);
                        System.out.println("Title:");
                        String titleTrack = kb.nextLine();
                        System.out.println("Length: ");
                        int lengthTrack = Integer.parseInt(kb.nextLine());
                        Track track = new Track(titleTrack,lengthTrack);
                        cd.addTrack(track);
                        i++;
                        System.out.println("Ban co muon nhap track tiep khong?(True/False)");
                        x =Boolean.parseBoolean(kb.nextLine());
                    }
                    store.addMedia(cd);
                    break label;
                // add dvd
                case 3:
                    DigitalVideoDisc dvd = new DigitalVideoDisc();
                    insertMedia(dvd);
                    insertDisc(dvd);
                    store.addMedia(dvd);
                    break label;
            }
        }
    }

    // 2.2 Remove Media
    // Remove media from store
    // Lưu title từ bàn phím rồi tìm Media và xóa
    private void removeMediaStore(Store store) {
        String title = outputTitle();
        Media media = store.findMedia(title);
        store.removeMedia(media);
    }
    // END FUNCTION UPDATE STORE
    //---------------------------------------------------

    // 3. SEE CURRENT CART
    private void currentCart(Cart cart) {
        cartMenu();
        boolean loop = true;
        int choice1 = getInput(5);
        label2:	while(loop==true) {
            switch(choice1) {
                case 0: loop = false; break label2;
                case 1:
                    filterMedia(cart);
                    break label2;
                case 2:
                    sortMedia(cart);
                    break label2;
                case 3:
                    removeMediaCart(cart);
                    break label2;
                case 4:
                    playMediaCart(cart);
                    break label2;
                case 5:
                    cart.placeOrder();
                    break label2;
            }
        }
    }

    // 3.1 Filter media
    // Filter by ID or TITLE
    // Nhap tu ban phim id hoac title
    // output: A media information
    private void filterMedia(Cart cart) {
        System.out.println("Filter by id or title:");
        String ans = kb.nextLine();
        if(ans.equals("id")||ans.equals("ID")) {
            System.out.println("Nhap ID:");
            System.out.println(cart.findMediaID(Integer.parseInt(kb.nextLine())));
        } else if(ans.equals("title")||ans.equals("Title")) {
            System.out.println("Nhap Title: ");
            System.out.println(cart.findMediaTitle(kb.nextLine()));
        } else System.out.println("Nhap sai.");
    }

    // 3.2 Sort medias in cart
    // Sort by TitleCost or CostTitle
    // output: print Cart Media List by sort
    private void sortMedia(Cart cart) {
        System.out.println("Sort by cost or title:");
        String ans = kb.nextLine();
        if(ans.equals("cost")||ans.equals("Cost")) {
            cart.sortCostTitle();
        } else if(ans.equals("title")||ans.equals("Title")) {
            cart.sortTitleCost();
        } else System.out.println("Nhap sai.");
    }
    // 3.3 Remove media from cart
    // Tương tự remove from Store
    private void removeMediaCart(Cart cart) {
        String title = outputTitle();
        Media media = cart.findMediaTitle(title);
        cart.removeMedia(media);
    }
    // 3.4 Play a media in cart
    // Tương tự play from Store
    private void playMediaCart(Cart cart) {
        String title = outputTitle();
        Media media = cart.findMediaTitle(title);
        if(media instanceof Playable) {
            ((Playable)media).play();
        } else System.out.println("Can't find the media to play");
    }

    //MAIN
    public static void main(String[] args) {
        Aims menu = new Aims();
        Cart cart = new Cart();
        Store store = new Store();
        menu.runMenu(cart,store);
    }

}