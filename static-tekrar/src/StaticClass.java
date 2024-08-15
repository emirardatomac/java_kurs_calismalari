public class StaticClass {
    //Static sınıfa özeldir
    public static int obje_sayisi = 0 ;
    private static String isim;
    public StaticClass(String isim){
        this.isim=isim;
        //Bir defa oluşmasını istediğimiz değişkenleri static olarak tanımlayabiliriz.
        obje_sayisi++;
    }
    public static String getİsim(){
        return isim;
        //return isim; static olan bir alanda statik olmayan bir alandan direkt kullanım yapamayız
        //ismin de static olması gerekir.
    }
}
