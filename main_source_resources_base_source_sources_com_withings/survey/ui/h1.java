package com.withings.survey.ui;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class h1 extends kotlin.jvm.internal.w implements ym0.r<r0.h, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44342a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f44343b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(InAppSurveyActivity inAppSurveyActivity, r8.n nVar) {
        super(4);
        this.f44342a = inAppSurveyActivity;
        this.f44343b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(r0.h hVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h bottomSheet = hVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(bottomSheet, "$this$bottomSheet");
        kotlin.jvm.internal.u.j(it, "it");
        c60.s.a(null, new g1(this.f44342a, this.f44343b), aVar, 0, 1);
        return nm0.y.f85009a;
    }
}
