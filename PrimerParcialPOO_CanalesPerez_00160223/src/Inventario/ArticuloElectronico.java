package Inventario;

public abstract class ArticuloElectronico {
    protected String nombre;
    protected String modelo;
    protected String descripcion;
    protected float precio;

    public void agregarArticulo(){

    }

    public void modificarArticulo(){

    }

    protected ArticuloElectronico() {
    }

    protected ArticuloElectronico(String nombre, String modelo, String descripcion, float precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
