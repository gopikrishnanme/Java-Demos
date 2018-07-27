public class FindSum {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]); //123
		int result=0;		
		
		while(num>0)
		{
		result=num%10;
		num=num/10;
		}
		
		System.out.println(result);
		
	}

}
