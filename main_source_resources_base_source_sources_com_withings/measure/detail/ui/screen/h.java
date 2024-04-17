package com.withings.measure.detail.ui.screen;

import com.withings.library.measure.MeasuresGroup;
import java.util.List;
import nm0.y;
import org.joda.time.DateTime;
/* compiled from: MeasureDetailActivity.kt */
/* loaded from: classes4.dex */
final class h extends kotlin.jvm.internal.w implements ym0.l<nm0.j<? extends DateTime, ? extends List<? extends MeasuresGroup>>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureDetailActivity f41765a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MeasureDetailActivity measureDetailActivity) {
        super(1);
        this.f41765a = measureDetailActivity;
    }

    @Override // ym0.l
    public final y invoke(nm0.j<? extends DateTime, ? extends List<? extends MeasuresGroup>> jVar) {
        nm0.j<? extends DateTime, ? extends List<? extends MeasuresGroup>> jVar2 = jVar;
        DateTime a11 = jVar2.a();
        kotlin.jvm.internal.u.g(a11);
        MeasureDetailActivity.H3(this.f41765a, a11, jVar2.b());
        return y.f85009a;
    }
}
