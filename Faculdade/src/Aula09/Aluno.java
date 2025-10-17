package com.mycompany.aluno;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlunoClasse a1 = new AlunoClasse();
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        a1.setNome(nome);
        
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        a1.setEndereco(endereco);
        
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        a1.setIdade(idade);
        scanner.nextLine(); // limpa o enter
        
        System.out.print("Sexo: ");
        String sexo = scanner.nextLine();
        a1.setSexo(sexo);
        
        System.out.print("RG: ");
        int rg = scanner.nextInt();
        a1.setRG(rg);
        scanner.nextLine(); // limpa o enter novamente
        
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        a1.setCurso(curso);
        
        System.out.println("\n--- Dados do Aluno ---");
        System.out.println(a1);
        
        scanner.close();
    }
}
