package com.bayor.jisel.annotation.client.multilevel;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-02-11T18:42:41.7057443-05:00",
  comments = "version: 1.1"
)
public sealed interface SealedModernVehicleDrivable extends SealedDrivable permits SealedSmartVehicleDrivable {
 	boolean keylessIgnition(java.lang.String param0) throws java.lang.UnsupportedOperationException;
}
