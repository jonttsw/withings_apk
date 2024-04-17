package com.withings.fever.ui;

import androidx.compose.runtime.a;
import com.withings.fever.core.model.FeverLevel;
import java.util.List;
import k1.o1;
import org.joda.time.DateTime;
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
final class u extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ at.a f39470a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.p0<k1.r0<Boolean>> f39471b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<List<as.h>> f39472c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(k1.r0 r0Var, at.a aVar, kotlin.jvm.internal.p0 p0Var) {
        super(3);
        this.f39470a = aVar;
        this.f39471b = p0Var;
        this.f39472c = r0Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        at.a aVar3 = this.f39470a;
        DateTime c11 = aVar3.c();
        aVar2.s(-599273518);
        boolean K = aVar2.K(c11);
        Object t11 = aVar2.t();
        k1.r0<List<as.h>> r0Var = this.f39472c;
        if (K || t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.e(new t(r0Var, aVar3, this.f39471b));
            aVar2.n(t11);
        }
        aVar2.J();
        int intValue = ((Number) ((o1) t11).getValue()).intValue();
        FeverLevel b10 = r0Var.getValue().get(intValue).b();
        FeverLevel feverLevel = FeverLevel.f39199d;
        if (b10 != feverLevel) {
            aVar2.s(-26715051);
            m.e(r0Var.getValue().get(intValue).b(), kotlin.collections.x.Z(r0Var.getValue().get(intValue).e()), aVar2, 0, 0);
            aVar2.J();
        } else {
            aVar2.s(-26714783);
            m.e(feverLevel, null, aVar2, 6, 2);
            aVar2.J();
        }
        return nm0.y.f85009a;
    }
}
