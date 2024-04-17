package com.withings.wiscale2.coretemperature.ui;

import android.content.Context;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.Instant;
import rs.e;
import ts.a;
/* compiled from: ExploreCoreTemperatureGraphFactory.kt */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f50461a;

    public l(Context activityContext) {
        u.j(activityContext, "activityContext");
        this.f50461a = activityContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [os.a, java.lang.Object] */
    public final ts.a a(List data) {
        u.j(data, "data");
        a.C1685a c1685a = new a.C1685a();
        List<nm0.j> list = data;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (nm0.j jVar : list) {
            arrayList.add(new rs.e(new e.a(bt.a.i(((Instant) jVar.a()).toDateTime()), ((Number) jVar.b()).floatValue())));
        }
        c1685a.l(arrayList);
        c1685a.v(false);
        c1685a.u(this.f50461a.getColor(C1987R.color.datavizGridlineBad));
        c1685a.i(new Object());
        ts.a s11 = c1685a.s();
        s11.l("TAG_MAIN_GRAPH");
        return s11;
    }
}
