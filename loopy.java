public class loopy{
	public static void main(String[] args){
		java.util.Scanner scScan = new java.util.Scanner(System.in);
		int intInput = 0;
		int intCounter = 0;
		intInput = scScan.nextInt();
		if(intInput % 2  == 0){
			while(intCounter<100){
				System.out.println("KIEL");
				intCounter++;
			}
		}
		else{
			String strInput;
			strInput = scScan.next();
			while(intCounter<intInput){
				System.out.println(strInput);
				intCounter++;
			}
		}
	}
}