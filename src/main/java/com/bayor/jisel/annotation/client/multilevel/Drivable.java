package com.bayor.jisel.annotation.client.multilevel;

import org.jisel.annotations.SealFor;
import org.jisel.annotations.TopLevel;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedOptions;

// testing multiple annotations on large interface

@SuppressWarnings({"unchecked", "deprecation", "unused", "testing", "anotherTestValue"})
@Deprecated
@SupportedOptions("")
@SupportedAnnotationTypes("type1")
public interface Drivable {

    String MODERN_VEHICLE = "ModernVehicle";
    String SMART_VEHICLE = "SmartVehicle";
    String FUTURISTIC_VEHICLE = "FuturisticVehicle";

    @TopLevel
    boolean startEngine() throws IllegalStateException;

    @SealFor(SMART_VEHICLE)
    @SealFor(MODERN_VEHICLE)
    boolean keylessIgnition(String encryptedKey) throws UnsupportedOperationException;

    @SealFor(SMART_VEHICLE)
    @SealFor(FUTURISTIC_VEHICLE)
    boolean autopilotMode();

    @SealFor(FUTURISTIC_VEHICLE)
    void fly();

    @SealFor(FUTURISTIC_VEHICLE)
    void autoInflateTyres();

    @SealFor(FUTURISTIC_VEHICLE)
    void doOtherFuturisticStuff();
}