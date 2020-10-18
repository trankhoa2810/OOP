package buoi1;

public class Sum_Max {
	public static void main(String[] args)
	{
		double sum = 0.0;
		double n = 0.0;
		double max = -11111.0;
		boolean b = false;
		for(int i = 0; i < args.length; i++)
		{
			try {
				n = Double.parseDouble(args[i]); 
				b = false;
			}catch(Exception e) {
				n = Double.MIN_VALUE;
				b = true;
			}
			if(max < n && !b)
				max = n;
			
			sum += n;
		}
		System.out.println(max);
		System.out.println(sum);
	}
}