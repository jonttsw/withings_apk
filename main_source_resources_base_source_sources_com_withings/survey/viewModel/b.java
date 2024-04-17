package com.withings.survey.viewModel;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppSurveyViewModel.kt */
/* loaded from: classes4.dex */
public final class b extends w implements l<s50.a, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyViewModel f44536a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InAppSurveyViewModel inAppSurveyViewModel) {
        super(1);
        this.f44536a = inAppSurveyViewModel;
    }

    @Override // ym0.l
    public final Boolean invoke(s50.a aVar) {
        s50.a it = aVar;
        u.j(it, "it");
        return Boolean.valueOf(u.e(it.b(), String.valueOf(this.f44536a.f44484s.getValue())));
    }
}
