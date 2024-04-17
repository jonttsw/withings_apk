package com.withings.paywall;

import android.app.Activity;
import javax.inject.Inject;
/* compiled from: BillingNavigationImpl.kt */
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final a f43606a;

    @Inject
    public d(a aVar) {
        this.f43606a = aVar;
    }

    @Override // com.withings.paywall.c
    public final void a(Activity activity, String planToken) {
        kotlin.jvm.internal.u.j(activity, "<this>");
        kotlin.jvm.internal.u.j(planToken, "planToken");
        this.f43606a.g(activity, planToken);
    }
}
