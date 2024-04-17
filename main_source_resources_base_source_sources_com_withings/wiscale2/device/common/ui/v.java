package com.withings.wiscale2.device.common.ui;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.conversation.BondingMigrationConversation;
import com.withings.device.Device;
import dj.t;
/* compiled from: DeviceBondingActivity.kt */
/* loaded from: classes5.dex */
public final class v extends androidx.lifecycle.g1 implements BondingMigrationConversation.b, t.a {

    /* renamed from: a  reason: collision with root package name */
    private final kn.e f54099a;

    /* renamed from: b  reason: collision with root package name */
    private final ej.w f54100b;

    /* renamed from: c  reason: collision with root package name */
    private final u70.i f54101c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f54102d = nm0.h.b(new a());

    /* renamed from: e  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f54103e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f54104f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.lifecycle.k0<String> f54105g;

    /* renamed from: h  reason: collision with root package name */
    private BondingMigrationConversation f54106h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f54107i;

    /* compiled from: DeviceBondingActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<gl.t> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final gl.t invoke() {
            fl.p a11 = fl.p.f67672b.a();
            v vVar = v.this;
            Device f11 = vVar.f54099a.f(vVar.f54101c);
            kotlin.jvm.internal.u.i(f11, "getByMac(...)");
            fl.o g11 = a11.g(f11);
            kotlin.jvm.internal.u.h(g11, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceWithBonding");
            return (gl.t) g11;
        }
    }

    public v(kn.e eVar, ej.w wVar, u70.i iVar) {
        this.f54099a = eVar;
        this.f54100b = wVar;
        this.f54101c = iVar;
        androidx.lifecycle.k0<Integer> k0Var = new androidx.lifecycle.k0<>();
        this.f54103e = k0Var;
        androidx.lifecycle.k0<Boolean> k0Var2 = new androidx.lifecycle.k0<>();
        this.f54104f = k0Var2;
        androidx.lifecycle.k0<String> k0Var3 = new androidx.lifecycle.k0<>();
        this.f54105g = k0Var3;
        BondingMigrationConversation bondingMigrationConversation = (BondingMigrationConversation) wVar.y(iVar, BondingMigrationConversation.class);
        if (bondingMigrationConversation != null) {
            this.f54106h = bondingMigrationConversation;
            bondingMigrationConversation.L(this);
            dj.t E = wVar.E(bondingMigrationConversation.v());
            k0Var3.setValue(E.a());
            E.e(this);
            k0Var.setValue(11);
            return;
        }
        k0Var2.setValue(Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.withings.common.device.conversation.a] */
    private final void q0() {
        BondingMigrationConversation bondingMigrationConversation;
        Integer value = this.f54103e.getValue();
        if (value != null && value.intValue() == 33 && (bondingMigrationConversation = this.f54106h) != null) {
            cj.b x11 = bondingMigrationConversation.x();
            BondingMigrationConversation bondingMigrationConversation2 = new BondingMigrationConversation((gl.t) this.f54102d.getValue(), new Object());
            bondingMigrationConversation2.L(this);
            this.f54106h = bondingMigrationConversation2;
            BondingMigrationConversation bondingMigrationConversation3 = (BondingMigrationConversation) this.f54100b.O(x11, bondingMigrationConversation2, BondingMigrationConversation.class);
        }
    }

    @Override // dj.t.a
    public final synchronized void D(dj.t lifecycle, dj.u event) {
        try {
            kotlin.jvm.internal.u.j(lifecycle, "lifecycle");
            kotlin.jvm.internal.u.j(event, "event");
            if (!this.f54107i) {
                String a11 = lifecycle.a();
                kotlin.jvm.internal.u.i(a11, "getCurrentState(...)");
                if (!kotlin.jvm.internal.u.e(a11, "connected") && !kotlin.jvm.internal.u.e(a11, "conversing")) {
                    this.f54107i = true;
                    q0();
                }
            }
            this.f54105g.setValue(lifecycle.a());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation wppDeviceConversation, Exception exc) {
        this.f54107i = false;
        this.f54103e.postValue(33);
    }

    public final androidx.lifecycle.k0<String> i0() {
        return this.f54105g;
    }

    public final androidx.lifecycle.k0<Boolean> j0() {
        return this.f54104f;
    }

    public final boolean k0() {
        return this.f54107i;
    }

    public final androidx.lifecycle.k0<Integer> m0() {
        return this.f54103e;
    }

    @Override // com.withings.common.device.conversation.BondingMigrationConversation.b
    public final void n() {
        this.f54103e.postValue(44);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        BondingMigrationConversation bondingMigrationConversation = this.f54106h;
        if (bondingMigrationConversation != null) {
            this.f54100b.E(bondingMigrationConversation.v()).f(this);
        }
    }

    public final void p0() {
        BondingMigrationConversation bondingMigrationConversation = this.f54106h;
        if (bondingMigrationConversation != null) {
            if (bondingMigrationConversation.w() == WppDeviceConversation.State.f33150b) {
                bondingMigrationConversation.G(Boolean.FALSE);
            } else {
                bondingMigrationConversation.p();
            }
        }
    }

    public final void r0() {
        this.f54103e.setValue(22);
    }

    public final void t0() {
        this.f54104f.setValue(Boolean.TRUE);
    }

    public final void y0() {
        BondingMigrationConversation bondingMigrationConversation = this.f54106h;
        if (bondingMigrationConversation != null && bondingMigrationConversation.w() == WppDeviceConversation.State.f33150b) {
            bondingMigrationConversation.G(Boolean.TRUE);
        }
    }

    public final void z0() {
        this.f54103e.setValue(22);
    }
}
