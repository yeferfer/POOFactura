public class Producto {
    //ATRIBUTOS
    private int IDProducto;

    private int IdTipoProducto;

    private String NombreProducto;

    private String DescripcionProducto;

    private int PrecioCompra;

    private int PrecioVenta;

    private double IVAxProducto;
    // METODOS
    public String RegistrarTipoProducto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void EliminarTipoProducto() {
    }

    public void InhabilitarTipoProducto() {
    }
    // GETTERS

    public int getIDProducto() {
        return IDProducto;
    }

    public int getIdTipoProducto() {
        return IdTipoProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public int getPrecioCompra() {
        return PrecioCompra;
    }

    public int getPrecioVenta() {
        return PrecioVenta;
    }

    public double getIVAxProducto() {
        return IVAxProducto;
    }
    //SETTERS

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public void setIdTipoProducto(int IdTipoProducto) {
        this.IdTipoProducto = IdTipoProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public void setPrecioCompra(int PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public void setPrecioVenta(int PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public void setIVAxProducto(double IVAxProducto) {
        this.IVAxProducto = IVAxProducto;
    }
    //CONSTRUCTORES
    public Producto(){
    
    }

    public Producto(int IDProducto, int IdTipoProducto, String NombreProducto, String DescripcionProducto, int PrecioCompra, int PrecioVenta, double IVAxProducto) {
        this.IDProducto = IDProducto;
        this.IdTipoProducto = IdTipoProducto;
        this.NombreProducto = NombreProducto;
        this.DescripcionProducto = DescripcionProducto;
        this.PrecioCompra = PrecioCompra;
        this.PrecioVenta = PrecioVenta;
        this.IVAxProducto = IVAxProducto;
    }
    
}
