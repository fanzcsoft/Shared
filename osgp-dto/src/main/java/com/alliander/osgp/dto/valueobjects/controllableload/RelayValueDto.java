package com.alliander.osgp.dto.valueobjects.controllableload;

import java.io.Serializable;

public class RelayValueDto implements Serializable {

    private static final long serialVersionUID = 2863688877612401767L;

    private int index;
    private boolean on;
    private int dimValue;
    
    public RelayValueDto(int index, boolean on, int dimValue) {
        this.index = index;
        this.on = on;
        this.dimValue = dimValue;
    }
    
    public int getIndex() {
        return this.index;
    }
    
    public boolean isOn() {
        return this.on;
    }
    
    public int getDimValue() {
        return this.dimValue;
    }
}
