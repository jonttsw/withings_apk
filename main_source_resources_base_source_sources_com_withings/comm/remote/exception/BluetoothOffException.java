package com.withings.comm.remote.exception;

import java.io.IOException;
/* loaded from: classes3.dex */
public class BluetoothOffException extends IOException {
    public BluetoothOffException() {
        super("Bluetooth is off");
    }
}
