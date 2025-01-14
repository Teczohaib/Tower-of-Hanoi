import java.util.*;
public class TowerofHanoi{
    public static void toh(int n,int t1,int t2,int t3){
        if(n==0){
            return;
        }
        toh(n-1,t1,t2,t3);
        System.out.println("move disk" + n + "from tower" + t1 + "to tower" + t2);
        toh(n-1,t3,t2,t1);
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("enter the number of disk");
        int n= scn.nextInt();
        System.out.print("Enter the number for the first tower (t1):");
        int t1=scn.nextInt();
        System.out.print("enter the number for the second tower (t2):");
        int t2=scn.nextInt();
        System.out.print("enter the number for the third tower (t3):");
        int t3=scn.nextInt();
        toh(n,t1,t2,t3);

    }
}