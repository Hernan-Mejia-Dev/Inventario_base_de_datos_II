
package Modelo;

public class Producto {
    Producto sig;//puntero siguiente
    private String Codigo;//Identificador con el que realizaremos las operaciones
    private String NombreProducto;
    private int ValorUnitario; //precio
    private int Stock;//cantidad
    private int total;//cantidad*precio
    
    
    //Setters y getters
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public int getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(int ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    public int getTotal() {
        return ValorUnitario*Stock;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "" + Codigo + "" + NombreProducto + "" + ValorUnitario + "" + Stock + "" + total;
    }
}
