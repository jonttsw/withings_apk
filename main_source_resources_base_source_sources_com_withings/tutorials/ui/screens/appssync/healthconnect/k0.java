package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
final class k0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l0.c f44981a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q60.a f44982b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f44983c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f44984d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f44985e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0.c cVar, q60.a aVar, Context context, e.n<Intent, ActivityResult> nVar, k1.r0<Boolean> r0Var) {
        super(0);
        this.f44981a = cVar;
        this.f44982b = aVar;
        this.f44983c = context;
        this.f44984d = nVar;
        this.f44985e = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Object a11;
        q60.a aVar = this.f44982b;
        Context context = this.f44983c;
        e.n<Intent, ActivityResult> nVar = this.f44984d;
        try {
            Intent b10 = aVar.b(context);
            if (b10 != null) {
                nVar.a(b10);
                a11 = nm0.y.f85009a;
            } else {
                a11 = null;
            }
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        Throwable b11 = nm0.k.b(a11);
        if (b11 != null && (b11 instanceof ActivityNotFoundException)) {
            this.f44985e.setValue(Boolean.TRUE);
        }
        return nm0.y.f85009a;
    }
}
