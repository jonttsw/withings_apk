package com.withings.details.height;

import com.withings.details.height.HeightListActivity;
import com.withings.library.measure.MeasuresGroup;
import k1.r0;
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
final class i extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<Boolean> f36610a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MeasuresGroup f36611b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<MeasuresGroup> f36612c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ym0.a<Boolean> aVar, MeasuresGroup measuresGroup, r0<MeasuresGroup> r0Var) {
        super(0);
        this.f36610a = aVar;
        this.f36611b = measuresGroup;
        this.f36612c = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        if (this.f36610a.invoke().booleanValue()) {
            HeightListActivity.b bVar = HeightListActivity.f36521k;
            this.f36612c.setValue(this.f36611b);
        }
        return nm0.y.f85009a;
    }
}
