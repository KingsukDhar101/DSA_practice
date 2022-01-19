import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(n);
        pattern13(n);
        pattern14(n);
        pattern15(n);
        
    }
    public static void pattern1(int n){
        System.out.println("Q1. Pattern-1 : ");
        for(int i=1; i<=n; i++){
            System.out.print("\t\t\t\t");
            for(int j=1; j<=n; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern2(int n){
        System.out.println("Q2. Pattern-2 : ");
        for(int i=1; i<=n; i++){
            System.out.print("\t\t\t\t");
            for(int j=1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern3(int n){
        System.out.println("Q3. Pattern-3 : ");
        for(int i=1; i<=n; i++){
            System.out.print("\t\t\t\t");
            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern4(int n){
        System.out.println("Q4. Pattern-4 : ");
        for(int i=1; i<=n; i++){
            System.out.print("\t\t\t\t");
            int val = 1;
            for(int j=1; j<=i; j++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern5(int n){
        System.out.println("Q5. Pattern-5 : ");
        int st = 1;
        for(int i=1; i<=2*n-1; i++){
            System.out.print("\t\t\t\t");
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }
            if(i < n){
                st++;
            }else{
                st--;
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern6(int n){
        System.out.println("Q6. Pattern-6 : ");
        int space = n-1;
        int star = 1;
        for(int i=1; i<=n; i++){
            System.out.print("\t\t\t\t");
            // space 
            for(int sp=1; sp<=space; sp++){
                System.out.print("\t");
            }
            // star
            for(int st=1; st<=star; st++){
                System.out.print("*\t");
            }
            System.out.println();
            space--;
            star++;
        }
        System.out.println();
    }
    public static void pattern7(int n){
        System.out.println("Q7. Pattern-7 : ");
        int space = 0;
        int star = n;
        for(int i=1; i<=n; i++){
            System.out.print("\t\t\t\t");
            // space
            for(int sp=1; sp<=space; sp++){
                System.out.print("\t");
            }
            
            // star
            for(int st=1; st<=star; st++){
                System.out.print("*\t");
            }
            System.out.println();
            space++;
            star--;
        }
        System.out.println();
    }
    public static void pattern8(int n){
        System.out.println("Q8. Pattern-8 : ");
        int space = n-1;
        int star = 1;
        for(int i=1; i<=n; i++){
            System.out.print("\t\t\t\t");
            // space
            for(int sp=1; sp<=space; sp++){
                System.out.print("\t");
            }
            
            // star
            for(int st=1; st<=star; st++){
                System.out.print("*\t");
            }
            System.out.println();
            space--;
            star += 2;
        }
        System.out.println();
    }
    public static void pattern9(int n){
        System.out.println("Q9. Pattern-9 : ");
        int space = 0;
        int star = 2*n-1;
        
        for(int row=1; row<=n; row++){
            System.out.print("\t\t\t\t");
            // space
            for(int sp=1; sp<=space; sp++){
                System.out.print("\t");
            }
            // star
            for(int st=1; st<=star; st++){
                System.out.print("*\t");
            }
            
            System.out.println();
            space++;
            star -= 2;
        }
        System.out.println();
    }
    public static void pattern10(int n){
        System.out.println("Q10. Pattern-10 : ");
        int space = n-1;
        int star = 1;
        for(int row=1; row<=n; row++){
            System.out.print("\t\t\t\t");
            // space
            for(int sp=1; sp<=space; sp++){
                System.out.print("\t");
            }
            // star
            for(int st=1; st<=star; st++){
                if(st%2 == 1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            space--;
            star += 2;
        }
        System.out.println();
    }
    public static void pattern11(int n){
        System.out.println("Q11. Pattern-11 : ");
        int space = 0;
        int star = 2*n-1;
        for(int row=1; row<=n; row++){
            System.out.print("\t\t\t\t");
            // space
            for(int sp=1; sp<=space; sp++){
                System.out.print("\t");
            }
            // star
            for(int st=1; st<=star; st++){
                if(st%2 == 1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            
            space++;
            star -= 2;
        }
        System.out.println();
    }
    public static void pattern12(int n){
        System.out.println("Q12. Pattern-12 : ");
        // upper part
        int space = 0;
        int star = 2*n-1;
        for(int row=1; row<=n; row++){
            System.out.print("\t\t\t\t");
            // space
            for(int sp=1; sp<=space; sp++){
                System.out.print("\t");
            }
            // star
            for(int st=1; st<=star; st++){
                if(st%2 == 1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            space++;
            star -= 2;
        }
        
        // lower part
        space = n-2;
        star = 3;
        for(int row=2; row<=n; row++){
            System.out.print("\t\t\t\t");
            // space
            for(int sp=1; sp<=space; sp++){
                System.out.print("\t");
            }
            // star
            for(int st=1; st<=star; st++){
                if(st%2 == 1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            space--;
            star += 2;
        }
        System.out.println();
    }
    public static void pattern13(int n){
        System.out.println("Q13. Pattern-13 : ");
        int space = n-1;
        int star = 1;
        for(int row=1; row<=n; row++){
            System.out.print("\t\t\t\t");
            // space
            for(int sp=1; sp<=space; sp++){
                System.out.print("\t");
            }
            // star
            for(int st=1; st<=star; st++){
                if(st==1 || st==star || row==n){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            
            // space
            
            System.out.println();
            space--;
            star += 2;
        }
        System.out.println();
    }
    public static void pattern14(int n){
        System.out.println("Q14. Pattern-14 : ");
        int space = 0;
        int star = 2*n-1;
        for(int row=1; row<=n; row++){
            System.out.print("\t\t\t\t");
            // space
            for(int sp=1; sp<=space; sp++){
                System.out.print("\t");
            }
            // star
            for(int st=1; st<=star; st++){
                if(st==1 || st==star || row==1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            
            space++;
            star -= 2;
        }
        System.out.println();
    }
    public static void pattern15(int n){
        System.out.println("Q15. Pattern-15 : ");
        int space = n-1;
        int star = 1;
        for(int row=1; row<=2*n-1; row++){
            System.out.print("\t\t\t\t");
            // space
            for(int sp=1; sp<=space; sp++){
                System.out.print("\t");
            }
            // star
            for(int st=1; st<=star; st++){
                if(st==1 || st==star || (row==n && st%2==1) || st == star/2+1){
                  System.out.print("*\t"); 
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            if(row < n){
                space--;
                star += 2;
            }else{
                space++;
                star -= 2;
            }
        }
        System.out.println();
    }
}