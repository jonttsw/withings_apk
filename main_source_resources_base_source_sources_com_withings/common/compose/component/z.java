package com.withings.common.compose.component;

import androidx.constraintlayout.compose.s;
/* compiled from: Cells.kt */
/* loaded from: classes3.dex */
final class z extends kotlin.jvm.internal.w implements ym0.l<androidx.constraintlayout.compose.c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.constraintlayout.compose.d f34979a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.constraintlayout.compose.d dVar) {
        super(1);
        this.f34979a = dVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.constraintlayout.compose.c cVar) {
        androidx.constraintlayout.compose.c constrain = cVar;
        kotlin.jvm.internal.u.j(constrain, "$this$constrain");
        androidx.constraintlayout.compose.c.a(constrain, constrain.f());
        androidx.constraintlayout.compose.c.i(constrain, this.f34979a.b(), constrain.f().b(), yk.h.b(), 0.0f, 120);
        constrain.l(s.a.a());
        return nm0.y.f85009a;
    }
}
