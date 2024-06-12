package Week3.Assignments;

public class APIClient {
	String s1="Test";	
	public void sendRequest(String Endpoint)
	{
		System.out.println(Endpoint);
	}
	public void sendRequest(String Endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println(Endpoint+" "+requestBody+" "+requestStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient api=new APIClient();
		api.sendRequest("Endpoint");
		api.sendRequest("Endpoint", "requestBody", false);
	}

}
