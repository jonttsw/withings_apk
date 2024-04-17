package com.withings.medicalreport.ui;

import android.os.Bundle;
import com.withings.wiscale2.C1987R;
/* compiled from: RecipientTypeFragmentDirections.kt */
/* loaded from: classes4.dex */
final class e0 implements r8.l {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f42244a;

    public e0(boolean z5) {
        this.f42244a = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e0) && this.f42244a == ((e0) obj).f42244a) {
            return true;
        }
        return false;
    }

    @Override // r8.l
    public final int getActionId() {
        return C1987R.id.action_recipientTypeFragment_to_recipientListFragment;
    }

    @Override // r8.l
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("shareToProfessional", this.f42244a);
        return bundle;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42244a);
    }

    public final String toString() {
        return androidx.appcompat.app.h.d(new StringBuilder("ActionRecipientTypeFragmentToRecipientListFragment(shareToProfessional="), this.f42244a, ")");
    }
}
