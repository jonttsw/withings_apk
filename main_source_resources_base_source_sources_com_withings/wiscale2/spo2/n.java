package com.withings.wiscale2.spo2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.vasistas.model.Vasistas;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SpO2QualityFilter.kt */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f61682a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static final List<Integer> f61683b = kotlin.collections.x.W(-1, -2, -3);

    /* renamed from: c  reason: collision with root package name */
    private static final List<Integer> f61684c = kotlin.collections.x.W(-5, -4, -3, -2, -1);

    private n() {
    }

    public static ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            ky.a e11 = ly.a.e(89, (ky.d) obj);
            if (e11 == null || ((int) e11.f()) > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Vasistas vasistas = (Vasistas) obj;
            if (vasistas.getSpo2Quality() == null || !kotlin.collections.x.z(f61683b, vasistas.getSpo2Quality())) {
                Integer spo2 = vasistas.getSpo2();
                if (spo2 != null && spo2.intValue() > 0) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList c(List list, boolean z5) {
        List<Integer> list2;
        kotlin.jvm.internal.u.j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ky.a e11 = ly.a.e(89, (ky.d) obj);
            if (e11 != null) {
                if (z5) {
                    list2 = f61684c;
                } else {
                    list2 = f61683b;
                }
                if (list2.contains(Integer.valueOf(an0.a.a(e11.f())))) {
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static ArrayList d(n nVar, ArrayList arrayList) {
        nVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Measure measureForType = ((MeasuresGroup) obj).getMeasureForType(89);
            if (measureForType != null) {
                if (f61683b.contains(Integer.valueOf(an0.a.a(measureForType.f95794y)))) {
                }
            }
            arrayList2.add(obj);
        }
        return arrayList2;
    }

    public static double e(ky.d dVar) {
        ky.a c11;
        kotlin.jvm.internal.u.j(dVar, "<this>");
        ky.a c12 = ly.a.c(89, dVar);
        if ((c12 != null && c12.f() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) || (c11 = ly.a.c(54, dVar)) == null) {
            return -1.0d;
        }
        return c11.f();
    }
}
