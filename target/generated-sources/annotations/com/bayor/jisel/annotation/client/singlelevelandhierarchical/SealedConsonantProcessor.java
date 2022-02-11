package com.bayor.jisel.annotation.client.singlelevelandhierarchical;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-02-11T18:42:41.8234303-05:00",
  comments = "version: 1.1"
)
public sealed interface SealedConsonantProcessor extends SealedLetterProcessor permits _ProcessorFinalCass {
 	void processConsonant(char param0);
}
