package com.withings.survey.ui;

import com.withings.survey.viewModel.InAppSurveyViewModel;
import java.util.Locale;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class g1 extends kotlin.jvm.internal.w implements ym0.l<Locale, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44337a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f44338b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(InAppSurveyActivity inAppSurveyActivity, r8.n nVar) {
        super(1);
        this.f44337a = inAppSurveyActivity;
        this.f44338b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Locale locale) {
        InAppSurveyViewModel E3;
        Locale selectedLocale = locale;
        kotlin.jvm.internal.u.j(selectedLocale, "selectedLocale");
        E3 = this.f44337a.E3();
        E3.T0().setValue(selectedLocale);
        this.f44338b.N();
        return nm0.y.f85009a;
    }
}
