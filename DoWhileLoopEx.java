package loops;

public class DoWhileLoopEx {
public static void main(String[] args) {
	int i = 0;
	int[] array= {1,2,3,4,5,6,7,8,9};
	do
	{
		if(array[i]%4==0) 
		{
			System.out.println(array[i]);	
		}
		i++;
	}
	while(i<=8);
}
}