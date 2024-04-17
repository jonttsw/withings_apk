package com.withings.survey.ui;

import android.content.Intent;
/* compiled from: ChooseInsightActivity.kt */
/* loaded from: classes4.dex */
final class l extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChooseInsightActivity f44374a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f44375b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ChooseInsightActivity chooseInsightActivity, k1.r0<String> r0Var) {
        super(0);
        this.f44374a = chooseInsightActivity;
        this.f44375b = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11 = InAppSurveyActivity.f44288f;
        String insightText = this.f44375b.getValue();
        ChooseInsightActivity context = this.f44374a;
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(insightText, "insightText");
        Intent putExtra = new Intent(context, InAppSurveyActivity.class).putExtra("survey_content", insightText);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        context.startActivity(putExtra);
        return nm0.y.f85009a;
    }
}
