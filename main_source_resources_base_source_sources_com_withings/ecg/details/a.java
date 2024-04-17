package com.withings.ecg.details;

import android.app.Application;
import androidx.lifecycle.k1;
import com.withings.ecg.model.HeartSignalRepository;
/* compiled from: Extensions.kt */
/* loaded from: classes3.dex */
public final class a implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgDebugScreenActivity f38088a;

    public a(EcgDebugScreenActivity ecgDebugScreenActivity) {
        this.f38088a = ecgDebugScreenActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        EcgDebugScreenActivity ecgDebugScreenActivity = this.f38088a;
        Application application = ecgDebugScreenActivity.getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        HeartSignalRepository heartSignalRepository = androidx.compose.foundation.lazy.layout.d.f4443b;
        if (heartSignalRepository != null) {
            return new e(application, heartSignalRepository, EcgDebugScreenActivity.z3(ecgDebugScreenActivity));
        }
        kotlin.jvm.internal.u.s("heartSignalRepository");
        throw null;
    }
}
