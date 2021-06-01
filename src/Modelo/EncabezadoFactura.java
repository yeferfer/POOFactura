
public class EncabezadoFactura {

    //ATRIBUTOS
    private int IdFactura;

    private int NIT;

    private String RazonSocial;

    private String Direccion_tienda;

    private int Telefono_tienda;

    private String fecha;

    private String hora;

    private int NroIdPersona;

    private int TipoPago;

    private Object totalPagar;

    //MEODOS
    public String ListarFactura() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void EliminarFactura() {
    }
    //GETTERS

    public int getIdFactura() {
        return IdFactura;
    }

    public int getNIT() {
        return NIT;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public String getDireccion_tienda() {
        return Direccion_tienda;
    }

    public int getTelefono_tienda() {
        return Telefono_tienda;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getNroIdPersona() {
        return NroIdPersona;
    }

    public int getTipoPago() {
        return TipoPago;
    }

    public Object getTotalPagar() {
        return totalPagar;
    }
    //SETTERS

    public void setIdFactura(int IdFactura) {
        this.IdFactura = IdFactura;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public void setDireccion_tienda(String Direccion_tienda) {
        this.Direccion_tienda = Direccion_tienda;
    }

    public void setTelefono_tienda(int Telefono_tienda) {
        this.Telefono_tienda = Telefono_tienda;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setNroIdPersona(int NroIdPersona) {
        this.NroIdPersona = NroIdPersona;
    }

    public void setTipoPago(int TipoPago) {
        this.TipoPago = TipoPago;
    }

    public void setTotalPagar(Object totalPagar) {
        this.totalPagar = totalPagar;
    }
    //CONSTRUCTORES
    public EncabezadoFactura() {
        
    }

    public EncabezadoFactura(int IdFactura, int NIT, String RazonSocial, String Direccion_tienda, int Telefono_tienda, String fecha, String hora, int NroIdPersona, int TipoPago, Object totalPagar) {
        this.IdFactura = IdFactura;
        this.NIT = NIT;
        this.RazonSocial = RazonSocial;
        this.Direccion_tienda = Direccion_tienda;
        this.Telefono_tienda = Telefono_tienda;
        this.fecha = fecha;
        this.hora = hora;
        this.NroIdPersona = NroIdPersona;
        this.TipoPago = TipoPago;
        this.totalPagar = totalPagar;
    }
    
}
