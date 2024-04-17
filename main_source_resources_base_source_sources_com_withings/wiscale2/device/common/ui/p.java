package com.withings.wiscale2.device.common.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseDeviceInfoFragment.kt */
/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f54036a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(h hVar) {
        super(2);
        this.f54036a = hVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            yk.o.b(false, s1.b.b(aVar2, 37256314, new o(this.f54036a)), aVar2, 48, 1);
        }
        return nm0.y.f85009a;
    }
}
