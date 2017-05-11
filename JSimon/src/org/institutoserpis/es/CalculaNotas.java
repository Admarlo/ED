package org.institutoserpis.es;

import java.util.Random;

public class CalculaNotas {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		/*Las notas serán creadas de forma aleatoria
		 no tener que introducir 20 valores en el vector*/
		
        float[][] notas = new float[20][3];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                float nota = 11;
                while (nota > 10) {
                    nota = random.nextFloat()*11;
                }
                notas[i][j] = nota;
            }
        }

        System.out.printf("Nota media de cada alumno:%n");
        notaMediaPorAlumno(notas);
        System.out.printf("%n");

        System.out.printf("Nota máxima de cada modulo:%n");
        notaMaximaPorModulo(notas);
        System.out.printf("%n");

        System.out.printf("Nota media por modulo:%n");
        notaMediaPorModulo(notas);
    }

    private static void notaMediaPorAlumno(float[][] notas) {
        float mediaAlumno[] = new float[20];

        for (int i = 0; i < notas.length; i++) {
            for(int j = 0; j < notas[i].length; j++) {
                mediaAlumno[i] += notas[i][j];
            }
            mediaAlumno[i] /= 3.0;
        }

        for(int i = 0; i < mediaAlumno.length; i++) {
            String alumnoFrase = "Alumno " + (i + 1) + ":";

            System.out.printf("%-19s %6.2f%n", alumnoFrase,
                    mediaAlumno[i]);
        }
    }

    private static void notaMaximaPorModulo(float[][] notas) {
        float maximaModulo[] = {0.0f, 0.0f, 0.0f};

        for (int i = 0; i < notas.length; i++) {
            for(int j = 0; j < notas[i].length; j++) {
                if (maximaModulo[j] < notas[i][j]) {
                    maximaModulo[j] = notas[i][j];
                }
            }
        }

        for(int i = 0; i < maximaModulo.length; i++) {
            String moduloFrase = "Modulo " + (i + 1) + ":";

            System.out.printf("%-19s %6.2f%n", moduloFrase, maximaModulo[i]);
        }

    }

    private static void notaMediaPorModulo(float[][] notas) {
        float mediaModulo[] = {0.0f, 0.0f, 0.0f};
        int sobrepasanMedia[] = {0, 0, 0};

        for (int i = 0; i < notas.length; i++) {
            for(int j = 0; j < notas[i].length; j++) {
                mediaModulo[j] += notas[i][j];
            }
        }

        for (int i = 0; i < mediaModulo.length; i++) {
            mediaModulo[i] /= 20.0f;
        }

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (mediaModulo[j] <= notas[i][j]) {
                    sobrepasanMedia[j]++;
                }
            }
        }

        for(int i = 0; i < mediaModulo.length; i++) {
            String mediaGrupoFrase = "Media del modulo " + (i + 1) + ":";
            
            System.out.printf("%-19s %6.2f (%d superan la media)%n",
                    mediaGrupoFrase, mediaModulo[i], sobrepasanMedia[i]);
        }
	}

}
