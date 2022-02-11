package com.bayor.jisel.annotation.client.hierarchical;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-02-11T18:42:41.7825388-05:00",
  comments = "version: 1.1"
)
public sealed interface SealedWorkerSociable extends SealedSociable permits SealedActiveWorkerSociable, com.bayor.jisel.annotation.client.hierarchical.subclasses.StudentWorkerHybrid {
 	boolean[] joinOfficeSocialGroups(java.lang.String[] param0, int param1);
}
