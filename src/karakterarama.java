
public class karakterarama {

    public static void main(String[] args) {
        char[] charDizi = {'a', 'b', 'c'};
        char karakter = 'b';
        boolean sonuc = metod(charDizi, karakter);
        System.out.println(sonuc);
    }

    public static boolean metod(char[] charDizi, char karakter) {
        boolean degisken=false;
        for (int i = 0; i < charDizi.length; i++) {
            if (charDizi[i] == karakter) {
                degisken = true;
                break;
            } else {
                degisken = false;
                
                break;
            }
        }
        return degisken;
    }
}
