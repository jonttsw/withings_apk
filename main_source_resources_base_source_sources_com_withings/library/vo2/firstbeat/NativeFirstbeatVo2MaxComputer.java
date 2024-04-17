package com.withings.library.vo2.firstbeat;

import com.withings.library.vo2.Gender;
import com.withings.library.vo2.Vo2MaxComputeStatus;
import com.withings.library.vo2.Vo2MaxInput;
import com.withings.library.vo2.Vo2MaxInputKt;
import com.withings.library.vo2.Vo2MaxUserInfoInput;
import com.withings.library.vo2.firstbeat.utils.FxIntHelperKt;
import fi.firstbeat.common.FbtParameters;
import fi.firstbeat.ete.Ete;
import fi.firstbeat.ete.EteInput;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: NativeFirstbeatVo2MaxComputer.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/withings/library/vo2/firstbeat/NativeFirstbeatVo2MaxComputer;", "", "Lcom/withings/library/vo2/Vo2MaxUserInfoInput;", "userInfoInput", "Lnm0/y;", "injectFirstbeatParameters", "(Lcom/withings/library/vo2/Vo2MaxUserInfoInput;)V", "", "activated", "injectWalkingTest", "(Z)V", "Lcom/withings/library/vo2/Vo2MaxInput;", "vo2MaxInput", "injectInput", "(Lcom/withings/library/vo2/Vo2MaxInput;)V", "Lcom/withings/library/vo2/firstbeat/EteResults;", "getResults", "()Lcom/withings/library/vo2/firstbeat/EteResults;", "", "getVersion", "()Ljava/lang/String;", "Lfi/firstbeat/ete/Ete;", "ete", "Lfi/firstbeat/ete/Ete;", "<init>", "()V", "Companion", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class NativeFirstbeatVo2MaxComputer {
    public static final Companion Companion = new Companion(null);
    public static final long ETE_UNKNOWN_DATE = 0;
    public static final int ETE_UNKNOWN_HR = 0;
    public static final int ETE_UNKNOWN_MAXIMAL_MET = 0;
    private Ete ete;

    /* compiled from: NativeFirstbeatVo2MaxComputer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/withings/library/vo2/firstbeat/NativeFirstbeatVo2MaxComputer$Companion;", "", "()V", "ETE_UNKNOWN_DATE", "", "ETE_UNKNOWN_HR", "", "ETE_UNKNOWN_MAXIMAL_MET", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: NativeFirstbeatVo2MaxComputer.kt */
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

    public NativeFirstbeatVo2MaxComputer() {
        System.loadLibrary("ete");
    }

    public final EteResults getResults() {
        Ete ete = this.ete;
        u.g(ete);
        fi.firstbeat.ete.EteResults results = ete.getResults();
        u.i(results, "ete!!.results");
        return EteResultsKt.toLocalEteResults(results, Vo2MaxComputeStatus.SUCCESS);
    }

    public final String getVersion() {
        String version = Ete.getVersion();
        u.i(version, "getVersion()");
        return version;
    }

    public final void injectFirstbeatParameters(Vo2MaxUserInfoInput userInfoInput) {
        FbtParameters.Gender gender;
        int i11;
        int i12;
        int i13;
        u.j(userInfoInput, "userInfoInput");
        this.ete = new Ete();
        FbtParameters fbtParameters = new FbtParameters();
        fbtParameters.activityClass = userInfoInput.getActivityClass();
        fbtParameters.age = userInfoInput.getAge();
        fbtParameters.height = userInfoInput.getHeight();
        fbtParameters.weight = userInfoInput.getWeight();
        int i14 = WhenMappings.$EnumSwitchMapping$0[userInfoInput.getGender().ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                gender = FbtParameters.Gender.FEMALE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            gender = FbtParameters.Gender.MALE;
        }
        fbtParameters.gender = gender;
        fbtParameters.nowDate = 0L;
        int[] iArr = fbtParameters.maximalMet;
        int i15 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        Integer fxInt = FxIntHelperKt.toFxInt(userInfoInput.getMaxMet());
        if (fxInt != null) {
            i11 = fxInt.intValue();
        } else {
            i11 = 0;
        }
        iArr[2] = i11;
        Integer minHeartRate = userInfoInput.getMinHeartRate();
        if (minHeartRate != null) {
            i12 = minHeartRate.intValue();
        } else {
            i12 = 0;
        }
        fbtParameters.minimalHr = i12;
        Integer minHeartRate2 = userInfoInput.getMinHeartRate();
        if (minHeartRate2 != null) {
            i13 = minHeartRate2.intValue();
        } else {
            i13 = 0;
        }
        fbtParameters.maximalHr = i13;
        Integer monthlyLoad = userInfoInput.getMonthlyLoad();
        if (monthlyLoad != null) {
            i15 = monthlyLoad.intValue();
        }
        fbtParameters.monthlyLoad = i15;
        Ete ete = this.ete;
        u.g(ete);
        ete.setParameters(fbtParameters, Ete.ResetMode.FULL);
    }

    public final void injectInput(Vo2MaxInput vo2MaxInput) {
        int i11;
        int i12;
        int i13;
        Integer fxInt;
        Integer fxInt2;
        u.j(vo2MaxInput, "vo2MaxInput");
        EteInput eteInput = new EteInput();
        eteInput.rri = vo2MaxInput.getRrInterval();
        Double heartRate = vo2MaxInput.getHeartRate();
        int i14 = 0;
        if (heartRate != null) {
            i11 = (int) heartRate.doubleValue();
        } else {
            i11 = 0;
        }
        eteInput.f67292hr = i11;
        eteInput.hrQuality = vo2MaxInput.getHeartRateQuality();
        eteInput.altitudeSource = Vo2MaxInputKt.toJarAltitudeSource(vo2MaxInput.getAltitudeSource());
        eteInput.userState = Vo2MaxInputKt.toJarUserState(vo2MaxInput.getUserState());
        Double speed = vo2MaxInput.getSpeed();
        if (speed != null && (fxInt2 = FxIntHelperKt.toFxInt(speed.doubleValue())) != null) {
            i12 = fxInt2.intValue();
        } else {
            i12 = 0;
        }
        eteInput.speed = i12;
        eteInput.temperature = -100;
        eteInput.humidity = -1;
        Double altitude = vo2MaxInput.getAltitude();
        if (altitude != null && (fxInt = FxIntHelperKt.toFxInt(altitude.doubleValue())) != null) {
            i13 = fxInt.intValue();
        } else {
            i13 = EteInput.UNKNOWN_ALTITUDE;
        }
        eteInput.altitude = i13;
        Integer watts = vo2MaxInput.getWatts();
        if (watts != null) {
            i14 = watts.intValue();
        }
        eteInput.power = i14;
        eteInput.stepRate = vo2MaxInput.getSteps();
        Ete ete = this.ete;
        u.g(ete);
        ete.analyze(eteInput);
    }

    public final void injectWalkingTest(boolean z5) {
        Ete ete = this.ete;
        u.g(ete);
        ete.setWalkingTest(z5);
    }
}
