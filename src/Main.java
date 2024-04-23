import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final  double pi = 3.14;
        Scanner scan = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        int yarıcap = scan.nextInt();
        AlanHesapla(yarıcap , pi);
        CevreHesapla(yarıcap , pi);

    }
    static  void AlanHesapla(int r , double pi){
        double alan = pi * r*r;
        System.out.println("Dairenin Alanı: " + alan);
    }
    static  void CevreHesapla(int r , double pi){

        double cevre = 2 *pi * r;
        System.out.println("Dairenin Alanı: " + cevre);


    }
}