package com.withings.nervehealth.ui;

import androidx.compose.material.c5;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: NerveHealthMeasureListActivity.kt */
/* loaded from: classes4.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f42721a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f42722b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(c5 c5Var, CoroutineScope coroutineScope) {
        super(0);
        this.f42721a = coroutineScope;
        this.f42722b = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f42721a, null, null, new h0(this.f42722b, null), 3, null);
        return nm0.y.f85009a;
    }
}
