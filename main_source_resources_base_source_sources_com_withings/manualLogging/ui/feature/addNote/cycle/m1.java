package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.material3.j5;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class m1 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f41104a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41105b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ u0 f41106c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(int i11, ym0.a<nm0.y> aVar, u0 u0Var) {
        super(4);
        this.f41104a = i11;
        this.f41105b = aVar;
        this.f41106c = u0Var;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        ym0.a<nm0.y> p11 = this.f41106c.p();
        q4.a(this.f41104a, 0, aVar, this.f41105b, p11);
        return nm0.y.f85009a;
    }
}
