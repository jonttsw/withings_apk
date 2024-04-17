package com.withings.wiscale2.device.common.feature.ecg;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class t9 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51755a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51756b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f51757c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(CoroutineScope coroutineScope, WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar) {
        super(0);
        this.f51755a = coroutineScope;
        this.f51756b = wBS08EcgActivationActivity;
        this.f51757c = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        WBS08EcgActivationViewModel R3;
        BuildersKt__Builders_commonKt.launch$default(this.f51755a, null, null, new s9(this.f51757c, null), 3, null);
        R3 = this.f51756b.R3();
        R3.y0();
        return nm0.y.f85009a;
    }
}
