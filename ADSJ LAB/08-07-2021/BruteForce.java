import java.util.*;
class BruteForce{
  int brute_Force(String T,String P){
    int n=T.length();
    int m=P.length();
    int i,k;
    for(i=0;i<n-m;i++){
    k=0;
    while(k<m&&T.charAt(i+k)==P.charAt(k)){
      k++;
    }
    if(k==m)
      return i;
    }
    return -1;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String t,p;
    System.out.println("Enter the main text and substring");
    t=sc.nextLine();
    p=sc.nextLine();
    BruteForce b = new BruteForce();
    int pos = b.brute_Force(t,p);
    if(pos==-1)
      System.out.println("Substring is not found in main text");
    else
      System.out.println("Substring is found at position "+pos+" in main String");
  }
}