package basics;

public class VoidProgram
{
	public static void main(String args[])
	{  /*
	      int r,sum=0,temp;    
	      int n=454;//It is the number variable to be checked for palindrome  
	      
	      temp=n;    
	      while(n>0){    
	       r=n%10;  //getting remainder  
	       sum=(sum*10)+r;    
	       n=n/10;    
	      }    
	      if(temp==sum)    
	       System.out.println("palindrome number ");    
	      else    
	       System.out.println("not palindrome");    */
	      
	      /*String s1="logic is important";
			char [] ch=s1.toCharArray();
			String out="";
			for (int i=0;i<ch.length ;i++) 
			{
				String word="";
				while(i<ch.length && ch[i]!=' ')
				{
					word=ch[i]+word; //reserving operation
					i++;
				}
				out=out+word+" "; //concatinated to display a single string
			}
			System.out.println("out="+out);*/

		// declaring variable

		
		   
		       /* String str = new String("Hi Welcome to Tutorialspoint");
		        for(int i=0; i<str.length(); i++) 
		        {
		           if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
		           {
		              System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
		           } 	
		        }*/
		        
		        for(int i = 10; i > 0; i--)
		        {
		            System.out.println(i);
		        }
		}
	}
