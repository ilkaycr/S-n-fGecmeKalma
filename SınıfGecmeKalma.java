package KosulluIfadeler;

import java.util.Scanner;

public class SınıfGecmeKalma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mat , fiz , kim, turk , tar , muzik ,a=0;

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        if(mat < 0 || mat > 100) {
            mat= 0;
            a++;
        }

        System.out.print("Fizik notunuzu giriniz : ");
        fiz = input.nextInt();
        if(fiz < 0 || fiz > 100) {
            fiz= 0;
            a++;
        }

        System.out.print("Kimya notunuzu giriniz : ");
        kim = input.nextInt();
        if(kim < 0 || kim > 100) {
            kim= 0;
            a++;
        }

        System.out.print("Türkçe notunuzu giriniz : ");
        turk = input.nextInt();
        if(turk < 0 || turk > 100) {
            turk= 0;
            a++;
        }

        System.out.print("Tarih notunuzu giriniz : ");
        tar = input.nextInt();
        if(tar < 0 || tar > 100) {
            tar= 0;
            a++;
        }

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();
        if(muzik < 0 || muzik > 100) {
            muzik= 0;
            a++;
        }

        double ort = (mat+fiz+turk+tar+muzik)/5-a;

        if (ort <= 55){
            System.out.println("Sınıfta kaldınız! Ortlamanız : " + ort);
        }
        else {
            System.out.println("Sınıfı geçtiniz! Ortalamanız : " + ort);
        }
    }
}
