package Math;

//square root;

public class SquareRoot {
    
    static int squareRoot(int n)
    {
        int s=1;
        int e=n;
        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(n/mid==mid)
            {
                return mid;
            }
            else if(n/mid<mid)
            {
                e=mid-1;
                 
            }
            else 
            {
                 s=mid+1;
            }
        }
        return 0;
    }

    static int perfectRoot(int n)
    {
        int s=0;
        int e=n;
        int mid=0;
        while(s<=e)
        {
            mid=s+(e-s)/2;
            if(mid*mid==n)
            {
                return mid;
            }
            else if(mid*mid>n)
            {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        return mid;

    }

    static double sqaureRootDouble(int n,int p)
    {
        int s=0;
        int e=n;
        double root=0.0;
        while(s<=e)
        {
           int mid=s+(e-s)/2;
            if(mid*mid==n)
            {
                return mid;
            }
            else if(mid*mid>n)
            {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        double inc = 0.1;

        for(int i=0;i<p;i++)
        {
            while(root*root<=n)
            {
                root+=inc;
            }
            root-=inc;
            inc/=10;
        }
        return root ;

    }
     
    static double NewtonRapson(double n)
    {
        double x=n;
        double root;
        while(true)
        {
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<0.5)
            {
                break;
            }
            x=root;
        }

        return root;
    }

    public static void main(String[] args)
    {
    //   System.out.println(squareRoot(26));
      System.out.printf("%.3f",sqaureRootDouble(5,3));
    // System.out.print(NewtonRapson(40));
}
}

