package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class i7 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f51426a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f51427b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51428c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(boolean z5, boolean z11, ym0.a<nm0.y> aVar) {
        super(2);
        this.f51426a = z5;
        this.f51427b = z11;
        this.f51428c = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._NEXT_, aVar2), null, this.f51426a, null, null, this.f51427b, this.f51428c, aVar2, 0, 53);
        }
        return nm0.y.f85009a;
    }
}
