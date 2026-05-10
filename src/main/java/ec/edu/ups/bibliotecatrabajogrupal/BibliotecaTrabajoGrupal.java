/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.bibliotecatrabajogrupal;
import ec.edu.ups.bibliotecatrabajogrupal.Objeto.Autor;
import ec.edu.ups.bibliotecatrabajogrupal.Objeto.Usuario;
import ec.edu.ups.bibliotecatrabajogrupal.Objeto.Libro;
import ec.edu.ups.bibliotecatrabajogrupal.Objeto.Prestamo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class BibliotecaTrabajoGrupal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Autor> listaAutores = new ArrayList();
        ArrayList<Usuario> listaUsuarios = new ArrayList();
        ArrayList<Libro> listaLibros = new ArrayList();
        ArrayList<Prestamo> listaPrestamos = new ArrayList();
        
        System.out.println("--- MENU ---");
        System.out.println("1 - Registrar Usuario");
        System.out.println("2 - Registrar Libros");
        System.out.println("3 - Registrar Autor");
        System.out.println("4 - Prestamos Libros");
        System.out.println("5 - Devolver libro");
        System.out.println("6 - Mostrar todos los libros");
        System.out.println("7 - Buscar libro");
        System.out.println("8 - Lista de libros por autor");
        System.out.println("9 - Mostrar todos los prestamos realizados");
        System.out.println("10 - Salir menu");
        int opcion = lector.nextByte();
        lector.nextLine();
        
        boolean encontrado;
        boolean buscarExistencia;
        String decision;
       
        
        while (opcion!=10){
            switch (opcion){
                case 1:
                    boolean continuaRes;
                    do{
                        Usuario nuevoUsuario = new Usuario();
                        continuaRes = false;
                        System.out.println("Datos del Usuario");
                        System.out.println("Ingrese su nombre completo: ");
                        String nombreCompletos = lector.nextLine();
                        nuevoUsuario.setNombreCompleto(nombreCompletos);
                   
                
                        System.out.println("Ingrese su cedula: ");
                        String cedula = lector.next();
                        nuevoUsuario.setCedula(cedula);
                      
                        System.out.println("Ingrese su fecha de nacimiento (DD MM AAAA)");
                        int dia = lector.nextInt();
                        int mes = lector.nextInt();
                        int anio = lector.nextInt();
                        Date fechaNac = new Date(anio-1900,mes-1,dia);
                        nuevoUsuario.setFechaNac(fechaNac);
                        
                        boolean restricion = nuevoUsuario.esMayorDeEdad(fechaNac);
                        if (!restricion){
                              System.out.println("Su cuenta tendra resctricciones de edad desea continuar? (S/N)");
                              String respuesta = lector.next();
                              if(respuesta.equalsIgnoreCase("N")){
                                  continuaRes = true;
                              }
                        }
                        
                        if(!continuaRes){
                            
                            nuevoUsuario.restriccionesUsuario(restricion,nuevoUsuario);

                            System.out.println("Creacion usuario");
                            System.out.println("Ingrese su correo: ");
                            String correo = lector.next();
                            nuevoUsuario.setCorreo(correo);

                            System.out.println("Cree una contrasenia: ");
                            String contrasenia = lector.next();
                            nuevoUsuario.setContrasenia(contrasenia);
                            
                            System.out.println("Tipo de Cliente (vip/comun): ");
                            
                            String tipoMembresia = lector.next();
                            
                            
                            Random random = new Random();
                            int generadorCodigo = random.nextInt(10000)+1000;
                            
                            String castingGnr = generadorCodigo + "";
                            
                            nuevoUsuario.agregarMembresia(tipoMembresia,true,castingGnr);

                            listaUsuarios.add(nuevoUsuario);
                        }
                        
                        System.out.println("Desea crear otro usuario? (S/N)");
                        decision = lector.next();
                        lector.nextLine();
                    } while (decision.equalsIgnoreCase("S"));
                    break;
                case 2:
                    do{
                        boolean registroEx = false;
                        System.out.println("===Registro Libros===");
                        System.out.println("Ingrese el titulo del libro: ");
                        String titulosLbr = lector.nextLine();
 
                        System.out.println("Ingrese el codigo del ISBN: ");
                        int isbnLbr = lector.nextInt();
                        lector.nextLine();
                        System.out.println("Ingrese el genero del libro: ");
                        String generoLbr = lector.nextLine();
                        System.out.println("Ingrese la fecha de publicacion: (DD MM AAAA)");
                        byte dia = lector.nextByte();
                        byte mes = lector.nextByte();
                        int anio= lector.nextInt();
                        Date fechaPub = new Date(anio-1900,mes -1,dia);
                        System.out.println("Ingrese el idioma del libro: ");
                        String idiomaLbr = lector.next();
                        boolean estado = true;
                        System.out.println("El libro tiene restricciones de edad? (S/N)");
                        String definirRestriccion = lector.next().toUpperCase().trim();
                        lector.nextLine();
                       
                        while (!definirRestriccion.equals("S") && !definirRestriccion.equals("N")){
                            System.out.println("Solo se admite (S/N)");
                            definirRestriccion = lector.next().toUpperCase().trim();
                            lector.nextLine();
                        }
                        
                        
                        boolean colocarRestriccion = definirRestriccion.equals("S");
                        System.out.println("Ingrese el autor del libro: ");
                        String autorLbr = lector.nextLine().trim();
                        if (listaAutores.isEmpty()){
                            System.out.println("Lista de Autores esta vacia....");
                            break;
                        }
                        
                        for(Autor autores : listaAutores){
                            if(autorLbr.equalsIgnoreCase(autores.getNombreCompleto().trim())){
                                System.out.println("El autor si esta registrado :)");
                                Libro nuevoLibro = new Libro(titulosLbr,isbnLbr,generoLbr,fechaPub,autores,idiomaLbr,estado,colocarRestriccion);
                                listaLibros.add(nuevoLibro);
                                autores.agregarLibro(nuevoLibro);
                                registroEx = true;
                                break;
                            }
                             
                        }
    
                        if(registroEx){
                            System.out.println("El libro se pudo registrar correctamente...");
                        }else{
                            System.out.println("El libro no se pudo registrar correctamente...");
                        }
                        System.out.println("Desea crear otro libro? (S/N)");
                        decision = lector.next();
                        lector.nextLine();
                    }while(decision.equalsIgnoreCase("S"));
                    break;
                case 3 :
                    do{
                        System.out.println("Ingrese el nombre completo: ");
                        String nomAtr = lector.nextLine();
                        
                        System.out.println("Ingrese la cedula: ");
                        String cedAtr = lector.next();
                        System.out.println("Ingrese la fecha de nacimiento: DD MM AAAA");
                        byte dia = lector.nextByte();
                        byte mes = lector.nextByte();
                        int anio= lector.nextInt();
                        Date fechaNacAtr = new Date(anio-1900,mes -1,dia);
                        lector.nextLine();
                        System.out.println("Ingrese el seudonimo: ");
                        String seudAtr = lector.nextLine();
                        System.out.println("Ingrese la nacionalidad:  ");
                        String nacAtr= lector.nextLine();
                        System.out.println("Ingrese el genero del Autor: ");
                        String genAtr = lector.nextLine();
                        Autor nuevoAutor = new Autor(nomAtr,cedAtr,fechaNacAtr,seudAtr,nacAtr,genAtr);
                        listaAutores.add(nuevoAutor);
                        System.out.println("Desea crear otro autor? (S/N)");
                        decision = lector.next();
                        lector.nextLine();
                        
                    }while(decision.equalsIgnoreCase("S"));
                    break;
                case 4:
                    encontrado = false;
                    buscarExistencia = false;
                     if(listaUsuarios.isEmpty()){
                          System.out.println("No existen personas registradas...");
                          break;
                      }else{
                        System.out.println("Ingrese su correo y contrasenia");
                        System.out.print("Correo: ");
                        String intentoCorreo = lector.next();
                        System.out.print("Contrasenia: ");
                        String intentoContrasenia = lector.next();

                        lector.nextLine();

                        for (Usuario solicitante : listaUsuarios){
                            if (intentoCorreo.equals(solicitante.getCorreo()) && intentoContrasenia.equals(solicitante.getContrasenia())) {
                                encontrado = true;
                                System.out.println("HOLA!!" + solicitante.getNombreCompleto());
                                if (listaLibros.isEmpty()) {
                                    System.out.println("No existen libros registrados...");
                                    break;
                                } else {
                                    System.out.println("Que libro desea solicitar");
                                    String libroSolicitado = lector.nextLine();
                                    for (Libro buscarLibro : listaLibros) {
                                        if (libroSolicitado.equals(buscarLibro.getTitulo())) {
                                            if(buscarLibro.getRestriccionesLibro() && solicitante.getRestricionesUsuario()){
                                                System.out.println("El libro no le puede ser entregado a " + solicitante.getNombreCompleto() + " por tener restriciones de edad");
                                                break;
                                            }else{
                                                Prestamo prestamo = new Prestamo();
                                                System.out.println(prestamo.prestamoLibro(solicitante, buscarLibro));
                                                Date obtenerFechaActual = new Date();
                                                int dia = obtenerFechaActual.getDay();
                                                int mes = obtenerFechaActual.getMonth();
                                                int anio = obtenerFechaActual.getYear();

                                                Date inicioPrestamo = new Date();
                                                inicioPrestamo = new Date(anio - 1900, mes - 1, dia);
                                                prestamo.setInicioPrestamo(inicioPrestamo);

                                                Date finPrestamo = new Date();
                                                finPrestamo = new Date(anio - 1900, mes - 1, dia + 7);
                                                prestamo.setFinPrestamo(finPrestamo);

                                                prestamo.setLibroPrestado(buscarLibro);
                                                prestamo.setUsuarioPrestado(solicitante);

                                                listaPrestamos.add(prestamo);

                                                buscarExistencia = true;
                                                break;
                                            }

                                        }
                                    }
                                    if (!buscarExistencia) {
                                        System.out.println("No disponemos de ese libro por el momento ");
                                    }
                                    break;
                                }

                            }
                        }
                    }
                    if(!encontrado){
                            System.out.println("Correo o contrasenia INCORRECTA");
                        }
                    break;
                    
                case 5:
                    encontrado = false;
                    buscarExistencia = false;
                    System.out.println("Ingrese su correo y contrasenia");
                    System.out.print("Correo: ");
                    String intentoCorreo = lector.next();
                    System.out.print("Contrasenia: ");
                    String intentoContrasenia = lector.next();  
                    
                    lector.nextLine();
                   
                    
                    for (Usuario solicitante : listaUsuarios){
                        if(intentoCorreo.equals(solicitante.getCorreo()) && intentoContrasenia.equals(solicitante.getContrasenia())){
                            encontrado = true;
                            System.out.println("HOLA!!" + solicitante.getNombreCompleto());
                            System.out.println("Que libro va a devolver");
                            String libroSolicitado = lector.nextLine();
                            for(Libro buscarLibro: listaLibros){
                                if(libroSolicitado.equals(buscarLibro.getTitulo())){
                                    Prestamo devolucion = new Prestamo();
                                    System.out.println(devolucion.devolucionLibro(solicitante, buscarLibro));
                                    for (int i = 0;i<listaPrestamos.size();i++){
                                        Prestamo prestamoActual = listaPrestamos.get(i);
                                        if(prestamoActual.getLibroPrestado().equals(buscarLibro)){
                                            listaPrestamos.remove(i);
                                            break;
                                        }
                                    }
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
                            System.out.println("Correo o contrasenia INCORRECTA");
                        }
                    break;
                case 6:
                    if (listaLibros.isEmpty()){
                        System.out.println("No existen libros registrados");
                    }else{
                        for (Libro mostrarLibros : listaLibros){
                        System.out.println(mostrarLibros.toString());
                        }
                    }
                    break;
                case 7: 
                    boolean libroBusca = false;
                    if (listaLibros.isEmpty()){
                        System.out.println("No existen libros registrados");
                    }else{
                       System.out.println("De que libro desea conocer sus datos?");
                       String buscarLibro = lector.nextLine();
                       for(Libro libros:listaLibros){
                           if(buscarLibro.equals(libros.getTitulo())){
                               System.out.println(libros.toString());
                               libroBusca=true;
                           }
                       }
                       if(!libroBusca){
                           System.out.println("No disponemos del libro que usted busca");
                       }
                    }
                    break;
                case 8:
                    boolean autorBusca = false;
                    if(listaAutores.isEmpty()){
                        System.out.println("No existen autores registrados");
                    }else{
                        System.out.println("De que autor desea ver sus libros?");
                        String listalibAutores = lector.nextLine();
                        for(Autor libautores :listaAutores){
                            if(listalibAutores.equals(libautores.getNombreCompleto())){
                                System.out.println(libautores.toString());
                                autorBusca = true;
                            }
                        }
                        if(!autorBusca){
                            System.out.println("No existe un autor registrado con ese nombre");
                        }
                    }
                    break;
                case 9:
                    if(listaPrestamos.isEmpty()){
                        System.out.println("No hay ningun prestamo realizado");
                    }else{
                        for (Prestamo prestamoHechos: listaPrestamos){
                            System.out.println(prestamoHechos.toString());
                        }
                    }
                
                    break;
                default:
                    System.out.println("Ninguna Opcion Seleccionada");
                    break;
            }
            System.out.println("--- MENU ---");
            System.out.println("1 - Registrar Usuario");
            System.out.println("2 - Registrar Libros");
            System.out.println("3 - Registrar Autor");
            System.out.println("4 - Prestamos Libros");
            System.out.println("5 - Devolver libro");
            System.out.println("6 - Mostrar todos los libros");
            System.out.println("7 - Buscar libro");
            System.out.println("8 - Lista de libros por autor");
            System.out.println("9 - Mostrar todos los prestamos realizados");
            System.out.println("10 - Salir menu");

            opcion = lector.nextByte();
            lector.nextLine();
        }
        System.out.println("Fin del procedimiento");
        lector.close();
    }
}
