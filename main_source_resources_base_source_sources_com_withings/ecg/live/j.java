package com.withings.ecg.live;

import androidx.lifecycle.l0;
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
public final class j implements l0<k0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f38686a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(c cVar) {
        this.f38686a = cVar;
    }

    @Override // androidx.lifecycle.l0
    public final void onChanged(k0 k0Var) {
        long j5;
        if (k0Var != null) {
            c cVar = this.f38686a;
            cVar.G0().removeObserver(this);
            cVar.R0().setValue(Boolean.TRUE);
            long currentTimeMillis = System.currentTimeMillis();
            j5 = cVar.f38651x;
            cVar.f38652y = Long.valueOf(currentTimeMillis - j5);
            cVar.G = 0L;
        }
    }
}
