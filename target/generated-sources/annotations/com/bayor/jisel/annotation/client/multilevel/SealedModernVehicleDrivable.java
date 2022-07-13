package com.bayor.jisel.annotation.client.multilevel;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-07-12T20:15:36.0631235-04:00",
  comments = "version: 1.2"
)
public sealed interface SealedModernVehicleDrivable extends SealedDrivable permits SealedSmartVehicleDrivable {
 	boolean keylessIgnition(java.lang.String encryptedKey) throws java.lang.UnsupportedOperationException;
}
