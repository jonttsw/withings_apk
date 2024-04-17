package com.withings.ecg.details;

import com.withings.ecg.details.WaitingSignalResultActivity;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class w2 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WaitingSignalResultActivity.e f38352a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(WaitingSignalResultActivity.e eVar) {
        super(0);
        this.f38352a = eVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f38352a.f38085b, "extra_user_id"));
    }
}
