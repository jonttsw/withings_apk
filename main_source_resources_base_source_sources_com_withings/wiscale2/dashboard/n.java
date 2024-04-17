package com.withings.wiscale2.dashboard;

import android.content.Context;
import androidx.lifecycle.j0;
import com.withings.device.Device;
import com.withings.user.User;
import com.withings.wiscale2.dashboard.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: DashboardCategories.kt */
/* loaded from: classes4.dex */
public final class n extends j0<List<? extends com.withings.wiscale2.dashboard.item.model.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.withings.wiscale2.dashboard.item.model.e> f50590a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f50591b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f50592c;

    /* compiled from: DashboardCategories.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<List<? extends com.withings.wiscale2.dashboard.item.model.c>, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f50594b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z5) {
            super(1);
            this.f50594b = z5;
        }

        @Override // ym0.l
        public final y invoke(List<? extends com.withings.wiscale2.dashboard.item.model.c> list) {
            List<? extends com.withings.wiscale2.dashboard.item.model.c> list2 = list;
            kotlin.jvm.internal.u.g(list2);
            ArrayList G = kotlin.collections.x.G(list2);
            ArrayList arrayList = new ArrayList();
            Iterator it = G.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                com.withings.wiscale2.dashboard.item.model.c cVar = (com.withings.wiscale2.dashboard.item.model.c) next;
                boolean z5 = true;
                if (cVar.b() == null && !(!cVar.e().isEmpty())) {
                    z5 = false;
                }
                if (cVar.g() && (this.f50594b || z5)) {
                    arrayList.add(next);
                }
            }
            n.this.postValue(arrayList);
            return y.f85009a;
        }
    }

    /* compiled from: DashboardCategories.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<fl.p> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f50595a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final fl.p invoke() {
            return fl.p.f67672b.a();
        }
    }

    public n(User user, List<? extends Device> list, Context context, CoroutineScope coroutineScope, boolean z5) {
        gl.d dVar;
        List<Integer> c11;
        List<Integer> c12;
        kotlin.jvm.internal.u.j(context, "context");
        this.f50590a = kotlin.collections.x.V(new qb0.e(context, user, coroutineScope));
        this.f50591b = nm0.h.b(b.f50595a);
        List<? extends Device> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            fl.o j5 = ((fl.p) this.f50591b.getValue()).j(((Device) next).getModelId());
            gl.d dVar2 = j5 instanceof gl.d ? (gl.d) j5 : null;
            if (dVar2 != null && (c12 = dVar2.c()) != null && c12.contains(12)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new qb0.g(user, (Device) it2.next(), coroutineScope));
        }
        this.f50592c = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list2) {
            fl.o j11 = ((fl.p) this.f50591b.getValue()).j(((Device) obj).getModelId());
            if (j11 instanceof gl.d) {
                dVar = (gl.d) j11;
            } else {
                dVar = null;
            }
            if (dVar != null && (c11 = dVar.c()) != null && c11.contains(35)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(kotlin.collections.x.y(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new qb0.b(user, (Device) it3.next(), coroutineScope));
        }
        addSource(new xw.k(kotlin.collections.x.l0(arrayList4, kotlin.collections.x.l0(this.f50592c, this.f50590a))), new g.b(new a(z5)));
    }
}
