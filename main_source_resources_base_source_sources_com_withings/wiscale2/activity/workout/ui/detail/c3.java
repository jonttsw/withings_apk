package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.withings.views.measure.detail.ui.views.BrandView;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class c3 extends kotlin.jvm.internal.w implements ym0.l<nm0.j<? extends Track, ? extends WorkoutCategory>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49146a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(x1 x1Var) {
        super(1);
        this.f49146a = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(nm0.j<? extends Track, ? extends WorkoutCategory> jVar) {
        Track a11 = jVar.a();
        x1 x1Var = this.f49146a;
        x1Var.Y1().f99143b.setDeviceModel(Integer.valueOf(a11.getDeviceModel()));
        BrandView brandView = x1Var.Y1().f99142a;
        Context context = x1Var.Y1().f99142a.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        brandView.setBrandName(com.withings.wiscale2.measure.accountmeasure.ui.add.g0.b(a11, context));
        x1.U1(x1Var, Integer.valueOf(a11.getDeviceModel()));
        return nm0.y.f85009a;
    }
}
