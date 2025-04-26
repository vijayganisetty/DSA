package Recursion.strings;

public class BasicStrings {

     // String ans="";
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s.charAt(i)!='a' && s.charAt(i)!='A')
        //     {
        //         ans+=s.charAt(i);
        //     }
        // }
        // return ans;

    //approach @1
    //every function new String is created and more memory is taken by this approach
    static void removeA(String s,String ans)
    {
        if(ans.isEmpty())
        {
            System.out.println(s);
            return ;
            
        }

        char ch=ans.charAt(0);
       
        if(ch=='a')
        {
         removeA(s, ans.substring(1));  
        }
        else{
            removeA(s+ch,ans.substring(1));
        }
    }
    
    //another approch
    static String removea(String s)
    {
        if(s.isEmpty())
        {
            return " " ;
            
        }

        char ch=s.charAt(0);
       
        if(ch=='a')
        {
        return  removea(s.substring(1));  
        }
        else{
          return  ch + removea(s.substring(1));
        }
    }

    static String skipApple(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }

        if(s.startsWith("apple"))
        {
            return skipApple(s.substring(5));
        }
        else{  
            return s.charAt(0)+skipApple(s.substring(1));
        }
    }

    static String skipNotApple(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }

        if(s.startsWith("app") && !s.startsWith("apple"))
        {
            return skipNotApple(s.substring(3));
        }
        else{  
            return s.charAt(0)+skipNotApple(s.substring(1));
        }
    }

    public static void main(String[] args)
    {

        // String s="";
        // String ans="vijay"; 
        // removeA(s, ans);
        // System.out.print(s);

        // String str="vijay";
        // System.out.print(removea(str));

        // String  s ="hgappleuy";
        // System.out.println(skipApple(s));

        // String  s ="hgappeluy";
        // System.out.println(skipNotApple(s));

    }
    
}
