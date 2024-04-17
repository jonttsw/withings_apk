package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.manualLogging.core.entity.cycle.CycleRegularity;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class x extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g3 f41393a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<CycleRegularity, nm0.y> f41394b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(g3 g3Var, ym0.l<? super CycleRegularity, nm0.y> lVar) {
        super(2);
        this.f41393a = g3Var;
        this.f41394b = lVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Comparator] */
    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            CycleRegularity.f40681a.getClass();
            List D0 = kotlin.collections.x.D0(CycleRegularity.a(), new Object());
            aVar2.s(-1716609040);
            List<CycleRegularity> list = D0;
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
            for (CycleRegularity cycleRegularity : list) {
                int indexOf = D0.indexOf(cycleRegularity);
                kotlin.jvm.internal.u.j(cycleRegularity, "<this>");
                int ordinal = cycleRegularity.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        i11 = C1987R.string._YES_;
                    } else {
                        i11 = C1987R.string.cycle_tracking_onboarding_regular_Idontknow;
                    }
                } else {
                    i11 = C1987R.string._NO_;
                }
                arrayList.add(new com.withings.common.compose.component.e0(ay.b.u(i11, aVar2), null, indexOf, null, null, 26));
            }
            aVar2.J();
            com.withings.common.compose.component.d3.a(null, arrayList, Integer.valueOf(D0.indexOf(this.f41393a.d())), false, 0L, null, new w(D0, this.f41394b), aVar2, 64, 57);
        }
        return nm0.y.f85009a;
    }
}
