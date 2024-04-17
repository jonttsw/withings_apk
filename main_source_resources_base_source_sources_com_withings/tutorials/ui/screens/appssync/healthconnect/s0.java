package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
final class s0 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45029a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f45030b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45031c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f45032d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q60.a f45033e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f45034f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ch.d f45035g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ym0.a<nm0.y> aVar, Context context, ym0.a<nm0.y> aVar2, k1.r0<Boolean> r0Var, q60.a aVar3, e.n<Intent, ActivityResult> nVar, ch.d dVar) {
        super(4);
        this.f45029a = aVar;
        this.f45030b = context;
        this.f45031c = aVar2;
        this.f45032d = r0Var;
        this.f45033e = aVar3;
        this.f45034f = nVar;
        this.f45035g = dVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        d0.g(s1.b.b(aVar2, 1474289377, new q0(this.f45030b, this.f45031c, this.f45032d, composable, this.f45033e, this.f45034f)), this.f45029a, new r0(this.f45030b, this.f45035g), aVar2, 6, 0);
        return nm0.y.f85009a;
    }
}
