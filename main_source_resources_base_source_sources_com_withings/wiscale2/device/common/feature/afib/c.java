package com.withings.wiscale2.device.common.feature.afib;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class c implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AfibActivationActivity f51014a;

    public c(AfibActivationActivity afibActivationActivity) {
        this.f51014a = afibActivationActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        AfibActivationActivity afibActivationActivity = this.f51014a;
        i iVar = afibActivationActivity.f50976h;
        if (iVar != null) {
            return iVar.a(AfibActivationActivity.B3(afibActivationActivity));
        }
        kotlin.jvm.internal.u.s("afibActivationViewModelFactory");
        throw null;
    }
}
