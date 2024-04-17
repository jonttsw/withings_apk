package com.withings.wiscale2.partner.ui;

import androidx.compose.material.c5;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartnerIntroFragment.kt */
/* loaded from: classes5.dex */
public final class o1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f59175a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59176b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f59177c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f59178d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(k1 k1Var, CoroutineScope coroutineScope, c5 c5Var, int i11) {
        super(2);
        this.f59175a = k1Var;
        this.f59176b = coroutineScope;
        this.f59177c = c5Var;
        this.f59178d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f59178d | 1);
        CoroutineScope coroutineScope = this.f59176b;
        c5 c5Var = this.f59177c;
        k1.w1(this.f59175a, coroutineScope, c5Var, aVar, g11);
        return nm0.y.f85009a;
    }
}
