package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.SleepScoreColorHelper;
import com.withings.wiscale2.track.data.SleepScoreHelperKt;
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
final class w0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepScore f61545a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0 f61546b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(SleepScore sleepScore, k0 k0Var) {
        super(2);
        this.f61545a = sleepScore;
        this.f61546b = k0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        float f11;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Context context = (Context) aVar2.D(androidx.compose.ui.platform.u0.d());
            int i11 = 0;
            androidx.compose.ui.e b10 = androidx.compose.foundation.h.b(androidx.compose.ui.e.f8927a, false, new v0(context, this.f61546b), 7);
            SleepScore sleepScore = this.f61545a;
            if (sleepScore != null) {
                f11 = sleepScore.getSleepScoreValue();
            } else {
                f11 = 0.0f;
            }
            float maximumScore = f11 / SleepScoreHelperKt.getSleepScoreConstants().getMaximumScore();
            long b11 = d2.h0.b(androidx.core.content.a.getColor(context, SleepScoreColorHelper.INSTANCE.getSleepScoreColorRes(sleepScore)));
            if (sleepScore != null) {
                i11 = sleepScore.getSleepScoreValue();
            }
            com.withings.common.compose.component.k3.a(b10, b11, maximumScore, String.valueOf(i11), null, false, true, aVar2, 1572864, 48);
        }
        return nm0.y.f85009a;
    }
}
