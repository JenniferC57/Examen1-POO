package Inventario;

public class TelefonoMovil extends ArticuloElectronico implements Informacion{

    private int numeroTelefono;
    private String companiaTelefonica;

    public TelefonoMovil() {

    }

    public TelefonoMovil(String nombre, String modelo, String descripcion, float precio, int numeroTelefono, String companiaTelefonica) {
        super(nombre, modelo, descripcion, precio);
        this.numeroTelefono = numeroTelefono;
        this.companiaTelefonica = companiaTelefonica;
    }

    @Override
    public void descripcion() {

    }

    @Override
    public float precio() {
        return 0;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCompaniaTelefonica() {
        return companiaTelefonica;
    }

    public void setCompaniaTelefonica(String companiaTelefonica) {
        this.companiaTelefonica = companiaTelefonica;
    }
}
