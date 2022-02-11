package com.bayor.jisel.annotation.client.hierarchical;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-02-11T18:42:41.7945096-05:00",
  comments = "version: 1.1"
)
public sealed interface SealedSociable permits SealedWorkerSociable, SealedStudentSociable {
 	java.lang.String startConversation() throws java.lang.IllegalStateException;
}
