package imc;
import java.util.Scanner;

/**
 *
 * @author marciomonks
 */
public class IMC {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        float peso;
        float altura;
        float imc;
        String classifica;

        System.out.println("Informe o nome da Pessoa: ");
        nome = ler.nextLine();
        System.out.println("Peso (kg): ");
        peso = ler.nextFloat();
        System.out.println("Altura (m): ");
        altura = ler.nextFloat();
        ler.nextLine();
       
        
        imc = calcularIMC(peso, altura);
       
        classifica = resultadoIMC(imc);
        
        System.out.printf("IMC da Pessoa = %.1f - %s\n", imc, classifica);
 
    }
    
    static float calcularIMC(float p, float h) {
      return p/(h*h);
   }


   static String resultadoIMC(float imc) {
      String result;
      if (imc <= 19)
         result = "Abaixo do Peso";
      else
         if (imc <= 25)
            result = "Peso ideal";
         else
            if (imc <= 30)
               result = "Acima do Peso";
            else
               if (imc <= 35)
                  result = "Obesidade Leve";
               else
                  result = "Obesidade"; 
      
      return result;
   }
    
}
