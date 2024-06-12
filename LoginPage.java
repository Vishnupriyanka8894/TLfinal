package Week3.Assignments;

public class LoginPage extends BasePage {

	@Override
	public void performCommonTasks()
	{
		System.out.println("This is Perform common tasks in login page class (overridden) ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp=new LoginPage();
		lp.performCommonTasks();

	}

}
