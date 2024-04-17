package com.withings.comm.wpp;

import java.util.ArrayList;
/* compiled from: WppMessageDivider.java */
/* loaded from: classes3.dex */
public final class g {
    public static ArrayList a(f fVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (fVar.c() + 5 <= 200) {
            arrayList.add(fVar);
            return arrayList;
        }
        short s11 = 5;
        for (h hVar : fVar.d()) {
            if (hVar.getSize() + s11 > 200) {
                s11 = hVar.getSize() + 5;
                arrayList.add(new f(fVar.f(), fVar.e(), arrayList2));
                arrayList2 = new ArrayList();
                arrayList2.add(hVar);
            } else {
                arrayList2.add(hVar);
                s11 = hVar.getSize() + s11;
            }
        }
        if (arrayList2.size() != 0) {
            arrayList.add(new f(fVar.f(), fVar.e(), arrayList2));
        }
        return arrayList;
    }
}
