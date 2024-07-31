public class pattern {
    
    static void pattern1()
    {
     System.out.println("pattren one");
    for(int i=1;i<=5;i++)
    { 
     for(int j=1;j<=5;j++)
     {
       System.out.print("*");
     }
     System.out.println("");
    }
    }
    static void pattern2()
    {
    System.out.println("pattren two");
    for(int i=1;i<=5;i++)
    {
     for(int j=1;j<=i;j++)
     {
       System.out.print("*");
     }
     System.out.println("");
    }
    }

     static void pattern3()
    {
    System.out.println("pattren three");
    for(int i=1;i<=5;i++)
    {
     for(int j=1;j<=5-i+1;j++)
     {
       System.out.print("*");
     }
     System.out.println("");
    }
    }

    static void pattern4()
    {
        System.out.println("pattren 4");
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
           System.out.println("");
        }
    }

    static void pattern5(int n)
        {
        System.out.println("pattren 4");
        for(int i=0;i<2*n;i++)
        {
            int c= i>n?2*n-i:i;
            for(int j=0;j<c;j++)
            {
                System.out.print("*");
            }
        System.out.println("");
        }
        }
     
    static void pattern6(int n)
    {
     for(int r=1;r<=n;r++)
     {
        int space=n-r;
        for(int s=1;s<=space;s++)
        {
            System.out.print(" ");
        }
        for(int c=1;c<=r;c++)
        {
           System.out.print("*");
        }
        System.out.println("");
     }
    }
    static void pattern7(int n)
    {
     for(int r=n;r>=1;r--)
     {
        int space=n-r;
        for(int s=1;s<=space;s++)
        {
            System.out.print(" ");
        }
        for(int c=1;c<=r;c++)
        {
           System.out.print("*");
        }
        System.out.println("");
     }
    }

    static void pattern8(int n)
    {
        for(int r=0;r<n;r++)
        {
            int space=n-r+1;
            for(int s=0;s<=space;s++)
            {
              System.out.print(" ");
            }
            for(int c=0;c<2*r+1;c++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern9(int n)
    {
        for(int r=n;r>=1;r--)
        {
            int space=n-r;
            for(int s=0;s<=space;s++)
            {
              System.out.print(" ");
            }
            for(int c=0;c<2*r-1;c++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern10(int n)
    {
        for(int r=1;r<=n;r++)
        {
            int space=n-r;
            for(int s=0;s<=space;s++)
            {
              System.out.print(" ");
            }
            for(int c=1;c<=r;c++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

        static void pattern11(int n)
    {
        for(int r=n;r>=1;r--)
        {
            int space=n-r;
            for(int s=0;s<=space;s++)
            {
              System.out.print(" ");
            }
            for(int c=1;c<=r;c++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    
   static void pattern12(int n)
    {
        for(int r=2*n;r>=1;r--)
        {
            int col=r>n?r-n:n-r+1;
            int space=n-col;
            for(int s=0;s<space;s++)
            {
              System.out.print(" ");
            }
            for(int c=1;c<=col;c++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    
        static void pattern28(int n)
        {
        System.out.println("pattren 28");
        for(int i=0;i<2*n;i++)
        {
            int c= i>n?2*n-i:i;

            int space = n -c;
            for(int s=0;s<space;s++)
            {
                System.out.print(" ");
            }
            
            for(int j=0;j<c;j++)
            {
                System.out.print("* ");
            }
        System.out.println("");
        }
        }

        static void pattern30(int n)
        {
            for(int i=1;i<=n;i++)
            {
                for(int s=0;s<=n-i;s++)
                {
                    System.out.print("  ");

                }
              for(int j=i;j>=1;j--)
                {
                    System.out.print(j+" ");
                }
               for(int j=2;j<=i;j++)
                {
                    System.out.print(j+" ");
                } 
                System.out.println();
            }

        }
        static void pattern17(int n)
        {
            for(int i=1;i<=2*n-1;i++)
            {
                int c=i>n?2*n-i:i;
                for(int s=0;s<=n-c;s++)
                {
                    System.out.print("  ");

                }
              for(int j=c;j>=1;j--)
                {
                    System.out.print(j+" ");
                }
               for(int j=2;j<=c;j++)
                {
                    System.out.print(j+" ");
                } 
                System.out.println();
            }

        }

        static void pattern31(int n)
        {
            int originalN=n;
            n=2*n-2;
            for(int i=0;i<=n;i++)
            {
                for(int j=0;j<=n;j++)  
                {
                   int ele=originalN-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                    System.out.print(ele+" ");
                }
                System.out.println();
            }
        }

    
    public static void main(String[] args)
    {

        pattern31(4); 
    // pattern12(5);
    }
}
