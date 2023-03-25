import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Js");
        curso2.setDescricao("Curso Js");
        curso2.setCargaHoraria(4);

        //System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Js");
        mentoria1.setDescricao("Mentoria");
        mentoria1.setData(LocalDate.now());

        //System.out.println(mentoria1);

        //Conteudo conteudo = new Curso(); // polimorfismo

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java");
        bootcamp.setDescricao("Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos CAMILA" + devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos inscritos CAMILA" + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos concluídos CAMILA" + devCamila.getConteudoConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());

        System.out.println("------------------------------");

        Dev devJoao= new Dev();
        devJoao.setNome("Greg");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos JOAO" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos inscritos JOAO" + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos concluídos JOAO" + devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularXp());

    }
}