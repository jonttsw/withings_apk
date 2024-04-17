package com.withings.wiscale2.dashboard;

import android.content.Context;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import com.withings.device.Device;
import com.withings.user.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.s0;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: DashboardCategories.kt */
/* loaded from: classes4.dex */
public final class g extends j0<List<? extends h>> {

    /* compiled from: DashboardCategories.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<List<? extends com.withings.wiscale2.dashboard.item.model.c>, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f50521b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(1);
            this.f50521b = context;
        }

        @Override // ym0.l
        public final y invoke(List<? extends com.withings.wiscale2.dashboard.item.model.c> list) {
            Object obj;
            List<? extends com.withings.wiscale2.dashboard.item.model.c> list2 = list;
            kotlin.jvm.internal.u.g(list2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list2) {
                com.withings.wiscale2.dashboard.item.model.c cVar = (com.withings.wiscale2.dashboard.item.model.c) obj2;
                Iterator it = ((kotlin.collections.c) DashboardCategories.a()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        List<String> b10 = ((DashboardCategories) obj).b();
                        if (!(b10 instanceof Collection) || !b10.isEmpty()) {
                            for (String str : b10) {
                                if (dp0.j.r(cVar.c(), str, false)) {
                                    break;
                                }
                            }
                            continue;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                DashboardCategories dashboardCategories = (DashboardCategories) obj;
                if (dashboardCategories == null) {
                    dashboardCategories = DashboardCategories.f50492c;
                }
                Object obj3 = linkedHashMap.get(dashboardCategories);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap.put(dashboardCategories, obj3);
                }
                ((List) obj3).add(obj2);
            }
            Context context = this.f50521b;
            final f fVar = new f(context);
            TreeMap t11 = s0.t(linkedHashMap, new Comparator() { // from class: com.withings.wiscale2.dashboard.d
                @Override // java.util.Comparator
                public final int compare(Object obj4, Object obj5) {
                    ym0.p tmp0 = ym0.p.this;
                    kotlin.jvm.internal.u.j(tmp0, "$tmp0");
                    return ((Number) tmp0.invoke(obj4, obj5)).intValue();
                }
            });
            ArrayList arrayList = new ArrayList(t11.size());
            for (Map.Entry entry : t11.entrySet()) {
                Object key = entry.getKey();
                kotlin.jvm.internal.u.i(key, "<get-key>(...)");
                int d11 = ((DashboardCategories) entry.getKey()).d();
                Object value = entry.getValue();
                kotlin.jvm.internal.u.i(value, "<get-value>(...)");
                arrayList.add(new h((DashboardCategories) key, d11, kotlin.collections.x.D0((Iterable) value, new e(context))));
            }
            g.this.postValue(arrayList);
            return y.f85009a;
        }
    }

    /* compiled from: DashboardCategories.kt */
    /* loaded from: classes4.dex */
    static final class b implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f50522a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(ym0.l lVar) {
            this.f50522a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f50522a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f50522a;
        }

        public final int hashCode() {
            return this.f50522a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50522a.invoke(obj);
        }
    }

    public g(User user, List<? extends Device> list, Context context, CoroutineScope coroutineScope, boolean z5) {
        kotlin.jvm.internal.u.j(context, "context");
        addSource(new n(user, list, context, coroutineScope, z5), new b(new a(context)));
    }
}
