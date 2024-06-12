package Week3.Assignments;

public class Javachallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scenario 1
		String s="Hello World";
		String ss=s.substring(6);
		System.out.println(ss);
		int length1=ss.length();
		System.out.println(length1);
		System.out.println("The last word is" +ss +"and length" +length1);
		System.out.println("=================================================================");
		//Scenario 2
		String s1="   fly me   to   the moon  ";
		String replaceall=s1.replaceAll(" ", "");
		System.out.println(replaceall);
		String lwd=replaceall.substring(10);
		int length2=lwd.length();
		System.out.println("The last word is" +lwd +length2);
		System.out.println("==================================================================");
		/*Scenario3
		Input: s = "luffy is still joyboy"
				Output: 6
				Explanation: The last word is "joyboy" with length 6.*/
		String s3="luffy is still joyboy";
		String sss=s3.substring(15);
		System.out.println(sss);
		int length3=sss.length();
		System.out.println(length3);
		System.out.println("The last word is" +sss +length3);
		System.out.println("==================================================================");
		
		
		
		 
		
		
		

	}

}
