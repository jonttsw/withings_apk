package com.withings.library.healthscore.utils.ktx;

import kotlin.Metadata;
/* compiled from: DoubleExtentions.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u001a\u001d\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LIMIT_VARIATION", "", "preventScoreVariation", "previousScore", "(Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;", "rangeScore", "HealthScore_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DoubleExtentionsKt {
    public static final double LIMIT_VARIATION = 10.0d;

    public static final Double preventScoreVariation(Double d11, Double d12) {
        Double d13;
        if (d12 != null) {
            double doubleValue = d12.doubleValue();
            if (d11 != null) {
                double doubleValue2 = d11.doubleValue();
                if (Math.abs(doubleValue - doubleValue2) > 10.0d) {
                    if (doubleValue > doubleValue2) {
                        doubleValue2 = doubleValue - 10.0d;
                    } else {
                        doubleValue2 = doubleValue + 10.0d;
                    }
                }
                d13 = Double.valueOf(doubleValue2);
            } else {
                d13 = null;
            }
            if (d13 != null) {
                return d13;
            }
            return d11;
        }
        return d11;
    }

    public static final double rangeScore(double d11) {
        return Math.min(100.0d, Math.max(20.0d, d11));
    }
}
