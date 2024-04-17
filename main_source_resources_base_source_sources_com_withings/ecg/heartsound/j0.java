package com.withings.ecg.heartsound;

import android.app.Application;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.withings.ecg.model.HeartSignalRepository;
/* compiled from: Extensions.kt */
/* loaded from: classes3.dex */
public final class j0 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartSoundListActivity f38481a;

    public j0(HeartSoundListActivity heartSoundListActivity) {
        this.f38481a = heartSoundListActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        HeartSoundListActivity heartSoundListActivity = this.f38481a;
        Application application = heartSoundListActivity.getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        HeartSignalRepository heartSignalRepository = androidx.compose.foundation.lazy.layout.d.f4443b;
        if (heartSignalRepository != null) {
            return new u0(application, heartSignalRepository, HeartSoundListActivity.B3(heartSoundListActivity), HeartSoundListActivity.z3(heartSoundListActivity));
        }
        kotlin.jvm.internal.u.s("heartSignalRepository");
        throw null;
    }
}
