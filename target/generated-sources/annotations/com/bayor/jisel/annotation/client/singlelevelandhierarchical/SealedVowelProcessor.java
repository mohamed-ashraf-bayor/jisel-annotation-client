package com.bayor.jisel.annotation.client.singlelevelandhierarchical;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-07-12T20:15:35.8786173-04:00",
  comments = "version: 1.2"
)
public sealed interface SealedVowelProcessor extends SealedLetterProcessor permits _ProcessorFinalCass {
 	void processVowel(char vowel);
}
