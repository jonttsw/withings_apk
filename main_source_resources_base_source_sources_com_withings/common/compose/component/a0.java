package com.withings.common.compose.component;

import androidx.constraintlayout.compose.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cells.kt */
/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.w implements ym0.l<androidx.constraintlayout.compose.o, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f33363a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f33364b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z5, boolean z11) {
        super(1);
        this.f33363a = z5;
        this.f33364b = z11;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.constraintlayout.compose.o oVar) {
        float f11;
        androidx.constraintlayout.compose.o ConstraintSet = oVar;
        kotlin.jvm.internal.u.j(ConstraintSet, "$this$ConstraintSet");
        boolean z5 = this.f33363a;
        if (z5) {
            f11 = 0.5f;
        } else {
            f11 = 1.0f;
        }
        f.b d11 = ConstraintSet.d(f11);
        androidx.constraintlayout.compose.d dVar = new androidx.constraintlayout.compose.d("middle");
        androidx.constraintlayout.compose.d dVar2 = new androidx.constraintlayout.compose.d("endPart");
        if (this.f33364b) {
            ConstraintSet.c(dVar, new w(z5, dVar2));
            if (z5) {
                ConstraintSet.c(dVar2, new x(d11));
            }
        } else {
            ConstraintSet.c(dVar, new y(z5, dVar2));
            if (z5) {
                ConstraintSet.c(dVar2, new z(dVar));
            }
        }
        return nm0.y.f85009a;
    }
}
