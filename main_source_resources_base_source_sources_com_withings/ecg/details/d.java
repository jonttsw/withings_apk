package com.withings.ecg.details;

import com.withings.ecg.details.EcgDebugScreenActivity;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgDebugScreenActivity.d f38169a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EcgDebugScreenActivity.d dVar) {
        super(0);
        this.f38169a = dVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f38169a.f37997b, "ecg_id"));
    }
}
