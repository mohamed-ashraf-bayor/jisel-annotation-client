package com.bayor.jisel.annotation.client.hierarchicalinheritance.subclasses;

import com.bayor.jisel.annotation.client.hierarchicalinheritance.SealedStudentSociable;
import com.bayor.jisel.annotation.client.hierarchicalinheritance.SealedWorkerSociable;
import org.jisel.AddToProfiles;

import static com.bayor.jisel.annotation.client.hierarchicalinheritance.Sociable.STUDENT;
import static com.bayor.jisel.annotation.client.hierarchicalinheritance.Sociable.WORKER;

@AddToProfiles(profiles = {STUDENT, WORKER}, largeInterface = "com.bayor.jisel.annotation.client.hierarchicalinheritance.Sociable")
public final class StudentWorkerHybrid implements SealedStudentSociable, SealedWorkerSociable {
    @Override
    public String startConversation() throws IllegalStateException {
        return null;
    }

    @Override
    public void askForHelpWhenNeeded() {

    }

    @Override
    public boolean attendClass(String param0) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean[] joinOfficeSocialGroups(String[] param0, int param1) {
        return new boolean[0];
    }
}
