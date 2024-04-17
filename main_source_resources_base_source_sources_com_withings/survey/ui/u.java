package com.withings.survey.ui;

import com.withings.survey.viewModel.InAppSurveyViewModel;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class u extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44450a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(InAppSurveyActivity inAppSurveyActivity) {
        super(1);
        this.f44450a = inAppSurveyActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        InAppSurveyViewModel E3;
        Boolean bool2 = bool;
        bool2.booleanValue();
        E3 = this.f44450a.E3();
        E3.a1().setValue(bool2);
        return nm0.y.f85009a;
    }
}
