package com.withings.wiscale2.heart.heartrate.events;

import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.heart.heartrate.events.HeartRateEventsActivity;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class d extends w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateEventsActivity.d f57641a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HeartRateEventsActivity.d dVar) {
        super(0);
        this.f57641a = dVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(b0.D(this.f57641a.f57634b, "EXTRA_HR_EVENTS_LEVEL"));
    }
}
