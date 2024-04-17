package com.withings.nervehealth.ui;

import android.content.Context;
import com.withings.survey.ui.InAppSurveyActivity;
/* compiled from: NerveHealthActivity.kt */
/* loaded from: classes4.dex */
final class r extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42767a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NerveHealthActivity f42768b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f42769c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, NerveHealthActivity nerveHealthActivity, Context context) {
        super(0);
        this.f42767a = str;
        this.f42768b = nerveHealthActivity;
        this.f42769c = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.activity.result.b bVar;
        String str = this.f42767a;
        if (str != null) {
            NerveHealthActivity nerveHealthActivity = this.f42768b;
            bVar = nerveHealthActivity.f42368q;
            int i11 = InAppSurveyActivity.f44288f;
            bVar.a(InAppSurveyActivity.a.a(this.f42769c, str, NerveHealthActivity.H3(nerveHealthActivity)));
        }
        return nm0.y.f85009a;
    }
}
