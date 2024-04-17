package com.withings.tutorials.ui.screens;

import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentalBodyComposition.kt */
/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f45515a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45516b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45517c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f45518d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f45519e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f45520f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, ym0.a<y> aVar, ym0.a<y> aVar2, String str, int i11, int i12) {
        super(2);
        this.f45515a = gVar;
        this.f45516b = aVar;
        this.f45517c = aVar2;
        this.f45518d = str;
        this.f45519e = i11;
        this.f45520f = i12;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f45519e | 1);
        this.f45515a.d(g11, this.f45520f, aVar, this.f45518d, this.f45516b, this.f45517c);
        return y.f85009a;
    }
}
