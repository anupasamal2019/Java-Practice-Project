
public class Pallindrome {
		public static void main(String[]args){
		int sum=0,r,temp;
		int no=1236;temp=no;
		while( no>0){
		r=no%10;
		sum=sum*10+r;
		no=no/10;
		}
		System.out.println(sum);
		/*if(temp==sum){
		System.out.println(temp+" "+"is pallindrome");

		}
		else{
		System.out.println(temp+" "+"is not pallindrome");

		}*/
		}
		}


