package com.withings.survey.ui;
/* compiled from: ChooseInsightActivity.kt */
/* loaded from: classes4.dex */
final class o extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChooseInsightActivity f44397a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f44398b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r8.n nVar, ChooseInsightActivity chooseInsightActivity) {
        super(1);
        this.f44397a = chooseInsightActivity;
        this.f44398b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        r8.n nVar = this.f44398b;
        ChooseInsightActivity chooseInsightActivity = this.f44397a;
        androidx.navigation.compose.n.b(NavHost, "selectionScreen", null, null, null, null, null, null, new s1.a(true, 466582924, new g(nVar, chooseInsightActivity)), 126);
        androidx.navigation.compose.n.b(NavHost, "manualInsight", null, null, null, null, null, null, new s1.a(true, 768084355, new n(nVar, chooseInsightActivity)), 126);
        return nm0.y.f85009a;
    }
}
