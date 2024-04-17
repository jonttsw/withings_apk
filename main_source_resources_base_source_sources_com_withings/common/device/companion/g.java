package com.withings.common.device.companion;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.k0;
import com.withings.device.Device;
import ej.w;
import fl.o;
import fl.p;
import gl.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
/* compiled from: CompanionLinkActivity.kt */
/* loaded from: classes3.dex */
public final class g extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final w f35097a;

    /* renamed from: b  reason: collision with root package name */
    private final kn.e f35098b;

    /* renamed from: c  reason: collision with root package name */
    private final DeviceCompanionLinkProvider f35099c;

    /* renamed from: d  reason: collision with root package name */
    private final fl.e f35100d;

    /* renamed from: e  reason: collision with root package name */
    private final Device f35101e;

    /* renamed from: f  reason: collision with root package name */
    private final k0<b> f35102f;

    /* renamed from: g  reason: collision with root package name */
    private final k0<xw.c<y>> f35103g;

    /* renamed from: h  reason: collision with root package name */
    private final o f35104h;

    /* renamed from: i  reason: collision with root package name */
    private final v f35105i;

    /* renamed from: j  reason: collision with root package name */
    private int f35106j;

    /* renamed from: k  reason: collision with root package name */
    private final List<a> f35107k;

    /* renamed from: l  reason: collision with root package name */
    private gj.i<? extends xi.b> f35108l;

    /* compiled from: CompanionLinkActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f35109a;

        /* renamed from: b  reason: collision with root package name */
        private final int f35110b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f35111c;

        public a(int i11, int i12, Object image) {
            u.j(image, "image");
            this.f35109a = i11;
            this.f35110b = i12;
            this.f35111c = image;
        }

        public final int a() {
            return this.f35110b;
        }

        public final Object b() {
            return this.f35111c;
        }

        public final int c() {
            return this.f35109a;
        }
    }

    /* compiled from: CompanionLinkActivity.kt */
    /* loaded from: classes3.dex */
    public static abstract class b {

        /* compiled from: CompanionLinkActivity.kt */
        /* loaded from: classes3.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f35112a = new a();

            private a() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return true;
            }

            public final int hashCode() {
                return 1617142238;
            }

            public final String toString() {
                return "Failure";
            }
        }

        /* compiled from: CompanionLinkActivity.kt */
        /* renamed from: com.withings.common.device.companion.g$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0457b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final a f35113a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0457b(a instructionPage) {
                super(0);
                u.j(instructionPage, "instructionPage");
                this.f35113a = instructionPage;
            }

            public final a a() {
                return this.f35113a;
            }
        }

        /* compiled from: CompanionLinkActivity.kt */
        /* loaded from: classes3.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f35114a = new c();

            private c() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return true;
            }

            public final int hashCode() {
                return 1594498190;
            }

            public final String toString() {
                return "Searching";
            }
        }

        /* compiled from: CompanionLinkActivity.kt */
        /* loaded from: classes3.dex */
        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f35115a = new d();

            private d() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return true;
            }

            public final int hashCode() {
                return 836546647;
            }

            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(int i11) {
            this();
        }

        private b() {
        }
    }

    public g(w wVar, kn.e eVar, DeviceCompanionLinkProvider deviceCompanionLinkProvider, fl.e eVar2, p pVar, Device device) {
        v vVar;
        u.j(deviceCompanionLinkProvider, "deviceCompanionLinkProvider");
        u.j(device, "device");
        this.f35097a = wVar;
        this.f35098b = eVar;
        this.f35099c = deviceCompanionLinkProvider;
        this.f35100d = eVar2;
        this.f35101e = device;
        this.f35102f = xw.d.b(null);
        k0<xw.c<y>> b10 = xw.d.b(null);
        this.f35103g = b10;
        o g11 = pVar.g(device);
        this.f35104h = g11;
        if (g11 instanceof v) {
            vVar = (v) g11;
        } else {
            vVar = null;
        }
        this.f35105i = vVar;
        eVar2.j(device);
        if (vVar == null) {
            this.f35107k = i0.f76187a;
            b10.setValue(new xw.c<>(y.f85009a));
            return;
        }
        List<v.b> P = vVar.P();
        ArrayList arrayList = new ArrayList(x.y(P, 10));
        for (v.b bVar : P) {
            arrayList.add(new a(bVar.c(), bVar.a(), bVar.b()));
        }
        this.f35107k = arrayList;
        if (!arrayList.isEmpty()) {
            this.f35102f.setValue(new b.C0457b((a) arrayList.get(this.f35106j)));
            return;
        }
        this.f35102f.setValue(b.c.f35114a);
        v vVar2 = this.f35105i;
        com.withings.common.device.e l5 = vVar2 != null ? vVar2.l(this.f35101e, new l(this)) : null;
        this.f35108l = l5;
        this.f35097a.o(l5);
    }

    public static final void f0(g gVar, String str) {
        gVar.getClass();
        x70.b.t(gVar, "companion device link failed : " + str, new Object[0]);
        gj.i<? extends xi.b> iVar = gVar.f35108l;
        if (iVar != null) {
            gVar.f35097a.K(iVar);
        }
        gVar.f35108l = null;
        gVar.f35102f.setValue(b.a.f35112a);
    }

    public static final void q0(g gVar, String str) {
        gj.i<? extends xi.b> iVar = gVar.f35108l;
        if (iVar != null) {
            gVar.f35097a.K(iVar);
        }
        gVar.f35108l = null;
        BuildersKt__Builders_commonKt.launch$default(h1.a(gVar), Dispatchers.getIO(), null, new m(gVar, str, null), 2, null);
        gVar.f35102f.setValue(b.d.f35115a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        gj.i<? extends xi.b> iVar = this.f35108l;
        if (iVar != null) {
            this.f35097a.K(iVar);
        }
        this.f35100d.h(this.f35101e);
    }

    public final k0<xw.c<y>> r0() {
        return this.f35103g;
    }

    public final k0<b> t0() {
        return this.f35102f;
    }

    public final void y0() {
        com.withings.common.device.e eVar;
        k0<b> k0Var = this.f35102f;
        b value = k0Var.getValue();
        if (value instanceof b.C0457b) {
            int i11 = this.f35106j;
            List<a> list = this.f35107k;
            if (i11 < x.M(list)) {
                int i12 = this.f35106j + 1;
                this.f35106j = i12;
                k0Var.setValue(new b.C0457b(list.get(i12)));
                return;
            }
            k0Var.setValue(b.c.f35114a);
            v vVar = this.f35105i;
            if (vVar != null) {
                eVar = vVar.l(this.f35101e, new l(this));
            } else {
                eVar = null;
            }
            this.f35108l = eVar;
            this.f35097a.o(eVar);
            return;
        }
        boolean z5 = value instanceof b.d;
        k0<xw.c<y>> k0Var2 = this.f35103g;
        if (z5) {
            k0Var2.setValue(new xw.c<>(y.f85009a));
        } else if (value instanceof b.a) {
            k0Var2.setValue(new xw.c<>(y.f85009a));
        } else {
            boolean z11 = value instanceof b.c;
        }
    }
}
