package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.app.Application;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class v0 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0 f61471a;

    public v0(o0 o0Var) {
        this.f61471a = o0Var;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        Application application = this.f61471a.requireActivity().getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        return new f(application);
    }
}
