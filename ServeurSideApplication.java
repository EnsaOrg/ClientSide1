package ma.ensa;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServeurSideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeurSideApplication.class, args);
		
		if (System.getSecurityManager() == null) {
		    System.setSecurityManager(new RMISecurityManager());
		  }

		  try {
		    Remote r = Naming.lookup("rmi://10.0.0.13/TestRMI");
		  } catch (Exception e) {
		    e.printStackTrace();
		  }

	}

}
