package com.withings.wiscale2.device.common.handcalibration.v2;

import com.withings.devicesetup.ui.LottieData;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
/* compiled from: InstallHandsCalibrationDelegate.kt */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final LottieData f52773a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f52774b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52775c;

    public /* synthetic */ f(LottieData lottieData, Integer num) {
        this(lottieData, num, C1987R.string.setup_calibrate_subtitle);
    }

    public final LottieData a() {
        return this.f52773a;
    }

    public final Integer b() {
        return this.f52774b;
    }

    public final int c() {
        return this.f52775c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (u.e(this.f52773a, fVar.f52773a) && u.e(this.f52774b, fVar.f52774b) && this.f52775c == fVar.f52775c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i11 = 0;
        LottieData lottieData = this.f52773a;
        if (lottieData == null) {
            hashCode = 0;
        } else {
            hashCode = lottieData.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num = this.f52774b;
        if (num != null) {
            i11 = num.hashCode();
        }
        return Integer.hashCode(this.f52775c) + ((i12 + i11) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HandsCalibrationDeviceContent(handsCalibrationLottieData=");
        sb2.append(this.f52773a);
        sb2.append(", postCalibrationResId=");
        sb2.append(this.f52774b);
        sb2.append(", setupCalibrateCheckMessage=");
        return androidx.camera.camera2.internal.e.c(sb2, this.f52775c, ")");
    }

    public f(LottieData lottieData, Integer num, int i11) {
        this.f52773a = lottieData;
        this.f52774b = num;
        this.f52775c = i11;
    }
}
