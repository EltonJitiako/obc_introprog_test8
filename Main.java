public class Main {
    
    public static void main (String[] args){
        
        Persona persona1 = new Persona();

        persona1.setNombre("John");
        persona1.setEdad(23);
        persona1.setTelefono(123123123);

        System.out.println("Nombre" + persona1.getNombre());
        System.out.println("Edad:" + persona1.getEdad());
        System.out.println("Telefono:" + persona1.getTelefono());
    
    }

}

class Persona {
    private String Nombre;
    private int Edad;
    private int Telefono;

    public void setNombre (String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre () {
        return this.Nombre;
    }

    public void setEdad (int Edad) {
        this.Edad = Edad;
    }

    public int getEdad () {
        return this.Edad;
    }

    public void setTelefono (int Telefono) {
        this.Telefono = Telefono;
    }

    public int getTelefono () {
        return this.Telefono;
    }
}
