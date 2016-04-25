package com.alliander.osgp.dto.valueobjects.controllableload;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeviceStatusDto implements Serializable {

    private static final long serialVersionUID = -5678773899404270370L;

    private List<RelayValueDto> relayValues;

    public DeviceStatusDto(final List<RelayValueDto> relayValues) {
        this.relayValues = new ArrayList<RelayValueDto>(relayValues);
    }

    public List<RelayValueDto> getRelayValues() {
        return Collections.unmodifiableList(this.relayValues);
    }
}
