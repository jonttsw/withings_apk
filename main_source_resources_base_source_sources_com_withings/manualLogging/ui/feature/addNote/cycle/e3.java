package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.manualLogging.ui.feature.addNote.cycle.CycleOnBoardingManualLoggingActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class e3 extends kotlin.jvm.internal.w implements ym0.a<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity.d f40990a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(CycleOnBoardingManualLoggingActivity.d dVar) {
        super(0);
        this.f40990a = dVar;
    }

    @Override // ym0.a
    public final String invoke() {
        return com.withings.wiscale2.device.hwa08.postinstall.b0.I(this.f40990a.f40807b, FirebaseAnalytics.Param.DESTINATION);
    }
}
