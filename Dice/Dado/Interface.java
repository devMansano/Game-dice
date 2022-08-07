import java.util.Scanner;


public class Interface
{
    ROLARDADOS kd = new ROLARDADOS();
    Regra re = new Regra();
    public void TelaInicial(){
        System.out.println("\nBEM VINDO, ESCOLHA UMA DAS TRÊS OPÇÕES");
        System.out.println("\n1)Jogar  2)Regras 3)Escolha de Dados 4)Sair");
        Scanner cursor = new Scanner(System.in);
        int escolhido = cursor.nextInt();

        switch(escolhido){
            case 1:
                System.out.print("\u000C"); //Deixar limpa a tela
                Dado1();

                break;
            case 2:
                System.out.print("\u000C");
                Regras();

                break;
            case 3:
                System.out.print("\u000C");
                TelaInicial2();

                break;

            case 4://Sair
                System.out.println("Obrigado por jogar, Tenha um excelente dia :D ");
                System.exit(0);

            default:

                System.out.println("Número inválido");
                System.out.print("\u000C"); //Deixar limpa a tela
                TelaInicial();
        }

    }

    public void TelaInicial2(){
        System.out.println("\n ESCOLHA UMA DAS TRÊS OPÇÕES DE DADOS");
        System.out.println("\n1)2 Dados 2)3 Dados 3)4 Dados 4)Sair");
        Scanner cursor = new Scanner(System.in);
        int escolhido = cursor.nextInt();

        switch(escolhido){
            case 1:
                System.out.print("\u000C"); //Deixar limpa a tela
                Dado1();

                break;
            case 2:
                System.out.print("\u000C");
                Dado2();
                break;
            case 3:
                System.out.print("\u000C");
                Dado3();
                break;
            case 4://Sair
                System.out.println("Obrigado por jogar, Tenha um excelente dia :D ");
                System.exit(0);

            default:

                System.out.println("Número inválido");
                System.out.print("\u000C"); //Deixar limpa a tela
                TelaInicial2();
        }

    }

    public void Regras(){
        re.Regra();
        TelaInicial();
    }

    public void Dado1() {
        kd.Play();
        TelaInicial();
    }

    public void Dado2() {
        kd.Play2();
        TelaInicial();
    }

    public void Dado3() {
        kd.Play3();
        TelaInicial();
    }
}

