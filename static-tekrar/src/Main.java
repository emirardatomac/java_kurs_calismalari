public class Main {
    public static void main(String[] args) {
        StaticClass s1 = new StaticClass("Emir");
        StaticClass s2 = new StaticClass("Emir");
        //Direkt olarak kullanabiliyoruz.
        System.out.println("Obje Sayısı:"+ StaticClass.obje_sayisi);
        System.out.println("Obje Sayısı:"+ s1.obje_sayisi);
        System.out.println("Obje Sayısı:"+ s2.obje_sayisi);

        toplama(3,4,5); //static olan bir alanda static olmayan alan kullanımı.aşağıdaki metodu static yaptığımızda düzelecektir.


    }
    public static void toplama(int a,int b,int c) {
        System.out.println(a+b+c);
    }
}