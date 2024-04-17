package com.withings.ecg.live;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes3.dex */
public final class e0 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveEcgActivity f38661a;

    public e0(LiveEcgActivity liveEcgActivity) {
        this.f38661a = liveEcgActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        LiveEcgActivity liveEcgActivity = this.f38661a;
        u70.i H3 = LiveEcgActivity.H3(liveEcgActivity);
        boolean b02 = LiveEcgActivity.z3(liveEcgActivity).b0();
        g0 D3 = LiveEcgActivity.D3(liveEcgActivity);
        jq.f C3 = LiveEcgActivity.C3(liveEcgActivity);
        vf.c cVar = liveEcgActivity.f38604r;
        if (cVar != null) {
            pi.i iVar = liveEcgActivity.f38605s;
            if (iVar != null) {
                return new c(H3, b02, D3, C3, iVar, cVar);
            }
            kotlin.jvm.internal.u.s("isForClinicalStudy");
            throw null;
        }
        kotlin.jvm.internal.u.s("accountManager");
        throw null;
    }
}
