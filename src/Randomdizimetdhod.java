
public class Randomdizimetdhod {
    public static void main(String[] args) {
        char[] dizi=charUret();
        for (int i = 0; i <dizi.length; i++) {
            System.out.print(dizi[i]+" ");
            
        }
    }
    //  100 elemanlı bir char dizisi rasgele oluşturulmak isteniyor.
    // a-z arası 100 elemanlı char dizisi donduren metdou yazınız.
    public static char[] charUret(){
        char[] dizi=new char[100];
        for (int i = 0; i < dizi.length; i++) {
            // 97-122 aarası deger uret
            int sayi=(int)(Math.random()*25)+97;
            dizi[i]=(char)sayi;
            
        }
        return dizi;
        
    }
}
