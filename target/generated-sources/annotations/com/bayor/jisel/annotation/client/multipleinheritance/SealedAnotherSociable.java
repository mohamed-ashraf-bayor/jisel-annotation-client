package com.bayor.jisel.annotation.client.multipleinheritance;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2021-12-28T08:35:27.234537-06:00",
  comments = "version: 1.0"
)
public sealed interface SealedAnotherSociable extends SealedWorkerStudentAnotherSociable permits _SociableFinalCass {
 	void onlyForAnother();
}