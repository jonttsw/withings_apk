package com.withings.tutorials.ui.screens.howtouse;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HowToUseWBS08.kt */
/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w f45461a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45462b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45463c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45464d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f45465e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f45466f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f45467g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i11, int i12, w wVar, String str, ym0.a aVar, ym0.a aVar2, ym0.a aVar3) {
        super(2);
        this.f45461a = wVar;
        this.f45462b = aVar;
        this.f45463c = aVar2;
        this.f45464d = aVar3;
        this.f45465e = str;
        this.f45466f = i11;
        this.f45467g = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f45466f | 1);
        this.f45461a.b(g11, this.f45467g, aVar, this.f45465e, this.f45462b, this.f45463c, this.f45464d);
        return nm0.y.f85009a;
    }
}
