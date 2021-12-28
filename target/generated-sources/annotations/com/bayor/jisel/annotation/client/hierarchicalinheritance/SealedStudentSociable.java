package com.bayor.jisel.annotation.client.hierarchicalinheritance;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2021-12-28T08:35:27.1926822-06:00",
  comments = "version: 1.0"
)
public sealed interface SealedStudentSociable extends SealedSociable permits com.bayor.jisel.annotation.client.hierarchicalinheritance.subclasses.StudentWorkerHybrid {
 	void askForHelpWhenNeeded();
	boolean attendClass(java.lang.String param0) throws java.lang.IllegalArgumentException;
}
