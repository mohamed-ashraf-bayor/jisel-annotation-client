package com.bayor.jisel.annotation.client.multilevel.subclasses;

import com.bayor.jisel.annotation.client.multilevel.Drivable;
import com.bayor.jisel.annotation.client.multilevel.SealedDrivable;
import org.jisel.annotations.AddTo;

@AddTo(largeInterface = Drivable.class)
public final class Classic90sCar implements SealedDrivable {
    @Override
    public boolean startEngine() throws IllegalStateException {
        return false;
    }
}