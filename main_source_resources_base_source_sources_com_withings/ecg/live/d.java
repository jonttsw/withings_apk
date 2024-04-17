package com.withings.ecg.live;
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
final class d extends kotlin.jvm.internal.w implements ym0.p<Long, Long, Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f38658a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j5) {
        super(2);
        this.f38658a = j5;
    }

    @Override // ym0.p
    public final Long invoke(Long l5, Long l6) {
        long longValue = l5.longValue();
        long longValue2 = l6.longValue();
        long j5 = this.f38658a;
        return Long.valueOf(en0.r.l((long) ((1.0d - (longValue2 / (longValue / 100))) * j5), 0L, j5));
    }
}
