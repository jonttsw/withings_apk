package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;

import androidx.compose.material.c5;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
final class a0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f55521a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f55522b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c5 c5Var, CoroutineScope coroutineScope) {
        super(0);
        this.f55521a = coroutineScope;
        this.f55522b = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f55521a, null, null, new z(this.f55522b, null), 3, null);
        return nm0.y.f85009a;
    }
}
