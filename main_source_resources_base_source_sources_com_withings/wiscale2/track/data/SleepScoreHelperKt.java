package com.withings.wiscale2.track.data;

import com.withings.library.sleep.SleepScoreGenericConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SleepScoreHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"sleepScoreConstants", "Lcom/withings/library/sleep/SleepScoreGenericConstants;", "getSleepScoreConstants", "()Lcom/withings/library/sleep/SleepScoreGenericConstants;", "setSleepScoreConstants", "(Lcom/withings/library/sleep/SleepScoreGenericConstants;)V", "HealthMate_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SleepScoreHelperKt {
    public static SleepScoreGenericConstants sleepScoreConstants;

    public static final SleepScoreGenericConstants getSleepScoreConstants() {
        SleepScoreGenericConstants sleepScoreGenericConstants = sleepScoreConstants;
        if (sleepScoreGenericConstants != null) {
            return sleepScoreGenericConstants;
        }
        u.s("sleepScoreConstants");
        throw null;
    }

    public static final void setSleepScoreConstants(SleepScoreGenericConstants sleepScoreGenericConstants) {
        u.j(sleepScoreGenericConstants, "<set-?>");
        sleepScoreConstants = sleepScoreGenericConstants;
    }
}
