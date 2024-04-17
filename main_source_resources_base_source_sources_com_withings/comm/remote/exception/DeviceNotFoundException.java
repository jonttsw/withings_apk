package com.withings.comm.remote.exception;

import java.io.IOException;
import u70.i;
/* loaded from: classes3.dex */
public class DeviceNotFoundException extends IOException {
    public DeviceNotFoundException(i iVar) {
        super("Didn't find device with mac : " + iVar);
    }
}
