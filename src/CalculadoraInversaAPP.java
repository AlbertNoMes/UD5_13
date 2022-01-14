import javax.swing.JOptionPane;
public class CalculadoraInversaAPP {

	public static void main(String[] args) {
		
		//Pedimos los operadores y el signo por string
		String var1=JOptionPane.showInputDialog("Introduce el operador 1");
		double operador1=Double.parseDouble(var1);
		String operacion=JOptionPane.showInputDialog("Escribe el signo para la operación");
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
			System.out.println("El resultado de la multiplicación es = "+(operador1*operador2));
			break;
		case "/":
			System.out.println("El resultado de la división es = "+(operador1/operador2));
			break;
		case "^":
			System.out.println("El resultado de la poténcia es = "+(int)Math.pow(operador1, operador2));
			break;
		case "%":
			System.out.println("El resultado del módulo es = "+(operador1%operador2));
			break;
		default:
			System.out.println("ERROR");
		}
	}
}
