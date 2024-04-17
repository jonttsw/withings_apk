package com.withings.comm.remote.exception;

import java.io.IOException;
/* loaded from: classes3.dex */
public class ConnectionClosedException extends IOException {
    public ConnectionClosedException() {
        super("Connection closed");
    }
}
