package com.withings.notifications.ui;

import androidx.camera.camera2.internal.v1;
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
final class n0 extends kotlin.jvm.internal.w implements ym0.l<androidx.compose.ui.layout.s, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<k3.n> f42981a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(k1.r0<k3.n> r0Var) {
        super(1);
        this.f42981a = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.compose.ui.layout.s sVar) {
        long j5;
        long j11;
        androidx.compose.ui.layout.s parentLayoutCoordinates = sVar;
        kotlin.jvm.internal.u.j(parentLayoutCoordinates, "parentLayoutCoordinates");
        androidx.compose.ui.layout.s R = parentLayoutCoordinates.R();
        if (R != null) {
            j11 = c2.c.f21947b;
            j5 = R.o(parentLayoutCoordinates, j11);
        } else {
            j5 = c2.c.f21947b;
        }
        this.f42981a.setValue(k3.n.b(v1.b(an0.a.b(c2.c.h(j5)), an0.a.b(c2.c.i(j5)))));
        return nm0.y.f85009a;
    }
}
