package com.base.dto;

import java.util.Date;

/**
 * Created by USUARIO on 1/03/2018.
 */

public class Entregables {
    private long nmconentregable;
    public long getNmconentregable() {
        return nmconentregable;
    }
    public void setNmconentregable(long nmconentregable) {
        this.nmconentregable = nmconentregable;
    }
    public long getNmconplan() {
        return nmconplan;
    }
    public void setNmconplan(long nmconplan) {
        this.nmconplan = nmconplan;
    }
    public Date getFeinicio() {
        return feinicio;
    }
    public void setFeinicio(Date feinicio) {
        this.feinicio = feinicio;
    }
    public Date getFefinal() {
        return fefinal;
    }
    public void setFefinal(Date fefinal) {
        this.fefinal = fefinal;
    }
    public String getDsentregable() {
        return dsentregable;
    }
    public void setDsentregable(String dsentregable) {
        this.dsentregable = dsentregable;
    }
    public Date getFeregistro() {
        return feregistro;
    }
    public void setFeregistro(Date feregistro) {
        this.feregistro = feregistro;
    }
    public Date getFebaja() {
        return febaja;
    }
    public void setFebaja(Date febaja) {
        this.febaja = febaja;
    }
    public String getCdusuario() {
        return cdusuario;
    }
    public void setCdusuario(String cdusuario) {
        this.cdusuario = cdusuario;
    }
    public long getNmestado() {
        return nmestado;
    }
    public void setNmestado(long nmestado) {
        this.nmestado = nmestado;
    }
    public String getDsestado() {
        return dsestado;
    }
    public void setDsestado(String dsestado) {
        this.dsestado = dsestado;
    }
    private long nmconplan ;
    private long nmestado;
    private String dsestado;

    private Date feinicio;
    private Date fefinal;
    private String  dsentregable;
    private Date  feregistro;
    private Date febaja;
    private  String cdusuario;

    /*Remote*/
    private String remote="softca.arcangel.common.dto.entregables.Entregables";
    public void setRemote(String remote) {
        this.remote = remote;
    }
    public String Nameobject(){
        return this.remote;
    }
}
