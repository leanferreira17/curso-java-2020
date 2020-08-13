package modulo.cuatro.ejercicios;

public class Banco {
    public boolean otorgarPrestamo(Cliente cliente) {
        if (comprobarCliente(cliente)) {
            // completar: devolver true si se otorga el prestamo y false en el caso contrario
            if ((
                    cliente.getEdad() >= 18
                            && cliente.getEdad() <= 65)
                    && cliente.isCasado() == true
                    && cliente.isArgentino() == true
                    && cliente.getSueldo() > 10000
                    && !(cliente.isDebeAlBanco())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    private boolean comprobarCliente(Cliente cliente) {
        if ((cliente.getEdad() == 0) || (cliente.getSueldo() == 0.0)) {
            return false;
        } else {
            return true;
        }
    }
}
