package com.withings.survey.ui;

import com.withings.survey.ui.InAppSurveyActivity;
/* compiled from: ChooseInsightActivity.kt */
/* loaded from: classes4.dex */
final class e extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChooseInsightActivity f44310a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ChooseInsightActivity chooseInsightActivity) {
        super(0);
        this.f44310a = chooseInsightActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11 = InAppSurveyActivity.f44288f;
        long q11 = m70.i.b().e().q();
        ChooseInsightActivity chooseInsightActivity = this.f44310a;
        chooseInsightActivity.startActivity(InAppSurveyActivity.a.a(chooseInsightActivity, "4710", q11));
        return nm0.y.f85009a;
    }
}
