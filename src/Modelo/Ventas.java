 
package Modelo;

public class Ventas {
     int id;
     int IdCliente;
     int IdEmpleado;
     String serie;
     String Fecha;
     double monto;
     String estado;
     
    public Ventas(){
        
    }

    public Ventas(int id, int IdCliente, int IdEmpleado, String serie, String Fecha, double monto) {
        this.id = id;
        this.IdCliente = IdCliente;
        this.IdEmpleado = IdEmpleado;
        this.serie = serie;
        this.Fecha = Fecha;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
