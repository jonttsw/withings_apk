package com.withings.survey.ui;

import android.content.Context;
/* compiled from: Hilt_InAppSurveyActivity.java */
/* loaded from: classes4.dex */
final class r implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_InAppSurveyActivity f44420a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Hilt_InAppSurveyActivity hilt_InAppSurveyActivity) {
        this.f44420a = hilt_InAppSurveyActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f44420a.inject();
    }
}
