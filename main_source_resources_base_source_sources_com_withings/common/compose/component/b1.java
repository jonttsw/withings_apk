package com.withings.common.compose.component;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpandableText.kt */
/* loaded from: classes3.dex */
public final class b1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f33423a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f33424b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f33425c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ m0.b<Float, m0.m> f33426d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.r0<Float> f33427e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(k1.r0<Boolean> r0Var, CoroutineScope coroutineScope, ym0.a<nm0.y> aVar, m0.b<Float, m0.m> bVar, k1.r0<Float> r0Var2) {
        super(0);
        this.f33423a = r0Var;
        this.f33424b = coroutineScope;
        this.f33425c = aVar;
        this.f33426d = bVar;
        this.f33427e = r0Var2;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        k1.r0<Boolean> r0Var = this.f33423a;
        r0Var.setValue(Boolean.valueOf(!r0Var.getValue().booleanValue()));
        BuildersKt__Builders_commonKt.launch$default(this.f33424b, null, null, new a1(r0Var, this.f33426d, this.f33427e, null), 3, null);
        ym0.a<nm0.y> aVar = this.f33425c;
        if (aVar != null) {
            aVar.invoke();
        }
        return nm0.y.f85009a;
    }
}
