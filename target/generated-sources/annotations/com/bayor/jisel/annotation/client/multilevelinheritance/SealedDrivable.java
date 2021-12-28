package com.bayor.jisel.annotation.client.multilevelinheritance;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2021-12-28T08:35:27.2524885-06:00",
  comments = "version: 1.0"
)
public sealed interface SealedDrivable permits SealedModernVehicleDrivable, SealedOtherVehicleDrivable, com.bayor.jisel.annotation.client.multilevelinheritance.subclasses.Classic90sCar {
 	boolean startEngine() throws java.lang.IllegalStateException;
}
