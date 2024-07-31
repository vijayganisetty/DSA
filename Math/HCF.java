package Math;

public class HCF {
    
static int hcf(int a,int b)
{
    if(a==0)
    {
        return b;
    }
    return hcf(b%a,a);
}

static int lcm(int a,int b)
{
    return (a*b)/hcf(a,b);
}

public static void main(String[] args)
{
    System.out.print(lcm(15,35)); 
}
}
