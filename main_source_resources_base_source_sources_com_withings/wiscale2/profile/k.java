package com.withings.wiscale2.profile;

import androidx.recyclerview.widget.m;
import com.withings.partner.model.Partner;
/* compiled from: ProfilePartnerAdapter.kt */
/* loaded from: classes5.dex */
public final class k extends m.f<Partner> {
    @Override // androidx.recyclerview.widget.m.f
    public final boolean areContentsTheSame(Partner partner, Partner partner2) {
        Partner oldItem = partner;
        Partner newItem = partner2;
        kotlin.jvm.internal.u.j(oldItem, "oldItem");
        kotlin.jvm.internal.u.j(newItem, "newItem");
        return false;
    }

    @Override // androidx.recyclerview.widget.m.f
    public final boolean areItemsTheSame(Partner partner, Partner partner2) {
        Partner oldItem = partner;
        Partner newItem = partner2;
        kotlin.jvm.internal.u.j(oldItem, "oldItem");
        kotlin.jvm.internal.u.j(newItem, "newItem");
        if (oldItem.l() == newItem.l()) {
            return true;
        }
        return false;
    }
}
