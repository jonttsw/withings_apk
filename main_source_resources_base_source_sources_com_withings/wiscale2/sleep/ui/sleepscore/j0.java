package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepAverageHRSectionView;
import com.withings.wiscale2.track.data.SleepStat;
/* compiled from: SleepAverageHRSectionView.kt */
/* loaded from: classes5.dex */
final class j0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepStat f61023a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SleepAverageHRSectionView.a f61024b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(SleepStat sleepStat, SleepAverageHRSectionView.a aVar) {
        super(2);
        this.f61023a = sleepStat;
        this.f61024b = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.o.g(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), null, s1.b.b(aVar2, 1339680816, new h0(this.f61023a)), ay.b.u(C1987R.string.sleepScoreDetail_averageHR_title, aVar2), null, false, false, false, null, null, new i0(this.f61024b), aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 0, 1010);
        }
        return nm0.y.f85009a;
    }
}
