package com.withings.wiscale2.heart.heartrate;

import org.joda.time.DateTime;
/* compiled from: HeartRateDayActivity.kt */
/* loaded from: classes5.dex */
final class r extends kotlin.jvm.internal.w implements ym0.l<DateTime, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateDayActivity f57721a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(HeartRateDayActivity heartRateDayActivity) {
        super(1);
        this.f57721a = heartRateDayActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(DateTime dateTime) {
        DateTime dateTime2 = dateTime;
        kotlin.jvm.internal.u.g(dateTime2);
        HeartRateDayActivity.C3(this.f57721a, dateTime2);
        return nm0.y.f85009a;
    }
}
