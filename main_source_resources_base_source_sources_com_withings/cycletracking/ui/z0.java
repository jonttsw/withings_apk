package com.withings.cycletracking.ui;

import androidx.compose.runtime.a;
import com.withings.common.compose.component.m4;
import com.withings.cycletracking.ui.e2;
import com.withings.wiscale2.C1987R;
import dn.b;
import org.joda.time.DateTime;
/* compiled from: CycleTrackingDatavizScreen.kt */
/* loaded from: classes3.dex */
final class z0 extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ at.a f36094a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e2.c f36095b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(e2.c cVar, at.a aVar) {
        super(3);
        this.f36094a = aVar;
        this.f36095b = cVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        e2.a.b bVar;
        int i11;
        String str;
        Integer e11;
        int i12;
        l0.i AnimatedVisibility = iVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        at.a aVar3 = this.f36094a;
        DateTime c11 = aVar3.c();
        aVar2.s(1208248074);
        boolean K = aVar2.K(c11);
        Object t11 = aVar2.t();
        e2.c cVar = this.f36095b;
        if (K || t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.e(new y0(cVar, aVar3));
            aVar2.n(t11);
        }
        k1.o1 o1Var = (k1.o1) t11;
        aVar2.J();
        e2.a a11 = cVar.d().a();
        nm0.y yVar = null;
        if (a11 instanceof e2.a.b) {
            bVar = (e2.a.b) a11;
        } else {
            bVar = null;
        }
        aVar2.s(1208248361);
        if (bVar != null) {
            if (bVar.a()) {
                i12 = C1987R.string.cycleTracking_cycleLogs_period;
            } else {
                i12 = C1987R.string.cycleTracking_phase_noPeriod_title;
            }
            bn.l.a(6, aVar2, ay.b.u(i12, aVar2), false);
            yVar = nm0.y.f85009a;
        }
        aVar2.J();
        if (yVar == null) {
            b.InterfaceC0847b interfaceC0847b = (b.InterfaceC0847b) o1Var.getValue();
            if (interfaceC0847b != null && (e11 = interfaceC0847b.e()) != null) {
                i11 = e11.intValue();
            } else {
                i11 = C1987R.string.dataviz_filter_placeholder;
            }
            m4 m4Var = new m4(ay.b.u(i11, aVar2), null, null, null, 14);
            b.InterfaceC0847b interfaceC0847b2 = (b.InterfaceC0847b) o1Var.getValue();
            if (interfaceC0847b2 != null) {
                str = interfaceC0847b2.h();
            } else {
                str = "--";
            }
            bn.l.b(false, m4Var, new m4(str, null, null, null, 14), aVar2, 6);
        }
        return nm0.y.f85009a;
    }
}
