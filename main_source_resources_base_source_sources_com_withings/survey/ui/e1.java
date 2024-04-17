package com.withings.survey.ui;

import com.withings.survey.viewModel.InAppSurveyViewModel;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class e1 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44317a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f44318b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(InAppSurveyActivity inAppSurveyActivity, r8.n nVar) {
        super(1);
        this.f44317a = inAppSurveyActivity;
        this.f44318b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        InAppSurveyViewModel E3;
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        E3 = this.f44317a.E3();
        E3.e1(kotlin.collections.x.V(new z50.a(1, it)));
        this.f44318b.N();
        return nm0.y.f85009a;
    }
}
