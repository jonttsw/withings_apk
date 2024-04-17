package com.withings.medicalreport.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.withings.medicalreport.ui.RecipientListFragment;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class c0 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecipientListFragment f42238a;

    public c0(RecipientListFragment recipientListFragment) {
        this.f42238a = recipientListFragment;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        return new RecipientListFragment.b(RecipientListFragment.t1(this.f42238a).a());
    }
}
