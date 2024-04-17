package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.manualLogging.ui.feature.addNote.cycle.CycleTrackingSymptomsAndPeriodManualLoggingActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class f4 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingSymptomsAndPeriodManualLoggingActivity.d f40995a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(CycleTrackingSymptomsAndPeriodManualLoggingActivity.d dVar) {
        super(0);
        this.f40995a = dVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f40995a.f40822b, "date"));
    }
}
