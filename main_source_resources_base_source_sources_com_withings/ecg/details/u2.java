package com.withings.ecg.details;

import androidx.lifecycle.k1;
import com.withings.ecg.details.WaitingSignalResultActivity;
/* compiled from: Extensions.kt */
/* loaded from: classes3.dex */
public final class u2 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WaitingSignalResultActivity f38343a;

    public u2(WaitingSignalResultActivity waitingSignalResultActivity) {
        this.f38343a = waitingSignalResultActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        WaitingSignalResultActivity waitingSignalResultActivity = this.f38343a;
        WaitingSignalResultActivity.d dVar = waitingSignalResultActivity.f38058h;
        if (dVar != null) {
            return dVar.a(WaitingSignalResultActivity.A3(waitingSignalResultActivity), WaitingSignalResultActivity.z3(waitingSignalResultActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
