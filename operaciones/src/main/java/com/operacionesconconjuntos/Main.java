package com.operacionesconconjuntos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        System.out.println("Ingrese los elementos del primer conjunto (ingrese 'q' para terminar):");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                int numero = Integer.parseInt(input);
                conjunto1.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero o 'q' para terminar.");
            }
        }

        System.out.println("Ingrese los elementos del segundo conjunto (ingrese 'q' para terminar):");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                int numero = Integer.parseInt(input);
                conjunto2.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero o 'q' para terminar.");
            }
        }

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);

        Set<Integer> union = new HashSet<>(conjunto1);
        union.addAll(conjunto2);
        System.out.println("Unión de los conjuntos: " + union);

        Set<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);
        System.out.println("Intersección de los conjuntos: " + interseccion);

        Set<Integer> diferencia = new HashSet<>(conjunto1);
        diferencia.removeAll(conjunto2);
        System.out.println("Diferencia (Conjunto1 - Conjunto2): " + diferencia);

        scanner.close();
    }
}