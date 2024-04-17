package com.withings.wiscale2.heart.afib;

import com.withings.wiscale2.heart.afib.AFibMeasuresListActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AFibMeasuresListActivity.g f57233a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AFibMeasuresListActivity.g gVar) {
        super(0);
        this.f57233a = gVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f57233a.f57105b, "extra_date_start"));
    }
}
