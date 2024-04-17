package com.withings.wiscale2.device.common.feature.ecg;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class v0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f52056a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f52057b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(CoroutineScope coroutineScope, androidx.compose.ui.platform.k4 k4Var) {
        super(0);
        this.f52056a = coroutineScope;
        this.f52057b = k4Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f52056a, null, null, new u0(this.f52057b, null), 3, null);
        return nm0.y.f85009a;
    }
}
