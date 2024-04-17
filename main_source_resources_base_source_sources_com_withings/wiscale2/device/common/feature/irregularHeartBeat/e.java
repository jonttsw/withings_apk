package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import kotlin.jvm.internal.u;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class e implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IrregularHeartBeatActivationActivity f52358a;

    public e(IrregularHeartBeatActivationActivity irregularHeartBeatActivationActivity) {
        this.f52358a = irregularHeartBeatActivationActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        u.j(modelClass, "modelClass");
        IrregularHeartBeatActivationActivity irregularHeartBeatActivationActivity = this.f52358a;
        j jVar = irregularHeartBeatActivationActivity.f52327e;
        if (jVar != null) {
            return jVar.a(IrregularHeartBeatActivationActivity.B3(irregularHeartBeatActivationActivity));
        }
        u.s("viewModelFactory");
        throw null;
    }
}
