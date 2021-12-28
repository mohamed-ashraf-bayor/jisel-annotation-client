package com.bayor.jisel.annotation.client.multipleinheritance;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2021-12-28T08:35:27.219577-06:00",
  comments = "version: 1.0"
)
public sealed interface SealedWorkerStudentAnotherSociable permits SealedWorkerSociable, SealedStudentSociable, SealedAnotherSociable {
 	void internalCommonMethod();
}
