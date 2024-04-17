package com.withings.wiscale2.partner.ui;

import androidx.compose.material.c5;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
final class r0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59193a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f59194b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(c5 c5Var, CoroutineScope coroutineScope) {
        super(0);
        this.f59193a = coroutineScope;
        this.f59194b = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f59193a, null, null, new q0(this.f59194b, null), 3, null);
        return nm0.y.f85009a;
    }
}
