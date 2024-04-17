package com.withings.common.compose.component;

import androidx.constraintlayout.compose.f;
import androidx.constraintlayout.compose.s;
/* compiled from: Cells.kt */
/* loaded from: classes3.dex */
final class y extends kotlin.jvm.internal.w implements ym0.l<androidx.constraintlayout.compose.c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f34929a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.constraintlayout.compose.d f34930b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z5, androidx.constraintlayout.compose.d dVar) {
        super(1);
        this.f34929a = z5;
        this.f34930b = dVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.constraintlayout.compose.c cVar) {
        f.a b10;
        androidx.constraintlayout.compose.c constrain = cVar;
        kotlin.jvm.internal.u.j(constrain, "$this$constrain");
        androidx.constraintlayout.compose.c.a(constrain, constrain.f());
        f.a e11 = constrain.f().e();
        if (this.f34929a) {
            b10 = this.f34930b.e();
        } else {
            b10 = constrain.f().b();
        }
        androidx.constraintlayout.compose.c.i(constrain, e11, b10, 0.0f, 0.0f, 124);
        constrain.l(s.a.a());
        return nm0.y.f85009a;
    }
}
