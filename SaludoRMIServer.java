

import java.rmi.*;

class SaludoRMIServer {
	public static void main (String[] argv) {
		try {
			Naming.rebind("SaludoRMIServer", new SaludoRMI());
			System.out.println("SaludoRMI Server esta listo.");
		} catch (Exception e) {
			System.out.println("SaludoRMI Server con erores: " + e);
		}
	}
}
