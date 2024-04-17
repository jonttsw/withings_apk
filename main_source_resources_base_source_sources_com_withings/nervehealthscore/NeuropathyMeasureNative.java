package com.withings.nervehealthscore;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: NeuropathyMeasureNative.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\"B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\n¢\u0006\u0002\u0010\u000bB)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\n\u0012\b\b\u0002\u0010\u0004\u001a\u00020\t¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J\u000e\u0010\u0019\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b\u001aJ1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\b\u0010 \u001a\u00020!H\u0016R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/withings/nervehealthscore/NeuropathyMeasureNative;", "", "value", "", "sudoMode", "Lcom/withings/nervehealthscore/NeuropathyMeasureNative$SudoMode;", "timeStamp", "Lorg/joda/time/DateTime;", "(FLcom/withings/nervehealthscore/NeuropathyMeasureNative$SudoMode;Lorg/joda/time/DateTime;)V", "", "Lcom/withings/nervehealthscore/TimeStampNative;", "(FILcom/withings/nervehealthscore/TimeStampNative;)V", "mode", "(FLcom/withings/nervehealthscore/NeuropathyMeasureNative$SudoMode;Lcom/withings/nervehealthscore/TimeStampNative;I)V", "getMode", "()Lcom/withings/nervehealthscore/NeuropathyMeasureNative$SudoMode;", "getSudoMode$nervehealthscore_release", "()I", "getTimeStamp", "()Lcom/withings/nervehealthscore/TimeStampNative;", "getValue", "()F", "component1", "component2", "component3", "component4", "component4$nervehealthscore_release", "copy", "equals", "", "other", "hashCode", "toString", "", "SudoMode", "nervehealthscore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class NeuropathyMeasureNative {
    private final SudoMode mode;
    private final int sudoMode;
    private final TimeStampNative timeStamp;
    private final float value;

    /* compiled from: NeuropathyMeasureNative.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/withings/nervehealthscore/NeuropathyMeasureNative$SudoMode;", "", "mode", "", "(Ljava/lang/String;II)V", "getMode", "()I", "SUDO_MODE_ROUTINE", "SUDO_MODE_GUIDED_SCAN", "nervehealthscore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public enum SudoMode {
        SUDO_MODE_ROUTINE(0),
        SUDO_MODE_GUIDED_SCAN(1);
        
        private final int mode;

        SudoMode(int i11) {
            this.mode = i11;
        }

        public final int getMode() {
            return this.mode;
        }
    }

    private NeuropathyMeasureNative(float f11, SudoMode sudoMode, TimeStampNative timeStampNative, int i11) {
        this.value = f11;
        this.mode = sudoMode;
        this.timeStamp = timeStampNative;
        this.sudoMode = i11;
    }

    public static /* synthetic */ NeuropathyMeasureNative copy$default(NeuropathyMeasureNative neuropathyMeasureNative, float f11, SudoMode sudoMode, TimeStampNative timeStampNative, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f11 = neuropathyMeasureNative.value;
        }
        if ((i12 & 2) != 0) {
            sudoMode = neuropathyMeasureNative.mode;
        }
        if ((i12 & 4) != 0) {
            timeStampNative = neuropathyMeasureNative.timeStamp;
        }
        if ((i12 & 8) != 0) {
            i11 = neuropathyMeasureNative.sudoMode;
        }
        return neuropathyMeasureNative.copy(f11, sudoMode, timeStampNative, i11);
    }

    public final float component1() {
        return this.value;
    }

    public final SudoMode component2() {
        return this.mode;
    }

    public final TimeStampNative component3() {
        return this.timeStamp;
    }

    public final int component4$nervehealthscore_release() {
        return this.sudoMode;
    }

    public final NeuropathyMeasureNative copy(float f11, SudoMode mode, TimeStampNative timeStamp, int i11) {
        u.j(mode, "mode");
        u.j(timeStamp, "timeStamp");
        return new NeuropathyMeasureNative(f11, mode, timeStamp, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NeuropathyMeasureNative)) {
            return false;
        }
        NeuropathyMeasureNative neuropathyMeasureNative = (NeuropathyMeasureNative) obj;
        if (u.e(Float.valueOf(this.value), Float.valueOf(neuropathyMeasureNative.value)) && this.mode == neuropathyMeasureNative.mode && u.e(this.timeStamp, neuropathyMeasureNative.timeStamp) && this.sudoMode == neuropathyMeasureNative.sudoMode) {
            return true;
        }
        return false;
    }

    public final SudoMode getMode() {
        return this.mode;
    }

    public final int getSudoMode$nervehealthscore_release() {
        return this.sudoMode;
    }

    public final TimeStampNative getTimeStamp() {
        return this.timeStamp;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.mode.hashCode();
        int hashCode2 = this.timeStamp.hashCode();
        return Integer.hashCode(this.sudoMode) + ((hashCode2 + ((hashCode + (Float.hashCode(this.value) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Value: " + this.value + " | SudoMode: " + this.sudoMode + " | Date: " + this.timeStamp.toDateTime();
    }

    /* synthetic */ NeuropathyMeasureNative(float f11, SudoMode sudoMode, TimeStampNative timeStampNative, int i11, int i12, m mVar) {
        this(f11, sudoMode, timeStampNative, (i12 & 8) != 0 ? sudoMode.getMode() : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NeuropathyMeasureNative(float f11, SudoMode sudoMode, DateTime timeStamp) {
        this(f11, sudoMode, new TimeStampNative(timeStamp), sudoMode.getMode());
        u.j(sudoMode, "sudoMode");
        u.j(timeStamp, "timeStamp");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NeuropathyMeasureNative(float r2, int r3, com.withings.nervehealthscore.TimeStampNative r4) {
        /*
            r1 = this;
            java.lang.String r0 = "timeStamp"
            kotlin.jvm.internal.u.j(r4, r0)
            com.withings.nervehealthscore.NeuropathyMeasureNative$SudoMode r0 = com.withings.nervehealthscore.NeuropathyMeasureNativeKt.access$toSudoMode(r3)
            r1.<init>(r2, r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealthscore.NeuropathyMeasureNative.<init>(float, int, com.withings.nervehealthscore.TimeStampNative):void");
    }
}
