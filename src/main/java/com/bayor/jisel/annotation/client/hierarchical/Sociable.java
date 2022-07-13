package com.bayor.jisel.annotation.client.hierarchical;

import org.jisel.annotations.SealFor;
import org.jisel.annotations.TopLevel;

import java.io.Serial;
import java.util.List;

public interface Sociable {

    String STUDENT = "Student";
    String WORKER = "Worker";
    String ACTIVE_WORKER = "ActiveWorker";

    @TopLevel
    String startConversation() throws IllegalStateException;

    @SealFor(STUDENT)
    boolean attendClass(String fieldOfStudy) throws IllegalArgumentException;

    @SealFor(STUDENT)
    void askForHelpWhenNeeded();

    // adding annotations for testing...

    @SealFor({WORKER, ACTIVE_WORKER})
    boolean[] joinOfficeSocialGroups(@SuppressWarnings("unused") String[] groups, @SuppressWarnings("unchecked") int maximum);

    @SealFor(ACTIVE_WORKER)
    @Deprecated
    void leadOfficeSocialGroup(@SuppressWarnings({"unchecked", "deprecation", "unused"}) String groupName);

    @SealFor(ACTIVE_WORKER)
    @Serial
    @Deprecated
    double createNewOfficeSocialGroup(String groupName, List<String> starters) throws ArithmeticException;
}