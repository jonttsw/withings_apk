package com.withings.survey.ui;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class p1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44411a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(InAppSurveyActivity inAppSurveyActivity) {
        super(0);
        this.f44411a = inAppSurveyActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        InAppSurveyActivity inAppSurveyActivity = this.f44411a;
        inAppSurveyActivity.setResult(0);
        inAppSurveyActivity.finish();
        return nm0.y.f85009a;
    }
}
