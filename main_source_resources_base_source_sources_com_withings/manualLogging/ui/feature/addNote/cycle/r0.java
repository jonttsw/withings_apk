package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.navigation.v;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class r0 extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.b0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f41191a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f41192b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(r8.n nVar, boolean z5) {
        super(1);
        this.f41191a = z5;
        this.f41192b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.navigation.b0 b0Var) {
        androidx.navigation.b0 navigate = b0Var;
        kotlin.jvm.internal.u.j(navigate, "$this$navigate");
        if (this.f41191a) {
            int i11 = androidx.navigation.v.f17471o;
            navigate.c(v.a.a(this.f41192b.A()).r(), q0.f41181a);
        }
        return nm0.y.f85009a;
    }
}
