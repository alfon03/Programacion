package Producto;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precioSinIVA;
    private static double IVA = 0.20;
    
    public Producto(String descripcion, double precioSinIVA) {
        this.codigo = generarCodigo();
        this.descripcion = descripcion;
        this.precioSinIVA = precioSinIVA;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public double getPrecioSinIVA() {
        return precioSinIVA;
    }
    
    public void setPrecioSinIVA(double precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }
    
    public double getPrecioConIVA() {
        return precioSinIVA + (precioSinIVA * IVA);
    }
    
    private int generarCodigo() {
        // Aquí se implementaría la lógica para generar el código de manera automática
        // En este ejemplo, se utiliza un número aleatorio entre 1 y 1000
        return (int) (Math.random() * 1000) + 1;
    }
}
