package com.midd.proyecto;

import com.base.dto.PlanProyecto;
import com.base.dto.Proyecto;

import java.util.List;

/**
 * Created by USUARIO on 1/03/2018.
 */

public interface IFacadePlanProyecto {

    public List<PlanProyecto> GetPlanProyectos(Proyecto proyecto );
}
