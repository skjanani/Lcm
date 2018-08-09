package janani;
import java.util.Scanner;
public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
int n=ja.nextInt(),n1=ja.nextInt(),lcm;
if(n>n1){
	lcm=n;
}
else{
	lcm=n1;
}
while(true){
	if(lcm%n==0 && lcm%n1==0){
		System.out.println(lcm);
		break;
	}
	lcm++;
}
	}

}
