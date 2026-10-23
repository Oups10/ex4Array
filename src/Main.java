import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numeros[] = new int[8];
        for (int i = 0; i < Numeros.length; i++) {
            Numeros[i] = sc.nextInt();
        }
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < Numeros.length; i++){
            if(Numeros[i]<0) {
                neg = neg + 1;
            } else if (Numeros[i]>0) {
                pos = pos +1;
            }else {
                zero = zero+1;
            }
        }
        System.out.println("Positius : "+pos);
        System.out.println("negatius : "+neg);
        System.out.println("zeros : "+zero);
    }
}