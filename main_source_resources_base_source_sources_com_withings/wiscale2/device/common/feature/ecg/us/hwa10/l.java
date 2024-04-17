package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.Hwa10EcgActivationActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class l extends w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa10EcgActivationActivity.b f51813a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Hwa10EcgActivationActivity.b bVar) {
        super(0);
        this.f51813a = bVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f51813a.f51797b, "device_id"));
    }
}
