package com.withings.tutorials.ui.screens.appssync.healthconnect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f45005a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45006b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45007c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f45008d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f45009e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11, int i12) {
        super(2);
        this.f45005a = str;
        this.f45006b = aVar;
        this.f45007c = aVar2;
        this.f45008d = i11;
        this.f45009e = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f45008d | 1);
        d0.a(g11, this.f45009e, aVar, this.f45005a, this.f45006b, this.f45007c);
        return nm0.y.f85009a;
    }
}
