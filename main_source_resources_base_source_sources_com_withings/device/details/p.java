package com.withings.device.details;

import androidx.compose.material.c5;
import k1.r0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DeviceDetailFragment.kt */
/* loaded from: classes3.dex */
final class p extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f36873a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f36874b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f36875c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f36876d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c5 c5Var, r0 r0Var, h hVar, CoroutineScope coroutineScope) {
        super(0);
        this.f36873a = coroutineScope;
        this.f36874b = hVar;
        this.f36875c = c5Var;
        this.f36876d = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f36873a, null, null, new o(this.f36874b, this.f36875c, this.f36876d, null), 3, null);
        return nm0.y.f85009a;
    }
}
