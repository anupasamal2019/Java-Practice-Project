 interface Person{
   void dsplay();
}
class Student implements Person{
   public void dsplay() {
      System.out.println("This is display method of the Student class");
   }
}
class Lecturer implements Person{
   public void dsplay() {
      System.out.println("This is display method of the Lecturer class");
   }
}
public class AbstractionExample{
   public static void main(String args[]) {
      Person person1 = new Student();
      person1.dsplay();
      Person person2 = new Lecturer();
      person2.dsplay();
   }
}
/*public class Armostrong {
	public static void main(String[] args) {
		int no=371,t1=no,leng=0;
		while(t1!=0) {
			leng=leng+1;
			t1=t1/10;
		}
		int t2=no;
		int arm=0;
		while(t2!=0) {
			int mul=1;
			int rem=t2%10;
			for(int i=1;i<=leng;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==no) {
			System.out.println(no+" is armostrong");
			
		}
		else {
			System.out.println(no+" is not armostrong");
			
		}*/
	
		
	


