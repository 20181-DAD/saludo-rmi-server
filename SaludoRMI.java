
import java.rmi.*;
import java.rmi.server.*;

public class SaludoRMI extends UnicastRemoteObject 
implements SaludoRMIInterface {

	public SaludoRMI () throws RemoteException {}

	public String saludar(String nombre) throws RemoteException {
		System.out.println("eco: saludando a "+nombre);
		return "Hola "+nombre;
	}
}

