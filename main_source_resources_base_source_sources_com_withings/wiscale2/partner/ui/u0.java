package com.withings.wiscale2.partner.ui;

import android.content.Context;
import com.withings.partner.model.Partner;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Partner f59220a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e0 f59221b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Partner partner, e0 e0Var) {
        super(0);
        this.f59220a = partner;
        this.f59221b = e0Var;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        Context requireContext = this.f59221b.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        return t10.h.a(requireContext, this.f59220a);
    }
}
