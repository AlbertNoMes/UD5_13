import javax.swing.JOptionPane;
public class CalculadoraInversaAPP {

	public static void main(String[] args) {
		
		//Pedimos los operadores y el signo por string
		String var1=JOptionPane.showInputDialog("Introduce el operador 1");
		double operador1=Double.parseDouble(var1);
		String operacion=JOptionPane.showInputDialog("Escribe el signo para la operaci�n");
		String var2=JOptionPane.showInputDialog("Introduce el operador 2");
		double operador2=Double.parseDouble(var2);
		
		switch (operacion) {
		case "+":
			System.out.println("El resultado de la suma es = "+(operador1+operador2));
			break;
		case "-":
			System.out.println("El resultado de la resta es = "+(operador1-operador2));
			break;
		case "*":
			System.out.println("El resultado de la multiplicaci�n es = "+(operador1*operador2));
			break;
		case "/":
			System.out.println("El resultado de la divisi�n es = "+(operador1/operador2));
			break;
		case "^":
			System.out.println("El resultado de la pot�ncia es = "+(int)Math.pow(operador1, operador2));
			break;
		case "%":
			System.out.println("El resultado del m�dulo es = "+(operador1%operador2));
			break;
		default:
			System.out.println("ERROR");
		}
	}
}
