
package Modelo;
//creacion de atributos
public class Producto {
    int IdPro;
    String nom;
    Double precio;
    int stock;
    String estado;
    
    public Producto(){
    
}

    public Producto(int IdPro, String nom, Double precio, int stock, String estado) {
        this.IdPro = IdPro;
        this.nom = nom;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public int getIdPro() {
        return IdPro;
    }

    public void setIdPro(int IdPro) {
        this.IdPro = IdPro;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
        
    }