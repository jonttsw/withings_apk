package com.withings.tutorials.ui.screens.howtouse;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HowToUseWBS08.kt */
/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w f45477a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f45478b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45479c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45480d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f45481e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f45482f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, String str, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11, int i12) {
        super(2);
        this.f45477a = wVar;
        this.f45478b = str;
        this.f45479c = aVar;
        this.f45480d = aVar2;
        this.f45481e = i11;
        this.f45482f = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f45481e | 1);
        this.f45477a.d(g11, this.f45482f, aVar, this.f45478b, this.f45479c, this.f45480d);
        return nm0.y.f85009a;
    }
}
