package com.bayor.jisel.annotation.client.hierarchical.subclasses;

import com.bayor.jisel.annotation.client.hierarchical.SealedStudentSociable;
import com.bayor.jisel.annotation.client.hierarchical.SealedWorkerSociable;
import com.bayor.jisel.annotation.client.hierarchical.Sociable;
import org.jisel.annotations.AddTo;

import static com.bayor.jisel.annotation.client.hierarchical.Sociable.STUDENT;
import static com.bayor.jisel.annotation.client.hierarchical.Sociable.WORKER;

@AddTo(profiles = {STUDENT, WORKER}, largeInterface = Sociable.class)
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