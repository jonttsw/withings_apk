package com.withings.wiscale2.partner.ui;

import androidx.compose.material.c5;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PartnerIntroFragment.kt */
/* loaded from: classes5.dex */
final class r1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f59195a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59196b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f59197c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(k1 k1Var, CoroutineScope coroutineScope, c5 c5Var) {
        super(2);
        this.f59195a = k1Var;
        this.f59196b = coroutineScope;
        this.f59197c = c5Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            k1.w1(this.f59195a, this.f59196b, this.f59197c, aVar2, 584);
        }
        return nm0.y.f85009a;
    }
}
