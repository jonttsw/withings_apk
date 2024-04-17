package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.material3.j5;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class d1 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f40974a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u0 f40975b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ym0.a<nm0.y> aVar, u0 u0Var) {
        super(4);
        this.f40974a = aVar;
        this.f40975b = u0Var;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        u0 u0Var = this.f40975b;
        ym0.a<nm0.y> g11 = u0Var.g();
        ym0.a<nm0.y> j5 = u0Var.j();
        i4.a(this.f40974a, g11, j5, aVar, 0);
        return nm0.y.f85009a;
    }
}
