package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
final class n0 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44996a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f44997b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44998c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f44999d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q60.a f45000e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f45001f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ch.d f45002g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(ym0.a<nm0.y> aVar, Context context, ym0.a<nm0.y> aVar2, k1.r0<Boolean> r0Var, q60.a aVar3, e.n<Intent, ActivityResult> nVar, ch.d dVar) {
        super(4);
        this.f44996a = aVar;
        this.f44997b = context;
        this.f44998c = aVar2;
        this.f44999d = r0Var;
        this.f45000e = aVar3;
        this.f45001f = nVar;
        this.f45002g = dVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        d0.f(s1.b.b(aVar2, -1361168921, new l0(this.f44997b, this.f44998c, this.f44999d, composable, this.f45000e, this.f45001f)), this.f44996a, new m0(this.f44997b, this.f45002g), aVar2, 6, 0);
        return nm0.y.f85009a;
    }
}
