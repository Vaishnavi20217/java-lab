package MyPack;
public class Balance 
{
	String name;
	double bal;
public Balance(String n,double b) {
	name = n;
	bal = b;
}
public void Show() {
	if(bal < 0) {
          System.out.println("Insufficient Balance!");
	}
		System.out.println(name+":$"+bal);
	}
}