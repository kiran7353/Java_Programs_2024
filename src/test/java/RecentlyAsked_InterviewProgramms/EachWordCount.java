package RecentlyAsked_InterviewProgramms;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class EachWordCount {
    public static void main(String[] args) {
        String s= "I love java programmging. Do you love Java";
        String[] a=s.split(" ");
        Map<String, Integer> m=new LinkedHashMap<>();
        int i=0;
        while(i!=a.length){
            if(m.containsKey(a[i])){
                m.put(a[i],m.getOrDefault(a[i],0)+1);
            }
            else{
                m.put(a[i],1);
            }
            i++;
        }

        for(Map.Entry<String,Integer> data:m.entrySet()){
            System.out.println(data.getKey()+" -> "+data.getValue());
        }
        
    }
}