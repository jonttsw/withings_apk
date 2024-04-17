package com.withings.wiscale2.device.common.feature.ecg;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class a3 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51168a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51169b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f51170c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(CoroutineScope coroutineScope, EcgActivationActivity ecgActivationActivity, r8.n nVar) {
        super(0);
        this.f51168a = coroutineScope;
        this.f51169b = ecgActivationActivity;
        this.f51170c = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f51168a, null, null, new z2(this.f51170c, null), 3, null);
        this.f51169b.U3().V0();
        return nm0.y.f85009a;
    }
}
