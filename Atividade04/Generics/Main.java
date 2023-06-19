package Atividade04.Generics;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Gerente gerenteUm = new Gerente("Gabriel Costa", 1, 7500.00);
        Analista analistaUm = new Analista("Luiza Campos", 2, 6000.00);
        Analista analistaDois = new Analista("Lais Silva", 6, 9000.00);
        Programador programadorUm = new Programador("Patricia Silva", 3, 8000.00);
        Programador programadorDois = new Programador("Gabriela Santos", 4, 8500.00);
        Programador programadorTres = new Programador("Junior Santos", 5, 4500.00);

        analistaDois.horaEntrada(8);
        analistaUm.horaEntrada(7);
        programadorUm.horaEntrada(9);
        programadorUm.horaSaida(20);
        programadorDois.horaEntrada(8);
        programadorDois.horaSaida(18);
        programadorTres.horaEntrada(9);
        programadorTres.horaSaida(19);
        analistaUm.horaSaida(18);

        Departamento tecnologia = new Departamento<>();
        tecnologia.adicionarGerente(gerenteUm);
        tecnologia.adicionarFuncionario(gerenteUm);
        tecnologia.adicionarFuncionario(analistaUm);
        tecnologia.adicionarFuncionario(analistaDois);
        tecnologia.adicionarFuncionario(programadorUm);
        tecnologia.adicionarFuncionario(programadorDois);
        tecnologia.adicionarFuncionario(programadorTres);

        String formato = "%1$-5s %2$-40s %3$-21s %4$-15s";

        System.out.println("Funcionários do departamento de tecnologia:");
        System.out.printf(formato, "ID", " | Nome", " | Hora de Entrada", " | Salario ");
        List<Funcionario> funcionarios = tecnologia.listarFuncionarios();
        System.out.println("Funcionários:");

        for (Funcionario funcionario : funcionarios) {
            System.out.printf(formato, funcionario.getId(),
                    " | " + funcionario.getNome(),
                    " | " + funcionario.getHoraEntrada() + "h",
                    " | " + funcionario.getSalario());

            System.out.println();
        }

        List<Funcionario> atrasados = tecnologia.listarAtrasados(7);
        System.out.println("\nFuncionários atrasados:");
        for (Funcionario atrasado : atrasados) {
            System.out.println(atrasado.getNome());
        }
    }
}