import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el número de ejercicio (22-32) que desea ejecutar: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                // Casos del 1 al 21 omitidos por brevedad...

                case 22 -> {
                    System.out.print("Ingrese el primer número: ");
                    int pn = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int sn = sc.nextInt();
                    int producto = 0;
                    for (int i = 0; i < sn; i++) producto += pn;
                    System.out.println("El producto es: " + producto);
                }
                case 23 -> {
                    for (int k = 1; k <= 10; k++) {
                        if (k % 2 == 0) continue;
                        System.out.println(k);
                    }
                }
                case 24 -> {
                    int s = 1;
                    while (s < 1000) {
                        System.out.println(s);
                        s = (int)Math.pow(s, 2) + 1;
                    }
                }
                case 25 -> {
                    String l;
                    do {
                        System.out.print("Ingrese una letra: ");
                        l = sc.next();
                    } while (!l.matches("[aeiouAEIOU]"));
                    System.out.println("Se ingresó una vocal.");
                }
                case 26 -> {
                    int a = 0, b = 1, c;
                    System.out.println(a);
                    System.out.println(b);
                    while ((c = a + b) < 100000) {
                        System.out.println(c);
                        a = b;
                        b = c;
                    }
                }
                case 27 -> {
                    System.out.print("Ingrese el primer número: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double n2 = sc.nextDouble();
                    System.out.print("Ingrese el operador (+, -, *, ^): ");
                    String op = sc.next();
                    double r;
                    switch (op) {
                        case "+" -> r = n1 + n2;
                        case "-" -> r = n1 - n2;
                        case "*" -> r = n1 * n2;
                        case "^" -> r = Math.pow(n1, n2);
                        default -> {
                            System.out.println("Operador no válido");
                            return;
                        }
                    }
                    System.out.println("Resultado: " + r);
                }
                case 28 -> {
                    int nv = 0, nc = 0;
                    for (int i = 1; i <= 10; i++) {
                        System.out.print("Ingrese la letra " + i + ": ");
                        String l = sc.next();
                        if (l.matches("[aeiouAEIOU]")) nv++;
                        else nc++;
                    }
                    System.out.println("Vocales: " + nv);
                    System.out.println("Consonantes: " + nc);
                }
                case 29 -> {
                    int c1 = 0, c2 = 0, c3 = 0, c0 = 0;
                    for (int i = 1; i <= 160; i++) {
                        System.out.print("Ingrese el voto del elector " + i + " (1, 2, 3, otro): ");
                        int voto = sc.nextInt();
                        switch (voto) {
                            case 1 -> c1++;
                            case 2 -> c2++;
                            case 3 -> c3++;
                            default -> c0++;
                        }
                    }
                    String ganador;
                    if (c1 > c2 && c1 > c3 && c1 > c0) ganador = "Candidato 1";
                    else if (c2 > c3 && c2 > c0) ganador = "Candidato 2";
                    else if (c3 > c0) ganador = "Candidato 3";
                    else ganador = "Nulos o blancos";
                    System.out.println("Ganador: " + ganador);
                }
                case 30 -> {
                    System.out.print("Ingrese el primer número: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = sc.nextDouble();
                    double prom = (num1 + num2) / 2;
                    System.out.println("El promedio es: " + prom);
                }
                case 31 -> {
                    System.out.print("Ingrese un número (1-12): ");
                    int mes = sc.nextInt();
                    String nombreMes = switch (mes) {
                        case 1 -> "Enero";
                        case 2 -> "Febrero";
                        case 3 -> "Marzo";
                        case 4 -> "Abril";
                        case 5 -> "Mayo";
                        case 6 -> "Junio";
                        case 7 -> "Julio";
                        case 8 -> "Agosto";
                        case 9 -> "Septiembre";
                        case 10 -> "Octubre";
                        case 11 -> "Noviembre";
                        case 12 -> "Diciembre";
                        default -> "Mes inválido";
                    };
                    System.out.println("El mes es: " + nombreMes);
                }
                case 32 -> {
                    System.out.print("Ingrese un número entero distinto de cero: ");
                    int numero = sc.nextInt();
                    System.out.println("Divisores de " + numero + ":");
                    for (int i = 1; i <= Math.abs(numero); i++) {
                        if (numero % i == 0) {
                            System.out.println(i);
                        }
                    }
                }
                default -> System.out.println("Opción no válida. Ingrese un número del 1 al 32.");
            }
        }
    }
}

