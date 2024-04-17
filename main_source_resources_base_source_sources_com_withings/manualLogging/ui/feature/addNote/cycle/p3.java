package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.cycletracking.core.model.CycleEntry;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTrackingSymptomsAndPeriodManualLoggingActivity.kt */
/* loaded from: classes4.dex */
public final class p3 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingSymptomsAndPeriodManualLoggingActivity f41166a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f41167b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<CycleEntry, nm0.y> f41168c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p3(CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity, String str, ym0.l<? super CycleEntry, nm0.y> lVar) {
        super(4);
        this.f41166a = cycleTrackingSymptomsAndPeriodManualLoggingActivity;
        this.f41167b = str;
        this.f41168c = lVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        o3 o3Var = new o3(this.f41166a);
        tx.h0.a(this.f41167b, o3Var, this.f41168c, null, aVar, 0, 8);
        return nm0.y.f85009a;
    }
}
