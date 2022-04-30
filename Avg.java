import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math,physic,turkish,hist,mus;
        System.out.println("Matematik Notunuz:");
        math=input.nextInt();

        System.out.println("Fizik Notunuz:");
        physic=input.nextInt();

        System.out.println("Türkçe Notunuz:");
        turkish=input.nextInt();

        System.out.println("Tarih Notunuz:");
        hist=input.nextInt();

        System.out.println("Müzik Notunuz:");
        mus=input.nextInt();

        int sum= math+physic+turkish+hist+mus;
        double avg = sum/6;
        String str = avg>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);
    }
}
