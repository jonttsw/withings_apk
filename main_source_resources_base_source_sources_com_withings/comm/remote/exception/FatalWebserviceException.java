package com.withings.comm.remote.exception;

import java.io.IOException;
/* loaded from: classes3.dex */
public class FatalWebserviceException extends IOException {
    public FatalWebserviceException() {
        super("Error contacting web services");
    }
}
