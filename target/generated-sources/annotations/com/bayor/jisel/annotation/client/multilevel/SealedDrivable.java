package com.bayor.jisel.annotation.client.multilevel;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-07-12T20:15:36.0760844-04:00",
  comments = "version: 1.2"
)
@java.lang.SuppressWarnings({"unchecked", "deprecation", "unused", "testing", "anotherTestValue"})
@java.lang.Deprecated
@javax.annotation.processing.SupportedOptions({""})
@javax.annotation.processing.SupportedAnnotationTypes({"type1"})
public sealed interface SealedDrivable permits SealedModernVehicleDrivable, com.bayor.jisel.annotation.client.multilevel.subclasses.Classic90sCar {
 	boolean startEngine() throws java.lang.IllegalStateException;
}
