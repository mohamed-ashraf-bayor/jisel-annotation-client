package com.bayor.jisel.annotation.client.hierarchical;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-07-12T20:15:35.8018209-04:00",
  comments = "version: 1.2"
)
public sealed interface SealedStudentSociable extends SealedSociable permits com.bayor.jisel.annotation.client.hierarchical.subclasses.StudentWorkerHybrid {
 	boolean attendClass(java.lang.String fieldOfStudy) throws java.lang.IllegalArgumentException;
	void askForHelpWhenNeeded();
}
