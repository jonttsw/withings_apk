package com.withings.survey.ui;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class x0 extends kotlin.jvm.internal.w implements ym0.l<androidx.compose.animation.k<androidx.navigation.d>, androidx.compose.animation.n0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.o1<Integer> f44459a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(k1.o1<Integer> o1Var) {
        super(1);
        this.f44459a = o1Var;
    }

    @Override // ym0.l
    public final androidx.compose.animation.n0 invoke(androidx.compose.animation.k<androidx.navigation.d> kVar) {
        androidx.compose.animation.k<androidx.navigation.d> NavHost = kVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        return androidx.compose.animation.p.i(null, 3).c(androidx.compose.animation.p.r(m0.k.d(300, 0, null, 6), new w0(this.f44459a)));
    }
}
