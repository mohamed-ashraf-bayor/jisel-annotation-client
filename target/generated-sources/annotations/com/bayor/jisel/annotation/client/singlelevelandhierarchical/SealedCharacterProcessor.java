package com.bayor.jisel.annotation.client.singlelevelandhierarchical;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-07-12T20:15:35.8726337-04:00",
  comments = "version: 1.2"
)
public sealed interface SealedCharacterProcessor extends SealedProcessor permits SealedLetterProcessor, SealedDigitProcessor {
 	void processCharacter(char character);
}
