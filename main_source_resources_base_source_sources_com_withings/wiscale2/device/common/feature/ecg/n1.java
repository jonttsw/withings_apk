package com.withings.wiscale2.device.common.feature.ecg;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class n1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51528a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51529b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f51530c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(EcgActivationActivity ecgActivationActivity, CoroutineScope coroutineScope, androidx.compose.ui.platform.k4 k4Var) {
        super(0);
        this.f51528a = ecgActivationActivity;
        this.f51529b = coroutineScope;
        this.f51530c = k4Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f51528a.U3().f2();
        BuildersKt__Builders_commonKt.launch$default(this.f51529b, null, null, new m1(this.f51530c, null), 3, null);
        return nm0.y.f85009a;
    }
}
