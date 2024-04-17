package com.withings.tutorials.ui.screens.explanations;
/* compiled from: ExplanationsActivity.kt */
/* loaded from: classes4.dex */
final class t extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExplanationsActivity f45251a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ExplanationsActivity explanationsActivity) {
        super(2);
        this.f45251a = explanationsActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            int i11 = e.m.f64583b;
            ExplanationsActivity explanationsActivity = this.f45251a;
            androidx.compose.runtime.j.a(e.m.b(explanationsActivity), s1.b.b(aVar2, 1722644976, new s(explanationsActivity, c11)), aVar2, 56);
        }
        return nm0.y.f85009a;
    }
}
