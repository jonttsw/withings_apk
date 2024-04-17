package com.withings.measure.detail.ui.screen;

import com.withings.measure.detail.ui.screen.MeasureDetailActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureDetailActivity.e f41767a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MeasureDetailActivity.e eVar) {
        super(0);
        this.f41767a = eVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f41767a.f41749b, "EXTRA_USER_ID"));
    }
}
