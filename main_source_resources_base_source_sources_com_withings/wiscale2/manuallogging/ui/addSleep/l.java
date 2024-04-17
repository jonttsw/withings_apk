package com.withings.wiscale2.manuallogging.ui.addSleep;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import ei0.q;
import kotlin.jvm.internal.u;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class l implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddSleepTrackActivity f58072a;

    public l(AddSleepTrackActivity addSleepTrackActivity) {
        this.f58072a = addSleepTrackActivity;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [dh0.b, java.lang.Object] */
    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        u.j(modelClass, "modelClass");
        AddSleepTrackActivity addSleepTrackActivity = this.f58072a;
        long A3 = AddSleepTrackActivity.A3(addSleepTrackActivity);
        q qVar = addSleepTrackActivity.f58023h;
        if (qVar != null) {
            dh0.a aVar = new dh0.a(qVar);
            ?? obj = new Object();
            q qVar2 = addSleepTrackActivity.f58023h;
            if (qVar2 != null) {
                px.b bVar = new px.b(A3, aVar, obj, new dh0.c(qVar2));
                xw.d.d(addSleepTrackActivity, bVar.j0(), new k(addSleepTrackActivity));
                return bVar;
            }
            u.s("sleepTrackManager");
            throw null;
        }
        u.s("sleepTrackManager");
        throw null;
    }
}
