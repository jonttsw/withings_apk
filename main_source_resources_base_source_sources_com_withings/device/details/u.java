package com.withings.device.details;

import androidx.compose.material.c5;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DeviceDetailFragment.kt */
/* loaded from: classes3.dex */
final class u extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f37045a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f37046b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(c5 c5Var, CoroutineScope coroutineScope) {
        super(0);
        this.f37045a = coroutineScope;
        this.f37046b = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f37045a, null, null, new t(this.f37046b, null), 3, null);
        return nm0.y.f85009a;
    }
}
