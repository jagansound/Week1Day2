package week1.day2;

public class ClassExcerise {
	public static void main(String[] args) {
		
		for (int i =1; i <= 100;i++) {
				System.out.println(i);
		}
	
	

//2. Print the odd numbers from 1-100.
		System.out.println("Print the odd numbers");
		for (int i =1; i <= 100;i++) {
			if(i%2 == 1)
			{
			System.out.println(i);}
	} 
//3. Print the squares of the even number from 59 - 38.
		System.out.println("Print the squares of the even number from 59 - 38.");
		for (int i =59; i >= 38;i--) {
			if(i%2 == 0)
			{
			System.out.println(i*i);}
			
// 4. write a program to get sum of the numbers.
			System.out.println("write a program to get sum of the numbers.");
			int range = 5;
			int sum = 0;
			for (int j =1; j <= range;j++) {
				{				
				sum = sum + j;
				System.out.println(sum);
				}
								
		} 		
			



	} 
		
		
	}
}