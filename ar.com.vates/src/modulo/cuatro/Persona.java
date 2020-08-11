package modulo.cuatro;

public class Persona {
    private String nombre;
    private char sexo;
    private int edad;
    private boolean pasoElExamenDeVista;
    private boolean nacioEnArgentina;
    private boolean pasoElExamenTeorico;

    public Persona(String nombre, char sexo, int edad, boolean pasoElExamenDeVista, boolean nacioEnArgentina, boolean pasoElExamenTeorico) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.pasoElExamenDeVista = pasoElExamenDeVista;
        this.nacioEnArgentina = nacioEnArgentina;
        this.pasoElExamenTeorico = pasoElExamenTeorico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isPasoElExamenDeVista() {
        return pasoElExamenDeVista;
    }

    public void setPasoElExamenDeVista(boolean pasoElExamenDeVista) {
        this.pasoElExamenDeVista = pasoElExamenDeVista;
    }

    public boolean isNacioEnArgentina() {
        return nacioEnArgentina;
    }

    public void setNacioEnArgentina(boolean nacioEnArgentina) {
        this.nacioEnArgentina = nacioEnArgentina;
    }

    public boolean isPasoElExamenTeorico() {
        return pasoElExamenTeorico;
    }

    public void setPasoElExamenTeorico(boolean pasoElExamenTeorico) {
        this.pasoElExamenTeorico = pasoElExamenTeorico;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", edad=" + edad +
                ", pasoElExamenDeVista=" + pasoElExamenDeVista +
                ", nacioEnArgentina=" + nacioEnArgentina +
                ", pasoElExamenTeorico=" + pasoElExamenTeorico +
                '}';
    }
}
