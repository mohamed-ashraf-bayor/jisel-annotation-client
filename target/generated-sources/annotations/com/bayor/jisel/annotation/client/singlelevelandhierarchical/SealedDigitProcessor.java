package com.bayor.jisel.annotation.client.singlelevelandhierarchical;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-02-11T18:42:41.8174475-05:00",
  comments = "version: 1.1"
)
public sealed interface SealedDigitProcessor extends SealedCharacterProcessor permits _ProcessorFinalCass {
 	void processDigit(int param0);
}
