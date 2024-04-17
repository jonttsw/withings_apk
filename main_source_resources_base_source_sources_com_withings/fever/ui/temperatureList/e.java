package com.withings.fever.ui.temperatureList;

import k1.r0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: TemperatureListActivity.kt */
/* loaded from: classes3.dex */
final class e extends w implements ym0.l<ky.d, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0<ky.d> f39429a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r0<ky.d> r0Var) {
        super(1);
        this.f39429a = r0Var;
    }

    @Override // ym0.l
    public final y invoke(ky.d dVar) {
        ky.d temperature = dVar;
        u.j(temperature, "temperature");
        this.f39429a.setValue(temperature);
        return y.f85009a;
    }
}
