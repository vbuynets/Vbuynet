package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.domain.domain.BaseDomain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "product_comments_state")
public class ProductCommentsState  extends BaseDomain implements Serializable {

    @Column(name = "state_name")
    private String stateName;


    /**
     * @return state_name
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * @param stateName
     */
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}