package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
final class p0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l0.c f45010a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q60.a f45011b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f45012c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f45013d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f45014e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(l0.c cVar, q60.a aVar, Context context, e.n<Intent, ActivityResult> nVar, k1.r0<Boolean> r0Var) {
        super(0);
        this.f45010a = cVar;
        this.f45011b = aVar;
        this.f45012c = context;
        this.f45013d = nVar;
        this.f45014e = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Object a11;
        q60.a aVar = this.f45011b;
        Context context = this.f45012c;
        e.n<Intent, ActivityResult> nVar = this.f45013d;
        try {
            Intent b10 = aVar.b(context);
            if (b10 == null) {
                b10 = aVar.a(context);
            }
            nVar.a(b10);
            a11 = nm0.y.f85009a;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        Throwable b11 = nm0.k.b(a11);
        if (b11 != null && (b11 instanceof ActivityNotFoundException)) {
            this.f45014e.setValue(Boolean.TRUE);
        }
        return nm0.y.f85009a;
    }
}
