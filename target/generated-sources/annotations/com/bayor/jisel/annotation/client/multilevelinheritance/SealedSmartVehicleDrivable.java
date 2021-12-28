package com.bayor.jisel.annotation.client.multilevelinheritance;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2021-12-28T08:35:27.2495066-06:00",
  comments = "version: 1.0"
)
public sealed interface SealedSmartVehicleDrivable extends SealedModernVehicleDrivable permits com.bayor.jisel.annotation.client.multilevelinheritance.subclasses.CyberVehicle {
 	boolean autopilotMode();
}
