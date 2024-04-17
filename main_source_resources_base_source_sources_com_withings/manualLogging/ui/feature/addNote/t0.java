package com.withings.manualLogging.ui.feature.addNote;

import androidx.lifecycle.k1;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
public final class t0 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41588a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(AddManualLogActivity addManualLogActivity) {
        this.f41588a = addManualLogActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <T extends androidx.lifecycle.g1> T create(Class<T> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        AddManualLogActivity addManualLogActivity = this.f41588a;
        o1 o1Var = addManualLogActivity.f40702i;
        if (o1Var != null) {
            return o1Var.a(AddManualLogActivity.D3(addManualLogActivity), AddManualLogActivity.C3(addManualLogActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
