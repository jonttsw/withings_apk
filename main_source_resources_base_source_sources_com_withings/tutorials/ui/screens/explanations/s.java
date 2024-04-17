package com.withings.tutorials.ui.screens.explanations;

import com.withings.tutorials.core.model.ExplanationsType;
/* compiled from: ExplanationsActivity.kt */
/* loaded from: classes4.dex */
final class s extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExplanationsActivity f45244a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f45245b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ExplanationsActivity explanationsActivity, r8.n nVar) {
        super(2);
        this.f45244a = explanationsActivity;
        this.f45245b = nVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        ym0.a aVar2;
        androidx.compose.runtime.a aVar3 = aVar;
        if ((num.intValue() & 11) == 2 && aVar3.h()) {
            aVar3.C();
        } else {
            ExplanationsActivity explanationsActivity = this.f45244a;
            e.j.a(0, 1, aVar3, new o(explanationsActivity), false);
            ExplanationsType z32 = ExplanationsActivity.z3(explanationsActivity);
            if (ExplanationsActivity.A3(explanationsActivity)) {
                aVar2 = new p(explanationsActivity);
            } else {
                aVar2 = q.f45232a;
            }
            ym0.a aVar4 = aVar2;
            n.a(z32, this.f45245b, aVar4, new r(explanationsActivity), aVar3, 64);
        }
        return nm0.y.f85009a;
    }
}
