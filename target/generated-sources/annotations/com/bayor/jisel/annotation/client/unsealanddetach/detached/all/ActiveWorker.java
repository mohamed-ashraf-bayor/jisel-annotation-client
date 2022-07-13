package com.bayor.jisel.annotation.client.unsealanddetach.detached.all;

@javax.annotation.processing.Generated(
  value = "org.jisel.JiselAnnotationProcessor",
  date = "2022-07-12T20:15:36.0072708-04:00",
  comments = "version: 1.2"
)
public interface ActiveWorker {
 	java.lang.String startConversation() throws java.lang.IllegalStateException;
	@java.lang.Deprecated
 	void leadOfficeSocialGroup(@java.lang.SuppressWarnings({"unchecked", "deprecation", "unused"}) java.lang.String groupName);
	boolean[] joinOfficeSocialGroups(@java.lang.SuppressWarnings({"unused"}) java.lang.String[] groups, @java.lang.SuppressWarnings({"unchecked"}) int maximum);
	@java.io.Serial
 	@java.lang.Deprecated
 	double createNewOfficeSocialGroup(java.lang.String groupName, java.util.List<java.lang.String> starters) throws java.lang.ArithmeticException;
}
