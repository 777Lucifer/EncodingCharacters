import java.util.*;
public class DspEnc
{
  static final int l=26;
  static String encription(String str,int n,int t)
  {
    t = t % l - 1;
    char arr[] =str.toCharArray();
    int maxchar[] =new int[l];
    for (int i=0;i<n ;i++ )
      maxchar[arr[i] - 'a']++;
      for (int i =0;i<n ;i++ )
      {
        if (maxchar[arr[i] - 'a'] % 2!=0)
            {
                int z=(arr[i] - 'a' + t) % l;
                arr[i]= (char)(z + 'a');
            }
             else
            {
             int z =(arr[i] - 'a' + t);
            if (z < 0)
            z = 2+l;
            arr[i] = (char)(z + 'a');
            }
     }



  return String.valueOf(arr);
}




   public static void main(String[] args) {
     System.out.println("enter characters===");
         Scanner input = new Scanner(System.in);
         String s = input.nextLine();
         int n = s.length();
         int t = 3;
         System.out.println(encription(s, n, t));

  }
}
