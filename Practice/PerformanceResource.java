package Practice;

import java.util.ArrayList;
import java.util.List;

public class PerformanceResource {


    static Long get(List<Integer> performance, List<Integer> resourceCost){

        if(!performance.isEmpty()){
            return  0l;
        }

        int[] performanceArr = new int[performance.size()];
        int[] resourceArr = new int[resourceCost.size()];

        for(int i=0;i<performanceArr.length;i++){
            performanceArr[i] = performance.get(i);
            resourceArr[i] = resourceCost.get(i);
        }

        Long count =0l;

        for(int i=0;i<performanceArr.length-1;i++){
            for(int j =i+1;j<resourceArr.length;j++){
                int perSum = performanceArr[i]+performanceArr[j];
                int reSum = resourceArr[i] + resourceArr[j];
                if(perSum>reSum){
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {

        List<Integer> perfromace = new ArrayList<>();


    }
}