package com.withings.tutorials.ui.screens.appssync.healthconnect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
public final class d1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44942a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44943b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f44944c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f44945d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(int i11, int i12, ym0.a aVar, ym0.a aVar2) {
        super(2);
        this.f44942a = aVar;
        this.f44943b = aVar2;
        this.f44944c = i11;
        this.f44945d = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f44944c | 1);
        ym0.a<nm0.y> aVar2 = this.f44942a;
        ym0.a<nm0.y> aVar3 = this.f44943b;
        d0.j(g11, this.f44945d, aVar, aVar2, aVar3);
        return nm0.y.f85009a;
    }
}
