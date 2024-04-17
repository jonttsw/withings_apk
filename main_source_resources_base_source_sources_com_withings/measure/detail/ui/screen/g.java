package com.withings.measure.detail.ui.screen;

import nm0.y;
import org.joda.time.DateTime;
/* compiled from: MeasureDetailActivity.kt */
/* loaded from: classes4.dex */
final class g extends kotlin.jvm.internal.w implements ym0.l<DateTime, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureDetailActivity f41764a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MeasureDetailActivity measureDetailActivity) {
        super(1);
        this.f41764a = measureDetailActivity;
    }

    @Override // ym0.l
    public final y invoke(DateTime dateTime) {
        DateTime dateTime2 = dateTime;
        kotlin.jvm.internal.u.g(dateTime2);
        MeasureDetailActivity.I3(this.f41764a, dateTime2);
        return y.f85009a;
    }
}
