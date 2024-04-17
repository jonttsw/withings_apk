package com.withings.measure.detail.ui.screen;

import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import org.joda.time.DateTime;
/* compiled from: MeasureDetailViewModel.kt */
/* loaded from: classes4.dex */
final class t extends kotlin.jvm.internal.w implements ym0.l<MeasuresGroup, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DateTime f41795a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q f41796b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Double f41797c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(DateTime dateTime, q qVar, Double d11) {
        super(1);
        this.f41795a = dateTime;
        this.f41796b = qVar;
        this.f41797c = d11;
    }

    @Override // ym0.l
    public final Boolean invoke(MeasuresGroup measuresGroup) {
        boolean z5;
        Double d11;
        MeasuresGroup it = measuresGroup;
        kotlin.jvm.internal.u.j(it, "it");
        if (hn.a.e(new DateTime(it.getDate()), this.f41795a)) {
            Measure measureForType = it.getMeasureForType(this.f41796b.f0().getMeasureType());
            if (measureForType != null) {
                d11 = Double.valueOf(measureForType.f95794y);
            } else {
                d11 = null;
            }
            if (kotlin.jvm.internal.u.c(d11, this.f41797c)) {
                z5 = true;
                return Boolean.valueOf(z5);
            }
        }
        z5 = false;
        return Boolean.valueOf(z5);
    }
}
