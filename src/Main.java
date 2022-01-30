import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number=scanner.nextInt();
        for (int i=1,j=1;i<=number || j<=number;i*=4,j*=5){
            if(i!=1 && j!=1){
                System.out.println("4'ün kuvvetleri : "+i);
                if(j<number)
                    System.out.println("5'in kuvvetleri : "+j);
            }
        }
    }
}
