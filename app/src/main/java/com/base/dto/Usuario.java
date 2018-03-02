package com.base.dto;

/**
 * Created by USUARIO on 28/02/2018.
 */


public class Usuario {

    private String remote = "org.arcangel.dto.Usuario";

    public String Nameobject() {
        return remote;
    }
    private long  nmconusuario;
    private String cdusuario;
    private String dsnombres;
    private String dsapellidos;
    private String dsusuario;
    private String dsclave;
    private String dsrol;
    private String valido;
    private String clave;
    private String xml;
    private String dsclaveold;

    public String getDsclaveold() {
        return dsclaveold;
    }

    public void setDsclaveold(String dsclaveold) {
        this.dsclaveold = dsclaveold;
    }


    public String getServer() {
        return server;
    }
    public void setServer(String server) {
        this.server = server;
    }
    private String server;

    public long getNmconusuario() {
        return nmconusuario;
    }
    public void setNmconusuario(long nmconusuario) {
        this.nmconusuario = nmconusuario;
    }
    public String getCdusuario() {
        return cdusuario;
    }
    public void setCdusuario(String cdusuario) {
        this.cdusuario = cdusuario;
    }
    public String getDsnombres() {
        return dsnombres;
    }
    public void setDsnombres(String dsnombres) {
        this.dsnombres = dsnombres;
    }
    public String getDsapellidos() {
        return dsapellidos;
    }
    public void setDsapellidos(String dsapellidos) {
        this.dsapellidos = dsapellidos;
    }
    public String getDsusuario() {
        return dsusuario;
    }
    public void setDsusuario(String dsusuario) {
        this.dsusuario = dsusuario;
    }
    public String getDsclave() {
        return dsclave;
    }
    public void setDsclave(String dsclave) {
        this.dsclave = dsclave;
    }

    public String getDsrol() {
        return dsrol;
    }
    public void setDsrol(String dsrol) {
        this.dsrol = dsrol;
    }
    public String getValido() {
        return valido;
    }
    public void setValido(String valido) {
        this.valido = valido;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getXml() {
        return xml;
    }
    public void setXml(String xml) {
        this.xml = xml;
    }
}