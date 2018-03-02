package com.base.dto;

import java.util.Date;

/**
 * Created by USUARIO on 1/03/2018.
 */

public class PlanProyecto {
    /*Remote*/
    private String remote="softca.arcangel.common.dto.planproyecto.PlanProyecto";
    public void setRemote(String remote) {
        this.remote = remote;
    }
    public String Nameobject(){
        return this.remote;
    }

    private long nmconplan;
    private long nmconproyecto;
    private String dsplan;
    private Date feinicio;
    private Date fefin;
    private Date feregistro;
    private Date febaja;
    private String dsobjgeneral;
    private String dsobjespecifico;
    private String dsalcance;
    private String cdusuario;
    private String dstipoproyecto;
    private String dscaracteristicas;
    private String dsentregables;
    private String dsadaptacion;

    public long getNmconplan() {
        return nmconplan;
    }

    public void setNmconplan(long nmconplan) {
        this.nmconplan = nmconplan;
    }

    public long getNmconproyecto() {
        return nmconproyecto;
    }

    public void setNmconproyecto(long nmconproyecto) {
        this.nmconproyecto = nmconproyecto;
    }

    public String getDsplan() {
        return dsplan;
    }

    public void setDsplan(String dsplan) {
        this.dsplan = dsplan;
    }

    public Date getFeinicio() {
        return feinicio;
    }

    public void setFeinicio(Date feinicio) {
        this.feinicio = feinicio;
    }

    public Date getFefin() {
        return fefin;
    }

    public void setFefin(Date fefin) {
        this.fefin = fefin;
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

    public String getDsobjgeneral() {
        return dsobjgeneral;
    }

    public void setDsobjgeneral(String dsobjgeneral) {
        this.dsobjgeneral = dsobjgeneral;
    }

    public String getDsobjespecifico() {
        return dsobjespecifico;
    }

    public void setDsobjespecifico(String dsobjespecifico) {
        this.dsobjespecifico = dsobjespecifico;
    }

    public String getDsalcance() {
        return dsalcance;
    }

    public void setDsalcance(String dsalcance) {
        this.dsalcance = dsalcance;
    }

    public String getCdusuario() {
        return cdusuario;
    }

    public void setCdusuario(String cdusuario) {
        this.cdusuario = cdusuario;
    }

    public String getDstipoproyecto() {
        return dstipoproyecto;
    }

    public void setDstipoproyecto(String dstipoproyecto) {
        this.dstipoproyecto = dstipoproyecto;
    }

    public String getDscaracteristicas() {
        return dscaracteristicas;
    }

    public void setDscaracteristicas(String dscaracteristicas) {
        this.dscaracteristicas = dscaracteristicas;
    }

    public String getDsentregables() {
        return dsentregables;
    }

    public void setDsentregables(String dsentregables) {
        this.dsentregables = dsentregables;
    }

    public String getDsadaptacion() {
        return dsadaptacion;
    }

    public void setDsadaptacion(String dsadaptacion) {
        this.dsadaptacion = dsadaptacion;
    }
}
