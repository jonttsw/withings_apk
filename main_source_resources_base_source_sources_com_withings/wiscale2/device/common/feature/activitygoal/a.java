package com.withings.wiscale2.device.common.feature.activitygoal;

import android.content.Context;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.device.Device;
import com.withings.target.data.TargetRepository;
import com.withings.user.User;
/* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class a extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final User f50911a;

    /* renamed from: b  reason: collision with root package name */
    private final TargetRepository f50912b;

    /* renamed from: c  reason: collision with root package name */
    private final fy.v f50913c;

    /* renamed from: d  reason: collision with root package name */
    private final qc0.k f50914d;

    /* renamed from: e  reason: collision with root package name */
    private final f f50915e;

    /* renamed from: f  reason: collision with root package name */
    private final xw.p<om.a, Integer, String> f50916f;

    /* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
    /* renamed from: com.withings.wiscale2.device.common.feature.activitygoal.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0688a extends kotlin.jvm.internal.w implements ym0.q<xw.p<om.a, Integer, String>, om.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0688a f50917a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(xw.p<om.a, Integer, String> pVar, om.a aVar, Integer num) {
            xw.p<om.a, Integer, String> liveData = pVar;
            om.a units = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(liveData, "liveData");
            kotlin.jvm.internal.u.j(units, "units");
            liveData.setValue(jm.a.c(units.c(), 36, intValue, 0, 0, 60).toString());
            return nm0.y.f85009a;
        }
    }

    public a(User user, Device device, TargetRepository targetRepository, fy.v vVar, Context context, m70.i userManager, l70.w unitPreferencesRepository, fy.p pVar, q70.j jVar, cy.a aVar) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(unitPreferencesRepository, "unitPreferencesRepository");
        this.f50911a = user;
        this.f50912b = targetRepository;
        this.f50913c = vVar;
        this.f50914d = new qc0.k(h1.a(this), user, device, aVar, pVar);
        om.d dVar = new om.d(jVar, h1.a(this), context, unitPreferencesRepository, userManager);
        f fVar = new f(h1.a(this), device.getUserId(), device, targetRepository, userManager, pVar);
        this.f50915e = fVar;
        this.f50916f = new xw.p<>(dVar, fVar, C0688a.f50917a);
    }

    public final f j0() {
        return this.f50915e;
    }

    public final xw.p<om.a, Integer, String> k0() {
        return this.f50916f;
    }

    public final qc0.k m0() {
        return this.f50914d;
    }
}
