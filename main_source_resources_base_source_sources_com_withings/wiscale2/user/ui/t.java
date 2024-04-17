package com.withings.wiscale2.user.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class t implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditUserMeasureActivity f62132a;

    public t(EditUserMeasureActivity editUserMeasureActivity) {
        this.f62132a = editUserMeasureActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        EditUserMeasureActivity editUserMeasureActivity = this.f62132a;
        x xVar = editUserMeasureActivity.f61798k;
        if (xVar != null) {
            return xVar.a(EditUserMeasureActivity.B3(editUserMeasureActivity), EditUserMeasureActivity.E3(editUserMeasureActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
