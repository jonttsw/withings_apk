package com.withings.medicalreport.ui;

import android.app.Application;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class m implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DateSelectionFragment f42259a;

    public m(DateSelectionFragment dateSelectionFragment) {
        this.f42259a = dateSelectionFragment;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        Application application = this.f42259a.requireActivity().getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        return new u(application);
    }
}
