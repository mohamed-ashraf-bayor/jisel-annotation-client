package com.bayor.jisel.annotation.client.hierarchical;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-02-11T18:42:41.7885226-05:00",
  comments = "version: 1.1"
)
public sealed interface SealedStudentSociable extends SealedSociable permits com.bayor.jisel.annotation.client.hierarchical.subclasses.StudentWorkerHybrid {
 	void askForHelpWhenNeeded();
	boolean attendClass(java.lang.String param0) throws java.lang.IllegalArgumentException;
}
