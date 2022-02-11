package com.bayor.jisel.annotation.client.hierarchical;

import org.jisel.annotations.SealFor;
import org.jisel.annotations.TopLevel;

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

    @SealFor({WORKER, ACTIVE_WORKER})
    boolean[] joinOfficeSocialGroups(String[] groups, int maximum);

    @SealFor(ACTIVE_WORKER)
    void leadOfficeSocialGroup(String groupName);

    @SealFor(ACTIVE_WORKER)
    double createNewOfficeSocialGroup(String groupName, List<String> starters) throws ArithmeticException;
}