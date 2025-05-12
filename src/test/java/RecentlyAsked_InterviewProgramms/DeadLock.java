package RecentlyAsked_InterviewProgramms;

public class DeadLock {
    public static void main(String[] args) {
        A a = new A();
        B b= new B();

        Thread t1 = new Thread() {
            public void run() {
                a.methodA(b);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                b.methodB(a);
            }
        };

        t1.start();
        t2.start();
    }

}

class A{
    synchronized void methodA(B b){
        System.out.println("Thread 1 starts execution of methodA");
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Thread 1 trying to call B's last method");
        b.last();
    }
    synchronized void last(){
        System.out.println("Inside A's last method");
    }
}

class B{
    synchronized void methodB(A a){
        System.out.println("Thread 2 starts execution of methodB");
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Thread 2 trying to call A's last method");
        a.last();
    }
    synchronized void last(){
        System.out.println("Inside B's last method");
    }
}
