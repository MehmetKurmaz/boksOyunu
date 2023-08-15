public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 100 , 10, 90, 0);
        Fighter alex = new Fighter("Alex" , 100, 5, 100, 0);
        Mach r = new Mach(marc,alex , 90 , 100);
        r.run();
    }

}