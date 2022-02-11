package com.bayor.jisel.annotation.client.multilevel;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-02-11T18:42:41.7426462-05:00",
  comments = "version: 1.1"
)
public sealed interface SealedDrivable permits SealedModernVehicleDrivable, com.bayor.jisel.annotation.client.multilevel.subclasses.Classic90sCar {
 	boolean startEngine() throws java.lang.IllegalStateException;
}
