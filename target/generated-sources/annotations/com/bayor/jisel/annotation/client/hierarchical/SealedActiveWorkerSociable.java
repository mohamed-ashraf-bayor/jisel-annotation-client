package com.bayor.jisel.annotation.client.hierarchical;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-07-12T20:15:35.7459673-04:00",
  comments = "version: 1.2"
)
public sealed interface SealedActiveWorkerSociable extends SealedWorkerSociable permits _SociableFinalCass {
 	@java.io.Serial
 	@java.lang.Deprecated
 	double createNewOfficeSocialGroup(java.lang.String groupName, java.util.List<java.lang.String> starters) throws java.lang.ArithmeticException;
	@java.lang.Deprecated
 	void leadOfficeSocialGroup(@java.lang.SuppressWarnings({"unchecked", "deprecation", "unused"}) java.lang.String groupName);
}
