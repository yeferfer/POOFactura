public class TipoProducto {
    //ATRIBUTOS
    private int IDProducto;

    private String ClasificacionProducto;
    //METODOS
    public String RegistrarProducto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String ModificarProducto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String ConsultarProducto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void EliminarProducto() {
    }

    public void InhabilitarProducto() {
    }
    //GETTERS

    public int getIDProducto() {
        return IDProducto;
    }

    public String getClasificacionProducto() {
        return ClasificacionProducto;
    }
    //SETTERS

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public void setClasificacionProducto(String ClasificacionProducto) {
        this.ClasificacionProducto = ClasificacionProducto;
    }
    //CONSTRUCTORES
    
    public TipoProducto(){
    
    }

    public TipoProducto(int IDProducto, String ClasificacionProducto) {
        this.IDProducto = IDProducto;
        this.ClasificacionProducto = ClasificacionProducto;
    }
    
    
}
