package com.withings.wiscale2.device.wpm.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.withings.wiscale2.device.wpm.ui.Wpm0203Activity;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class z implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm0203Activity f55795a;

    public z(Wpm0203Activity wpm0203Activity) {
        this.f55795a = wpm0203Activity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        Wpm0203Activity wpm0203Activity = this.f55795a;
        Wpm0203Activity.e eVar = wpm0203Activity.f55619f;
        if (eVar != null) {
            return eVar.a(Wpm0203Activity.G3(wpm0203Activity), Wpm0203Activity.F3(wpm0203Activity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
