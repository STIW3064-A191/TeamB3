
import java.util.Scanner;

public class ExtractVowelAndConsonant {
	public static void main(String[ ] arg)
	{
	String s;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	s=sc.nextLine();	
	System.out.println("Vowels in a string '"+s+"' are :"); 	
	vowels(s);
        
        System.out.println("Conconant in a string '"+s+"' are :"); 	
	consonant(s);
	}
        
static void vowels(String str)
{
	char ch;
	int i=0;
	for(int j=0;j<str.length();j++)
	{
	  ch=str.charAt(j);	
	  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	  {
            i=1;
	    System.out.println(ch); 		 
	  }
	}
	if(i==0)
		System.out.println("There are no vowels in a entered string"); 
	
}

static void consonant(String str)
{
	char cn;
	int i=0;
	for(int j=0;j<str.length();j++)
	{
	  cn=str.charAt(j);	
	  if(cn=='b'||cn=='c'||cn=='d'||cn=='f'||cn=='g'||cn=='h'||cn=='j'||cn=='k'||cn=='l'||cn=='m'
                    ||cn=='n'||cn=='p'||cn=='q'||cn=='r'||cn=='s'||cn=='t'||cn=='v'||cn=='w'||cn=='x'
                    ||cn=='y'||cn=='z'||cn=='F'||cn=='G'||cn=='H'||cn=='J'||cn=='K'||cn=='L'||cn=='M'
                    ||cn=='N'||cn=='P'||cn=='Q'||cn=='R'||cn=='S'||cn=='T'||cn=='V'||cn=='W'||cn=='X'
                    ||cn=='Y'||cn=='Z')
	  {
            i=1;
	    System.out.println(cn); 		 
	  }
	}
	if(i==0)
		System.out.println("There are no consonant in a entered string"); 

}
}