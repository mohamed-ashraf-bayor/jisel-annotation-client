package com.bayor.jisel.annotation.client.singlelevelandhierarchical;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-07-12T20:15:35.8437104-04:00",
  comments = "version: 1.2"
)
public sealed interface SealedLetterProcessor extends SealedCharacterProcessor permits SealedConsonantProcessor, SealedVowelProcessor {
 	void processLetter(char letter);
}
