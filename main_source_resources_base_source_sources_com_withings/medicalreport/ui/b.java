package com.withings.medicalreport.ui;

import org.joda.time.DateTime;
/* compiled from: DateSelectionFragment.kt */
/* loaded from: classes4.dex */
final class b extends kotlin.jvm.internal.w implements ym0.l<Long, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DateSelectionFragment f42234a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DateSelectionFragment dateSelectionFragment) {
        super(1);
        this.f42234a = dateSelectionFragment;
    }

    @Override // ym0.l
    public final nm0.y invoke(Long l5) {
        u w12;
        long longValue = l5.longValue();
        w12 = this.f42234a.w1();
        w12.B0(new DateTime(longValue));
        return nm0.y.f85009a;
    }
}
