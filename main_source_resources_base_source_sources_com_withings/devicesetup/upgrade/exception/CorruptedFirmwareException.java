package com.withings.devicesetup.upgrade.exception;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: CorruptedFirmwareException.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/devicesetup/upgrade/exception/CorruptedFirmwareException;", "Ljava/io/IOException;", "device-setup-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CorruptedFirmwareException extends IOException {
    public CorruptedFirmwareException(String url, String expectedMd5, String str) {
        u.j(url, "url");
        u.j(expectedMd5, "expectedMd5");
    }
}
