package com.withings.ecg.details;

import com.withings.ecg.details.EcgResultActivity;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class k2 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgResultActivity.e f38253a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(EcgResultActivity.e eVar) {
        super(0);
        this.f38253a = eVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f38253a.f38037b, "ecgId"));
    }
}
