

public class VehiculoControl
{
    private String marca;
    private String modelo;
    private int anoFabricacion;
    private int stockActual;
    private int precioLista;
    private int precioVenta;
    private int codigoVendedor;

    /**
     * Constructor 
     */
    public VehiculoControl(String marca,String modelo,int anoFabricacion,int stockActual,int precioLista,int precioVenta,int codigoVendedor)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.anoFabricacion=anoFabricacion;
        this.stockActual=stockActual;
        this.precioLista=precioLista;
        this.precioVenta=precioVenta;
        this.codigoVendedor=codigoVendedor;
    }
    //accesadores
    public String getMarca()
    {
      return this.marca;
    }
    public String getModelo()
    {
        return this.modelo;
    }
    public int getAnoFabricacion()
    {
        return this.anoFabricacion;
    }
    public int getStockActual()
    {
        return this.stockActual;
    }
    public int getPrecioLista ()
    {
        return this.precioLista;
    }
    public int getPrecioVenta ()
    {
        return this.precioVenta;
    }
    public int getCodigoVendedor()
    {
       return this.codigoVendedor;
    }
    //mutadores
    public void setMarca(String marca)
    {
        this.marca=marca;
    }
    public void setModelo(String mod)
    {
        this.modelo=modelo;
    }
    public void setAnoFabricacion(int anoFabricacion)
    {
        this.anoFabricacion=anoFabricacion;
    }
    public void setStockActual(int stockActual)
    {
        this.stockActual=stockActual;
    }
    public void setPrecioLista(int precioLista)
    {
        this.precioLista=precioLista;
    }
    public void setPrecioVenta(int precioventa)
    {
        this.precioVenta=precioventa;
    }
    public void setCodigoVendedor(int codigoVendedor)
    {
        this.codigoVendedor=codigoVendedor;
    }
    //metodos 
    public String imprimeResumen()
    {
        String datos="\t\t***********DATOS DEL AUTO **********\n";
        datos+="Marca                  :   "+this.marca+"\n";
        datos+="modelo                 :   "+this.modelo+"\n";
        datos+="Año de fabricacion     :   "+this.anoFabricacion+"\n";
        datos+="Stock actual           :   "+this.stockActual+"\n";
        datos+="Precio de lista        :   "+this.precioLista+"\n";
        datos+="Precio de venta        :   "+this.precioVenta+"\n";
        datos+="codigo de vendedor     :   "+this.codigoVendedor+"\n";
        return datos;
    }
    
    
    
}
