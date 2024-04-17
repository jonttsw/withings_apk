package com.withings.wiscale2.measure.list;

import android.content.Context;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.wiscale2.measure.list.d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MeasureDisplayer.kt */
/* loaded from: classes5.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f58556a = true;

    /* renamed from: b  reason: collision with root package name */
    private final ym0.q<k, User, List<? extends MeasuresGroup>, nm0.y> f58557b = new a();

    /* compiled from: MeasureDisplayer.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<k, User, List<? extends MeasuresGroup>, nm0.y> {
        a() {
            super(3);
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
        @Override // ym0.q
        public final nm0.y invoke(k kVar, User user, List<? extends MeasuresGroup> list) {
            k measureItemViewHolder = kVar;
            User user2 = user;
            List<? extends MeasuresGroup> measuresGroup = list;
            kotlin.jvm.internal.u.j(measureItemViewHolder, "measureItemViewHolder");
            kotlin.jvm.internal.u.j(user2, "user");
            kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
            i.this.d().invoke(measureItemViewHolder, user2, kotlin.collections.x.I(measuresGroup));
            return nm0.y.f85009a;
        }
    }

    public ArrayList a(List items) {
        kotlin.jvm.internal.u.j(items, "items");
        List<MeasuresGroup> list = items;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        for (MeasuresGroup measuresGroup : list) {
            arrayList.add(new d.c(measuresGroup));
        }
        return arrayList;
    }

    public final boolean b() {
        return this.f58556a;
    }

    public ym0.q<k, User, List<? extends MeasuresGroup>, nm0.y> c() {
        return this.f58557b;
    }

    public abstract ym0.q<k, User, MeasuresGroup, nm0.y> d();

    public abstract ym0.q<Context, User, MeasuresGroup, nm0.y> e();

    public boolean f(MeasuresGroup measuresGroup) {
        kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
        return true;
    }
}
