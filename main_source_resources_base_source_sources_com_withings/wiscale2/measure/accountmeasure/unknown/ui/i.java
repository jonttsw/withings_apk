package com.withings.wiscale2.measure.accountmeasure.unknown.ui;

import android.app.Application;
import androidx.lifecycle.e1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: UnknownMeasuresActivity.kt */
/* loaded from: classes5.dex */
public final class i extends androidx.lifecycle.b {

    /* renamed from: a */
    private final ih0.a f58354a;

    /* renamed from: b */
    private final j0 f58355b;

    /* renamed from: c */
    private final jh0.e f58356c;

    /* renamed from: d */
    private final xw.f f58357d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnknownMeasuresActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends w implements l<List<jh0.d>, List<MeasuresGroup>> {

        /* renamed from: a */
        public static final a f58358a = new w(1);

        @Override // ym0.l
        public final List<MeasuresGroup> invoke(List<jh0.d> list) {
            List<jh0.d> list2 = list;
            u.g(list2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((jh0.d) obj).c()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((jh0.d) it.next()).b());
            }
            return arrayList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnknownMeasuresActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements l<User, Boolean> {

        /* renamed from: a */
        public static final b f58359a = new w(1);

        @Override // ym0.l
        public final Boolean invoke(User user) {
            User it = user;
            u.j(it, "it");
            return Boolean.valueOf(!it.D());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnknownMeasuresActivity.kt */
    /* loaded from: classes5.dex */
    public static final class c extends w implements l<List<User>, List<Object>> {

        /* renamed from: a */
        public static final c f58360a = new w(1);

        @Override // ym0.l
        public final List<Object> invoke(List<User> list) {
            List<User> users = list;
            u.j(users, "users");
            List<User> list2 = users;
            ArrayList arrayList = new ArrayList(x.y(list2, 10));
            for (User user : list2) {
                arrayList.add(new UserItemData(user, null));
            }
            return x.m0("add-user-cell", arrayList);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Application application, m70.i iVar, ih0.a unknownMeasuresManager, int i11) {
        super(application);
        u.j(unknownMeasuresManager, "unknownMeasuresManager");
        this.f58354a = unknownMeasuresManager;
        this.f58355b = e1.b(new m70.a(h1.a(this), iVar, b.f58359a), c.f58360a);
        jh0.e eVar = new jh0.e(unknownMeasuresManager, i11, h1.a(this).getCoroutineContext());
        this.f58356c = eVar;
        this.f58357d = xw.d.f(e1.b(eVar, a.f58358a));
    }

    public static final /* synthetic */ ih0.a f0(i iVar) {
        return iVar.f58354a;
    }

    public final xw.f g0() {
        return this.f58357d;
    }

    public final jh0.e i0() {
        return this.f58356c;
    }

    public final j0 j0() {
        return this.f58355b;
    }

    public final void k0() {
        ArrayList arrayList;
        List<? extends jh0.d> value = this.f58356c.getValue();
        if (value != null) {
            List<? extends jh0.d> list = value;
            arrayList = new ArrayList(x.y(list, 10));
            for (jh0.d dVar : list) {
                dVar.d(true);
                arrayList.add(dVar.b());
            }
        } else {
            arrayList = null;
        }
        this.f58357d.setValue(arrayList);
    }

    public final void m0(jh0.d dVar) {
        ArrayList arrayList;
        jh0.e eVar = this.f58356c;
        List<? extends jh0.d> value = eVar.getValue();
        if (value != null) {
            List<? extends jh0.d> list = value;
            arrayList = new ArrayList(x.y(list, 10));
            for (jh0.d dVar2 : list) {
                if (dVar2.b().getId() == dVar.b().getId()) {
                    dVar2 = dVar;
                }
                arrayList.add(dVar2);
            }
        } else {
            arrayList = null;
        }
        eVar.setValue(arrayList);
    }
}
