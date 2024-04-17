package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
final class v0 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45049a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45050b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q60.a f45051c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f45052d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f45053e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, q60.a aVar3, Context context, e.n<Intent, ActivityResult> nVar) {
        super(4);
        this.f45049a = aVar;
        this.f45050b = aVar2;
        this.f45051c = aVar3;
        this.f45052d = context;
        this.f45053e = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        d0.d(6, 0, aVar2, this.f45049a, s1.b.b(aVar2, 1153088080, new u0(this.f45050b, this.f45051c, this.f45052d, this.f45053e)));
        return nm0.y.f85009a;
    }
}
