package com.withings.library.sleep;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SleepLib.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u00106\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0007\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\t\u0010\u001bR\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b\n\u0010\u001bR\"\u0010 \u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\u000b\u0010\u001bR\"\u0010\"\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001a\"\u0004\b\f\u0010\u001bR\"\u0010$\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001a\"\u0004\b\r\u0010\u001bR\"\u0010&\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001a\"\u0004\b\u000e\u0010\u001bR\"\u0010(\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001a\"\u0004\b\u000f\u0010\u001bR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010+\u001a\u0004\b3\u0010-\"\u0004\b4\u00105R\"\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-\"\u0004\b8\u00105¨\u0006;"}, d2 = {"Lcom/withings/library/sleep/SleepScoreStruct;", "", "", FirebaseAnalytics.Param.SCORE, "", "status", "Lnm0/y;", "setSleepDuration", "(FI)V", "setRecovery", "setSleepInterruptions", "setRegularity", "setTimeToWakeUp", "setTimeToFallAsleep", "setNightHeartRate", "setSnoring", "", "toString", "()Ljava/lang/String;", "Lcom/withings/library/sleep/SleepScoreAlgoComponent;", "sleepScoreAlgoComponent", "setComponent", "(Lcom/withings/library/sleep/SleepScoreAlgoComponent;FI)V", "sleepDuration", "Lcom/withings/library/sleep/SleepScoreAlgoComponent;", "getSleepDuration", "()Lcom/withings/library/sleep/SleepScoreAlgoComponent;", "(Lcom/withings/library/sleep/SleepScoreAlgoComponent;)V", "recovery", "getRecovery", "sleepInterruptions", "getSleepInterruptions", "regularity", "getRegularity", "timeToWakeUp", "getTimeToWakeUp", "timeToFallAsleep", "getTimeToFallAsleep", "nightHeartRate", "getNightHeartRate", "snoring", "getSnoring", "errorCode", "I", "getErrorCode", "()I", "F", "getScore", "()F", "setScore", "(F)V", "getStatus", "setStatus", "(I)V", "version", "getVersion", "setVersion", "<init>", "(IFII)V", "sleep-lib_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class SleepScoreStruct {
    private final int errorCode;
    private float score;
    private int status;
    private int version;
    private SleepScoreAlgoComponent sleepDuration = new SleepScoreAlgoComponent(0.0f, 0, 3, null);
    private SleepScoreAlgoComponent recovery = new SleepScoreAlgoComponent(0.0f, 0, 3, null);
    private SleepScoreAlgoComponent sleepInterruptions = new SleepScoreAlgoComponent(0.0f, 0, 3, null);
    private SleepScoreAlgoComponent regularity = new SleepScoreAlgoComponent(0.0f, 0, 3, null);
    private SleepScoreAlgoComponent timeToWakeUp = new SleepScoreAlgoComponent(0.0f, 0, 3, null);
    private SleepScoreAlgoComponent timeToFallAsleep = new SleepScoreAlgoComponent(0.0f, 0, 3, null);
    private SleepScoreAlgoComponent nightHeartRate = new SleepScoreAlgoComponent(0.0f, 0, 3, null);
    private SleepScoreAlgoComponent snoring = new SleepScoreAlgoComponent(0.0f, 0, 3, null);

    public SleepScoreStruct(int i11, float f11, int i12, int i13) {
        this.errorCode = i11;
        this.score = f11;
        this.status = i12;
        this.version = i13;
    }

    private final void setComponent(SleepScoreAlgoComponent sleepScoreAlgoComponent, float f11, int i11) {
        sleepScoreAlgoComponent.setScore(f11);
        sleepScoreAlgoComponent.setStatus(i11);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final SleepScoreAlgoComponent getNightHeartRate() {
        return this.nightHeartRate;
    }

    public final SleepScoreAlgoComponent getRecovery() {
        return this.recovery;
    }

    public final SleepScoreAlgoComponent getRegularity() {
        return this.regularity;
    }

    public final float getScore() {
        return this.score;
    }

    public final SleepScoreAlgoComponent getSleepDuration() {
        return this.sleepDuration;
    }

    public final SleepScoreAlgoComponent getSleepInterruptions() {
        return this.sleepInterruptions;
    }

    public final SleepScoreAlgoComponent getSnoring() {
        return this.snoring;
    }

    public final int getStatus() {
        return this.status;
    }

    public final SleepScoreAlgoComponent getTimeToFallAsleep() {
        return this.timeToFallAsleep;
    }

    public final SleepScoreAlgoComponent getTimeToWakeUp() {
        return this.timeToWakeUp;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setNightHeartRate(SleepScoreAlgoComponent sleepScoreAlgoComponent) {
        u.j(sleepScoreAlgoComponent, "<set-?>");
        this.nightHeartRate = sleepScoreAlgoComponent;
    }

    public final void setRecovery(SleepScoreAlgoComponent sleepScoreAlgoComponent) {
        u.j(sleepScoreAlgoComponent, "<set-?>");
        this.recovery = sleepScoreAlgoComponent;
    }

    public final void setRegularity(SleepScoreAlgoComponent sleepScoreAlgoComponent) {
        u.j(sleepScoreAlgoComponent, "<set-?>");
        this.regularity = sleepScoreAlgoComponent;
    }

    public final void setScore(float f11) {
        this.score = f11;
    }

    public final void setSleepDuration(SleepScoreAlgoComponent sleepScoreAlgoComponent) {
        u.j(sleepScoreAlgoComponent, "<set-?>");
        this.sleepDuration = sleepScoreAlgoComponent;
    }

    public final void setSleepInterruptions(SleepScoreAlgoComponent sleepScoreAlgoComponent) {
        u.j(sleepScoreAlgoComponent, "<set-?>");
        this.sleepInterruptions = sleepScoreAlgoComponent;
    }

    public final void setSnoring(SleepScoreAlgoComponent sleepScoreAlgoComponent) {
        u.j(sleepScoreAlgoComponent, "<set-?>");
        this.snoring = sleepScoreAlgoComponent;
    }

    public final void setStatus(int i11) {
        this.status = i11;
    }

    public final void setTimeToFallAsleep(SleepScoreAlgoComponent sleepScoreAlgoComponent) {
        u.j(sleepScoreAlgoComponent, "<set-?>");
        this.timeToFallAsleep = sleepScoreAlgoComponent;
    }

    public final void setTimeToWakeUp(SleepScoreAlgoComponent sleepScoreAlgoComponent) {
        u.j(sleepScoreAlgoComponent, "<set-?>");
        this.timeToWakeUp = sleepScoreAlgoComponent;
    }

    public final void setVersion(int i11) {
        this.version = i11;
    }

    public String toString() {
        return "SleepScoreStruct(errorCode=" + this.errorCode + ", score=" + this.score + ", status=" + this.status + ", version=" + this.version + ", sleepDuration=" + this.sleepDuration + ", recovery=" + this.recovery + ", sleepInterruptions=" + this.sleepInterruptions + ", regularity=" + this.regularity + ", timeToWakeUp=" + this.timeToWakeUp + ", timeToFallAsleep=" + this.timeToFallAsleep + ", nightHeartRate=" + this.nightHeartRate + ", snoring=" + this.snoring + ')';
    }

    public final void setNightHeartRate(float f11, int i11) {
        setComponent(this.nightHeartRate, f11, i11);
    }

    public final void setRecovery(float f11, int i11) {
        setComponent(this.recovery, f11, i11);
    }

    public final void setRegularity(float f11, int i11) {
        setComponent(this.regularity, f11, i11);
    }

    public final void setSleepDuration(float f11, int i11) {
        setComponent(this.sleepDuration, f11, i11);
    }

    public final void setSleepInterruptions(float f11, int i11) {
        setComponent(this.sleepInterruptions, f11, i11);
    }

    public final void setSnoring(float f11, int i11) {
        setComponent(this.snoring, f11, i11);
    }

    public final void setTimeToFallAsleep(float f11, int i11) {
        setComponent(this.timeToFallAsleep, f11, i11);
    }

    public final void setTimeToWakeUp(float f11, int i11) {
        setComponent(this.timeToWakeUp, f11, i11);
    }
}
