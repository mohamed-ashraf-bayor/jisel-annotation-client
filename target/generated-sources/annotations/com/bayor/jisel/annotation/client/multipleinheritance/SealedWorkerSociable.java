package com.bayor.jisel.annotation.client.multipleinheritance;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2021-12-28T08:35:27.2265592-06:00",
  comments = "version: 1.0"
)
public sealed interface SealedWorkerSociable extends SealedActiveWorkerWorkerSociable, SealedWorkerStudentAnotherSociable permits SealedActiveWorkerSociable, SealedStudentSociable {
 	java.lang.String startConversation() throws java.lang.IllegalStateException;
}
