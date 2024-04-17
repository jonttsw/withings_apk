package com.withings.comm.wpp.exception;

import java.io.IOException;
/* loaded from: classes3.dex */
public class NoKlSecretProvidedException extends IOException {
    public NoKlSecretProvidedException() {
        super("The device sent a probe challenge but we don't have klSecret for it");
    }
}
