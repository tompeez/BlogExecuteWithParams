package de.hahn.blog.executewithparameter.model.adfbc.views.common;

import oracle.jbo.ViewObject;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Aug 18 15:16:15 CEST 2014
// ---------------------------------------------------------------------
public interface LocationsView extends ViewObject {
    void findCityByName(String name);

    String getbindCity();

    void setbindCity(String value);
}
