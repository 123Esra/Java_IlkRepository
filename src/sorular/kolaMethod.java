package sorular;

import java.util.Scanner;

public class kolaMethod {

    static Scanner k;

    public static void main(String[] args) {
        bilgiver();
        k = new Scanner(System.in);
        System.out.println("Kaç kola almak istersiniz:");
        int x = k.nextInt();//5
        System.out.println("Kaç tl verdiniz:");
        int verilen = k.nextInt();//100
        String sonuc = kolasec(x, verilen);
        System.out.println(sonuc);
    }
    

    public static void bilgiver() {
        System.out.println("Kola 1TL dir.");

    }

    public static String kolasec(int sayi, int gelenPara) {//5,100
        String sonuc="";
        int kalaPara = gelenPara - sayi;
        int ikiYuz = 0, yuz = 0, elli = 0, yirmi = 0, on = 0, bes = 0, bir = 0;
        while (kalaPara > 0) {
            if (kalaPara > 200) {
                ikiYuz++;
                kalaPara = kalaPara - 200;
            } else if (kalaPara > 100 && kalaPara <= 200) {
                yuz++;
                kalaPara = kalaPara - 100;
            } else if (kalaPara >= 50 && kalaPara <= 100) {
                elli++;
                kalaPara = kalaPara - 50;
            } else if (kalaPara >= 20 && kalaPara <= 50) {
                yirmi++;
                kalaPara = kalaPara - 20;
            } else if (kalaPara >= 10 && kalaPara <= 20) {
                on++;
                kalaPara = kalaPara - 10;
            } else if (kalaPara >= 5 && kalaPara <=10) {
                bes++;
                kalaPara = kalaPara -5;
            }
            else if (kalaPara >= 1&& kalaPara <=5) {
                bir++;
                kalaPara = kalaPara -1;
            }
        }
        sonuc="200 X " + ikiYuz +"\n"+"100 X " + yuz +"\n"+"50 X " + elli +"\n"+"20 X " +
                yirmi +"\n"+"10 X " + on +"\n"+"5 X " + bes +"\n"+"1 X " + bir +"\n";
        
        return sonuc;
    }

}
