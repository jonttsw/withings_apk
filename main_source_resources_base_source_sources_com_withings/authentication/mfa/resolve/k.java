package com.withings.authentication.mfa.resolve;

import androidx.compose.material.c5;
import androidx.lifecycle.h1;
import k1.r0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: MfaResolveScreen.kt */
/* loaded from: classes3.dex */
final class k extends kotlin.jvm.internal.w implements ym0.l<c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32161a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MfaResolutionViewModel f32162b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f32163c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0<b> f32164d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CoroutineScope coroutineScope, MfaResolutionViewModel mfaResolutionViewModel, c5 c5Var, r0<b> r0Var) {
        super(1);
        this.f32161a = coroutineScope;
        this.f32162b = mfaResolutionViewModel;
        this.f32163c = c5Var;
        this.f32164d = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(c cVar) {
        c it = cVar;
        kotlin.jvm.internal.u.j(it, "it");
        BuildersKt__Builders_commonKt.launch$default(this.f32161a, null, null, new j(this.f32163c, this.f32164d, null), 3, null);
        MfaResolutionViewModel mfaResolutionViewModel = this.f32162b;
        mfaResolutionViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(mfaResolutionViewModel), Dispatchers.getIO(), null, new f(it, mfaResolutionViewModel, null), 2, null);
        return nm0.y.f85009a;
    }
}
