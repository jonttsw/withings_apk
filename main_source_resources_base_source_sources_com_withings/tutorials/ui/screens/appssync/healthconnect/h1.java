package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.content.Context;
import k1.o1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
public final class h1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f44965a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44966b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o1<Boolean> f44967c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44968d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f44969e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Context context, ym0.a<nm0.y> aVar, o1<Boolean> o1Var, ym0.a<nm0.y> aVar2, int i11) {
        super(2);
        this.f44965a = context;
        this.f44966b = aVar;
        this.f44967c = o1Var;
        this.f44968d = aVar2;
        this.f44969e = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f44969e | 1);
        o1<Boolean> o1Var = this.f44967c;
        ym0.a<nm0.y> aVar2 = this.f44968d;
        d0.m(this.f44965a, this.f44966b, o1Var, aVar2, aVar, g11);
        return nm0.y.f85009a;
    }
}
