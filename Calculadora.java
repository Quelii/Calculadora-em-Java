package aprimoramentos;

import java.util.Scanner; // importando a class scanner

// FEITO POR QUELIANE GRAMACHO//

public class Calculadora {

    /**
     * @param args
     */
    public static void main (String[]args){
    try (Scanner ler = new Scanner(System.in)) {
      int a, b;
    
        System.out.printf("Digite o primeiro valor \n");
        a = ler.nextInt(); //entrada de dados (lendo um valor inteiro)
    
        System.out.printf("\n Digite o Segundo Valor\n");
        b= ler.nextInt();  //entrada de dados valor inteiro

        while (true) {

            System.out.printf("\n DIGITE 1 PARA SOMAR  \n");
            System.out.printf("\n DIGITE 2 PARA SUBITRAIR \n");
            System.out.printf("\n DIGITE 3 PARA DIVIDIR \n");
            System.out.printf("\n DIGITE 4 PARA MUTIPLICAR\n");

        int num= ler.nextInt();
        System.out.printf("%d",num);
      


        switch( num ){

            case 1:
                System.out.printf("\n O RESULTADO EH \n");
                System.out.printf("%d + %d = %d\n",a, b ,(a + b));
                break;
            case 2:
                System.out.printf("\n O RESULTADO EH \n");
                System.out.printf("%d - %d = %d\n",a, b, (a - b));
                break;
            case 3:
                System.out.printf("\n O RESULTADO EH \n");
                System.out.printf("%d / %d = %d\n",a, b, (a / b));
                break;
            case 4:
                System.out.printf("\n O RESULTADO EH \n");
                System.out.printf("%d * %d = %d\n",a, b, (a * b));
                break;
        default:
        System.out.printf("SELECAO INVALIDA \n");
        }
}
}
    }
    

}
