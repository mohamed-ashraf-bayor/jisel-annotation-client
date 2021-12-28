package com.bayor.jisel.annotation.client.multipleinheritance;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2021-12-28T08:35:27.2305479-06:00",
  comments = "version: 1.0"
)
public sealed interface SealedStudentSociable extends SealedWorkerStudentAnotherSociable, SealedWorkerSociable permits _SociableFinalCass {
 	boolean attendClass(java.lang.String param0) throws java.lang.IllegalArgumentException;
	void askForHelpWhenNeeded();
}
