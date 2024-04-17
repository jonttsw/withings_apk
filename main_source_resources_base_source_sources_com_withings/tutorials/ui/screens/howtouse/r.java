package com.withings.tutorials.ui.screens.howtouse;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HowToUseWBS08.kt */
/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w f45470a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f45471b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45472c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45473d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45474e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f45475f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, String str, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11) {
        super(2);
        this.f45470a = wVar;
        this.f45471b = str;
        this.f45472c = aVar;
        this.f45473d = aVar2;
        this.f45474e = aVar3;
        this.f45475f = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f45475f | 1);
        this.f45470a.c(g11, aVar, this.f45471b, this.f45472c, this.f45473d, this.f45474e);
        return nm0.y.f85009a;
    }
}
