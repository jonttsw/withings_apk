package com.withings.wiscale2.settings;

import android.app.Application;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class z implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DebugDeeplinkActivity f60400a;

    public z(DebugDeeplinkActivity debugDeeplinkActivity) {
        this.f60400a = debugDeeplinkActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        Application application = this.f60400a.getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        m70.i b10 = m70.i.b();
        kotlin.jvm.internal.u.i(b10, "get(...)");
        return new a0(application, b10);
    }
}
