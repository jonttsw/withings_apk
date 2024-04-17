package com.withings.tutorials.ui.screens.appssync.healthconnect;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
final class f0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44949a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f44950b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44951c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(r8.n nVar, ym0.a aVar, ym0.a aVar2) {
        super(2);
        this.f44949a = aVar;
        this.f44950b = nVar;
        this.f44951c = aVar2;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            d0.j(0, 0, aVar2, new e0(this.f44950b, this.f44951c), this.f44949a);
        }
        return nm0.y.f85009a;
    }
}
