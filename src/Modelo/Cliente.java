public class Cliente {
//ATRIBUTOS
    private int NroIdPersona;

    private int TipoID;

    private int TipoPersona;

    private String Nombre;

    private String Direccion;

    private int Telefono;

    private String ciudad;

    private String Departamento;

    private String Correo;

    private int CodigoPostal;
//METODOS
    public String ConsultarCliente() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void EliminarCliente() {
    }

    public String RegistrarCliente() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String ActualizarCliente() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    // GETTERS

    public int getNroIdPersona() {
        return NroIdPersona;
    }

    public int getTipoID() {
        return TipoID;
    }

    public int getTipoPersona() {
        return TipoPersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public String getCorreo() {
        return Correo;
    }

    public int getCodigoPostal() {
        return CodigoPostal;
    }
    //SETTERS

    public void setNroIdPersona(int NroIdPersona) {
        this.NroIdPersona = NroIdPersona;
    }

    public void setTipoID(int TipoID) {
        this.TipoID = TipoID;
    }

    public void setTipoPersona(int TipoPersona) {
        this.TipoPersona = TipoPersona;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setCodigoPostal(int CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }
    //CONSTRUCTORES
    public Cliente(){
    
    }

    public Cliente(int NroIdPersona, int TipoID, int TipoPersona, String Nombre, String Direccion, int Telefono, String ciudad, String Departamento, String Correo, int CodigoPostal) {
        this.NroIdPersona = NroIdPersona;
        this.TipoID = TipoID;
        this.TipoPersona = TipoPersona;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.ciudad = ciudad;
        this.Departamento = Departamento;
        this.Correo = Correo;
        this.CodigoPostal = CodigoPostal;
    }
    
}
