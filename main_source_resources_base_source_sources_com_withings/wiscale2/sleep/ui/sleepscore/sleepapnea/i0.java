package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import com.withings.vasistas.model.SleepLevel;
import com.withings.vasistas.model.Vasistas;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SleepDisorderDetailsFragment.kt */
/* loaded from: classes5.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.l<List<Vasistas>, List<Vasistas>> {

    /* renamed from: a  reason: collision with root package name */
    public static final i0 f61345a = new kotlin.jvm.internal.w(1);

    @Override // ym0.l
    public final List<Vasistas> invoke(List<Vasistas> list) {
        List<Vasistas> list2 = list;
        kotlin.jvm.internal.u.g(list2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((Vasistas) obj).getSleepLevel() != SleepLevel.Awake.getVasistasType()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
