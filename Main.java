import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner scanner = new Scanner(System.in);

			int codigoProduto = 0, quantidade = 0;
			double valorPagar =0;
			
			System.out.print("Por favor, digite o código do produto: ");
			codigoProduto = scanner.nextInt();
			
			System.out.print("Agora, digite a quantidade comprada: ");
			quantidade = scanner.nextInt();
			
			
			if (codigoProduto == 1) {
				valorPagar = quantidade * 5.00;
			} else if (codigoProduto == 2) {
				valorPagar = quantidade * 3.50;
			} else if (codigoProduto == 3) {
				valorPagar = quantidade * 4.80;
			} else if (codigoProduto == 4) {
				valorPagar = quantidade * 8.90;
			} else if (codigoProduto == 5) {
				valorPagar = quantidade * 7.32;
			}
			
			System.out.printf("Obrigado por comprar conosco, o total ficou em %.2f", valorPagar);
			
			scanner.close();

			}
}
