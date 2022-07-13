package com.bayor.jisel.annotation.client.multilevel;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-07-12T20:15:36.0691082-04:00",
  comments = "version: 1.2"
)
public sealed interface SealedSmartVehicleDrivable extends SealedModernVehicleDrivable permits SealedFuturisticVehicleDrivable, com.bayor.jisel.annotation.client.multilevel.subclasses.CyberVehicle {
 	boolean autopilotMode();
}
