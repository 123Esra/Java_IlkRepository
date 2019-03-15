
import java.util.Scanner;


public class geriMetod {
    public static void main(String[] args) {
        //Klavyeden girişler yapılacak.
        //onu bi metoda yolla.
        //metodum string bir değer döndrecek.
        Scanner k=new Scanner(System.in);
        System.out.println(" bir kelime giriniz:");
        String kelime=k.nextLine();
        System.out.println("Bir sayı giriniz:");
        int sayi=k.nextInt();
        String sonuc=metot(kelime,sayi);//metot metoduna git diyor.
        System.out.println(sonuc);// return edilen yerde sout yazılmaz.
    }
    public static String metot(String a,int b){
        String geriDonderilecek="";
        for (int i = 0; i < b; i++) {
            
            geriDonderilecek+=a+"\n";
        }
        return geriDonderilecek;
    }
}
