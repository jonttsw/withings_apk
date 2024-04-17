package com.withings.fever.ui.temperatureList;

import androidx.lifecycle.h1;
import k1.r0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
/* compiled from: TemperatureListActivity.kt */
/* loaded from: classes3.dex */
final class g extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TemperatureListActivity f39431a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ky.d f39432b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<ky.d> f39433c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TemperatureListActivity temperatureListActivity, ky.d dVar, r0<ky.d> r0Var) {
        super(0);
        this.f39431a = temperatureListActivity;
        this.f39432b = dVar;
        this.f39433c = r0Var;
    }

    @Override // ym0.a
    public final y invoke() {
        q A3 = TemperatureListActivity.A3(this.f39431a);
        b bVar = new b(this.f39432b);
        A3.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(A3), Dispatchers.getIO(), null, new p(A3, bVar.a(), null), 2, null);
        this.f39433c.setValue(null);
        return y.f85009a;
    }
}
