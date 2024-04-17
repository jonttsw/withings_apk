package com.withings.wiscale2.user.ui.profile;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class e0 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditProfileActivity f61949a;

    public e0(EditProfileActivity editProfileActivity) {
        this.f61949a = editProfileActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        EditProfileActivity editProfileActivity = this.f61949a;
        y0 y0Var = editProfileActivity.f61845g;
        if (y0Var != null) {
            return y0Var.a(EditProfileActivity.I3(editProfileActivity), !editProfileActivity.K3(), new va0.d(editProfileActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
