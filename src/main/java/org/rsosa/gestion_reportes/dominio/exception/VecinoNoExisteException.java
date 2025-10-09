package org.rsosa.gestion_reportes.dominio.exception;

public class VecinoNoExisteException extends RuntimeException{
    public VecinoNoExisteException(Long id){
        super("Vecino con id " + id + " no existe");
    }
//    public VecinoNoExisteException(String input){
//        String mensaje = "";
//        if (input.contains("@") && input.contains(".")) {
//            mensaje = "Vecino con email " + input + " no existe";
//        } else {
//            mensaje = "Vecino con nombre " + input + " no existe";
//        }
//        super(mensaje);
//    }
}