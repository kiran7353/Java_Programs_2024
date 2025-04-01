package RecentlyAsked_InterviewProgramms;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] l=new int[a.length];
        int[] r=new int[a.length];
        l[0]=1;
        r[a.length-1]=1;
        for(int i=1;i<a.length;i++){
            l[i]=l[i-1]*a[i-1];
        }
        for(int i=a.length-2;i>=0;i--){
            r[i]=r[i+1]*a[i+1];
        }
        for(int i=0;i<a.length;i++){
            a[i]=l[i]*r[i];
        }
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}
