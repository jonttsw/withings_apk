package com.withings.common.compose.component;

import androidx.constraintlayout.compose.f;
/* compiled from: Cells.kt */
/* loaded from: classes3.dex */
final class x extends kotlin.jvm.internal.w implements ym0.l<androidx.constraintlayout.compose.c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f.b f34911a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f.b bVar) {
        super(1);
        this.f34911a = bVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.constraintlayout.compose.c cVar) {
        androidx.constraintlayout.compose.c constrain = cVar;
        kotlin.jvm.internal.u.j(constrain, "$this$constrain");
        androidx.constraintlayout.compose.c.j(constrain, this.f34911a, constrain.f().c(), 1.0f, 60);
        androidx.constraintlayout.compose.c.b(constrain, constrain.f());
        constrain.l(new androidx.constraintlayout.compose.t("preferWrap"));
        return nm0.y.f85009a;
    }
}
