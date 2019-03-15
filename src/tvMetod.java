
public class tvMetod {

    public static void main(String[] args) {
        bilgiver();
        String sonuc = kanaliGoster(1);
        System.out.println(sonuc);
    }

    public static void bilgiver() {
        System.out.println("1-) Kanal D\n2-) Show tV\n3-) atv");

    }

    public static String kanaliGoster(int sayi1) {
        String geriDonus = "";
        if (sayi1 == 1) {
            geriDonus = "Kanal D";
        }

        if (sayi1 == 2) {
            geriDonus = "Kanal D";
        }

        if (sayi1 == 3) {
            geriDonus = "Kanal D";
        }
        return geriDonus;

    }

}
