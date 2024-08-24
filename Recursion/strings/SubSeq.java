package Recursion.strings;

import java.util.ArrayList;
import java.util.Arrays;

//sub sets on strings
public class SubSeq {

    // p - processed
    //up - unProcessed
    static void subSeq(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p, up.substring(1));

    }

    static ArrayList<String> subSeqRet(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> ans = new  ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch = up.charAt(0); 
        ArrayList<String> left = subSeqRet(p+ch,up.substring(1));
        ArrayList<String> right =subSeqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    static void subSeqAscii(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        subSeqAscii(p+ch,up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p+(ch+0), up.substring(1));

    }

     public static void main(String[] args)
     { 
       
    //    subSeq("","abc");
    // System.out.println(subSeqRet("","abc"));
       subSeqAscii("","abc");

     }
    
}
