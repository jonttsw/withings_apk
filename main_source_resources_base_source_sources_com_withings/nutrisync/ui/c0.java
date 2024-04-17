package com.withings.nutrisync.ui;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: VitaminCScreen.kt */
/* loaded from: classes4.dex */
final class c0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f43221a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<qm0.d<? super nm0.y>, Object> f43222b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c0(CoroutineScope coroutineScope, ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> lVar) {
        super(0);
        this.f43221a = coroutineScope;
        this.f43222b = lVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f43221a, Dispatchers.getIO(), null, new b0(this.f43222b, null), 2, null);
        return nm0.y.f85009a;
    }
}
