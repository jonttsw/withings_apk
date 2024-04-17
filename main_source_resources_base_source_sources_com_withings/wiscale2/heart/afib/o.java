package com.withings.wiscale2.heart.afib;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: AFibLoader.kt */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList f57219a;

    static {
        sm0.a<AFibType> a11 = AFibType.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(a11, 10));
        Iterator it = ((kotlin.collections.c) a11).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((AFibType) it.next()).b()));
        }
        f57219a = arrayList;
    }

    public static final ArrayList a() {
        return f57219a;
    }
}
