
package sistemadeventas;

import java.util.ArrayList;


public class Ventas {
    ArrayList<ProductoVenta> lv= new ArrayList<>();
    int total;
    String fecha;
    int efectivo;
    String usuario;

    public Ventas() {
        
    }
    public boolean validarProducto(String codigo) {
        for (int i = 0; i < lv.size(); i++) {
            if ( lv.get(i).getCodigo().equals(codigo)){
                return true;
            }
        }
        return false;
    }
    
    public ProductoVenta buscarProducto(String codigo) {
        for (int i = 0; i < lv.size(); i++) {
            if ( lv.get(i).getCodigo().equals(codigo)){
                return lv.get(i);
            }
        }
        ProductoVenta productoNoExiste = new ProductoVenta();
        return productoNoExiste;
    } 
    
    public int posicion(String codigo) {
        for (int i = 0; i < lv.size(); i++) {
            if ( lv.get(i).getCodigo().equals(codigo)){
                return i;
            }
        }
        ProductoVenta productoNoExiste = new ProductoVenta();
        return 0;
    } 
    
    
    public ArrayList<ProductoVenta> getLv() {
        return lv;
    }

    public void setLv(ArrayList<ProductoVenta> lv) {
        this.lv = lv;
    }

   

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    

}
