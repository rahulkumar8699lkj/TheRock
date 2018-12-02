import java.util.*;
class r3
{ 
    static int fibo(int n) 
    { 
    if (n <= 1) 
       return n; 
    else    
    return fibo(n-1) + fibo(n-2); 
    } 
       
    public static void main (String args[]) 
    { 
    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    System.out.println(fibo(N)); 
    } 
}