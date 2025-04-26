package Practice;

import java.util.*;
//tech mahindra
public class Practice {

    //take length of array
    //take inputs
    //find if it is even or odd
    //add even to even sum
    //add odd to odd sum
    //return oddsum - evensum
    static int oddeven() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = 0;
        int ev = 0;
        int od = 0;
        for (int i = 0; i < n; i++) {
            x = arr[i];
            if (x % 2 == 0) {
                ev += x;
            } else {
                od += x;
            }

        }
        return od - ev;

    }

    //only cloth length with more than 12 can made 12feet curtain
    static int totalcloth() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            x = arr[i];
            int a = x / 12;
            num += a;
        }
        return num;
    }

    //a=97,z=122
    static String encry(String x) {
        String ans = "";
        for (int i = 0; i < x.length(); i++) {
            int temp = (int) x.charAt(i) + 3;
            if (temp < 123) {
                ans += (char) temp;
            } else {
                ans += (char) (temp - 26);
            }

        }
        return ans;
    }

    static int GP(int x, int y, double n) {
        double ans = y / x;

        return (int) Math.pow(ans, n - 1);

    }

    //if n is power of the 2 return true else false
    static boolean matprob(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }

    //sort the array
    //add adjacent difference to ans
    static int penalty(int n) {
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int p = 0;
        for (int i = 1; i < n; i++) {
            p += arr[i] - arr[i - 1];
        }

        return p;

    }

    static int calcTotalTax(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 100) {
                ans += (arr[i] - 100) / 10;
            }
        }
        return ans;
    }

    static void revArr() {
        int[] num = {1, 2, 3, 4, 5};
        int i = 0;
        int j = num.length - 1;
        while (i < j) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }
        System.out.print(Arrays.toString(num));

    }

    static void bubbleSort() {
        int[] num = {5, 4, 3, 2, 1};
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length - i; j++) {
                if (num[j] < num[j - 1]) {
                    int temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                }

            }
        }
        System.out.print(Arrays.toString(num));
    }

    static long revNum(long n) {
        long ans = 0L;
        while (n > 0) {
            long x = n % 10;
            ans = ans * 10 + x;
            n = n / 10;
        }
        return ans;
    }


    static int diceProblem(int n, String s) {
        int ans = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < s.length(); i += 2) {
                ans += Character.getNumericValue(s.charAt(i));
            }
        } else {
            for (int i = 0; i < s.length() / 2; i++) {
                ans += Character.getNumericValue(s.charAt(i + 2));
            }
        }
        return ans;
    }

    static int hourClock(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == 60) {
                    count++;
                    System.out.println(nums[i] + " " + nums[j]);
                }
            }
        }
        return count;
    }


    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int count=0;
        int s=a.get(0);
        int e=b.get(b.size()-1);
        int acount=0;
        int bcount=0;
        for(int i=s;i<=e;i++){
            int x=i;
            acount=0;
            bcount=0;
            for(int j:a){

                if(i%j==0){
                    acount++;
                }
                else{
                    break;
                }
            }
            for (int l : b) {
                if (l%x == 0) {
                    bcount++;
                }
                else{
                    break;
                }
            }
            if((acount+bcount)==(a.size()+b.size())){
                count++;
            }
        }
        // System.out.println(acount+" "+bcount);

        return count;

    }
    
    public static void main(String[] args) {
        // System.out.print(oddeven());
        // System.out.print(totalcloth());
        // System.out.print(GP(3,9,1));
        // System.out.print(encry("nrfzh"));
        // System.out.println(matprob(7));
        // System.out.print(penalty(3));
        // System.out.print(calcTotalTax(5));
        // revArr();
        // bubbleSort();
//    System.out.print(revNum(8187801815L));

//        Scanner sc = new Scanner(System.in);
//       String[] arr   =  sc.nextLine().split(" ");
//       int a = Integer.parseInt(arr[0]);
//       int b = Integer.parseInt(arr[1]);
//        System.out.println(a+b);

        //  System.out.println(diceProblem(5,"123456"));

        //  System.out.println(hourClock(new int[] {30,30,25,27,33}));

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        b.add(100);

        System.out.println(getTotalX(a,b));
    }
}
