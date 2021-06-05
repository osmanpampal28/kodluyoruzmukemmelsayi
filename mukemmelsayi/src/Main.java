import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("mükemmel sayı olup olmadığına bakmak istediğiniz sayıyı giriniz : ");
        int sayi = scanner.nextInt();
        int toplam=0;

        while(sayi<0){
            System.out.println("sayı 0'dan büyük olmalı");
            sayi=scanner.nextInt();
        }

        for (int i = 1; i <= sayi/2; i++) {
            if (sayi % i ==0) {
                toplam+=i;
            }
        }
        if(sayi==1)
            System.out.println( sayi+" Mükemmel Sayı Değildir");
        if (sayi==toplam) {
            System.out.println(sayi+" Mükemmel Sayıdır");
        }
        else
            System.out.println( sayi+" Mükemmel Sayı Değildir");
    }
}
