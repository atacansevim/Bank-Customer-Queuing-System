import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		DPLQ Abank = new DPLQ();

		while(true)
		{
			boolean flag=true;
			int number = 0;
			if(flag == true)
			{System.out.println("------Bank System-----"); flag = false;}
			System.out.print("Current Queue: "); Abank.Display();
			System.out.println("1- Add a new customer to the queue");
			System.out.print("");
			System.out.println("2- Process a customer");
			try{
				Scanner input = new Scanner(System.in);

				System.out.print(" ");
				number = input.nextInt(); 
			}
			catch(java.util.InputMismatchException e)
			{
				System.out.print("inappropriate entry");
			}
			catch(java.lang.NumberFormatException e)
			{
				System.out.print("inappropriate entry");
			}
		
			if(number == 1)
			{
				String name;
				Scanner NP = new Scanner(System.in);
				System.out.print("Please enter Name and the type of customer:  ");
				name = NP.nextLine();
				String[]Np;
				Np = name.split(" ");
				Customer p = new Customer( Np[0], Integer.parseInt(Np[1]));
				Abank.add(p);
			}
			else if(number == 2)
			{
				Abank.Remove();
				System.out.println();
				System.out.println();
			}
		}

	}

}
