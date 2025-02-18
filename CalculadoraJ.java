import java.util.Scanner;

public class CalculadoraJ {
    public static void main(String[] args) {   
        Scanner Txt = new Scanner(System.in);

        //Variáveis
        float num1 = 0;
        float num2 = 0;
        String Operação;
        String Answer;
        float result = 0;
        int OperationNum = 0;
        
        System.out.println("Quer ajuda?");
        System.out.println("Sim ou não?");
        Answer = Txt.nextLine();

            while ("Sim".equals(Answer)) {

            //Escolha de valores
            System.out.println("Selecione um valor");
            num1 = Txt.nextFloat();
            Txt.nextLine();

            System.out.println("Agora uma operação. + - * /");
            Operação = Txt.nextLine();

            System.out.println("Agora um segundo valor.");
            num2 = Txt.nextFloat();
            Txt.nextLine();


            //Funcionamento
            if ("+".equals(Operação)) {
                OperationNum = 1;
            } else if ("-".equals(Operação)) {
                OperationNum = 2;
            } else if ("*".equals(Operação)) {
                OperationNum = 3;
            } else if ("/".equals(Operação)) {
                OperationNum = 4;
            }

            switch (OperationNum) {
                case 1:
                result = num1 + num2;
                break;

                case 2:
                result = num1 - num2;
                break;

                case 3:
                result = (num1) * (num2);
                break;

                case 4:
                result = (num1) / (num2);
                break;
            }
            System.out.println(result);

            System.out.println("Precisa de algo a mais?");
            System.out.println("Sim ou não?");
            Answer = Txt.nextLine();
            }
            Txt.close();
        }
}
