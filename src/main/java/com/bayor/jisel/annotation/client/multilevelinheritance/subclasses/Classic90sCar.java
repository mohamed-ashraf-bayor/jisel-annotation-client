package com.bayor.jisel.annotation.client.multilevelinheritance.subclasses;

import com.bayor.jisel.annotation.client.multilevelinheritance.SealedDrivable;
import org.jisel.AddToProfile;

@AddToProfile(largeInterface = "com.bayor.jisel.annotation.client.multilevelinheritance.Drivable")
public final class Classic90sCar implements SealedDrivable {
    @Override
    public boolean startEngine() throws IllegalStateException {
        return false;
    }
}