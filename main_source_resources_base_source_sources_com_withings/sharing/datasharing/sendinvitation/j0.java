package com.withings.sharing.datasharing.sendinvitation;

import androidx.compose.material3.m8;
import k1.r0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
/* compiled from: ShareMethodScreen.kt */
/* loaded from: classes4.dex */
final class j0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f44221a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m8 f44222b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f44223c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(CoroutineScope coroutineScope, m8 m8Var, r0<Boolean> r0Var) {
        super(0);
        this.f44221a = coroutineScope;
        this.f44222b = m8Var;
        this.f44223c = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Job launch$default;
        m8 m8Var = this.f44222b;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f44221a, null, null, new h0(m8Var, null), 3, null);
        launch$default.invokeOnCompletion(new i0(m8Var, this.f44223c));
        return nm0.y.f85009a;
    }
}
