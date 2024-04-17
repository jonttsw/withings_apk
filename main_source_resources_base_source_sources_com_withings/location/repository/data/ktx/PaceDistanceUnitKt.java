package com.withings.location.repository.data.ktx;

import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.location.model.PaceDistanceUnit;
import kotlin.Metadata;
/* compiled from: PaceDistanceUnit.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"PaceDistanceUnit", "Lcom/withings/location/model/PaceDistanceUnit;", HealthConstants.FoodIntake.UNIT, "", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaceDistanceUnitKt {
    public static final PaceDistanceUnit PaceDistanceUnit(int i11) {
        if (i11 != 6) {
            if (i11 != 7) {
                return PaceDistanceUnit.KM.INSTANCE;
            }
            return PaceDistanceUnit.MILE.INSTANCE;
        }
        return PaceDistanceUnit.KM.INSTANCE;
    }
}
