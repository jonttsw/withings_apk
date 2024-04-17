package com.withings.wiscale2.device.common.feature.ecg;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class l7 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51497a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f51498b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(CoroutineScope coroutineScope, androidx.compose.ui.platform.k4 k4Var) {
        super(0);
        this.f51497a = coroutineScope;
        this.f51498b = k4Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f51497a, null, null, new k7(this.f51498b, null), 3, null);
        return nm0.y.f85009a;
    }
}
