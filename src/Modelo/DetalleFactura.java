public class DetalleFactura {
// ATRIBUTOS
    private int IDProducto;

    private int UnidadesProducto;

    private int ValorUnitario;

    private double IvaAPagar;

    private int subTotal;
//METODOS
    public String ListarDetalleFactura() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void EliminarDetalleFactura() {
    }
// GETTERS

    public int getIDProducto() {
        return IDProducto;
    }

    public int getUnidadesProducto() {
        return UnidadesProducto;
    }

    public int getValorUnitario() {
        return ValorUnitario;
    }

    public double getIvaAPagar() {
        return IvaAPagar;
    }

    public int getSubTotal() {
        return subTotal;
    }
  //SETTERS

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public void setUnidadesProducto(int UnidadesProducto) {
        this.UnidadesProducto = UnidadesProducto;
    }

    public void setValorUnitario(int ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    public void setIvaAPagar(double IvaAPagar) {
        this.IvaAPagar = IvaAPagar;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }
  //CONSTRUCTORES
    public DetalleFactura(){
    
    }

    public DetalleFactura(int IDProducto, int UnidadesProducto, int ValorUnitario, double IvaAPagar, int subTotal) {
        this.IDProducto = IDProducto;
        this.UnidadesProducto = UnidadesProducto;
        this.ValorUnitario = ValorUnitario;
        this.IvaAPagar = IvaAPagar;
        this.subTotal = subTotal;
    }
    
}
