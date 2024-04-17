package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
/* compiled from: AllWorkoutsActivity.kt */
/* loaded from: classes4.dex */
public final class h5 extends androidx.recyclerview.widget.u<Object, RecyclerView.z> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49221a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineScope f49222b;

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            h5.this.notifyItemRemoved(num.intValue());
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(AllWorkoutsActivity context, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl) {
        super(new m.f());
        kotlin.jvm.internal.u.j(context, "context");
        this.f49221a = context;
        this.f49222b = lifecycleCoroutineScopeImpl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        Object item = getItem(i11);
        if (item instanceof l7) {
            l7 l7Var = (l7) item;
            if (l7Var.f() == null && l7Var.g().c() == null && !l7Var.h()) {
                return 1;
            }
            return 2;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z holder, int i11) {
        boolean z5;
        kotlin.jvm.internal.u.j(holder, "holder");
        Object item = getItem(i11);
        boolean z11 = false;
        if (holder instanceof m1) {
            m1 m1Var = (m1) holder;
            kotlin.jvm.internal.u.h(item, "null cannot be cast to non-null type com.withings.wiscale2.home.ui.PeriodSection");
            sg0.a aVar = (sg0.a) item;
            if (i11 == 0) {
                z11 = true;
            }
            m1Var.a(aVar, z11);
        } else if (holder instanceof k5) {
            k5 k5Var = (k5) holder;
            kotlin.jvm.internal.u.h(item, "null cannot be cast to non-null type com.withings.wiscale2.activity.workout.ui.detail.WorkoutPreviewInfo");
            l7 l7Var = (l7) item;
            if (i11 != 0 && !(getItem(i11 - 1) instanceof sg0.a)) {
                z5 = false;
            } else {
                z5 = true;
            }
            k5Var.c(this.f49222b, l7Var, z5, i11, new a());
        } else if (holder instanceof u1) {
            u1 u1Var = (u1) holder;
            kotlin.jvm.internal.u.h(item, "null cannot be cast to non-null type com.withings.wiscale2.activity.workout.ui.detail.WorkoutPreviewInfo");
            l7 l7Var2 = (l7) item;
            if (i11 == 0 || (getItem(i11 - 1) instanceof sg0.a)) {
                z11 = true;
            }
            u1Var.a(l7Var2, z11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        if (i11 != -1) {
            if (i11 != 2) {
                return new k5(androidx.collection.c.n(parent, C1987R.layout.list_item_timeline_activity_track));
            }
            return new u1(androidx.collection.c.n(parent, C1987R.layout.list_item_homeview_workout_big));
        }
        int i12 = m1.f49433c;
        return new m1(androidx.collection.c.n(parent, C1987R.layout.view_all_data_section));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Comparator] */
    @Override // androidx.recyclerview.widget.u
    public final void submitList(List<Object> list) {
        boolean z5;
        String str;
        String valueOf;
        kotlin.jvm.internal.u.h(list, "null cannot be cast to non-null type kotlin.collections.List<com.withings.wiscale2.activity.workout.ui.detail.WorkoutPreviewInfo>");
        Context context = this.f49221a;
        kotlin.jvm.internal.u.j(context, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kotlin.collections.x.D0(list, new Object())) {
            DateTime c11 = ((l7) obj).c();
            DateTime withTimeAtStartOfDay = c11.withDayOfWeek(1).withTimeAtStartOfDay();
            if (withTimeAtStartOfDay.plusWeeks(1).isAfterNow()) {
                str = context.getString(C1987R.string.notificationDetail_thisWeekTitle);
                kotlin.jvm.internal.u.i(str, "getString(...)");
            } else if (withTimeAtStartOfDay.plusWeeks(2).isAfterNow()) {
                str = context.getString(C1987R.string.notificationDetail_lastWeekTitle);
                kotlin.jvm.internal.u.i(str, "getString(...)");
            } else if (c11.withDayOfMonth(1).withTimeAtStartOfDay().plusMonths(1).isAfterNow()) {
                str = context.getString(C1987R.string.notificationDetail_thisMonthTitle);
                kotlin.jvm.internal.u.i(str, "getString(...)");
            } else {
                String abstractDateTime = c11.toString(context.getString(C1987R.string._DATE_MMMM_YYYY_));
                kotlin.jvm.internal.u.i(abstractDateTime, "toString(...)");
                if (abstractDateTime.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    char charAt = abstractDateTime.charAt(0);
                    if (Character.isLowerCase(charAt)) {
                        valueOf = androidx.camera.camera2.internal.r2.a("getDefault(...)", charAt);
                    } else {
                        valueOf = String.valueOf(charAt);
                    }
                    str = androidx.appcompat.view.menu.d.e(sb2, valueOf, abstractDateTime, 1, "substring(...)");
                } else {
                    str = abstractDateTime;
                }
            }
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((List) obj2).add(obj);
        }
        Set entrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(entrySet, 10));
        int i11 = 0;
        for (Object obj3 : entrySet) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                Map.Entry entry = (Map.Entry) obj3;
                Object[] objArr = new Object[1];
                String str2 = (String) entry.getKey();
                if (i11 == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objArr[0] = new sg0.a(str2, z5);
                arrayList.add(kotlin.collections.x.l0((Iterable) entry.getValue(), kotlin.collections.x.i0(objArr)));
                i11 = i12;
            } else {
                kotlin.collections.x.K0();
                throw null;
            }
        }
        super.submitList(kotlin.collections.x.L(arrayList));
    }
}
