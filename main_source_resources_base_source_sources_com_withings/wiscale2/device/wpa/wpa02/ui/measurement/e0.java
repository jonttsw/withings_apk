package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;

import androidx.compose.material.c5;
import com.withings.wiscale2.device.wpa.wpa02.ui.measurement.Wpa02LaunchMeasurementActivity;
import k1.r0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
final class e0 extends kotlin.jvm.internal.w implements ym0.l<ne0.c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f55538a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0<ne0.c> f55539b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f55540c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(c5 c5Var, r0 r0Var, CoroutineScope coroutineScope) {
        super(1);
        this.f55538a = coroutineScope;
        this.f55539b = r0Var;
        this.f55540c = c5Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(ne0.c cVar) {
        ne0.c it = cVar;
        kotlin.jvm.internal.u.j(it, "it");
        Wpa02LaunchMeasurementActivity.b bVar = Wpa02LaunchMeasurementActivity.f55468g;
        this.f55539b.setValue(it);
        BuildersKt__Builders_commonKt.launch$default(this.f55538a, null, null, new d0(this.f55540c, null), 3, null);
        return nm0.y.f85009a;
    }
}
