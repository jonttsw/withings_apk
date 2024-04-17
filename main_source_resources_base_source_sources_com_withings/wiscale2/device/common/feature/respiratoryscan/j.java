package com.withings.wiscale2.device.common.feature.respiratoryscan;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import kotlin.jvm.internal.u;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class j implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RespiratoryScanActivationActivity f52455a;

    public j(RespiratoryScanActivationActivity respiratoryScanActivationActivity) {
        this.f52455a = respiratoryScanActivationActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        u.j(modelClass, "modelClass");
        RespiratoryScanActivationActivity respiratoryScanActivationActivity = this.f52455a;
        m mVar = respiratoryScanActivationActivity.f52423g;
        if (mVar != null) {
            return mVar.a(RespiratoryScanActivationActivity.A3(respiratoryScanActivationActivity));
        }
        u.s("viewModelFactory");
        throw null;
    }
}
