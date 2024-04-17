package com.withings.library.vo2;

import fi.firstbeat.ete.EteInput;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
/* compiled from: Vo2MaxInput.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"toJarAltitudeSource", "Lfi/firstbeat/ete/EteInput$AltitudeSource;", "Lcom/withings/library/vo2/AltitudeSource;", "toJarUserState", "Lfi/firstbeat/ete/EteInput$UserState;", "Lcom/withings/library/vo2/UserState;", "toLocalAltitudeSource", "Vo2Lib_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Vo2MaxInputKt {

    /* compiled from: Vo2MaxInput.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[EteInput.AltitudeSource.values().length];
            iArr[EteInput.AltitudeSource.DEFAULT.ordinal()] = 1;
            iArr[EteInput.AltitudeSource.BAROMETER.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AltitudeSource.values().length];
            iArr2[AltitudeSource.DEFAULT.ordinal()] = 1;
            iArr2[AltitudeSource.BAROMETER.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[UserState.values().length];
            iArr3[UserState.NOT_AVAILABLE.ordinal()] = 1;
            iArr3[UserState.RUNNING.ordinal()] = 2;
            iArr3[UserState.CYCLING.ordinal()] = 3;
            iArr3[UserState.STRENGTH_TRAINING.ordinal()] = 4;
            iArr3[UserState.EXERCISE.ordinal()] = 5;
            iArr3[UserState.SLEEP.ordinal()] = 6;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final EteInput.AltitudeSource toJarAltitudeSource(AltitudeSource altitudeSource) {
        u.j(altitudeSource, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$1[altitudeSource.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return EteInput.AltitudeSource.BAROMETER;
            }
            throw new NoWhenBranchMatchedException();
        }
        return EteInput.AltitudeSource.DEFAULT;
    }

    public static final EteInput.UserState toJarUserState(UserState userState) {
        u.j(userState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[userState.ordinal()]) {
            case 1:
                return EteInput.UserState.NOT_AVAILABLE;
            case 2:
                return EteInput.UserState.RUNNING;
            case 3:
                return EteInput.UserState.CYCLING;
            case 4:
                return EteInput.UserState.STRENGTH_TRAINING;
            case 5:
                return EteInput.UserState.EXERCISE;
            case 6:
                return EteInput.UserState.SLEEP;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final AltitudeSource toLocalAltitudeSource(EteInput.AltitudeSource altitudeSource) {
        u.j(altitudeSource, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[altitudeSource.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return AltitudeSource.DEFAULT;
            }
            return AltitudeSource.BAROMETER;
        }
        return AltitudeSource.DEFAULT;
    }
}
