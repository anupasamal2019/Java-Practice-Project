
public class Primeornot {
		public static void main(String[]args){
			int no=2;boolean flag=true;
			for(int i=2;i<no-1;i++) {
				if(no%i==0) {
					flag=false;
					break;
				}
			}
			if(flag==true&&no>1) {
				System.out.println(no+" "+"Is prime number");
			}
			else {
				System.out.println(no+" "+"Is not prime number");
			}
		}
			}
		
			/*int i,m=0,flag=0;      
			  int n=-15;//it is the number to be checked    
			  m=n/2;      
			  if(n==0||n==1){  
			   System.out.println(n+" is not prime number");      
			  }else{  
			   for(i=2;i<=m;i++){      
			    if(n%i==0){      
			     System.out.println(n+" is not prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  { System.out.println(n+" is prime number"); }  
			  }//end of else  
			}    */
				
		/*int no=1,temp=0;
				 if(no==0||no==1){  
			   System.out.println(no+" is not prime number"); }
				 else {
		for(int i=2;i<no-1;i++){
		if(no%i==0){
		temp=temp+1;
		}
		}
		if(temp>0){
		System.out.println("not prime");
		}
		else{
		System.out.println("prime");
		}
		}
		}*/


