package com.withings.common.compose.component;

import androidx.constraintlayout.compose.s;
/* compiled from: InfoSection.kt */
/* loaded from: classes3.dex */
final class s2 extends kotlin.jvm.internal.w implements ym0.l<androidx.constraintlayout.compose.c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.constraintlayout.compose.d f34714a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(androidx.constraintlayout.compose.d dVar) {
        super(1);
        this.f34714a = dVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.constraintlayout.compose.c cVar) {
        androidx.constraintlayout.compose.c constrain = cVar;
        kotlin.jvm.internal.u.j(constrain, "$this$constrain");
        constrain.l(s.a.a());
        androidx.constraintlayout.compose.g0.a(constrain.g(), this.f34714a.c(), yk.h.c(), 4);
        androidx.constraintlayout.compose.x.a(constrain.h(), constrain.f().e(), 0.0f, 6);
        androidx.constraintlayout.compose.g0.a(constrain.e(), constrain.f().c(), 0.0f, 6);
        return nm0.y.f85009a;
    }
}
