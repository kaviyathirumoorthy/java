
/*documentation: this program return the reverse of input string and is implemented by using StringBuilder*/
//package
//import statements;
import java.util.*;
//interface section
//class definition
public class Main {
	//main method class
	public static void main(String[] args){
		//statements
		Scanner sc=new Scanner(System.in);
		String str1="";
		str1=sc.nextLine();
		StringBuilder k=new StringBuilder(str1);
		str1=(k.reverse()).toString(); // to reverse entire string
		System.out.print(str1);
	}
}

/*import java.util.*;
//interface section
//class definition
public class Main {
	//main method class
	public static void main(String[] args){
		//statements
		Scanner sc=new Scanner(System.in);
		String str1;
		str1=sc.nextLine();
		String[] str=str1.split(" ");
		String reverse_str="";
		for(String j:str){
			StringBuilder k=new StringBuilder(j);           // TO REVERSE EACH WORD IN A STRING
			k.reverse();
			reverse_str+=(k.toString()+" ");
		}
		System.out.print(reverse_str.trim());
	}
}*/



