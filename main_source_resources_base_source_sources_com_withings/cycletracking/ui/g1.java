package com.withings.cycletracking.ui;

import com.withings.cycletracking.ui.e2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: CycleTrackingDatavizScreen.kt */
/* loaded from: classes3.dex */
final class g1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e2 f35558a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f35559b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<qm0.d<? super nm0.y>, Object> f35560c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g1(e2 e2Var, CoroutineScope coroutineScope, ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> lVar) {
        super(0);
        this.f35558a = e2Var;
        this.f35559b = coroutineScope;
        this.f35560c = lVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        e2.c cVar;
        e2 e2Var = this.f35558a;
        if (e2Var instanceof e2.c) {
            cVar = (e2.c) e2Var;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            BuildersKt__Builders_commonKt.launch$default(this.f35559b, Dispatchers.getIO(), null, new f1(this.f35560c, null), 2, null);
        }
        return nm0.y.f85009a;
    }
}
