package com.withings.wiscale2.device.common.feature.afib;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class k implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AfibSettingsActivity f51028a;

    public k(AfibSettingsActivity afibSettingsActivity) {
        this.f51028a = afibSettingsActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        AfibSettingsActivity afibSettingsActivity = this.f51028a;
        t tVar = afibSettingsActivity.f50994g;
        if (tVar != null) {
            return tVar.a(AfibSettingsActivity.z3(afibSettingsActivity));
        }
        kotlin.jvm.internal.u.s("afibViewModelFactory");
        throw null;
    }
}
