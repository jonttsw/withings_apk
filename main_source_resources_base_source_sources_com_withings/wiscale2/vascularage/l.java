package com.withings.wiscale2.vascularage;
/* compiled from: VascularAgeActivity.kt */
/* loaded from: classes5.dex */
final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VascularAgeActivity f62418a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(VascularAgeActivity vascularAgeActivity) {
        super(2);
        this.f62418a = vascularAgeActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            VascularAgeActivity vascularAgeActivity = this.f62418a;
            k1.y.f("error", new j(vascularAgeActivity, null), aVar2);
            k0.e(VascularAgeActivity.B3(vascularAgeActivity), new k(vascularAgeActivity), aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
