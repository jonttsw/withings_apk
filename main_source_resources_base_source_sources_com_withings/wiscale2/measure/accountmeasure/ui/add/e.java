package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.library.measure.Measure;
/* compiled from: AddBloodPressureFragment.kt */
/* loaded from: classes5.dex */
final class e extends kotlin.jvm.internal.w implements ym0.l<ky.a, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f58160a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar) {
        super(1);
        this.f58160a = aVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(ky.a aVar) {
        ky.a aVar2 = aVar;
        Measure measure = null;
        if (aVar2 != null) {
            measure = hy.g.d(aVar2, null);
        }
        a.H1(this.f58160a, measure);
        return nm0.y.f85009a;
    }
}
