package com.withings.comm.network.bluetooth;

import androidx.camera.camera2.internal.k0;
import com.withings.comm.network.common.exception.ConnectionFailException;
/* loaded from: classes3.dex */
public class BondCreationException extends ConnectionFailException {
    public BondCreationException(String str, String str2) {
        super(k0.c("Unable to create bond with ", str, " (", str2, ")"));
    }
}
