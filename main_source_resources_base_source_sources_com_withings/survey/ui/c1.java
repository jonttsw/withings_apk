package com.withings.survey.ui;

import com.withings.survey.viewModel.InAppSurveyViewModel;
import java.util.List;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class c1 extends kotlin.jvm.internal.w implements ym0.l<List<? extends z50.a>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44302a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(InAppSurveyActivity inAppSurveyActivity) {
        super(1);
        this.f44302a = inAppSurveyActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ym0.l
    public final nm0.y invoke(List<? extends z50.a> list) {
        InAppSurveyViewModel E3;
        List<? extends z50.a> it = list;
        kotlin.jvm.internal.u.j(it, "it");
        E3 = this.f44302a.E3();
        E3.e1(it);
        return nm0.y.f85009a;
    }
}
