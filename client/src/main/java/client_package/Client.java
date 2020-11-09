package client_package;

import static spark.Spark.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		port(8080);
		get("/hello", (req, res) -> "Hello World");

	}

}
