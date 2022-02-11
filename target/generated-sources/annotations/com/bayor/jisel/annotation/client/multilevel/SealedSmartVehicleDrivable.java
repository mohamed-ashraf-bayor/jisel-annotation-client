package com.bayor.jisel.annotation.client.multilevel;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-02-11T18:42:41.7346692-05:00",
  comments = "version: 1.1"
)
public sealed interface SealedSmartVehicleDrivable extends SealedModernVehicleDrivable permits SealedFuturisticVehicleDrivable, com.bayor.jisel.annotation.client.multilevel.subclasses.CyberVehicle {
 	boolean autopilotMode();
}
