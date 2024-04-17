package com.withings.wiscale2.partner.ui;

import androidx.compose.material.c5;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PartnerIntroFragment.kt */
/* loaded from: classes5.dex */
final class u1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f59222a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59223b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f59224c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(k1 k1Var, CoroutineScope coroutineScope, c5 c5Var) {
        super(2);
        this.f59222a = k1Var;
        this.f59223b = coroutineScope;
        this.f59224c = c5Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            k1.x1(this.f59222a, new t1(this.f59224c, this.f59223b), aVar2, 64);
        }
        return nm0.y.f85009a;
    }
}
