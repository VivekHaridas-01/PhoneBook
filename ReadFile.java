package Project2;
import java.io.*;  
import java.util.*;

public class ReadFile 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		int c;
		BST b = new BST();
		Scanner in=new Scanner(System.in);
		FileInputStream F=new FileInputStream("Phonebook.txt");       
		Scanner sc=new Scanner(F);
		while(sc.hasNextLine())  
		{
			String str=sc.nextLine();
			String[] s=str.split("\t");
			PhoneBook temp = new PhoneBook();
			temp.Name=s[0];
			temp.Number=s[1];
			temp.Email=s[2];
			b.insert(temp);
		}
		System.out.println("PHONE DIRECTORY");
		System.out.println("1.Search");
		System.out.println("2.Display");
		System.out.println("3.Display First Contact");
		System.out.println("4.Display Last Contact");
		do
		{
		System.out.println("Enter Your Choice");
		int ch=in.nextInt();
		switch(ch)
		{
		case 1 : System.out.println("Enter Name to be Searched:");
				 String s=in.next();
				 b.Search(s);
				 break;
		case 2 : b.Dislpay();
				 break;
		case 3:  b.Display_First();
				 break;
		case 4:  b.Display_Last();
				 break;
		default : System.out.println("No such Operation");
		}
		System.out.println("Do you wish to continue? 1-Yes | 0-No");
		c=in.nextInt();
		}while(c==1);
		sc.close();
		in.close();
	}
}
