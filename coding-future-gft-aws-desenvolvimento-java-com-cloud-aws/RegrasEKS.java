package dio.javaCloudAWS;

import java.util.Scanner;

public class RegrasEKS {

    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();

        //TODO: Calcule o número mínimo de nodes necessários
//        int numeroMinimoNodes = numeroTotalPods / podsPorNode <= 1 ? 1 : (int) Math.ceil((double) numeroTotalPods / podsPorNode);
        int numeroMinimoNodes = (int) Math.ceil((double) numeroTotalPods / podsPorNode);

        //TODO: Calcule o número mínimo de servidores necessários
//        int numeroMinimoServidores = numeroTotalPods / podsPorServidor <= 1 ? 1 : (int) Math.ceil((double) numeroTotalPods / podsPorServidor);
        int numeroMinimoServidores = (int) Math.ceil((double) numeroTotalPods / podsPorServidor);

        if (numeroMinimoNodes <= 1) {
            System.out.println("1.Recomendamos usar um unico node" +
                    "\n2.Numero minimo de servidores:" + (int) numeroMinimoServidores);
        } else if (numeroMinimoServidores <= 1) {
            System.out.println("1.Numero minimo de nodes:" + (int) numeroMinimoNodes +
                    "\n2.Recomendamos usar um unico servidor");
        } else {
            System.out.println("1.Numero minimo de nodes:" + (int) numeroMinimoNodes +
                    "\n2.Numero minimo de servidores:" + (int) numeroMinimoServidores);
        }
        scanner.close();
    }
}
