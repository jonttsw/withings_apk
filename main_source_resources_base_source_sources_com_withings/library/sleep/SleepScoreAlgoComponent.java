package com.withings.library.sleep;

import androidx.camera.camera2.internal.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: SleepLib.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/withings/library/sleep/SleepScoreAlgoComponent;", "", FirebaseAnalytics.Param.SCORE, "", "status", "", "(FI)V", "getScore", "()F", "setScore", "(F)V", "getStatus", "()I", "setStatus", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sleep-lib_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class SleepScoreAlgoComponent {
    private float score;
    private int status;

    public SleepScoreAlgoComponent() {
        this(0.0f, 0, 3, null);
    }

    public static /* synthetic */ SleepScoreAlgoComponent copy$default(SleepScoreAlgoComponent sleepScoreAlgoComponent, float f11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f11 = sleepScoreAlgoComponent.score;
        }
        if ((i12 & 2) != 0) {
            i11 = sleepScoreAlgoComponent.status;
        }
        return sleepScoreAlgoComponent.copy(f11, i11);
    }

    public final float component1() {
        return this.score;
    }

    public final int component2() {
        return this.status;
    }

    public final SleepScoreAlgoComponent copy(float f11, int i11) {
        return new SleepScoreAlgoComponent(f11, i11);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SleepScoreAlgoComponent) {
                SleepScoreAlgoComponent sleepScoreAlgoComponent = (SleepScoreAlgoComponent) obj;
                if (Float.compare(this.score, sleepScoreAlgoComponent.score) != 0 || this.status != sleepScoreAlgoComponent.status) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final float getScore() {
        return this.score;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Integer.hashCode(this.status) + (Float.hashCode(this.score) * 31);
    }

    public final void setScore(float f11) {
        this.score = f11;
    }

    public final void setStatus(int i11) {
        this.status = i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SleepScoreAlgoComponent(score=");
        sb2.append(this.score);
        sb2.append(", status=");
        return e.c(sb2, this.status, ")");
    }

    public SleepScoreAlgoComponent(float f11, int i11) {
        this.score = f11;
        this.status = i11;
    }

    public /* synthetic */ SleepScoreAlgoComponent(float f11, int i11, int i12, m mVar) {
        this((i12 & 1) != 0 ? 0.0f : f11, (i12 & 2) != 0 ? 0 : i11);
    }
}
