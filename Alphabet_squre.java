import java.util.Scanner;

public class Alphabet_squre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(char j=65;j<65+n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
