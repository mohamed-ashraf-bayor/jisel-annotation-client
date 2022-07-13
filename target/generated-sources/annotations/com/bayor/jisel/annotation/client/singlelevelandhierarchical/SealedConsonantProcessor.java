package com.bayor.jisel.annotation.client.singlelevelandhierarchical;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-07-12T20:15:35.8526818-04:00",
  comments = "version: 1.2"
)
public sealed interface SealedConsonantProcessor extends SealedLetterProcessor permits _ProcessorFinalCass {
 	void processConsonant(char consonant);
}
