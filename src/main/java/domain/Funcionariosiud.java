package domain;

public class Funcionariosiud {
    
    private String cedulaf;
    private String nombres;
    private String apellidos;
    private String estadocivil;
    private String sexo;
    private String direccion;
    private String telefono;
    private String fnacimiento;

    public String getCedulaf() {
        return cedulaf;
    }

    public void setCedulaf(String cedulaf) {
        this.cedulaf = cedulaf;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telfono) {
        this.telefono = telfono;
    }

    public String getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    @Override
    public String toString() {
        return nombres + " " + apellidos;
    }

//    public void add(Funcionariosiud funcionarios) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
