package com.bayor.jisel.annotation.client.unsealanddetach;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-07-12T20:15:35.9424451-04:00",
  comments = "version: 1.2"
)
public sealed interface SealedStudentSociable extends SealedSociable permits _SociableFinalCass {
 	void askForHelpWhenNeeded();
	boolean attendClass(java.lang.String fieldOfStudy) throws java.lang.IllegalArgumentException;
}
