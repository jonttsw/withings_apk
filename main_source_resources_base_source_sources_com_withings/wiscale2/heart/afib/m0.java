package com.withings.wiscale2.heart.afib;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.r2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.ecg.details.EcgListActivity;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.ui.detail.m1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.joda.time.DateTime;
/* compiled from: AFibMeasurements.kt */
/* loaded from: classes5.dex */
public final class m0 extends androidx.recyclerview.widget.u<Object, RecyclerView.z> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f57209a;

    /* renamed from: b  reason: collision with root package name */
    private final User f57210b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f57211c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f57212d;

    /* compiled from: AFibMeasurements.kt */
    /* loaded from: classes5.dex */
    public static final class a extends m.f<Object> {
        @Override // androidx.recyclerview.widget.m.f
        public final boolean areContentsTheSame(Object oldItem, Object newItem) {
            kotlin.jvm.internal.u.j(oldItem, "oldItem");
            kotlin.jvm.internal.u.j(newItem, "newItem");
            return kotlin.jvm.internal.u.e(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.m.f
        public final boolean areItemsTheSame(Object oldItem, Object newItem) {
            kotlin.jvm.internal.u.j(oldItem, "oldItem");
            kotlin.jvm.internal.u.j(newItem, "newItem");
            return kotlin.jvm.internal.u.e(oldItem, newItem);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context, User user, boolean z5, boolean z11) {
        super(new m.f());
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(user, "user");
        this.f57209a = context;
        this.f57210b = user;
        this.f57211c = z5;
        this.f57212d = z11;
    }

    public static void d(ky.d afibMeasuresGroup, m0 this$0, View view) {
        Intent putExtra;
        kotlin.jvm.internal.u.j(afibMeasuresGroup, "$afibMeasuresGroup");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ky.a h11 = ah.m.h(afibMeasuresGroup);
        Context context = view.getContext();
        int e11 = h11.e();
        User user = this$0.f57210b;
        if (e11 == 130) {
            EcgListActivity.a aVar = EcgListActivity.f38008n;
            Context context2 = view.getContext();
            kotlin.jvm.internal.u.i(context2, "getContext(...)");
            putExtra = EcgListActivity.a.a(aVar, context2, user.q(), null, Long.valueOf(afibMeasuresGroup.i()), Long.valueOf(afibMeasuresGroup.d()), 4);
        } else {
            int i11 = AFibDetailActivity.f57077j;
            Context context3 = view.getContext();
            kotlin.jvm.internal.u.i(context3, "getContext(...)");
            Long valueOf = Long.valueOf(user.q());
            putExtra = new Intent(context3, AFibDetailActivity.class).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, valueOf).putExtra("measure", hy.g.d(h11, null));
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        }
        context.startActivity(putExtra);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        if (getItem(i11) instanceof ky.d) {
            return 1;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z holder, int i11) {
        boolean z5;
        kotlin.jvm.internal.u.j(holder, "holder");
        Object item = getItem(i11);
        if (holder instanceof m1) {
            m1 m1Var = (m1) holder;
            kotlin.jvm.internal.u.h(item, "null cannot be cast to non-null type com.withings.wiscale2.home.ui.PeriodSection");
            sg0.a aVar = (sg0.a) item;
            if (i11 == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            m1Var.a(aVar, z5);
        } else if (holder instanceof p) {
            Object item2 = getItem(i11);
            kotlin.jvm.internal.u.h(item2, "null cannot be cast to non-null type com.withings.measure.core.models.MeasuresGroup");
            ky.d dVar = (ky.d) item2;
            ((p) holder).a(dVar, this.f57212d);
            holder.itemView.setOnClickListener(new pq.d(4, dVar, this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        if (i11 == 1) {
            return new p(androidx.collection.c.n(parent, C1987R.layout.item_measurement));
        }
        int i12 = m1.f49433c;
        return new m1(androidx.collection.c.n(parent, C1987R.layout.view_all_data_section));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Comparator] */
    @Override // androidx.recyclerview.widget.u
    public final void submitList(List<Object> list) {
        boolean z5;
        String abstractDateTime;
        String valueOf;
        String valueOf2;
        if (this.f57211c) {
            kotlin.jvm.internal.u.h(list, "null cannot be cast to non-null type kotlin.collections.List<com.withings.measure.core.models.MeasuresGroup>");
            Context context = this.f57209a;
            kotlin.jvm.internal.u.j(context, "context");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : kotlin.collections.x.D0(list, new Object())) {
                DateTime dateTime = new DateTime(((ky.d) obj).c());
                DateTime now = DateTime.now();
                kotlin.jvm.internal.u.i(now, "now(...)");
                if (!kotlin.jvm.internal.u.e(hn.a.t(dateTime), hn.a.t(now))) {
                    abstractDateTime = dateTime.toString(context.getString(C1987R.string._DATE_EEEE_MMMM_D_YYYY_));
                    kotlin.jvm.internal.u.i(abstractDateTime, "toString(...)");
                    if (abstractDateTime.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        char charAt = abstractDateTime.charAt(0);
                        if (Character.isLowerCase(charAt)) {
                            valueOf2 = r2.a("getDefault(...)", charAt);
                        } else {
                            valueOf2 = String.valueOf(charAt);
                        }
                        abstractDateTime = androidx.appcompat.view.menu.d.e(sb2, valueOf2, abstractDateTime, 1, "substring(...)");
                    }
                } else {
                    abstractDateTime = dateTime.toString(context.getString(C1987R.string._DATE_EEEE_MMMM_D_));
                    kotlin.jvm.internal.u.i(abstractDateTime, "toString(...)");
                    if (abstractDateTime.length() > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        char charAt2 = abstractDateTime.charAt(0);
                        if (Character.isLowerCase(charAt2)) {
                            valueOf = r2.a("getDefault(...)", charAt2);
                        } else {
                            valueOf = String.valueOf(charAt2);
                        }
                        abstractDateTime = androidx.appcompat.view.menu.d.e(sb3, valueOf, abstractDateTime, 1, "substring(...)");
                    }
                }
                Object obj2 = linkedHashMap.get(abstractDateTime);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(abstractDateTime, obj2);
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
                    String str = (String) entry.getKey();
                    if (i11 == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objArr[0] = new sg0.a(str, z5);
                    arrayList.add(kotlin.collections.x.l0((Iterable) entry.getValue(), kotlin.collections.x.i0(objArr)));
                    i11 = i12;
                } else {
                    kotlin.collections.x.K0();
                    throw null;
                }
            }
            super.submitList(kotlin.collections.x.L(arrayList));
            return;
        }
        super.submitList(list);
    }
}
