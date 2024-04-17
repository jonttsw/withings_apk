package com.withings.tutorials.ui.screens.appssync.healthconnect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
public final class a1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44900a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f44901b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f44902c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f44903d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(int i11, int i12, ym0.a aVar, ym0.p pVar) {
        super(2);
        this.f44900a = aVar;
        this.f44901b = pVar;
        this.f44902c = i11;
        this.f44903d = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f44902c | 1);
        ym0.a<nm0.y> aVar2 = this.f44900a;
        ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f44901b;
        d0.i(g11, this.f44903d, aVar, aVar2, pVar);
        return nm0.y.f85009a;
    }
}
