package com.withings.wiscale2.spo2;

import com.withings.periodsbar.Period;
import org.joda.time.DateTime;
/* compiled from: Spo2Activity.kt */
/* loaded from: classes5.dex */
final class q extends kotlin.jvm.internal.w implements ym0.l<nm0.o<? extends Period, ? extends DateTime, ? extends DateTime>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Spo2Activity f61688a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Spo2Activity spo2Activity) {
        super(1);
        this.f61688a = spo2Activity;
    }

    @Override // ym0.l
    public final nm0.y invoke(nm0.o<? extends Period, ? extends DateTime, ? extends DateTime> oVar) {
        nm0.o<? extends Period, ? extends DateTime, ? extends DateTime> oVar2 = oVar;
        Period a11 = oVar2.a();
        DateTime c11 = oVar2.c();
        kotlin.jvm.internal.u.g(a11);
        kotlin.jvm.internal.u.g(c11);
        Spo2Activity spo2Activity = this.f61688a;
        Spo2Activity.F3(spo2Activity, a11, oVar2.b(), c11);
        Spo2Activity.C3(spo2Activity).setValue(a11);
        return nm0.y.f85009a;
    }
}
