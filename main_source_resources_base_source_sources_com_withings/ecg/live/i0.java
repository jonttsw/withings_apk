package com.withings.ecg.live;

import android.os.Handler;
import com.withings.ecg.graph.EcgEntry;
/* compiled from: LiveEcgPlayer.kt */
/* loaded from: classes3.dex */
public final class i0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g0 f38685a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(g0 g0Var) {
        this.f38685a = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f11;
        float f12;
        Handler handler;
        g0 g0Var = this.f38685a;
        f11 = g0Var.f38674i;
        g0.a(g0Var, new EcgEntry(f11, 0.0f));
        f12 = g0Var.f38674i;
        g0Var.f38674i = f12 + 0.017f;
        g0Var.k();
        g0Var.f38666a.invalidate();
        handler = g0Var.f38670e;
        handler.postDelayed(this, 32L);
    }
}
