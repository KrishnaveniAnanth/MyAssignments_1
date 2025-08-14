package week4.day1_home;

//Concrete class implements interface
public class JavaConnection implements DatabaseConnection {

	public void connect() {
		System.out.println("Database is Connected");
	}

	public void disconnect() {
		System.out.println("Database is Disconnected");
	}

	public void executeUpdate() {
		System.out.println("Executing the database update");
	}

	// main method for execution
	public static void main(String[] args) {
		// creating object
		JavaConnection status = new JavaConnection();
		// calling abstract methods from interface
		status.connect();
		status.disconnect();
		status.executeUpdate();

	}

}
