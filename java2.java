// Programa que implementa los ejercicios del 1 al 21 de algoritmos
// usando una estructura de switch para seleccionar el ejercicio a ejecutar

import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de ejercicio (1-21) que desea ejecutar: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> {
                // Ejercicio 1: Calcular distancia recorrida en MRU
                System.out.print("Ingrese la velocidad constante (m/s): ");
                double v = sc.nextDouble();
                System.out.print("Ingrese el tiempo (s): ");
                double t = sc.nextDouble();
                double d = v * t;
                System.out.println("La distancia recorrida es: " + d + " metros");
            }
            case 2 -> {
                // Ejercicio 2: Calcular promedio de tres notas
                System.out.print("Ingrese la primera nota: ");
                double n1 = sc.nextDouble();
                System.out.print("Ingrese la segunda nota: ");
                double n2 = sc.nextDouble();
                System.out.print("Ingrese la tercera nota: ");
                double n3 = sc.nextDouble();
                double promedio = (n1 + n2 + n3) / 3;
                System.out.println("El promedio es: " + promedio);
            }
            case 3 -> {
                // Ejercicio 3: Calcular puntaje de respuestas
                System.out.print("Ingrese el número de respuestas correctas: ");
                int rc = sc.nextInt();
                System.out.print("Ingrese el número de respuestas incorrectas: ");
                int ri = sc.nextInt();
                // Las respuestas en blanco valen 0, no afectan el puntaje
                int prc = rc * 4;
                int pri = ri * (-1);
                int pf = prc + pri;
                System.out.println("El puntaje final es: " + pf);
            }
            case 4 -> {
                // Ejercicio 4: Calcular puntaje de equipo de fútbol
                System.out.print("Ingrese el número de partidos ganados: ");
                int pg = sc.nextInt();
                System.out.print("Ingrese el número de partidos empatados: ");
                int pe = sc.nextInt();
                System.out.print("Ingrese el número de partidos perdidos: ");
                sc.nextInt(); // Los partidos perdidos no suman puntos, solo se solicita el dato
                int ppg = pg * 3;
                int ppe = pe * 1;
                int pt = ppg + ppe; // Los partidos perdidos no suman puntos
                System.out.println("El puntaje total es: " + pt);
            }
            case 5 -> {
                // Ejercicio 5: Calcular planilla de un empleado
                System.out.print("Ingrese el número de horas laboradas en el mes: ");
                double hl = sc.nextDouble();
                System.out.print("Ingrese la tarifa por hora: ");
                double th = sc.nextDouble();
                double planilla = hl * th;
                System.out.println("La planilla es: " + planilla);
            }
            case 6 -> {
                // Ejercicio 6: Calcular área de un triángulo (fórmula de Herón)
                System.out.print("Ingrese el primer lado del triángulo: ");
                double la = sc.nextDouble();
                System.out.print("Ingrese el segundo lado del triángulo: ");
                double lb = sc.nextDouble();
                System.out.print("Ingrese el tercer lado del triángulo: ");
                double lc = sc.nextDouble();
                double s = (la + lb + lc) / 2;
                double area = Math.sqrt(s * (s - la) * (s - lb) * (s - lc));
                System.out.println("El área del triángulo es: " + area);
            }
            case 7 -> {
                // Ejercicio 7: Calcular número de CDs para backup
                System.out.print("Ingrese la capacidad del disco duro en GB: ");
                double gb = sc.nextDouble();
                double mg = gb * 1024;
                int cd = (int) Math.ceil(mg / 700);
                System.out.println("El número de CDs necesarios es: " + cd);
            }
            case 8 -> {
                // Ejercicio 8: Calcular distancia entre dos puntos
                System.out.print("Ingrese la abscisa del punto A: ");
                double x1 = sc.nextDouble();
                System.out.print("Ingrese la ordenada del punto A: ");
                double y1 = sc.nextDouble();
                System.out.print("Ingrese la abscisa del punto B: ");
                double x2 = sc.nextDouble();
                System.out.print("Ingrese la ordenada del punto B: ");
                double y2 = sc.nextDouble();
                double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                System.out.println("La distancia entre los puntos es: " + distancia);
            }
            case 9 -> {
                // Ejercicio 9: Determinar si debe sacar CUIL
                System.out.print("Ingrese el año de nacimiento: ");
                int an = sc.nextInt();
                int aa = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
                int edad = aa - an;
                if (edad > 17) {
                    System.out.println("Debe solicitar su CUIL");
                } else {
                    System.out.println("No debe solicitar su CUIL aún");
                }
            }
            case 10 -> {
                // Ejercicio 10: Comparar edades de hermanos
                System.out.print("Ingrese la edad del primer hermano: ");
                int e1 = sc.nextInt();
                System.out.print("Ingrese la edad del segundo hermano: ");
                int e2 = sc.nextInt();
                int de;
                if (e1 > e2) {
                    de = e1 - e2;
                    System.out.println("El primer hermano es el mayor, por " + de + " años");
                } else {
                    de = e2 - e1;
                    System.out.println("El segundo hermano es el mayor, por " + de + " años");
                }
            }
            case 11 -> {
                // Ejercicio 11: Incentivos por producción
                System.out.print("Ingrese la producción del Lunes: ");
                double pl = sc.nextDouble();
                System.out.print("Ingrese la producción del Martes: ");
                double pma = sc.nextDouble();
                System.out.print("Ingrese la producción del Miércoles: ");
                double pmi = sc.nextDouble();
                System.out.print("Ingrese la producción del Jueves: ");
                double pj = sc.nextDouble();
                System.out.print("Ingrese la producción del Viernes: ");
                double pv = sc.nextDouble();
                System.out.print("Ingrese la producción del Sábado: ");
                double ps = sc.nextDouble();
                double pt11 = pl + pma + pmi + pj + pv + ps;
                double promedioProd = pt11 / 6;
                if (promedioProd >= 100) {
                    System.out.println("Recibirá incentivos");
                } else {
                    System.out.println("No recibirá incentivos");
                }
            }
            case 12 -> {
                // Ejercicio 12: Encontrar el mayor de tres números
                System.out.print("Ingrese el primer número: ");
                double num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = sc.nextDouble();
                System.out.print("Ingrese el tercer número: ");
                double num3 = sc.nextDouble();
                double mayor;
                if (num1 > num2 && num1 > num3) {
                    mayor = num1;
                } else if (num2 > num3) {
                    mayor = num2;
                } else {
                    mayor = num3;
                }
                System.out.println("El número mayor es: " + mayor);
            }
            case 13 -> {
                // Ejercicio 13: Identificar tipo de triángulo
                System.out.print("Ingrese el primer lado del triángulo: ");
                double lado1 = sc.nextDouble();
                System.out.print("Ingrese el segundo lado del triángulo: ");
                double lado2 = sc.nextDouble();
                System.out.print("Ingrese el tercer lado del triángulo: ");
                double lado3 = sc.nextDouble();
                String tipoTriangulo;
                if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
                    tipoTriangulo = "Escaleno";
                } else if (lado1 == lado2 && lado2 == lado3) {
                    tipoTriangulo = "Equilátero";
                } else {
                    tipoTriangulo = "Isósceles";
                }
                System.out.println("El triángulo es: " + tipoTriangulo);
            }
            case 14 -> {
                // Ejercicio 14: Convertir a números romanos
                System.out.print("Ingrese un número entero del 1 al 10: ");
                int numEntero = sc.nextInt();
                String romano = switch (numEntero) {
                    case 1 -> "I";
                    case 2 -> "II";
                    case 3 -> "III";
                    case 4 -> "IV";
                    case 5 -> "V";
                    case 6 -> "VI";
                    case 7 -> "VII";
                    case 8 -> "VIII";
                    case 9 -> "IX";
                    case 10 -> "X";
                    default -> "Número fuera de rango";
                };
                System.out.println("El equivalente en romano es: " + romano);
            }
            case 15 -> {
                // Ejercicio 15: Calcular bonificación por ventas
                System.out.print("Ingrese el monto de venta: ");
                double mv = sc.nextDouble();
                double tb = 0;
                if (mv >= 0 && mv < 1000) {
                    tb = 0;
                } else if (mv >= 1000 && mv < 5000) {
                    tb = (3 * mv) / 100;
                } else if (mv >= 5000 && mv < 20000) {
                    tb = (5 * mv) / 100;
                } else if (mv >= 20000) {
                    tb = (8 * mv) / 100;
                }
                System.out.println("La bonificación es: " + tb);
            }
            case 16 -> {
                // Ejercicio 16: Mostrar vocal según número
                System.out.print("Ingrese un número entero: ");
                int ne = sc.nextInt();
                String vocal = switch (ne) {
                    case 1 -> "A";
                    case 2 -> "E";
                    case 3 -> "I";
                    case 4 -> "O";
                    case 5 -> "U";
                    default -> "Valor incorrecto";
                };
                System.out.println("La vocal es: " + vocal);
            }
            case 17 -> {
                // Ejercicio 17: Separar un número en unidades y decenas
                System.out.print("Ingrese un número entero de 2 cifras: ");
                int numero = sc.nextInt();
                int dec = numero / 10;
                int uni = numero % 10;
                System.out.println("Número de decenas: " + dec + "\nNúmero de unidades: " + uni);
            }
            case 18 -> {
                // Ejercicio 18: Determinar si un número es par
                System.out.print("Ingrese un número entero diferente de cero: ");
                int numero18 = sc.nextInt();
                String msg18;
                if (numero18 % 2 == 0) {
                    msg18 = "Es par";
                } else {
                    msg18 = "Es impar";
                }
                System.out.println(msg18);
            }
            case 19 -> {
                // Ejercicio 19: Mostrar números pares del 1 al 10
                StringBuilder resultado19 = new StringBuilder("2");
                int n19 = 2;
                for (int k = 1; k <= 4; k++) {
                    n19 = n19 + 2;
                    resultado19.append(", ").append(n19);
                }
                System.out.println("Los números pares del 1 al 10 son: " + resultado19);
            }
            case 20 -> {
                // Ejercicio 20: Calcular sueldo promedio
                System.out.print("Ingrese el número de empleados: ");
                int ne20 = sc.nextInt();
                double ss = 0;
                for (int k = 1; k <= ne20; k++) {
                    System.out.print("Ingrese el sueldo del empleado " + k + ": ");
                    double se = sc.nextDouble();
                    ss = ss + se;
                }
                double sp = ss / ne20;
                System.out.println("El sueldo promedio es: " + sp);
            }
            case 21 -> {
                // Ejercicio 21: Contar mayores y menores de edad
                int may = 0;
                int men = 0;
                for (int k = 1; k <= 200; k++) {
                    System.out.print("Ingrese la edad de la persona " + k + ": ");
                    int ep = sc.nextInt();
                    if (ep < 18) {
                        men = men + 1;
                    } else {
                        may = may + 1;
                    }
                    // Para evitar ingresar 200 edades, preguntamos si desea continuar
                    if (k % 10 == 0) {
                        System.out.print("¿Desea continuar ingresando edades? (s/n): ");
                        String resp = sc.next();
                        if (!resp.equalsIgnoreCase("s")) {
                            break;
                        }
                        sc.close();
                    }
                }
                System.out.println("Personas mayores de edad: " + may + "\nPersonas menores de edad: " + men);
            }
            default -> System.out.println("Opción no válida. Ingrese un número del 1 al 21.");
        }
    }
}