package com.withings.wiscale2.device.common.feature.ecg;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class x0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52097a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f52098b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f52099c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(EcgActivationActivity ecgActivationActivity, CoroutineScope coroutineScope, androidx.compose.ui.platform.k4 k4Var) {
        super(0);
        this.f52097a = ecgActivationActivity;
        this.f52098b = coroutineScope;
        this.f52099c = k4Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f52097a.U3().e2();
        BuildersKt__Builders_commonKt.launch$default(this.f52098b, null, null, new w0(this.f52099c, null), 3, null);
        return nm0.y.f85009a;
    }
}
