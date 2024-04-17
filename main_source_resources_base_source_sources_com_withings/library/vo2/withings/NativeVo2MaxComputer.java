package com.withings.library.vo2.withings;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.vo2.Gender;
import com.withings.library.vo2.Vo2MaxComputeStatus;
import com.withings.library.vo2.Vo2MaxInput;
import com.withings.library.vo2.Vo2MaxOutput;
import com.withings.library.vo2.Vo2MaxUserInfoInput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: NativeVo2MaxComputer.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJi\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0086 J\n\u0010\u001c\u001a\u00020\u001d*\u00020\u000e¨\u0006\u001f"}, d2 = {"Lcom/withings/library/vo2/withings/NativeVo2MaxComputer;", "", "()V", "compute", "Lcom/withings/library/vo2/Vo2MaxOutput;", "vo2MaxUserInfoInput", "Lcom/withings/library/vo2/Vo2MaxUserInfoInput;", "vo2MaxInputs", "", "Lcom/withings/library/vo2/Vo2MaxInput;", "firstbeat_legacy", "", "isRunning", "computeVo2Max", "Lcom/withings/library/vo2/withings/NativeVo2MaxRes;", "hrArray", "", "speedArray", "altitudeArray", "length", "", "age", "height", "weight", "isMale", "ac", ConstantsWs.SUBCATEGORY_FEATURE_VO2MAX, "", "getComputeStatus", "Lcom/withings/library/vo2/Vo2MaxComputeStatus;", "Companion", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NativeVo2MaxComputer {
    public static final Companion Companion = new Companion(null);
    public static final short VO2MAX_STATUS_ERROR_ALTITUDE_RANGE = -3;
    public static final short VO2MAX_STATUS_ERROR_FAR_FROM_JACKSON = -5;
    public static final short VO2MAX_STATUS_ERROR_GAIT_NOT_SUPPORTED = -7;
    public static final short VO2MAX_STATUS_ERROR_HR_RANGE = -2;
    public static final short VO2MAX_STATUS_ERROR_LARGE_VARIATION = -6;
    public static final short VO2MAX_STATUS_ERROR_NOT_ENOUGH_POINTS = -1;
    public static final short VO2MAX_STATUS_ERROR_REGRESSION_QUALITY = -4;
    public static final short VO2MAX_STATUS_OK_BOUNDS_MAX = 3;
    public static final short VO2MAX_STATUS_OK_INITIAL = 0;
    public static final short VO2MAX_STATUS_OK_PREVIOUS = 2;
    public static final short VO2MAX_STATUS_OK_TRANSITION = 1;

    /* compiled from: NativeVo2MaxComputer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/withings/library/vo2/withings/NativeVo2MaxComputer$Companion;", "", "()V", "VO2MAX_STATUS_ERROR_ALTITUDE_RANGE", "", "VO2MAX_STATUS_ERROR_FAR_FROM_JACKSON", "VO2MAX_STATUS_ERROR_GAIT_NOT_SUPPORTED", "VO2MAX_STATUS_ERROR_HR_RANGE", "VO2MAX_STATUS_ERROR_LARGE_VARIATION", "VO2MAX_STATUS_ERROR_NOT_ENOUGH_POINTS", "VO2MAX_STATUS_ERROR_REGRESSION_QUALITY", "VO2MAX_STATUS_OK_BOUNDS_MAX", "VO2MAX_STATUS_OK_INITIAL", "VO2MAX_STATUS_OK_PREVIOUS", "VO2MAX_STATUS_OK_TRANSITION", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: NativeVo2MaxComputer.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gender.values().length];
            iArr[Gender.M.ordinal()] = 1;
            iArr[Gender.F.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NativeVo2MaxComputer() {
        System.loadLibrary("vo2-lib");
    }

    public final Vo2MaxOutput compute(Vo2MaxUserInfoInput vo2MaxUserInfoInput, List<Vo2MaxInput> vo2MaxInputs, boolean z5, boolean z11) {
        float f11;
        boolean z12;
        float f12;
        float f13;
        u.j(vo2MaxUserInfoInput, "vo2MaxUserInfoInput");
        u.j(vo2MaxInputs, "vo2MaxInputs");
        List<Vo2MaxInput> list = vo2MaxInputs;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            f11 = Float.NaN;
            if (!it.hasNext()) {
                break;
            }
            Double heartRate = ((Vo2MaxInput) it.next()).getHeartRate();
            if (heartRate != null) {
                f11 = (float) heartRate.doubleValue();
            }
            arrayList.add(Float.valueOf(f11));
        }
        float[] O0 = x.O0(arrayList);
        ArrayList arrayList2 = new ArrayList(x.y(list, 10));
        for (Vo2MaxInput vo2MaxInput : list) {
            Double speed = vo2MaxInput.getSpeed();
            if (speed != null) {
                f13 = (float) speed.doubleValue();
            } else {
                f13 = Float.NaN;
            }
            arrayList2.add(Float.valueOf(f13));
        }
        float[] O02 = x.O0(arrayList2);
        ArrayList arrayList3 = new ArrayList(x.y(list, 10));
        for (Vo2MaxInput vo2MaxInput2 : list) {
            Double altitude = vo2MaxInput2.getAltitude();
            if (altitude != null) {
                f12 = (float) altitude.doubleValue();
            } else {
                f12 = Float.NaN;
            }
            arrayList3.add(Float.valueOf(f12));
        }
        float[] O03 = x.O0(arrayList3);
        short size = (short) vo2MaxInputs.size();
        short age = (short) vo2MaxUserInfoInput.getAge();
        short height = (short) vo2MaxUserInfoInput.getHeight();
        short weight = (short) vo2MaxUserInfoInput.getWeight();
        int i11 = WhenMappings.$EnumSwitchMapping$0[vo2MaxUserInfoInput.getGender().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                z12 = false;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            z12 = true;
        }
        short activityClass = (short) vo2MaxUserInfoInput.getActivityClass();
        Double vo2max = vo2MaxUserInfoInput.getVo2max();
        if (vo2max != null) {
            f11 = (float) vo2max.doubleValue();
        }
        NativeVo2MaxRes computeVo2Max = computeVo2Max(O0, O02, O03, size, age, height, weight, z12, activityClass, z5, z11, f11);
        return new Vo2MaxOutput(getComputeStatus(computeVo2Max), Double.valueOf(computeVo2Max.getVo2max()), null, String.valueOf(computeVo2Max.getAlgoVersion()), null, 16, null);
    }

    public final native NativeVo2MaxRes computeVo2Max(float[] fArr, float[] fArr2, float[] fArr3, short s11, short s12, short s13, short s14, boolean z5, short s15, boolean z11, boolean z12, float f11);

    public final Vo2MaxComputeStatus getComputeStatus(NativeVo2MaxRes nativeVo2MaxRes) {
        u.j(nativeVo2MaxRes, "<this>");
        short status = nativeVo2MaxRes.getStatus();
        if (status == 0) {
            return Vo2MaxComputeStatus.SUCCESS_INITIAL;
        }
        if (status == 1) {
            return Vo2MaxComputeStatus.SUCCESS_TRANSITION;
        }
        if (status == 2) {
            return Vo2MaxComputeStatus.SUCCESS_PREVIOUS;
        }
        if (status == 3) {
            return Vo2MaxComputeStatus.SUCCESS_BOUNDS_MAX;
        }
        if (status == -1) {
            return Vo2MaxComputeStatus.ERROR_NOT_ENOUGH_DATA;
        }
        if (status == -2) {
            return Vo2MaxComputeStatus.ERROR_HR_RANGE;
        }
        if (status == -3) {
            return Vo2MaxComputeStatus.ERROR_ALTITUDE_RANGE;
        }
        if (status == -4) {
            return Vo2MaxComputeStatus.ERROR_REGRESSION_QUALITY;
        }
        if (status == -5) {
            return Vo2MaxComputeStatus.ERROR_FAR_FROM_JACKSON;
        }
        if (status == -6) {
            return Vo2MaxComputeStatus.ERROR_LARGE_VARIATION;
        }
        if (status == -7) {
            return Vo2MaxComputeStatus.ERROR_GAIT_NOT_SUPPORTED;
        }
        return Vo2MaxComputeStatus.ERROR;
    }
}
