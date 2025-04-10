package ec.edu.ups.clases;

import ec.edu.ups.enums.TipoDireccion;

public class Direccion {
    private TipoDireccion tipoDireccion;
    private String tipo;
    private String callePricipal;
    private String calleSecundaria;
    private  String numeracion;
    private String ciudad;
    private String provincia;
    private String pais;

    public Direccion() {}

    public Direccion(TipoDireccion tipoDireccion,String tipo, String callePricipal, String calleSecundaria, String numeracion, String ciudad, String provincia, String pais) {
        this.tipo = tipo;
        this.callePricipal = callePricipal;
        this.calleSecundaria = calleSecundaria;
        this.numeracion = numeracion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.tipoDireccion = tipoDireccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCallePricipal() {
        return callePricipal;
    }

    public void setCallePricipal(String callePricipal) {
        this.callePricipal = callePricipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }
    public void setTipoDireccion(TipoDireccion tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    @Override
    public String toString() {
        return "\n\tDireccion{" +
                "\n\tipoDireccion=" + tipoDireccion +
                "\n\t, tipo='" + tipo + '\'' +
                "\n\t, callePricipal='" + callePricipal + '\'' +
                "\n\t, calleSecundaria='" + calleSecundaria + '\'' +
                "\n\t, numeracion='" + numeracion + '\'' +
                "\n\t, ciudad='" + ciudad + '\'' +
                "\n\t, provincia='" + provincia + '\'' +
                "\n\t, pais='" + pais + '\'' +
                '}';
    }
}
