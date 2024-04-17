package com.withings.survey.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
public final class h0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44340a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f44341b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(InAppSurveyActivity inAppSurveyActivity, int i11) {
        super(2);
        this.f44340a = inAppSurveyActivity;
        this.f44341b = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f44341b | 1);
        InAppSurveyActivity.B3(this.f44340a, aVar, g11);
        return nm0.y.f85009a;
    }
}
