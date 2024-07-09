
public class IfStatement {
	public static void main(String[] args) {
		boolean isBluetoothEnabled = true;
		int fileSended = 3; 	//Scope global es accesible desde cualquier lugar
		
		if(isBluetoothEnabled) {
			//Send file
			fileSended++;
			System.out.println("Archivo Enviado");
			int i =0;	//variable declarada en scope if
			i++;		//solo es accesible dentro del scope
		} else {
			fileSended--;
			System.out.println("Por favor enciende tu Bluetooth para iniciar la transferencia");
		}
		
		System.out.println(isBluetoothEnabled);
		System.out.println(fileSended);
	}
}
