package com.withings.common.compose.component;

import androidx.constraintlayout.compose.f;
import androidx.constraintlayout.compose.s;
/* compiled from: Cells.kt */
/* loaded from: classes3.dex */
final class w extends kotlin.jvm.internal.w implements ym0.l<androidx.constraintlayout.compose.c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f34887a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.constraintlayout.compose.d f34888b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z5, androidx.constraintlayout.compose.d dVar) {
        super(1);
        this.f34887a = z5;
        this.f34888b = dVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.constraintlayout.compose.c cVar) {
        f.b c11;
        androidx.constraintlayout.compose.c constrain = cVar;
        kotlin.jvm.internal.u.j(constrain, "$this$constrain");
        f.b d11 = constrain.f().d();
        if (this.f34887a) {
            c11 = this.f34888b.d();
        } else {
            c11 = constrain.f().c();
        }
        androidx.constraintlayout.compose.c.j(constrain, d11, c11, 0.0f, 60);
        androidx.constraintlayout.compose.c.b(constrain, constrain.f());
        constrain.l(s.a.a());
        return nm0.y.f85009a;
    }
}
