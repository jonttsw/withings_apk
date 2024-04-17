package com.withings.wiscale2.vascularage;

import com.withings.periodsbar.Period;
import org.joda.time.DateTime;
/* compiled from: VascularAgeActivityV1.kt */
/* loaded from: classes5.dex */
final class q extends kotlin.jvm.internal.w implements ym0.l<nm0.o<? extends Period, ? extends DateTime, ? extends DateTime>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VascularAgeActivityV1 f62437a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(VascularAgeActivityV1 vascularAgeActivityV1) {
        super(1);
        this.f62437a = vascularAgeActivityV1;
    }

    @Override // ym0.l
    public final nm0.y invoke(nm0.o<? extends Period, ? extends DateTime, ? extends DateTime> oVar) {
        nm0.o<? extends Period, ? extends DateTime, ? extends DateTime> oVar2 = oVar;
        Period a11 = oVar2.a();
        DateTime c11 = oVar2.c();
        kotlin.jvm.internal.u.g(a11);
        kotlin.jvm.internal.u.g(c11);
        VascularAgeActivityV1 vascularAgeActivityV1 = this.f62437a;
        VascularAgeActivityV1.F3(vascularAgeActivityV1, a11, oVar2.b(), c11);
        VascularAgeActivityV1.G3(vascularAgeActivityV1, a11);
        return nm0.y.f85009a;
    }
}
