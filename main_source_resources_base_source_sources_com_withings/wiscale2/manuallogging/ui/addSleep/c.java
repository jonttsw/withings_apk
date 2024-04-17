package com.withings.wiscale2.manuallogging.ui.addSleep;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: AddLogSleepScreen.kt */
/* loaded from: classes5.dex */
final class c extends w implements p<Long, Long, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<Long, Long, y> f58062a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p<? super Long, ? super Long, y> pVar) {
        super(2);
        this.f58062a = pVar;
    }

    @Override // ym0.p
    public final y invoke(Long l5, Long l6) {
        long longValue = l5.longValue();
        long longValue2 = l6.longValue();
        this.f58062a.invoke(Long.valueOf(longValue), Long.valueOf(longValue2));
        return y.f85009a;
    }
}
