package com.midd.entregable;

import com.base.dto.Entregables;
import com.base.dto.PlanProyecto;

import java.util.List;

/**
 * Created by USUARIO on 1/03/2018.
 */

public interface IFacadeEntregable {

    List<Entregables> GetEntregables(PlanProyecto planProyecto);
}
