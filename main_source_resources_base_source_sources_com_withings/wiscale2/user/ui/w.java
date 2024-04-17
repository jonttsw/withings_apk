package com.withings.wiscale2.user.ui;

import android.content.Context;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.withings.user.User;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: EditUserMeasureActivity.kt */
/* loaded from: classes5.dex */
public final class w extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final User f62139a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f62140b;

    /* renamed from: c  reason: collision with root package name */
    private final vf.c f62141c;

    /* renamed from: d  reason: collision with root package name */
    private final oi0.b f62142d;

    /* renamed from: e  reason: collision with root package name */
    private final m70.i f62143e;

    /* renamed from: f  reason: collision with root package name */
    private final kn.e f62144f;

    /* renamed from: g  reason: collision with root package name */
    private final fl.p f62145g;

    /* renamed from: h  reason: collision with root package name */
    private final q70.b f62146h;

    /* renamed from: i  reason: collision with root package name */
    private final q70.l f62147i;

    /* renamed from: j  reason: collision with root package name */
    private final om.d f62148j;

    /* renamed from: k  reason: collision with root package name */
    private final j0 f62149k;

    /* renamed from: l  reason: collision with root package name */
    private final j0 f62150l;

    /* renamed from: m  reason: collision with root package name */
    private final k0<Exception> f62151m;

    /* renamed from: n  reason: collision with root package name */
    private final k0<Boolean> f62152n;

    /* renamed from: o  reason: collision with root package name */
    private final k0<Boolean> f62153o;

    /* renamed from: p  reason: collision with root package name */
    private final k0<User> f62154p;

    /* renamed from: q  reason: collision with root package name */
    private final k0<Boolean> f62155q;

    /* compiled from: EditUserMeasureActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<om.a, l70.u> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f62156a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final l70.u invoke(om.a aVar) {
            om.a it = aVar;
            kotlin.jvm.internal.u.j(it, "it");
            return it.b();
        }
    }

    /* compiled from: EditUserMeasureActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<om.a, l70.u> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f62157a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final l70.u invoke(om.a aVar) {
            om.a it = aVar;
            kotlin.jvm.internal.u.j(it, "it");
            return it.e();
        }
    }

    public w(User user, boolean z5, Context context, vf.c accountManager, oi0.b syncManager, m70.i userManager, kn.e deviceManager, fl.p pVar, q70.b bVar, q70.l lVar, q70.j jVar, l70.w unitPreferencesRepository) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(accountManager, "accountManager");
        kotlin.jvm.internal.u.j(syncManager, "syncManager");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(unitPreferencesRepository, "unitPreferencesRepository");
        this.f62139a = user;
        this.f62140b = z5;
        this.f62141c = accountManager;
        this.f62142d = syncManager;
        this.f62143e = userManager;
        this.f62144f = deviceManager;
        this.f62145g = pVar;
        this.f62146h = bVar;
        this.f62147i = lVar;
        om.d dVar = new om.d(jVar, h1.a(this), context, unitPreferencesRepository, userManager);
        this.f62148j = dVar;
        this.f62149k = e1.b(dVar, a.f62156a);
        this.f62150l = e1.b(dVar, b.f62157a);
        this.f62151m = xw.d.b(null);
        Boolean bool = Boolean.FALSE;
        this.f62152n = xw.d.b(bool);
        this.f62153o = xw.d.b(bool);
        this.f62154p = xw.d.b(null);
        this.f62155q = xw.d.b(bool);
    }

    public final k0<Boolean> A0() {
        return this.f62155q;
    }

    public final k0<User> B0() {
        return this.f62154p;
    }

    public final k0<Boolean> F0() {
        return this.f62153o;
    }

    public final j0 G0() {
        return this.f62150l;
    }

    public final void K0(int i11) {
        this.f62148j.E(i11);
    }

    public final void M0(int i11) {
        this.f62148j.G(i11);
    }

    public final void O0(Double d11, Double d12) {
        int a11 = an0.a.a(d11.doubleValue() * 100);
        double doubleValue = d12.doubleValue();
        this.f62155q.postValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new v(this, a11, doubleValue, null), 2, null);
    }

    public final k0<Exception> t0() {
        return this.f62151m;
    }

    public final k0<Boolean> y0() {
        return this.f62152n;
    }

    public final j0 z0() {
        return this.f62149k;
    }
}
