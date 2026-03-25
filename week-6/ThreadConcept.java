class A extends Thread 
{
public void run() {
for(int i=1;i<=5;i++) {
System.out.println("\t From ThreadA: i= "+i);
}
System.out.println("Exit from A");
}
}
class B extends Thread 
{
public void run() {
for(int j=1;j<=5;j++) {
System.out.println("\t From ThreadB: j= "+j);
}
System.out.println("Exit from B");
}
}
class C extends Thread 
{
public void run() {
for(int k=1;k<=5;k++) {
System.out.println("\t From Threadc: k= "+k);
}
System.out.println("Exit from c");
}
}
 class ThreadConcept
{
	public static void main(String[] args) 
	{
new A().start();
new B().start();
new C().start();

for(int i=0;i<=5;i++){
System.out.println("main Thread");
}
	}
}

