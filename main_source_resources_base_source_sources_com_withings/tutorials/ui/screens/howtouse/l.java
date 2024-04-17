package com.withings.tutorials.ui.screens.howtouse;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HowToUseWBS08.kt */
/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w f45452a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f45453b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45454c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45455d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45456e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f45457f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f45458g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i11, int i12, w wVar, String str, ym0.a aVar, ym0.a aVar2, ym0.a aVar3) {
        super(2);
        this.f45452a = wVar;
        this.f45453b = str;
        this.f45454c = aVar;
        this.f45455d = aVar2;
        this.f45456e = aVar3;
        this.f45457f = i11;
        this.f45458g = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f45457f | 1);
        this.f45452a.a(g11, this.f45458g, aVar, this.f45453b, this.f45454c, this.f45455d, this.f45456e);
        return nm0.y.f85009a;
    }
}
