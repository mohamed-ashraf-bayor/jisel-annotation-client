package com.bayor.jisel.annotation.client.unsealanddetach;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-07-12T20:15:35.9294784-04:00",
  comments = "version: 1.2"
)
public sealed interface SealedWorkerSociable extends SealedSociable permits SealedActiveWorkerSociable {
 	boolean[] joinOfficeSocialGroups(@java.lang.SuppressWarnings({"unused"}) java.lang.String[] groups, @java.lang.SuppressWarnings({"unchecked"}) int maximum);
}
