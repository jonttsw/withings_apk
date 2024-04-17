package com.withings.wiscale2.heart;

import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.heart.HeartHistoryActivity;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class m extends w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartHistoryActivity.l f57782a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(HeartHistoryActivity.l lVar) {
        super(0);
        this.f57782a = lVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(b0.D(this.f57782a.f57059b, "measure_type"));
    }
}
