import java.util.Scanner;
public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
			String[] s = new String[]  {"idly  ","wada  ","dosa  ","poori ","EggDosa ","masalaDosa ","bonda  ","tea   ","coffee ","Quit  "};
			int[] rate = new int[]{10,15,20,30,25,30,20,10,10,0};
			int[] ci = new int[10];
		        int sum=0;
		       
			boolean ordering=true;
		         
		        
		        do{
		            System.out.println("ITEM"+"\t\t\tPrice");
		            
				for(int i=0;i<10;i++)
		            System.out.println((i+1)+"."+s[i]+"\t\t"+rate[i]);
				System.out.println("Select the item number:");
		            
		            
		            int choose=input.nextInt();
		          
			    if(choose>0 && choose<10)
			    {
				System.out.println("enter the no of quantites of "+s[choose-1]);
		                 int q=input.nextInt();
			         ci[choose-1]+=q;
				
			    }
			    else
			    {
		               ordering=false;
		              
		            }
		        
		        }while(ordering);
			
			   
		        System.out.println("Your Orders are:\n");
			    for(int i=0;i<10;i++)
			    {
		             if(ci[i]!=0)
			     {
			      sum+=ci[i]*rate[i];
		              System.out.println(s[i]+"*   "+rate[i]+"*"+ci[i]+"=="+ci[i]*rate[i]+"rs");
			     }
			    }
		  
		        
		        System.out.println("Your total bill="+sum);
		        
		         System.out.println("Thank you");
	}

}
