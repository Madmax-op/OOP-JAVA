import java.util.*;
public class OddEven{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int odd=0;
	int even=0;
	
	for(int i=0;i<10;i++){
		if (Integer.parseInt(args[i]) % 2 == 0){
			even++;
}
		else{
			odd++;
}}
	System.out.println("Even:"+even+"\nOdd:"+odd);		
}}
