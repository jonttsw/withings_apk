package com.withings.survey.ui;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class v0 extends kotlin.jvm.internal.w implements ym0.l<androidx.compose.animation.k<androidx.navigation.d>, androidx.compose.animation.l0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.o1<Integer> f44453a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(k1.o1<Integer> o1Var) {
        super(1);
        this.f44453a = o1Var;
    }

    @Override // ym0.l
    public final androidx.compose.animation.l0 invoke(androidx.compose.animation.k<androidx.navigation.d> kVar) {
        androidx.compose.animation.k<androidx.navigation.d> NavHost = kVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        return androidx.compose.animation.p.h(null, 0.0f, 3).c(androidx.compose.animation.p.o(m0.k.d(300, 0, null, 6), new u0(this.f44453a)));
    }
}
