public class Empleado {

    String nombre;
    String apellido;
    int sueldo;
    int contacto;
    int fechaDeContratacion;

    //constructor

    public Empleado() {
    }


    //metodos get/set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public int getFechaDeContratacion() {
        return fechaDeContratacion;
    }

    public void setFechaDeContratacion(int fechaDeContratacion) {
        this.fechaDeContratacion = fechaDeContratacion;
    }

}

