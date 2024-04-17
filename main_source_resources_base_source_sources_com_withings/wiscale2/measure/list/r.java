package com.withings.wiscale2.measure.list;

import com.withings.wiscale2.measure.list.MeasureListActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureListActivity.f f58578a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(MeasureListActivity.f fVar) {
        super(0);
        this.f58578a = fVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f58578a.f58508b, "EXTRA_USER_ID"));
    }
}
