package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.sleep.ui.sleepscore.SecondarySleepActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SecondarySleepActivity.m f61502a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SecondarySleepActivity.m mVar) {
        super(0);
        this.f61502a = mVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f61502a.f60566b, "EXTRA_TRACK_ID"));
    }
}
