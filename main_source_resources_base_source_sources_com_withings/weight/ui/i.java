package com.withings.weight.ui;

import com.withings.periodsbar.Period;
import com.withings.weight.core.model.LimbModel;
import kotlin.NoWhenBranchMatchedException;
import org.joda.time.DateTime;
import u90.j;
/* compiled from: SegmentalBodyCompositionActivity.kt */
/* loaded from: classes4.dex */
final class i extends kotlin.jvm.internal.w implements ym0.p<DateTime, j.a, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalBodyCompositionActivity f47620a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SegmentalBodyCompositionActivity segmentalBodyCompositionActivity) {
        super(2);
        this.f47620a = segmentalBodyCompositionActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(DateTime dateTime, j.a aVar) {
        int i11;
        DateTime date = dateTime;
        j.a zoom = aVar;
        kotlin.jvm.internal.u.j(date, "date");
        kotlin.jvm.internal.u.j(zoom, "zoom");
        SegmentalBodyCompositionActivity segmentalBodyCompositionActivity = this.f47620a;
        ch.d dVar = segmentalBodyCompositionActivity.f47595g;
        if (dVar != null) {
            a3.b b10 = dVar.b();
            long A3 = SegmentalBodyCompositionActivity.A3(segmentalBodyCompositionActivity);
            if (kotlin.jvm.internal.u.e(zoom, j.a.C1699a.f101633a)) {
                LimbModel limbModel = LimbModel.f46985a;
                i11 = 0;
            } else if (kotlin.jvm.internal.u.e(zoom, j.a.c.f101637a)) {
                LimbModel limbModel2 = LimbModel.f46985a;
                i11 = 1;
            } else if (kotlin.jvm.internal.u.e(zoom, j.a.b.f101635a)) {
                LimbModel limbModel3 = LimbModel.f46985a;
                i11 = 2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int i12 = i11;
            Period period = Period.f43722g;
            b10.getClass();
            segmentalBodyCompositionActivity.startActivity(a3.b.j(segmentalBodyCompositionActivity, A3, i12, date, period));
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}
