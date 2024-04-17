package com.withings.wiscale2.device.hwa08.postinstall;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.withings.common.device.conversation.SetTrackerPositionConversation;
import com.withings.device.Device;
import com.withings.user.User;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import java.util.List;
/* compiled from: Hwa08PostInstallViewModel.kt */
/* loaded from: classes5.dex */
public final class c0 extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Device f54431a;

    /* renamed from: b  reason: collision with root package name */
    private final ej.w f54432b;

    /* renamed from: c  reason: collision with root package name */
    private final kn.e f54433c;

    /* renamed from: d  reason: collision with root package name */
    private final bx.a f54434d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f54435e;

    /* renamed from: f  reason: collision with root package name */
    private final xw.n<nm0.y> f54436f;

    /* renamed from: g  reason: collision with root package name */
    private final xw.n<nm0.y> f54437g;

    /* renamed from: h  reason: collision with root package name */
    private final xw.n<nm0.y> f54438h;

    /* renamed from: i  reason: collision with root package name */
    private final xw.n<nm0.y> f54439i;

    /* renamed from: j  reason: collision with root package name */
    private final xw.n<nm0.y> f54440j;

    /* renamed from: k  reason: collision with root package name */
    private final xw.n<nm0.y> f54441k;

    /* renamed from: l  reason: collision with root package name */
    private final xw.n<nm0.y> f54442l;

    /* renamed from: m  reason: collision with root package name */
    private final xw.n<nm0.y> f54443m;

    /* renamed from: n  reason: collision with root package name */
    private final xw.n<nm0.y> f54444n;

    /* renamed from: o  reason: collision with root package name */
    private final xw.n<nm0.y> f54445o;

    /* renamed from: p  reason: collision with root package name */
    private final xw.n<nm0.y> f54446p;

    /* renamed from: q  reason: collision with root package name */
    private final xw.n<nm0.y> f54447q;

    /* renamed from: r  reason: collision with root package name */
    private final xw.n<nm0.y> f54448r;

    /* renamed from: s  reason: collision with root package name */
    private final xw.n<nm0.y> f54449s;

    /* renamed from: t  reason: collision with root package name */
    private final xw.n<nm0.y> f54450t;

    /* renamed from: u  reason: collision with root package name */
    private final xw.n<nm0.y> f54451u;

    /* renamed from: v  reason: collision with root package name */
    private k0<Integer> f54452v;

    /* renamed from: w  reason: collision with root package name */
    private final j0 f54453w;

    /* renamed from: x  reason: collision with root package name */
    private final List<xw.n<nm0.y>> f54454x;

    /* renamed from: y  reason: collision with root package name */
    private final List<xw.n<nm0.y>> f54455y;

    /* renamed from: z  reason: collision with root package name */
    private final List<xw.n<nm0.y>> f54456z;

    /* compiled from: Hwa08PostInstallViewModel.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<Integer, LiveData<Boolean>> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<Boolean> invoke(Integer num) {
            boolean z5;
            Integer num2 = num;
            if (num2 != null && (num2.intValue() != 0 || c0.this.f54435e)) {
                z5 = true;
            } else {
                z5 = false;
            }
            return xw.d.a(Boolean.valueOf(z5));
        }
    }

    public c0(User user, Device device, WorkoutManager workoutManager, ej.w wVar, kn.e eVar, bx.a aVar, boolean z5, boolean z11) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(workoutManager, "workoutManager");
        this.f54431a = device;
        this.f54432b = wVar;
        this.f54433c = eVar;
        this.f54434d = aVar;
        this.f54435e = z11;
        xw.n<nm0.y> nVar = new xw.n<>();
        this.f54436f = nVar;
        xw.n<nm0.y> nVar2 = new xw.n<>();
        this.f54437g = nVar2;
        xw.n<nm0.y> nVar3 = new xw.n<>();
        this.f54438h = nVar3;
        xw.n<nm0.y> nVar4 = new xw.n<>();
        this.f54439i = nVar4;
        xw.n<nm0.y> nVar5 = new xw.n<>();
        this.f54440j = nVar5;
        xw.n<nm0.y> nVar6 = new xw.n<>();
        this.f54441k = nVar6;
        xw.n<nm0.y> nVar7 = new xw.n<>();
        this.f54442l = nVar7;
        xw.n<nm0.y> nVar8 = new xw.n<>();
        this.f54443m = nVar8;
        xw.n<nm0.y> nVar9 = new xw.n<>();
        this.f54444n = nVar9;
        xw.n<nm0.y> nVar10 = new xw.n<>();
        this.f54445o = nVar10;
        xw.n<nm0.y> nVar11 = new xw.n<>();
        this.f54446p = nVar11;
        xw.n<nm0.y> nVar12 = new xw.n<>();
        this.f54447q = nVar12;
        xw.n<nm0.y> nVar13 = new xw.n<>();
        this.f54448r = nVar13;
        xw.n<nm0.y> nVar14 = new xw.n<>();
        this.f54449s = nVar14;
        this.f54450t = new xw.n<>();
        this.f54451u = new xw.n<>();
        k0<Integer> b10 = xw.d.b(0);
        this.f54452v = b10;
        this.f54453w = e1.c(b10, new a());
        List<xw.n<nm0.y>> W = kotlin.collections.x.W(nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12, nVar13, nVar14);
        this.f54454x = W;
        List<xw.n<nm0.y>> W2 = kotlin.collections.x.W(nVar10, nVar11, nVar12, nVar14);
        this.f54455y = W2;
        W = z5 ? W2 : W;
        this.f54456z = W;
        aVar.d(true);
        androidx.compose.foundation.lazy.layout.d.j(true);
        W.get(r0()).setValue(null);
    }

    public final xw.n<nm0.y> A0() {
        return this.f54445o;
    }

    public final xw.n<nm0.y> B0() {
        return this.f54447q;
    }

    public final xw.n<nm0.y> F0() {
        return this.f54443m;
    }

    public final xw.n<nm0.y> G0() {
        return this.f54436f;
    }

    public final xw.n<nm0.y> K0() {
        return this.f54440j;
    }

    public final xw.n<nm0.y> M0() {
        return this.f54444n;
    }

    public final xw.n<nm0.y> O0() {
        return this.f54442l;
    }

    public final xw.n<nm0.y> R0() {
        return this.f54441k;
    }

    public final void T0() {
        nm0.y yVar;
        this.f54452v.setValue(Integer.valueOf(r0() + 1));
        xw.n nVar = (xw.n) kotlin.collections.x.N(r0(), this.f54456z);
        if (nVar != null) {
            nVar.setValue(null);
            yVar = nm0.y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            this.f54450t.setValue(null);
        }
    }

    public final void U0() {
        if (r0() != 0) {
            this.f54452v.setValue(Integer.valueOf(r0() - 1));
            this.f54456z.get(r0()).setValue(null);
        } else if (this.f54435e) {
            this.f54451u.setValue(null);
        }
    }

    public final void g0(int i11) {
        cj.d b10 = jl.a.b(this.f54431a);
        SetTrackerPositionConversation setTrackerPositionConversation = new SetTrackerPositionConversation(this.f54433c, i11);
        ej.w wVar = this.f54432b;
        wVar.getClass();
        wVar.u(b10, setTrackerPositionConversation, SetTrackerPositionConversation.class).r();
    }

    public final xw.n<nm0.y> i0() {
        return this.f54449s;
    }

    public final xw.n<nm0.y> j0() {
        return this.f54437g;
    }

    public final xw.n<nm0.y> k0() {
        return this.f54438h;
    }

    public final xw.n<nm0.y> m0() {
        return this.f54448r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f54434d.d(false);
        androidx.compose.foundation.lazy.layout.d.j(false);
        super.onCleared();
    }

    public final xw.n<nm0.y> p0() {
        return this.f54450t;
    }

    public final xw.n<nm0.y> q0() {
        return this.f54451u;
    }

    public final int r0() {
        Integer value = this.f54452v.getValue();
        if (value == null) {
            return 0;
        }
        return value.intValue();
    }

    public final xw.n<nm0.y> t0() {
        return this.f54439i;
    }

    public final j0 y0() {
        return this.f54453w;
    }

    public final xw.n<nm0.y> z0() {
        return this.f54446p;
    }
}
