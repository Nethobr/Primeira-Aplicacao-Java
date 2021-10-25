import java.util.Scanner;

public class LivroTeste 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
			float alturaUs,
				  pesoUs,
				  calcImc;
			
			do
			{
				System.out.print ("Altura: ");
				alturaUs = input.nextFloat ();
				
				System.out.print ("Peso: ");
				pesoUs = input.nextFloat ();
				
				calcImc = (pesoUs / (alturaUs *2));
				
				System.out.printf ("%f\n", calcImc);
				if (calcImc < 18.5)
				{
					System.out.printf ("Desnutrido: %.2f\n", calcImc);
				}
				else if (calcImc >= 18.5 && calcImc <= 24.9)
				{
					System.out.printf ("Normal: %.2f\n", calcImc);
				}
				else if (calcImc <= 25 && calcImc <= 29.9)
				{
					System.out.printf ("Cuidado ae: %.2f\n", calcImc);
				}
				else
				{
					System.out.printf ("Deu ruim: %.2f\n", calcImc);
				}
			} while (1 > 0);
	}   //Fim main
}   //fim class
