
package sistemadeventas;
import java.util.ArrayList;

public class ListaProductos {
    
    private static ArrayList<Producto> lp = new ArrayList<>();

    public ListaProductos() { 
        
    }
    
    public ListaProductos(ArrayList<Producto> lp) {
        ListaProductos.lp = lp;
    }

    public ArrayList<Producto> getLp() {
        return lp;
    }

    public void setLp(ArrayList<Producto> lp) {
        ListaProductos.lp = lp;
    }
    
    public void NuevoProducto(String codigo, String descripcion, int precio, int stock, int stockMin){
        Producto pr = new Producto(codigo,descripcion,precio,stock,stockMin);
        lp.add(pr);
    }
    
    public void agregarProducto(Producto pr){
      lp.add(pr);
    }
    
    public Producto buscarProducto(String codigo) {
        for (int i = 0; i < lp.size(); i++) {
            if ( lp.get(i).getCodigo().equals(codigo)){
                return lp.get(i);
            }
        }
        Producto productoNoExiste = new Producto("","",0,0,0);
        return productoNoExiste;
    } 
}
