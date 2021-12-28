package com.bayor.jisel.annotation.client.hierarchicalinheritance;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2021-12-28T08:35:27.1966505-06:00",
  comments = "version: 1.0"
)
public sealed interface SealedSociable permits SealedWorkerSociable, SealedStudentSociable {
 	java.lang.String startConversation() throws java.lang.IllegalStateException;
}
