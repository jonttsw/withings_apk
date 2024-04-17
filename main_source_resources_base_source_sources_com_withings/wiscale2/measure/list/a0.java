package com.withings.wiscale2.measure.list;

import android.content.Context;
import com.withings.features.InternalSetting;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.wiscale2.heart.HeartDetailActivity;
import com.withings.wiscale2.measure.list.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jm.a;
/* compiled from: MeasureDisplayer.kt */
/* loaded from: classes5.dex */
public final class a0 extends i {

    /* renamed from: c  reason: collision with root package name */
    private final ym0.q<k, User, MeasuresGroup, nm0.y> f58517c = b.f58521a;

    /* renamed from: d  reason: collision with root package name */
    private final ym0.q<k, User, List<? extends MeasuresGroup>, nm0.y> f58518d = a.f58520a;

    /* renamed from: e  reason: collision with root package name */
    private final ym0.q<Context, User, MeasuresGroup, nm0.y> f58519e = c.f58522a;

    /* compiled from: MeasureDisplayer.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<k, User, List<? extends MeasuresGroup>, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f58520a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(k kVar, User user, List<? extends MeasuresGroup> list) {
            nm0.j jVar;
            String str;
            k measureItemViewHolder = kVar;
            User user2 = user;
            List<? extends MeasuresGroup> measuresGroups = list;
            kotlin.jvm.internal.u.j(measureItemViewHolder, "measureItemViewHolder");
            kotlin.jvm.internal.u.j(user2, "user");
            kotlin.jvm.internal.u.j(measuresGroups, "measuresGroups");
            ArrayList arrayList = new ArrayList();
            for (MeasuresGroup measuresGroup : measuresGroups) {
                Measure measureForType = measuresGroup.getMeasureForType(91);
                if (measureForType != null) {
                    Context context = measureItemViewHolder.itemView.getContext();
                    kotlin.jvm.internal.u.g(context);
                    og0.l lVar = new og0.l(context, user2);
                    jm.a a11 = a.d.a(context);
                    float f11 = (float) measureForType.f95794y;
                    if (measuresGroup.getAttrib() == 0) {
                        str = "Real:";
                    } else {
                        str = "Average:";
                    }
                    jVar = new nm0.j(w6.o.a(str, " ", a11.f(f11, measureForType.getType())), context.getString(lVar.g(f11)));
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    arrayList.add(jVar);
                }
            }
            measureItemViewHolder.a().setText(kotlin.collections.x.R(arrayList, "\r\n", null, null, y.f58591a, 30));
            measureItemViewHolder.b().setText(kotlin.collections.x.R(arrayList, "\r\n", null, null, z.f58592a, 30));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: MeasureDisplayer.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.q<k, User, MeasuresGroup, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f58521a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(k kVar, User user, MeasuresGroup measuresGroup) {
            nm0.y yVar;
            k measureItemViewHolder = kVar;
            User user2 = user;
            MeasuresGroup measuresGroup2 = measuresGroup;
            kotlin.jvm.internal.u.j(measureItemViewHolder, "measureItemViewHolder");
            kotlin.jvm.internal.u.j(user2, "user");
            kotlin.jvm.internal.u.j(measuresGroup2, "measuresGroup");
            Measure measureForType = measuresGroup2.getMeasureForType(91);
            if (measureForType != null) {
                Context context = measureItemViewHolder.itemView.getContext();
                kotlin.jvm.internal.u.g(context);
                og0.l lVar = new og0.l(context, user2);
                jm.a a11 = a.d.a(context);
                float f11 = (float) measureForType.f95794y;
                measureItemViewHolder.a().setText(a11.f(f11, measureForType.getType()));
                measureItemViewHolder.b().setText(lVar.g(f11));
                yVar = nm0.y.f85009a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                Fail.h(measureForType, null);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: MeasureDisplayer.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.q<Context, User, MeasuresGroup, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f58522a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(Context context, User user, MeasuresGroup measuresGroup) {
            Context context2 = context;
            User user2 = user;
            MeasuresGroup measuresGroup2 = measuresGroup;
            kotlin.jvm.internal.u.j(context2, "context");
            kotlin.jvm.internal.u.j(user2, "user");
            kotlin.jvm.internal.u.j(measuresGroup2, "measuresGroup");
            context2.startActivity(HeartDetailActivity.D3(context2, measuresGroup2, 2, user2.q()));
            return nm0.y.f85009a;
        }
    }

    private static boolean g() {
        vf.c cVar;
        cVar = vf.c.f103617d;
        if (cVar != null) {
            if (!cVar.h().c().a() && !wr.b.c(InternalSetting.f39154m)) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.wiscale2.measure.list.i
    public final ArrayList a(List items) {
        kotlin.jvm.internal.u.j(items, "items");
        if (g()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : items) {
                Long valueOf = Long.valueOf(((MeasuresGroup) obj).getDate().getTime());
                Object obj2 = linkedHashMap.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(valueOf, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new d.a((List) entry.getValue()));
            }
            return arrayList;
        }
        return super.a(items);
    }

    @Override // com.withings.wiscale2.measure.list.i
    public final ym0.q<k, User, List<? extends MeasuresGroup>, nm0.y> c() {
        return this.f58518d;
    }

    @Override // com.withings.wiscale2.measure.list.i
    public final ym0.q<k, User, MeasuresGroup, nm0.y> d() {
        return this.f58517c;
    }

    @Override // com.withings.wiscale2.measure.list.i
    public final ym0.q<Context, User, MeasuresGroup, nm0.y> e() {
        return this.f58519e;
    }

    @Override // com.withings.wiscale2.measure.list.i
    public final boolean f(MeasuresGroup measuresGroup) {
        kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
        ArrayList i02 = kotlin.collections.x.i0(8);
        if (g()) {
            i02.add(0);
        }
        return i02.contains(Integer.valueOf(measuresGroup.getAttrib()));
    }
}
