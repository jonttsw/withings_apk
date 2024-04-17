package com.withings.wiscale2.device.common.feature.ecg;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class d3 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51270a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51271b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(CoroutineScope coroutineScope, r8.n nVar) {
        super(0);
        this.f51270a = coroutineScope;
        this.f51271b = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f51270a, null, null, new c3(this.f51271b, null), 3, null);
        return nm0.y.f85009a;
    }
}
