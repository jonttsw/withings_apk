package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import kotlin.jvm.internal.u;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class k implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IrregularHeartBeatSettingsActivity f52368a;

    public k(IrregularHeartBeatSettingsActivity irregularHeartBeatSettingsActivity) {
        this.f52368a = irregularHeartBeatSettingsActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        u.j(modelClass, "modelClass");
        IrregularHeartBeatSettingsActivity irregularHeartBeatSettingsActivity = this.f52368a;
        t tVar = irregularHeartBeatSettingsActivity.f52346e;
        if (tVar != null) {
            return tVar.a(IrregularHeartBeatSettingsActivity.z3(irregularHeartBeatSettingsActivity));
        }
        u.s("viewModelFactory");
        throw null;
    }
}
