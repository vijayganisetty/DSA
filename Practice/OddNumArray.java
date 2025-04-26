package Practice;

public class OddNumArray {

    public static void main(String[] args) {
        int arr[] = new int[20];
        arr[0]=1;
        int odds[] = new int[20];
        int x=0;
        int num =1;
        while(true){
            if(num%2!=0){
                odds[x]=num;
                x++;
            }
            num++;

            if(x==20){
                break;
            }
        }

        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+odds[i-1];
        }
//        for(int i=0;i<odds.length;i++){
//            System.out.print(odds[i]+", ");
//        }
        System.out.println();
        for(int i=0;i<odds.length;i++){
            if(arr[i]%2==0){
                arr[i]*=-1;
            }
            System.out.print(arr[i]+", ");
        }
    }
}
