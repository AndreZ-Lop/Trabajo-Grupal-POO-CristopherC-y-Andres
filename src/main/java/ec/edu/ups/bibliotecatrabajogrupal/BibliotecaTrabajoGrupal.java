/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.bibliotecatrabajogrupal;
import ec.edu.ups.bibliotecatrabajogrupal.Objeto.Autor;
import ec.edu.ups.bibliotecatrabajogrupal.Objeto.Usuario;
import ec.edu.ups.bibliotecatrabajogrupal.Objeto.Libreria;
import ec.edu.ups.bibliotecatrabajogrupal.Objeto.Libro;
import ec.edu.ups.bibliotecatrabajogrupal.Objeto.Persona;
import java.util.Scanner;
import java.util.ArrayList;

public class BibliotecaTrabajoGrupal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        ArrayList<Usuario> listaUsuarios = new ArrayList();
        ArrayList<Libreria> listaLibros = new ArrayList();
        
        System.out.println("--- MENU ---");
        System.out.println("1 - Registrar Usuario");
        System.out.println("2 - Registrar Libros");
        System.out.println("3 - Prestamos Libros");
        System.out.println("4 - Devolver libro");
        System.out.println("5 - Mostrar todos los libros");
        System.out.println("6 - Salir menu");
        
        int opcion = lector.nextByte();
        lector.nextLine();
        
        boolean encontrado;
        boolean buscarExistencia;
        
        while (opcion!=6){
            switch (opcion){
                case 1:
                    String decision;
                    do{
                        Persona nuevosDatos = new Persona();
                        
                        System.out.println("Datos del Usuario");
                        System.out.println("Ingrese su nombre");
                        String nombre = lector.next();
                        nuevosDatos.setNombre(nombre);
                
                        System.out.println("Ingrese su cedula");
                        String cedula = lector.next();
                        nuevosDatos.setCedula(cedula);
                      
                        System.out.println("Ingrese su edad");
                        int edad = lector.nextInt();
                        nuevosDatos.setEdad(edad);
         
                        System.out.println("Ingrese su apellido");
                        String apellido = lector.next();
                        nuevosDatos.setApellido(apellido);
                        
                        Usuario nuevoUsuario = new Usuario();
                        
                        nuevoUsuario.setDatosUsuario(nuevosDatos);
                        
                        System.out.println("Creacion usuario");
                        System.out.println("Ingrese su correo");
                        String correo = lector.next();
                        nuevoUsuario.setCorreo(correo);
                        
                        System.out.println("Cree una contraseña");
                        String contrasenia = lector.next();
                        nuevoUsuario.setContrasenia(contrasenia);
                        
                        nuevoUsuario.setEstadoMembresia(true);
                        
                        listaUsuarios.add(nuevoUsuario);
                        
                        System.out.println("Desea crear otro usuario? (S/N)");
                        decision = lector.next();
                    } while (decision.equalsIgnoreCase("S"));
                    break;
                case 2:
                    decision = "";
                    do{
                        Libro nuevoLibro = new Libro();
                        Autor nuevoAutor = new Autor();
                        System.out.println("--- Datos ---");
                        System.out.println("Ingreso de datos del autor");
                        System.out.println("Nombre");
                        String nombre = lector.next();
                        nuevoAutor.setNombre(nombre);
                        
                        System.out.println("Apellido");
                        String apellido = lector.next();
                        nuevoAutor.setApellido(apellido);
                        
                        System.out.println("seudonimo del autor");
                        String apodo = lector.next();
                        nuevoAutor.setSeudonimo(apodo);
                        
                        lector.nextLine();
                        
                        System.out.println("Ingreso de datos del libro");
                        System.out.println("Titulo del Libro");
                        String titulo = lector.nextLine();
                        nuevoLibro.setTitulo(titulo);
                        
                        System.out.println("Id del libro");
                        int id = lector.nextInt();
                        nuevoLibro.setId(id);
                        
                        lector.nextLine();
                        
                        System.out.println("Desea registrar otro libro? (S/N)");
                        decision = lector.next();
                        
                        Libreria nuevo = new Libreria();
                        nuevo.setNuevoLibro(nuevoLibro);
                        nuevo.setAutorLibro(nuevoAutor);
                        nuevo.setEstado(true);
                        
                        listaLibros.add(nuevo);
                        
                    }while(decision.equalsIgnoreCase("S"));
                    break;
                case 3:
                    encontrado = false;
                    buscarExistencia = false;
                    System.out.println("Ingrese su correo y contraseña");
                    System.out.print("Correo: ");
                    String intentoCorreo = lector.next();
                    System.out.print("Contraseña: ");
                    String intentoContrasenia = lector.next();
                    
                    lector.nextLine();
             
                    for (Usuario solicitante : listaUsuarios){
                        if (intentoCorreo.equals(solicitante.getCorreo()) && intentoContrasenia.equals(solicitante.getContrasenia())){
                            encontrado = true;
                            System.out.println("HOLA!!" + solicitante.getDatosUsuario().getNombre());
                            System.out.println("Que libro desea solicitar");
                            String libroSolicitado = lector.nextLine();
                            for(Libreria buscarLibro: listaLibros){
                                if(libroSolicitado.equals(buscarLibro.getNuevoLibro().getTitulo())){
                                    System.out.println(buscarLibro.prestamoLibro(solicitante, buscarLibro));
                                    buscarExistencia = true;
                                    break;
                                }
                            }
                             if (!buscarExistencia){
                                System.out.println("No disponemos de ese libro por el momento ");
                            } 
                            break;
                        }
                    }
                    if(!encontrado){
                            System.out.println("Correo o contraseña INCORRECTOS");
                        }
                    break;
                    
                case 4:
                    encontrado = false;
                    buscarExistencia = false;
                    System.out.println("Ingrese su correo y contraseña");
                    System.out.print("Correo: ");
                    intentoCorreo = lector.next();
                    System.out.print("Contraseña: ");
                    intentoContrasenia = lector.next();  
                    
                    lector.nextLine();
                    
                    for (Usuario solicitante : listaUsuarios){
                        if(intentoCorreo.equals(solicitante.getCorreo()) && intentoContrasenia.equals(solicitante.getContrasenia())){
                            encontrado = true;
                            System.out.println("HOLA!!" + solicitante.getDatosUsuario().getNombre());
                            System.out.println("Que libro va a devolver");
                            String libroSolicitado = lector.nextLine();
                            for(Libreria buscarLibro: listaLibros){
                                if(libroSolicitado.equals(buscarLibro.getNuevoLibro().getTitulo())){
                                    System.out.println(buscarLibro.devolucionLibro(solicitante, buscarLibro));
                                    buscarExistencia = true;
                                    break;
                                }
                            }
                            if(!buscarExistencia){
                                System.out.println("El libro que desea devolver no se encuentra registrado");
                            }
                            
                        }
                    }
                    if(!encontrado){
                            System.out.println("Correo o contraseña INCORRECTOS");
                        }
                    break;
                case 5:
                    for (Libreria mostrarLibros : listaLibros){
                        System.out.println(mostrarLibros);
                    }
                    break;
                default:
                    System.out.println("Ninguna Opcion Seleccionada");
            }
            System.out.println("--- MENU ---");
            System.out.println("1 - Registrar Usuario");
            System.out.println("2 - Registrar Libros");
            System.out.println("3 - Prestamos Libros");
            System.out.println("4 - Devolver libro");
            System.out.println("5 - Mostrar todos los libros");
            System.out.println("6 - Salir menu");

            opcion = lector.nextByte();
            lector.nextLine();
        }
        System.out.println("Fin del proceso");
        lector.close();
    }
}
