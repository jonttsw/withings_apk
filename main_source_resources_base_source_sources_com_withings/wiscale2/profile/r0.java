package com.withings.wiscale2.profile;

import androidx.compose.ui.platform.ComposeView;
import com.withings.wiscale2.profile.h;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class r0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59461a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ComposeView f59462b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(q qVar, ComposeView composeView) {
        super(2);
        this.f59461a = qVar;
        this.f59462b = composeView;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        y0 y0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            q qVar = this.f59461a;
            y0Var = qVar.f59424h;
            h.a aVar3 = null;
            if (y0Var != null) {
                T value = h6.b.c(y0Var.t0(), aVar2).getValue();
                if (value instanceof h.a) {
                    aVar3 = (h.a) value;
                }
                if (aVar3 != null) {
                    yk.o.b(false, s1.b.b(aVar2, -1595650094, new q0(aVar3, qVar, this.f59462b)), aVar2, 48, 1);
                }
            } else {
                kotlin.jvm.internal.u.s("profileViewModel");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
