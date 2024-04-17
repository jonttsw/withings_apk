package com.withings.weight.ui.limbExplore;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: CreateSegmentalLimbExploreGraph.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f47663a;

    /* renamed from: b  reason: collision with root package name */
    private final ct.a f47664b;

    @Inject
    public a(Activity context, ct.a aVar) {
        kotlin.jvm.internal.u.j(context, "context");
        this.f47663a = context;
        this.f47664b = aVar;
    }

    private final ts.e b(List list, BodyCompositionType bodyCompositionType, boolean z5) {
        ArrayList arrayList;
        float b10;
        float b11;
        int a11 = bodyCompositionType.a();
        Context context = this.f47663a;
        int color = context.getColor(a11);
        int color2 = context.getColor(bodyCompositionType.d());
        int ordinal = bodyCompositionType.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                List<c> list2 = list;
                arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
                for (c cVar : list2) {
                    ct.c cVar2 = new ct.c(context);
                    float i11 = bt.a.i(cVar.a());
                    if (z5) {
                        b11 = cVar.c();
                    } else {
                        b11 = cVar.b();
                    }
                    arrayList.add(cVar2.a(i11, b11, cVar, color, color2));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            List<c> list3 = list;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(list3, 10));
            for (c cVar3 : list3) {
                ct.d dVar = new ct.d(context);
                float i12 = bt.a.i(cVar3.a());
                if (z5) {
                    b10 = cVar3.c();
                } else {
                    b10 = cVar3.b();
                }
                arrayList2.add(dVar.a(i12, b10, cVar3, color, color2, 45.0f));
            }
            arrayList = arrayList2;
        }
        this.f47664b.getClass();
        ts.e a12 = ct.a.a(color, arrayList);
        a12.l(bodyCompositionType.b().b());
        return a12;
    }

    public final om0.b a(m data, boolean z5) {
        kotlin.jvm.internal.u.j(data, "data");
        om0.b bVar = new om0.b();
        bVar.add(b(data.a(), BodyCompositionType.f47634d, z5));
        bVar.add(b(data.c(), BodyCompositionType.f47635e, z5));
        return bVar.t();
    }
}
