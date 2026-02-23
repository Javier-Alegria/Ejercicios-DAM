package EjercicioObjetos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;


        Grupo g1 = new Grupo("1dam");
        Alumno a1 = new Alumno("11111111A","Shino1",2);
        Alumno a2 = new Alumno("22222222B","Shino2",3);
        Alumno a3 = new Alumno("33333333C","Shino3",4);
        Alumno a4 = new Alumno("44444444D","Shino4",5);


        g1.altaAlumno(a1);
        g1.altaAlumno(a2);
        g1.altaAlumno(a3);
        g1.altaAlumno(a4);

        System.out.println(g1.mostrarAlumnos());

        g1.bajarAlumno(a3.getDni());

        System.out.println(g1.mostrarAlumnos());




/*
        Alumno alumno = null;
        Grupo grupo = null;

        do {
            System.out.println("\n== OPCIONES DE INTERACCIÓN==");
            System.out.println("Dar de alta un alumno (1)");
            System.out.println("Dar de baja un alumno (indicando su DNI) (2)");
            System.out.println("Mostrar todos los alumnos (3)");
            System.out.println("Calcular y mostrar la nota media del grupo (4)");
            System.out.println("Crear alumno (5)");
            System.out.println("Crear grupo (6)");
            System.out.println("Salir (0)");

            System.out.print("Ingrese opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if(alumno!=null && grupo!=null){




                        grupo.altaAlumno(alumno);
                    } else
                        System.out.println("Debes crear el alumno y grupo primero");
                    break;

                case 2:
                    if(alumno!=null && grupo!=null){
                        System.out.println(grupo.bajaAlumno(alumno.getDni()));
                    } else
                        System.out.println("Debes crear el alumno y grupo primero");
                    break;

                case 3:
                    if(grupo!=null){
                        System.out.println(grupo.mostrarAlumnos());
                    } else
                        System.out.println("Debes crear el grupo primero");
                    break;

                case 4:
                    if(grupo!=null){
                        grupo.calcularNotaMedia();
                    } else
                        System.out.println("Debes crear el grupo primero");
                    break;

                case 5:
                    System.out.println("Introduce el DNI del alumno");
                    String dni = sc.next();
                    System.out.println("Introduce el nombre del alumno");
                    String nombre = sc.next();
                    System.out.println("Introduce la nota media del alumno");
                    double notaMedia = sc.nextDouble();
                    alumno = new Alumno(dni,nombre,notaMedia);
                    break;

                case 6:
                    System.out.println("Introduce el nombre del grupo");
                    String grupoNombre = sc.next();
                    grupo = new Grupo(grupoNombre);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);

*/
    }
}
