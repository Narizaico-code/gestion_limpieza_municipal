package org.rsosa.gestion_reportes.dominio.exception;

public class ReporteNoExisteException extends RuntimeException {
  public ReporteNoExisteException(String message) {
    super(message);
  }
}
