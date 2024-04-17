package com.withings.nervehealthscore;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: NeuropathyDiagnosticNative.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\"B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\n¢\u0006\u0002\u0010\u000bB'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J\u000e\u0010\u0019\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b\u001aJ1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\b\u0010 \u001a\u00020!H\u0016R\u0014\u0010\u0004\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/withings/nervehealthscore/NeuropathyDiagnosticNative;", "", "value", "", "status", "Lcom/withings/nervehealthscore/NeuropathyDiagnosticNative$SudoStatus;", "timeStamp", "Lorg/joda/time/DateTime;", "(FLcom/withings/nervehealthscore/NeuropathyDiagnosticNative$SudoStatus;Lorg/joda/time/DateTime;)V", "", "Lcom/withings/nervehealthscore/TimeStampNative;", "(FILcom/withings/nervehealthscore/TimeStampNative;)V", "sudoStatus", "(FLcom/withings/nervehealthscore/NeuropathyDiagnosticNative$SudoStatus;Lcom/withings/nervehealthscore/TimeStampNative;I)V", "getStatus$nervehealthscore_release", "()I", "getSudoStatus", "()Lcom/withings/nervehealthscore/NeuropathyDiagnosticNative$SudoStatus;", "getTimeStamp", "()Lcom/withings/nervehealthscore/TimeStampNative;", "getValue", "()F", "component1", "component2", "component3", "component4", "component4$nervehealthscore_release", "copy", "equals", "", "other", "hashCode", "toString", "", "SudoStatus", "nervehealthscore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class NeuropathyDiagnosticNative {
    private final int status;
    private final SudoStatus sudoStatus;
    private final TimeStampNative timeStamp;
    private final float value;

    /* compiled from: NeuropathyDiagnosticNative.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/withings/nervehealthscore/NeuropathyDiagnosticNative$SudoStatus;", "", "status", "", "(Ljava/lang/String;II)V", "getStatus", "()I", "SUDO_STATUS_NORMAL", "SUDO_STATUS_SIGNS_OF_NEUROPATHY", "SUDO_STATUS_PENDING", "SUDO_STATUS_INCONCLUSIVE", "nervehealthscore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public enum SudoStatus {
        SUDO_STATUS_NORMAL(0),
        SUDO_STATUS_SIGNS_OF_NEUROPATHY(1),
        SUDO_STATUS_PENDING(2),
        SUDO_STATUS_INCONCLUSIVE(3);
        
        private final int status;

        SudoStatus(int i11) {
            this.status = i11;
        }

        public final int getStatus() {
            return this.status;
        }
    }

    private NeuropathyDiagnosticNative(float f11, SudoStatus sudoStatus, TimeStampNative timeStampNative, int i11) {
        this.value = f11;
        this.sudoStatus = sudoStatus;
        this.timeStamp = timeStampNative;
        this.status = i11;
    }

    public static /* synthetic */ NeuropathyDiagnosticNative copy$default(NeuropathyDiagnosticNative neuropathyDiagnosticNative, float f11, SudoStatus sudoStatus, TimeStampNative timeStampNative, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f11 = neuropathyDiagnosticNative.value;
        }
        if ((i12 & 2) != 0) {
            sudoStatus = neuropathyDiagnosticNative.sudoStatus;
        }
        if ((i12 & 4) != 0) {
            timeStampNative = neuropathyDiagnosticNative.timeStamp;
        }
        if ((i12 & 8) != 0) {
            i11 = neuropathyDiagnosticNative.status;
        }
        return neuropathyDiagnosticNative.copy(f11, sudoStatus, timeStampNative, i11);
    }

    public final float component1() {
        return this.value;
    }

    public final SudoStatus component2() {
        return this.sudoStatus;
    }

    public final TimeStampNative component3() {
        return this.timeStamp;
    }

    public final int component4$nervehealthscore_release() {
        return this.status;
    }

    public final NeuropathyDiagnosticNative copy(float f11, SudoStatus sudoStatus, TimeStampNative timeStamp, int i11) {
        u.j(sudoStatus, "sudoStatus");
        u.j(timeStamp, "timeStamp");
        return new NeuropathyDiagnosticNative(f11, sudoStatus, timeStamp, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NeuropathyDiagnosticNative)) {
            return false;
        }
        NeuropathyDiagnosticNative neuropathyDiagnosticNative = (NeuropathyDiagnosticNative) obj;
        if (u.e(Float.valueOf(this.value), Float.valueOf(neuropathyDiagnosticNative.value)) && this.sudoStatus == neuropathyDiagnosticNative.sudoStatus && u.e(this.timeStamp, neuropathyDiagnosticNative.timeStamp) && this.status == neuropathyDiagnosticNative.status) {
            return true;
        }
        return false;
    }

    public final int getStatus$nervehealthscore_release() {
        return this.status;
    }

    public final SudoStatus getSudoStatus() {
        return this.sudoStatus;
    }

    public final TimeStampNative getTimeStamp() {
        return this.timeStamp;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.sudoStatus.hashCode();
        int hashCode2 = this.timeStamp.hashCode();
        return Integer.hashCode(this.status) + ((hashCode2 + ((hashCode + (Float.hashCode(this.value) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Value: " + this.value + " | Status: " + this.status + " | Date: " + this.timeStamp.toDateTime();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NeuropathyDiagnosticNative(float f11, SudoStatus status, DateTime timeStamp) {
        this(f11, status, new TimeStampNative(timeStamp), status.getStatus());
        u.j(status, "status");
        u.j(timeStamp, "timeStamp");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NeuropathyDiagnosticNative(float r2, int r3, com.withings.nervehealthscore.TimeStampNative r4) {
        /*
            r1 = this;
            java.lang.String r0 = "timeStamp"
            kotlin.jvm.internal.u.j(r4, r0)
            com.withings.nervehealthscore.NeuropathyDiagnosticNative$SudoStatus r0 = com.withings.nervehealthscore.NeuropathyDiagnosticNativeKt.access$toSudoStatus(r3)
            r1.<init>(r2, r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealthscore.NeuropathyDiagnosticNative.<init>(float, int, com.withings.nervehealthscore.TimeStampNative):void");
    }
}
