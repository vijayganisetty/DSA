package Recursion;

import java.util.ArrayList;

public class PermCom {
    

    //permutation and combinations
    // if there is a word, finding what are differnt ways of writing that word
    // abc - acb , bca,bac,cba,cab.....
    static void permutations(String p,String up)
    {
       if(up.isEmpty())
       {
        System.out.println(p);
        return;
       }
       char ch=up.charAt(0);
       for(int i=0;i<=p.length();i++)
       {
              String f = p.substring(0,i);
              String s = p.substring(i,p.length());
              permutations(f+ch+s, up.substring(1));
       }

    }

    //same as above
    //adding the outcomes to the arraylist
    static ArrayList<String> permutationsList(String p,String up)
    {
       if(up.isEmpty())
       {
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
       }
       char ch=up.charAt(0);

       ArrayList<String> ans = new ArrayList<>();
       for(int i=0;i<=p.length();i++)
       {
              String f = p.substring(0,i);
              String s = p.substring(i,p.length());
           ans.addAll(permutationsList(f+ch+s, up.substring(1)));
       }
      
       return ans;

    }

    //counting the outcomes from above problem
    static int permutationsCount(String p,String up)
    {
       if(up.isEmpty())
       {
        return 1;
       }
       int count=0;
       char ch=up.charAt(0);
       for(int i=0;i<=p.length();i++)
       {
              String f = p.substring(0,i);
              String s = p.substring(i,p.length());
             count = count+ permutationsCount(f+ch+s, up.substring(1));
       }

       return count;

    }
    
    //Leetcode - letters combinatons of numbers
    //In the mobile keypad, if two numbers are pressed when what will be the 
    // chances of getting the paires of alphabets
    // 12 is pressed 1 - abc and 2 - def 
    //outcomes  ad, ae,af,bd,be,bf,cd,ce,cf.
    static void letterComb(String p,String up)
    {
      if(up.isEmpty())
      {
         System.out.println(p);
         return ;
      }
 
      int digit = up.charAt(0)-'0';
      for(int i=(digit-1)*3;i<digit*3;i++)
      {
         char ch=(char)('a'+i);
         letterComb(p+ch, up.substring(1));
      }
    }
    static ArrayList<String> letterCombRet(String p,String up)
    {
      if(up.isEmpty())
      {
         ArrayList<String> list = new ArrayList<>();
         list.add(p);
         return  list;
      }
      ArrayList<String> ans = new ArrayList<>();
      int digit =   up.charAt(0)-'0';
      for(int i=(digit-1)*3;i<digit*3;i++)
      {
         char ch=(char)('a'+i);
        ans.addAll(letterCombRet(p+ch, up.substring(1)));
      }
      return ans;
    }

    //throwing a dice and probablity of getting a number
    // chance of getting 4 - 2,2 4,0 3,1...... 
    static void dice(String p,int target)
    {
      if(target==0)
      {
         System.out.println(p);
         return;
      }
      for(int i=1;i<=6 && i<=target ;i++)
      {
         dice(p+i,target-i);
      }
    }
    public static void main(String[] args)
    {
        
      //  permutations("", "abc");
      //  System.out.print(permutationsList("", "abc"));
      //  System.out.println(permutationsCount("","abc"));

      //  letterComb("", "12");
      // System.out.println(letterCombRet(" ","12"));

      dice("",4);

    }
}
