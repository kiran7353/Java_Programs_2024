package Course_JAVA;

import java.util.*;
public class FirstPGM{
    public static void main(String[] args) {
        int[] num = {1,2,2,3,4,3,5,6,6,9};
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<num.length;i++){
            if(!map.containsKey(num[i])){
                map.put(num[i],1);
            }else{
                map.put(num[i],map.getOrDefault(num[i],0)+1);
            }
        }

        for(Map.Entry<Integer,Integer> data:map.entrySet()){
            System.out.println(data.getKey()+" is "+data.getValue()+" times");
        }
    }
}
