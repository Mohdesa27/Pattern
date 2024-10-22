import java.util.*;
public class Rhombus_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=n-1;k>=i;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int l=n-1;l>=i;l--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
