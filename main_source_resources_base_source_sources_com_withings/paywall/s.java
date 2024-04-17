package com.withings.paywall;

import com.withings.paywall.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.s0;
/* compiled from: PaywallAnalytics.kt */
/* loaded from: classes4.dex */
public final class s {
    public static void a() {
        v70.a.c("advertising", null, 2);
    }

    public static void b(w error) {
        String str;
        String str2;
        kotlin.jvm.internal.u.j(error, "error");
        if (kotlin.jvm.internal.u.e(error, w.a.f43706a)) {
            str = "already_purchased_other_account";
        } else if (kotlin.jvm.internal.u.e(error, w.c.f43708a)) {
            str = "cannot_purchase";
        } else if (kotlin.jvm.internal.u.e(error, w.d.f43709a)) {
            str = "unavailable_product";
        } else if (error instanceof w.b) {
            str = "generic_error";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (error instanceof w.b) {
            str2 = ((w.b) error).a();
        } else {
            str2 = "";
        }
        v70.a.c("error_popup", s0.j(new nm0.j("error_key", str), new nm0.j("error_detail", str2)), 2);
    }

    public static void c() {
        v70.a.c("paywall", null, 2);
    }
}
