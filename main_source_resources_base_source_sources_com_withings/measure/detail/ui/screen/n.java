package com.withings.measure.detail.ui.screen;

import org.joda.time.DateTime;
/* compiled from: MeasureDetailActivity.kt */
/* loaded from: classes4.dex */
final class n extends kotlin.jvm.internal.w implements ym0.l<DateTime, Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureDetailActivity f41771a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(MeasureDetailActivity measureDetailActivity) {
        super(1);
        this.f41771a = measureDetailActivity;
    }

    @Override // ym0.l
    public final Integer invoke(DateTime dateTime) {
        ry.l lVar;
        DateTime selectedDate = dateTime;
        kotlin.jvm.internal.u.j(selectedDate, "selectedDate");
        lVar = this.f41771a.f41742l;
        if (lVar != null) {
            return Integer.valueOf(lVar.getPosition(selectedDate));
        }
        kotlin.jvm.internal.u.s("monthAdapter");
        throw null;
    }
}
