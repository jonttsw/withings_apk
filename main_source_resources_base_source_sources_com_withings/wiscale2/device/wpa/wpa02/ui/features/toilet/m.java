package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import androidx.lifecycle.h1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: ToiletDeviceViewModel.kt */
/* loaded from: classes5.dex */
final class m extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f55433a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar) {
        super(0);
        this.f55433a = kVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        k kVar = this.f55433a;
        BuildersKt__Builders_commonKt.launch$default(h1.a(kVar), Dispatchers.getIO(), null, new l(kVar, null), 2, null);
        return nm0.y.f85009a;
    }
}
