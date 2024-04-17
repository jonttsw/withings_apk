package com.withings.wiscale2.device.common.screen.ui;

import android.content.Context;
import com.withings.device.Device;
import com.withings.user.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: WorkoutScreenOrderFragment.kt */
/* loaded from: classes5.dex */
public final class h2 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f53330a;

    /* renamed from: b  reason: collision with root package name */
    private final Device f53331b;

    /* renamed from: c  reason: collision with root package name */
    private final User f53332c;

    /* renamed from: d  reason: collision with root package name */
    private final wb0.h f53333d;

    /* renamed from: e  reason: collision with root package name */
    private final rc0.a f53334e;

    /* renamed from: f  reason: collision with root package name */
    private final WorkoutScreenOrderSettingConversation f53335f;

    /* renamed from: g  reason: collision with root package name */
    private List<wp.u> f53336g;

    /* renamed from: h  reason: collision with root package name */
    private final i2 f53337h;

    /* renamed from: i  reason: collision with root package name */
    private final xw.n<Integer> f53338i;

    /* compiled from: WorkoutScreenOrderFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f53339a;

        /* renamed from: b  reason: collision with root package name */
        private final List<wp.u> f53340b;

        public a(int i11, ArrayList arrayList) {
            this.f53339a = i11;
            this.f53340b = arrayList;
        }

        public final int a() {
            return this.f53339a;
        }

        public final List<wp.u> b() {
            return this.f53340b;
        }

        public final int c() {
            return this.f53339a;
        }

        public final List<wp.u> d() {
            return this.f53340b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f53339a == aVar.f53339a && kotlin.jvm.internal.u.e(this.f53340b, aVar.f53340b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f53340b.hashCode() + (Integer.hashCode(this.f53339a) * 31);
        }

        public final String toString() {
            return "WorkoutScreenSettings(maxWorkout=" + this.f53339a + ", screens=" + this.f53340b + ")";
        }
    }

    /* compiled from: WorkoutScreenOrderFragment.kt */
    /* loaded from: classes5.dex */
    static final class b implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f53341a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(ym0.l lVar) {
            this.f53341a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f53341a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f53341a;
        }

        public final int hashCode() {
            return this.f53341a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53341a.invoke(obj);
        }
    }

    public h2(Context context, ej.w wVar, fl.p pVar, Device device, User user) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(user, "user");
        this.f53330a = context;
        this.f53331b = device;
        this.f53332c = user;
        fl.o g11 = pVar.g(device);
        kotlin.jvm.internal.u.h(g11, "null cannot be cast to non-null type com.withings.wiscale2.device.common.DeviceWithWorkoutScreens");
        wb0.h hVar = (wb0.h) g11;
        this.f53333d = hVar;
        this.f53334e = hVar.c0(context);
        this.f53335f = (WorkoutScreenOrderSettingConversation) wVar.y(device.getMacAddress(), WorkoutScreenOrderSettingConversation.class);
        this.f53336g = kotlin.collections.i0.f76187a;
        this.f53337h = new i2(this);
        this.f53338i = new xw.n<>();
    }

    public static final ArrayList p0(h2 h2Var, ArrayList arrayList, int[] iArr) {
        h2Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((wp.u) obj).c()) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        nm0.j jVar = new nm0.j(arrayList2, arrayList3);
        List list = (List) jVar.a();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : (List) jVar.b()) {
            if (((wp.u) obj2).a()) {
                arrayList4.add(obj2);
            } else {
                arrayList5.add(obj2);
            }
        }
        nm0.j jVar2 = new nm0.j(arrayList4, arrayList5);
        List list2 = (List) jVar2.a();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : (List) jVar2.b()) {
            if (((wp.u) obj3).f()) {
                arrayList6.add(obj3);
            } else {
                arrayList7.add(obj3);
            }
        }
        nm0.j jVar3 = new nm0.j(arrayList6, arrayList7);
        return kotlin.collections.x.l0(kotlin.collections.x.D0((List) jVar3.b(), new l2(h2Var)), kotlin.collections.x.l0(kotlin.collections.x.D0((List) jVar3.a(), new l2(h2Var)), kotlin.collections.x.l0(list, kotlin.collections.x.D0(list2, new k2(iArr)))));
    }

    public final Context q0() {
        return this.f53330a;
    }

    public final i2 r0() {
        return this.f53337h;
    }

    public final xw.n<Integer> t0() {
        return this.f53338i;
    }

    public final void y0(int i11) {
        a value;
        List<wp.u> d11;
        wp.u uVar;
        List<wp.u> d12;
        wp.u uVar2;
        i2 i2Var = this.f53337h;
        a value2 = i2Var.getValue();
        if ((value2 == null || (d12 = value2.d()) == null || (uVar2 = (wp.u) kotlin.collections.x.N(i11, d12)) == null || !uVar2.c()) && (value = i2Var.getValue()) != null && (d11 = value.d()) != null && (uVar = (wp.u) kotlin.collections.x.N(i11, d11)) != null && uVar.d()) {
            a value3 = i2Var.getValue();
            if (value3 != null) {
                List<wp.u> d13 = value3.d();
                Integer num = null;
                int i12 = 0;
                if (!(d13 instanceof Collection) || !d13.isEmpty()) {
                    for (wp.u uVar3 : d13) {
                        if (uVar3.a() && (i12 = i12 + 1) < 0) {
                            kotlin.collections.x.J0();
                            throw null;
                        }
                    }
                }
                if (i12 >= value3.c() && !value3.d().get(i11).a()) {
                    xw.n<Integer> nVar = this.f53338i;
                    a value4 = i2Var.getValue();
                    if (value4 != null) {
                        num = Integer.valueOf(value4.c());
                    }
                    kotlin.jvm.internal.u.g(num);
                    nVar.setValue(num);
                    return;
                }
            }
            a value5 = i2Var.getValue();
            if (value5 != null) {
                a aVar = value5;
                aVar.d().get(i11).h(!aVar.d().get(i11).a());
                i2Var.setValue(value5);
            }
        }
    }

    public final void z0() {
        List<wp.u> d11;
        Long l5;
        Long l6;
        List<wp.u> d12;
        Boolean bool;
        i2 i2Var = this.f53337h;
        a value = i2Var.getValue();
        if (value != null && (d11 = value.d()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : d11) {
                if (((wp.u) obj).a()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : this.f53336g) {
                if (((wp.u) obj2).a()) {
                    arrayList2.add(obj2);
                }
            }
            en0.k w11 = en0.r.w(0, Math.max(arrayList2.size(), arrayList.size()));
            if (!(w11 instanceof Collection) || !((Collection) w11).isEmpty()) {
                en0.j it = w11.iterator();
                while (it.hasNext()) {
                    int a11 = it.a();
                    wp.u uVar = (wp.u) kotlin.collections.x.N(a11, arrayList);
                    Boolean bool2 = null;
                    if (uVar != null) {
                        l5 = Long.valueOf(uVar.g());
                    } else {
                        l5 = null;
                    }
                    wp.u uVar2 = (wp.u) kotlin.collections.x.N(a11, arrayList2);
                    if (uVar2 != null) {
                        l6 = Long.valueOf(uVar2.g());
                    } else {
                        l6 = null;
                    }
                    if (kotlin.jvm.internal.u.e(l5, l6)) {
                        wp.u uVar3 = (wp.u) kotlin.collections.x.N(a11, arrayList);
                        if (uVar3 != null) {
                            bool = Boolean.valueOf(uVar3.a());
                        } else {
                            bool = null;
                        }
                        wp.u uVar4 = (wp.u) kotlin.collections.x.N(a11, arrayList2);
                        if (uVar4 != null) {
                            bool2 = Boolean.valueOf(uVar4.a());
                        }
                        if (!kotlin.jvm.internal.u.e(bool, bool2)) {
                        }
                    }
                    a value2 = i2Var.getValue();
                    if (value2 != null && (d12 = value2.d()) != null) {
                        this.f53335f.O(d12);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
