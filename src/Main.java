import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
       int n1, n2, select;
        Scanner scanner = new Scanner(System.in);
       System.out.print("İlk Sayıyı Giriniz : ");
       n1=scanner.nextInt();
       System.out.print("İkinci Sayıyı Giriniz : ");
       n2=scanner.nextInt(); 
       System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
       System.out.print("Seçiminiz : ");
       select= scanner.nextInt();
       
       switch(select){
           case 1 : 
           System.out.print("Toplam : "+(n1+n2));
           break;
           case 2 : 
           System.out.print("Çıkarma : "+(n1-n2));
           break;
           case 3 : 
           System.out.print("Çarpma : "+(n1*n2));
           break;
           case 4 : 
             if(n2==0){
               System.out.println("Bir sayı sıfıra bölünemez");
              } else{
                System.out.println("Bölme : "+(n1/n2));
              }               
           break;
           default:
           System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz. ");


       }
    }
}
