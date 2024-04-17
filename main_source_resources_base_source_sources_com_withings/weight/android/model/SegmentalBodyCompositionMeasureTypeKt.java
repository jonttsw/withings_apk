package com.withings.weight.android.model;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.weight.core.model.LimbModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import ky.d;
import nm0.y;
import sm0.a;
/* compiled from: SegmentalBodyCompositionMeasureType.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lky/d;", "", "containsSegmentalBodyCompMeasures", "(Lky/d;)Z", "", "Lky/a;", "hasAllLimbPositions", "(Ljava/util/List;)Z", "", "getSegmentalBodyCompTypes", "()[I", "Lcom/withings/weight/core/model/LimbModel;", "limb", "Lcom/withings/weight/android/model/SegmentalBodyCompositionMeasureType;", "type", "", "generateValueForLimb", "(Lky/d;Lcom/withings/weight/core/model/LimbModel;Lcom/withings/weight/android/model/SegmentalBodyCompositionMeasureType;)D", "android_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SegmentalBodyCompositionMeasureTypeKt {

    /* compiled from: SegmentalBodyCompositionMeasureType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LimbPosition.values().length];
            try {
                iArr[LimbPosition.LeftArm.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LimbPosition.RightArm.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LimbPosition.Torso.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LimbPosition.LeftLeg.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LimbPosition.RightLeg.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LimbModel.values().length];
            try {
                LimbModel limbModel = LimbModel.f46985a;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                LimbModel limbModel2 = LimbModel.f46985a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                LimbModel limbModel3 = LimbModel.f46985a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean containsSegmentalBodyCompMeasures(d dVar) {
        u.j(dVar, "<this>");
        a<SegmentalBodyCompositionMeasureType> entries = SegmentalBodyCompositionMeasureType.getEntries();
        ArrayList<Number> arrayList = new ArrayList(x.y(entries, 10));
        for (SegmentalBodyCompositionMeasureType segmentalBodyCompositionMeasureType : entries) {
            arrayList.add(Integer.valueOf(segmentalBodyCompositionMeasureType.getWsIdentifier()));
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (Number number : arrayList) {
            int intValue = number.intValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : dVar.f()) {
                if (((ky.a) obj).e() == intValue) {
                    arrayList2.add(obj);
                }
            }
            if (!hasAllLimbPositions(arrayList2)) {
                return false;
            }
        }
        return true;
    }

    public static final double generateValueForLimb(d dVar, LimbModel limb, SegmentalBodyCompositionMeasureType type) {
        double f11;
        u.j(dVar, "<this>");
        u.j(limb, "limb");
        u.j(type, "type");
        ArrayList<ky.a> arrayList = new ArrayList();
        for (Object obj : dVar.f()) {
            if (((ky.a) obj).e() == type.getWsIdentifier()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        for (ky.a aVar : arrayList) {
            int i11 = WhenMappings.$EnumSwitchMapping$1[limb.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int i12 = WhenMappings.$EnumSwitchMapping$0[LimbPosition.Companion.from(aVar.d().e()).ordinal()];
                        if (i12 != 4) {
                            if (i12 == 5) {
                                f11 = aVar.f();
                            }
                        } else {
                            f11 = aVar.f();
                        }
                        d11 = f11 + d11;
                    }
                    arrayList2.add(y.f85009a);
                } else {
                    if (WhenMappings.$EnumSwitchMapping$0[LimbPosition.Companion.from(aVar.d().e()).ordinal()] == 3) {
                        f11 = aVar.f();
                        d11 = f11 + d11;
                        arrayList2.add(y.f85009a);
                    } else {
                        arrayList2.add(y.f85009a);
                    }
                }
            } else {
                int i13 = WhenMappings.$EnumSwitchMapping$0[LimbPosition.Companion.from(aVar.d().e()).ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        f11 = aVar.f();
                    } else {
                        arrayList2.add(y.f85009a);
                    }
                } else {
                    f11 = aVar.f();
                }
                d11 = f11 + d11;
                arrayList2.add(y.f85009a);
            }
        }
        return d11;
    }

    public static final int[] getSegmentalBodyCompTypes() {
        a<SegmentalBodyCompositionMeasureType> entries = SegmentalBodyCompositionMeasureType.getEntries();
        ArrayList arrayList = new ArrayList(x.y(entries, 10));
        for (SegmentalBodyCompositionMeasureType segmentalBodyCompositionMeasureType : entries) {
            arrayList.add(Integer.valueOf(segmentalBodyCompositionMeasureType.getWsIdentifier()));
        }
        return x.P0(arrayList);
    }

    public static final boolean hasAllLimbPositions(List<ky.a> list) {
        u.j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (ky.a aVar : list) {
            Integer e11 = aVar.d().e();
            if (e11 != null) {
                arrayList.add(e11);
            }
        }
        List B = x.B(arrayList);
        for (Object obj : LimbPosition.getEntries().toArray(new LimbPosition[0])) {
            if (!B.contains(Integer.valueOf(((LimbPosition) obj).getWsIdentifier()))) {
                return false;
            }
        }
        return true;
    }
}
