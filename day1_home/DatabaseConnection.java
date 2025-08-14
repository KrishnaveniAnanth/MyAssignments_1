package week4.day1_home;

//create an interface with abstract methods
public interface DatabaseConnection {
	public abstract void connect();

	public abstract void disconnect();

	public abstract void executeUpdate();

}
