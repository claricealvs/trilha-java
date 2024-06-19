package testes;

import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devClarice = new Dev();
        devClarice.setNome("Clarice");
        devClarice.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Clarice:" + devClarice.getConteudosInscritos());
        devClarice.progredir();
        devClarice.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devClarice.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devClarice.getConteudosConcluidos());
        System.out.println("XP:" + devClarice.calcularTotalXp());


        devClarice.gerarCertificado();

        System.out.println("-------");

    }

}
