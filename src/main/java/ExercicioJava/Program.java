package ExercicioJava;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        List<CvsProduto> list = new ArrayList<>();
        list.add(new CvsProduto("Macarrao", 15.99, 15));
        list.add(new CvsProduto("Feijao", 10.99, 10));

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();


        File sourceFile = new File(sourceFileStr);
        String strPath = sourceFile.getParent();

        File outDir = new File(strPath + "\\out");
        if (!outDir.exists()) {
            boolean success = outDir.mkdir();
            System.out.println("Directory created successfully: " + success);
        }

        String targetFileStr = strPath + "\\out\\sumarry.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr, true))) {

            for (CvsProduto produto : list) {
                bw.write(Arrays.toString(produto.toString().split(",")));
                bw.newLine();
            }

            System.out.println("Produtos adicionados ao arquivo CSV.");

        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
