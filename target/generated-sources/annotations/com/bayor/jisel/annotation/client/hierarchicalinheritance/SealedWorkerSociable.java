package com.bayor.jisel.annotation.client.hierarchicalinheritance;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2021-12-28T08:35:27.1876789-06:00",
  comments = "version: 1.0"
)
public sealed interface SealedWorkerSociable extends SealedSociable permits SealedActiveWorkerSociable, com.bayor.jisel.annotation.client.hierarchicalinheritance.subclasses.StudentWorkerHybrid {
 	boolean[] joinOfficeSocialGroups(java.lang.String[] param0, int param1);
}