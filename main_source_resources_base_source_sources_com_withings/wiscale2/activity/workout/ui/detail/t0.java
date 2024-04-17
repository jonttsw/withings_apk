package com.withings.wiscale2.activity.workout.ui.detail;

import com.rudderstack.android.sdk.core.MessageType;
import com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class t0 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity.d f49643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ListGpsPointActivity.d dVar) {
        super(0);
        this.f49643a = dVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f49643a.f49058b, MessageType.TRACK));
    }
}
