package com.withings.wiscale2.vo2max.view;

import com.withings.library.measure.MeasuresGroup;
import java.util.List;
/* compiled from: Vo2maxActivity.kt */
/* loaded from: classes5.dex */
final class b1 extends kotlin.jvm.internal.w implements ym0.l<List<? extends MeasuresGroup>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2maxActivity f62692a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Vo2maxActivity vo2maxActivity) {
        super(1);
        this.f62692a = vo2maxActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends MeasuresGroup> list) {
        List<? extends MeasuresGroup> it = list;
        kotlin.jvm.internal.u.j(it, "it");
        Vo2maxActivity.E3(this.f62692a, it);
        return nm0.y.f85009a;
    }
}
