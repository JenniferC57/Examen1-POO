package Inventario;

public class Laptop extends ArticuloElectronico implements Informacion{

    private int RAM;
    private String operador;

    public Laptop() {

    }

    public Laptop(String nombre, String marca, String descripcion, float precio, int RAM, String operador) {
        super(nombre, marca, descripcion, precio);
        this.RAM = RAM;
        this.operador = operador;
    }

    @Override
    public void descripcion() {

    }

    @Override
    public float precio() {
        return 0;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
}
