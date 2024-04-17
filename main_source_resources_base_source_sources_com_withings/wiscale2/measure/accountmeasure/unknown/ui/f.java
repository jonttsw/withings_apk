package com.withings.wiscale2.measure.accountmeasure.unknown.ui;

import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.measure.accountmeasure.unknown.ui.UnknownMeasuresActivity;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class f extends w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UnknownMeasuresActivity.d f58350a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(UnknownMeasuresActivity.d dVar) {
        super(0);
        this.f58350a = dVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(b0.D(this.f58350a.f58335b, "measure_type"));
    }
}
