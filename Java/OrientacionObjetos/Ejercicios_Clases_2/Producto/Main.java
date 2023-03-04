package Producto;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Televisor", 500.0);
        Producto producto2 = new Producto("Lavadora", 300.0);
        Producto producto3 = new Producto("Nevera", 700.0);
        
        System.out.println("Producto 1:");
        System.out.println("Código: " + producto1.getCodigo());
        System.out.println("Descripción: " + producto1.getDescripcion());
        System.out.println("Precio sin IVA: " + producto1.getPrecioSinIVA());
        System.out.println("Precio con IVA: " + producto1.getPrecioConIVA());
        
        System.out.println("Producto 2:");
        System.out.println("Código: " + producto2.getCodigo());
        System.out.println("Descripción: " + producto2.getDescripcion());
        System.out.println("Precio sin IVA: " + producto2.getPrecioSinIVA());
        System.out.println("Precio con IVA: " + producto2.getPrecioConIVA());
        
        System.out.println("Producto 3:");
        System.out.println("Código: " + producto3.getCodigo());
        System.out.println("Descripción: " + producto3.getDescripcion());
        System.out.println("Precio sin IVA: " + producto3.getPrecioSinIVA());
        System.out.println("Precio con IVA: " + producto3.getPrecioConIVA());
    }
}
