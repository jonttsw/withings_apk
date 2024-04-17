package com.withings.vasistas.model;

import androidx.activity.b0;
import com.withings.device.Device;
import com.withings.vasistas.model.Vasistas;
import cp0.g;
import cp0.k;
import cp0.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kn.e;
import kotlin.Metadata;
import kotlin.collections.l0;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;
import nm0.j;
/* compiled from: Vasistas.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0010\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0017\u001a\u00020\u0014*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\b\u0012\u0004\u0012\u00020\u00000\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/withings/vasistas/model/Vasistas;", "other", "", "isOverlapping", "(Lcom/withings/vasistas/model/Vasistas;Lcom/withings/vasistas/model/Vasistas;)Z", "hasHrEvents", "(Lcom/withings/vasistas/model/Vasistas;)Z", "isSleepingVasistas", "isAwakeVasistas", "Lcom/withings/vasistas/model/Vasistas$Category;", "Lcom/withings/vasistas/model/Vasistas$VasistasType;", "getVasistasType", "(Lcom/withings/vasistas/model/Vasistas$Category;)Lcom/withings/vasistas/model/Vasistas$VasistasType;", "", "Lkn/e;", "deviceManager", "anySpO2ConsideredUS", "(Ljava/util/List;Lkn/e;)Z", "spO2ConsideredUs", "(Lcom/withings/vasistas/model/Vasistas;Lkn/e;)Z", "", "getSpeedInKmH", "(Lcom/withings/vasistas/model/Vasistas;)F", "speedInKmH", "", "getMostCountedDeviceId", "(Ljava/util/List;)Ljava/lang/Integer;", "mostCountedDeviceId", "core-data-vasistas_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VasistasKt {

    /* compiled from: Vasistas.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Vasistas.Category.values().length];
            try {
                iArr[Vasistas.Category.SPO2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean anySpO2ConsideredUS(List<Vasistas> list, e deviceManager) {
        u.j(list, "<this>");
        u.j(deviceManager, "deviceManager");
        List<Vasistas> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Vasistas vasistas : list2) {
            if (spO2ConsideredUs(vasistas, deviceManager)) {
                return true;
            }
        }
        return false;
    }

    public static final Integer getMostCountedDeviceId(List<Vasistas> list) {
        Object next;
        u.j(list, "<this>");
        final g i11 = n.i(n.t(x.t(list), VasistasKt$mostCountedDeviceId$1.INSTANCE), VasistasKt$mostCountedDeviceId$2.INSTANCE);
        l0<Long, Long> l0Var = new l0<Long, Long>() { // from class: com.withings.vasistas.model.VasistasKt$special$$inlined$groupingBy$1
            @Override // kotlin.collections.l0
            public Long keyOf(Long l5) {
                return Long.valueOf(l5.longValue());
            }

            @Override // kotlin.collections.l0
            public Iterator<Long> sourceIterator() {
                return k.this.iterator();
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Long> sourceIterator = l0Var.sourceIterator();
        while (sourceIterator.hasNext()) {
            Long keyOf = l0Var.keyOf(sourceIterator.next());
            Object obj = linkedHashMap.get(keyOf);
            if (obj == null && !linkedHashMap.containsKey(keyOf)) {
                obj = new n0();
            }
            n0 n0Var = (n0) obj;
            n0Var.f76254a++;
            linkedHashMap.put(keyOf, n0Var);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            u.h(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            v0.e(entry);
            entry.setValue(Integer.valueOf(((n0) entry.getValue()).f76254a));
        }
        v0.d(linkedHashMap);
        Iterator it = s0.o(linkedHashMap).iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((j) next).d()).intValue();
                do {
                    Object next2 = it.next();
                    int intValue2 = ((Number) ((j) next2).d()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        j jVar = (j) next;
        if (jVar == null) {
            return null;
        }
        return Integer.valueOf((int) ((Number) jVar.c()).longValue());
    }

    public static final float getSpeedInKmH(Vasistas vasistas) {
        u.j(vasistas, "<this>");
        int i11 = l70.n.f78809c;
        return (float) ((vasistas.getDistance() / 1000.0d) * (3600000.0f / vasistas.getDurationMillis()));
    }

    public static final Vasistas.VasistasType getVasistasType(Vasistas.Category category) {
        u.j(category, "<this>");
        if (WhenMappings.$EnumSwitchMapping$0[category.ordinal()] == 1) {
            return Vasistas.VasistasType.SPO2;
        }
        return null;
    }

    public static final boolean hasHrEvents(Vasistas vasistas) {
        u.j(vasistas, "<this>");
        if (vasistas.getHrLevel() != 0) {
            return true;
        }
        return false;
    }

    public static final boolean isAwakeVasistas(Vasistas vasistas) {
        u.j(vasistas, "<this>");
        if (vasistas.getSleepLevel() == SleepLevel.Awake.getVasistasType()) {
            return true;
        }
        return false;
    }

    public static final boolean isOverlapping(Vasistas vasistas, Vasistas other) {
        u.j(vasistas, "<this>");
        u.j(other, "other");
        if (b0.p(vasistas.getStartDate(), other.getEnd()) && b0.p(other.getStartDate(), vasistas.getEnd())) {
            return true;
        }
        return false;
    }

    public static final boolean isSleepingVasistas(Vasistas vasistas) {
        u.j(vasistas, "<this>");
        return SleepLevel.Companion.getSleepingStages().contains(Integer.valueOf(vasistas.getSleepLevel()));
    }

    public static final boolean spO2ConsideredUs(Vasistas vasistas, e deviceManager) {
        Device d11;
        Integer classification;
        u.j(vasistas, "<this>");
        u.j(deviceManager, "deviceManager");
        if (vasistas.getSpo2() != null && vasistas.getDeviceModel() == 94 && ((d11 = deviceManager.d(vasistas.getDeviceId())) == null || (classification = d11.getClassification()) == null || classification.intValue() != 0)) {
            return true;
        }
        return false;
    }
}
