package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class oa extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51608a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51609b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ xb.b f51610c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar, xb.b bVar) {
        super(2);
        this.f51608a = wBS08EcgActivationActivity;
        this.f51609b = nVar;
        this.f51610c = bVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51608a;
            e.j.a(0, 1, aVar2, new na(wBS08EcgActivationActivity), false);
            WBS08EcgActivationActivity.E3(wBS08EcgActivationActivity, this.f51609b, this.f51610c, aVar2, 584);
        }
        return nm0.y.f85009a;
    }
}
