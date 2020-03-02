
import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception {
long time = System.currentTimeMillis()+9*60*60*1000; //UTC time + 9 hours(GMT)=KST
int hours   = (int) ((time / (1000*60*60)) % 24);
int minutes = (int)((time / (1000*60)) % 60); 
int seconds = (int) (time / 1000) % 60 ;
	
		System.out.println("Current Korean time is "+hours+":"+minutes+":"+seconds);
		
		System.out.print("Enter the time zone offset to GMT: ");
		Scanner s=new Scanner(System.in);
		int offset=s.nextInt();
				
		if(offset<-11||offset>12){
			System.out.print("Error");
		}
		else{
		time=time+offset*60*60*1000;
		 hours   = (int) ((time / (1000*60*60)) % 24);
		minutes = (int)((time / (1000*60)) % 60); 
		seconds = (int) (time / 1000) % 60 ;
		System.out.print("The specified time is "+hours+":"+minutes+":"+seconds);
	}
	}
}
