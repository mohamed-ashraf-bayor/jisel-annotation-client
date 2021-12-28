package com.bayor.jisel.annotation.client.multipleinheritance;

import org.jisel.SealForProfile;
import org.jisel.SealForProfiles;

import java.util.List;

public interface Sociable {

    String STUDENT = "Student";
    String WORKER = "Worker";
    String ACTIVE_WORKER = "ActiveWorker";
    String ANOTHER = "Another";

    @SealForProfiles( {STUDENT, WORKER, ACTIVE_WORKER})
    String startConversation() throws IllegalStateException;

    @SealForProfile(STUDENT)
    boolean attendClass(String fieldOfStudy) throws IllegalArgumentException;

    @SealForProfile(STUDENT)
    void askForHelpWhenNeeded();

    @SealForProfile(WORKER)
    @SealForProfile(ACTIVE_WORKER)
    boolean[] joinOfficeSocialGroups(String[] groups, int maximum);

    @SealForProfiles( {STUDENT, WORKER, ANOTHER})
    void internalCommonMethod();

    @SealForProfile(ANOTHER)
    void onlyForAnother();

    @SealForProfile(ACTIVE_WORKER)
    void leadOfficeSocialGroup(String groupName);

    @SealForProfile(ACTIVE_WORKER)
    double createNewOfficeSocialGroup(String groupName, List<String> starters) throws ArithmeticException;
}