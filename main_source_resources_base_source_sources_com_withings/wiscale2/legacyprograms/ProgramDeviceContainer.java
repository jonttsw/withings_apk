package com.withings.wiscale2.legacyprograms;

import com.withings.programs.model.program.DeviceDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ProgramDeviceAdapter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/ProgramDeviceContainer;", "", "()V", "hasDevice", "", "getHasDevice", "()Z", "setHasDevice", "(Z)V", "programDevice", "Lcom/withings/programs/model/program/DeviceDomain;", "getProgramDevice", "()Lcom/withings/programs/model/program/DeviceDomain;", "setProgramDevice", "(Lcom/withings/programs/model/program/DeviceDomain;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProgramDeviceContainer {
    public static final int $stable = 8;
    private boolean hasDevice;
    private DeviceDomain programDevice = new DeviceDomain("", 0, false);

    public final boolean getHasDevice() {
        return this.hasDevice;
    }

    public final DeviceDomain getProgramDevice() {
        return this.programDevice;
    }

    public final void setHasDevice(boolean z5) {
        this.hasDevice = z5;
    }

    public final void setProgramDevice(DeviceDomain deviceDomain) {
        u.j(deviceDomain, "<set-?>");
        this.programDevice = deviceDomain;
    }
}
