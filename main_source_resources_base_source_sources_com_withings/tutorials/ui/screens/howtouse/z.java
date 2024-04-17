package com.withings.tutorials.ui.screens.howtouse;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HowToUseWBS08.kt */
/* loaded from: classes4.dex */
public final class z extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w f45506a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f45507b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45508c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45509d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45510e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f45511f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f45512g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i11, int i12, w wVar, String str, ym0.a aVar, ym0.a aVar2, ym0.a aVar3) {
        super(2);
        this.f45506a = wVar;
        this.f45507b = str;
        this.f45508c = aVar;
        this.f45509d = aVar2;
        this.f45510e = aVar3;
        this.f45511f = i11;
        this.f45512g = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f45511f | 1);
        this.f45506a.f(g11, this.f45512g, aVar, this.f45507b, this.f45508c, this.f45509d, this.f45510e);
        return nm0.y.f85009a;
    }
}
