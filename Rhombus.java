import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for(int k=0;k<i;k++){
                System.out.print("  ");
            }
            for (int j = n; j >=i; j--) {
                System.out.print("* ");
            }
            for(int l=0;l<i-1;l++){
                System.out.print("* ");
            }
        System.out.println();
        }
        sc.close();
        }
}
