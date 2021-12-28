package com.bayor.jisel.annotation.client.multilevelinheritance.subclasses;

import com.bayor.jisel.annotation.client.multilevelinheritance.Drivable;
import com.bayor.jisel.annotation.client.multilevelinheritance.SealedSmartVehicleDrivable;
import org.jisel.AddToProfile;

@AddToProfile(profile = Drivable.SMART_VEHICLE, largeInterface = "com.bayor.jisel.annotation.client.multilevelinheritance.Drivable")
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
