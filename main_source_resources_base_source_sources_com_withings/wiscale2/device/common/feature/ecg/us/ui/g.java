package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import com.withings.wiscale2.device.common.feature.ecg.us.ui.EcgReviewActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class g extends w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgReviewActivity.c f52006a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(EcgReviewActivity.c cVar) {
        super(0);
        this.f52006a = cVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f52006a.f51995b, "device_id"));
    }
}
