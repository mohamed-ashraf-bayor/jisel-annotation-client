package com.bayor.jisel.annotation.client.hierarchical;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-07-12T20:15:35.8087989-04:00",
  comments = "version: 1.2"
)
public sealed interface SealedSociable permits SealedWorkerSociable, SealedStudentSociable {
 	java.lang.String startConversation() throws java.lang.IllegalStateException;
}
