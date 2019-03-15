
public class yerlestirme {

    public static void main(String[] args) {
        int[] dizi = {3, 5, 7};
        char[] charDizi = {'a', 'b', 'c'};

        String sonuc = metod(dizi, charDizi);
        System.out.println(sonuc);
    }
    public static String metod(int[]dizi,char[]charDizi){
        String gonderilecekolan="";
        for (int i = 0; i < dizi.length; i++) {
            gonderilecekolan+=""+dizi[i]+charDizi[i];
           
        }
        return gonderilecekolan;
        
    }

}
