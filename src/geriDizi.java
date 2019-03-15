


public class geriDizi {

    public static void main(String[] args) {
        //Gelen diziyi ekrana yazdıran metodu yazınız void.
        int[] dizi = {1, 2, 6, 9, 7};
        metod(dizi);
        // dizi,4
        int sayi = 12;
        System.out.println(sayi);
        metodindis(dizi, 12);//metodinds adlı metoda git.satır satır çalıştırdık.

    }

    public static void metod(int[] dizi1) {
        for (int i = 0; i < dizi1.length; i++) {
            System.out.print(dizi1[i] + " ");

        }

    }

    public static void metodindis(int[] dizi1, int sayi1) {
        if (sayi1 > dizi1.length) {
            System.out.println("İndis aşımına ugrandı.");
        } else {
            int sonuc = dizi1[sayi1];
            System.out.println(sonuc);
        }

    }
}
