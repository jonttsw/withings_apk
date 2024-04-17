package com.withings.wiscale2.settings;

import android.content.Context;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: UnitsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/settings/UnitsActivityViewModel;", "Landroidx/lifecycle/g1;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UnitsActivityViewModel extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final om.d f59814a;

    static {
        int i11 = om.d.f87714f;
    }

    @Inject
    public UnitsActivityViewModel(Context context, l70.w unitPreferencesRepository, m70.i userManager, q70.j jVar) {
        kotlin.jvm.internal.u.j(unitPreferencesRepository, "unitPreferencesRepository");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        this.f59814a = new om.d(jVar, androidx.lifecycle.h1.a(this), context, unitPreferencesRepository, userManager);
    }

    public final om.d f0() {
        return this.f59814a;
    }

    public final void g0(int i11) {
        this.f59814a.C(i11);
    }

    public final void i0(int i11) {
        this.f59814a.E(i11);
    }

    public final void j0(int i11) {
        this.f59814a.F(i11);
    }

    public final void k0(int i11) {
        this.f59814a.G(i11);
    }
}
