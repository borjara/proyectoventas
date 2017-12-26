
package sistemadeventas;

public class Producto {
    private String codigo;
    private String descripcion;
    private int stockMin;
    private int stockActual;
    private int precio;

    public Producto(String codigo, String descripcion, int precio, int stockActual, int stockMin) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stockMin = stockMin;
        this.stockActual = stockActual;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
