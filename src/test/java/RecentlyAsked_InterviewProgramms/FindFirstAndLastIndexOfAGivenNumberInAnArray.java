package RecentlyAsked_InterviewProgramms;

public class FindFirstAndLastIndexOfAGivenNumberInAnArray {
    public static void main(String[] args) {
        int[] a= {1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10};
        int n=5;

        int firstIndex=-1;
        int lastIndex=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==n&&firstIndex==-1){
                firstIndex=i;
            }else if(a[i]==n&&firstIndex!=-1){
                lastIndex=i;
            }
        }

        if(firstIndex==-1){
            System.out.println("Number not found");
        }else{
            System.out.println("First index of "+n+" is: "+firstIndex);
            System.out.println("Last index of "+n+" is: "+lastIndex);
        }
    }
}
