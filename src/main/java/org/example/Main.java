package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        List<String> respuestas1 = new ArrayList<String>();
        respuestas1.add("Negro");
        respuestas1.add("verde");
        respuestas1.add("Blanco");
        respuestas1.add("Azul");
        Preguntas pregunta1 = new Preguntas( "De que color era el caballo de San Martìn",
                respuestas1, 3);
        quiz.agregarPregunta(pregunta1);

        pregunta1.mostrarPregunta();
    }
}