package com.withings.wiscale2.partner.ui;

import androidx.compose.material.c5;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
final class n0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59168a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f59169b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(c5 c5Var, CoroutineScope coroutineScope) {
        super(0);
        this.f59168a = coroutineScope;
        this.f59169b = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f59168a, null, null, new m0(this.f59169b, null), 3, null);
        return nm0.y.f85009a;
    }
}
