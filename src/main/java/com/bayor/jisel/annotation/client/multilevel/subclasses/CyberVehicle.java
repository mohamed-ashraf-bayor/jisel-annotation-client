package com.bayor.jisel.annotation.client.multilevel.subclasses;

import com.bayor.jisel.annotation.client.multilevel.Drivable;
import com.bayor.jisel.annotation.client.multilevel.SealedSmartVehicleDrivable;
import org.jisel.annotations.AddTo;

import static com.bayor.jisel.annotation.client.multilevel.Drivable.SMART_VEHICLE;

@AddTo(profiles = SMART_VEHICLE, largeInterface = Drivable.class)
public final class CyberVehicle implements SealedSmartVehicleDrivable {
    @Override
    public boolean startEngine() throws IllegalStateException {
        return false;
    }

    @Override
    public boolean keylessIgnition(String param0) throws UnsupportedOperationException {
        return false;
    }

    @Override
    public boolean autopilotMode() {
        return false;
    }
}