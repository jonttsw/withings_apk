package com.withings.wiscale2.weight.list;

import androidx.lifecycle.h1;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
/* compiled from: WeightListActivity.kt */
/* loaded from: classes5.dex */
final class g extends w implements ym0.l<ky.d, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeightListActivity f62923a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WeightListActivity weightListActivity) {
        super(1);
        this.f62923a = weightListActivity;
    }

    @Override // ym0.l
    public final y invoke(ky.d dVar) {
        ky.d it = dVar;
        u.j(it, "it");
        k A3 = WeightListActivity.A3(this.f62923a);
        A3.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(A3), Dispatchers.getIO(), null, new j(A3, it, null), 2, null);
        return y.f85009a;
    }
}
