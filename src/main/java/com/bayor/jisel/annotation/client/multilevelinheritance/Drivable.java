package com.bayor.jisel.annotation.client.multilevelinheritance;

import org.jisel.SealForProfile;

public interface Drivable {

    String MODERN_VEHICLE = "ModernVehicle";
    String SMART_VEHICLE = "SmartVehicle";
    String OTHER_VEHICLE = "OtherVehicle";

    @SealForProfile(MODERN_VEHICLE)
    @SealForProfile(SMART_VEHICLE)
    @SealForProfile(OTHER_VEHICLE) // added as a "dummy" profile in order to achieve multi level inheritance with the tagged method as being part of the top-level parent interface
    boolean startEngine() throws IllegalStateException;

    @SealForProfile(MODERN_VEHICLE)
    @SealForProfile(SMART_VEHICLE)
    boolean keylessIgnition(String encryptedKey) throws UnsupportedOperationException;

    @SealForProfile(SMART_VEHICLE)
    boolean autopilotMode();
}