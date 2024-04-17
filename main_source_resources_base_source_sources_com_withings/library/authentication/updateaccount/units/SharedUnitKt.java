package com.withings.library.authentication.updateaccount.units;

import com.withings.library.authentication.updateaccount.units.DistanceUnit;
import com.withings.library.authentication.updateaccount.units.HeightUnit;
import com.withings.library.authentication.updateaccount.units.TemperatureUnit;
import com.withings.library.authentication.updateaccount.units.WeightUnit;
import kotlin.Metadata;
/* compiled from: SharedUnit.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0002¨\u0006\t"}, d2 = {"toDistanceUnit", "Lcom/withings/library/authentication/updateaccount/units/DistanceUnit;", "", "toHeightUnit", "Lcom/withings/library/authentication/updateaccount/units/HeightUnit;", "toTemperatureUnit", "Lcom/withings/library/authentication/updateaccount/units/TemperatureUnit;", "toWeightUnit", "Lcom/withings/library/authentication/updateaccount/units/WeightUnit;", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SharedUnitKt {
    public static final DistanceUnit toDistanceUnit(int i11) {
        if (i11 != 6) {
            if (i11 != 7) {
                if (i11 != 8) {
                    return new DistanceUnit.Custom(i11);
                }
                return DistanceUnit.Yard.INSTANCE;
            }
            return DistanceUnit.Inch.INSTANCE;
        }
        return DistanceUnit.Meter.INSTANCE;
    }

    public static final HeightUnit toHeightUnit(int i11) {
        if (i11 != 4) {
            if (i11 != 7) {
                return new HeightUnit.Custom(i11);
            }
            return HeightUnit.Inch.INSTANCE;
        }
        return HeightUnit.Meter.INSTANCE;
    }

    public static final TemperatureUnit toTemperatureUnit(int i11) {
        if (i11 != 11) {
            if (i11 != 13) {
                return new TemperatureUnit.Custom(i11);
            }
            return TemperatureUnit.Farenheit.INSTANCE;
        }
        return TemperatureUnit.Celsius.INSTANCE;
    }

    public static final WeightUnit toWeightUnit(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 14) {
                    return new WeightUnit.Custom(i11);
                }
                return WeightUnit.Stlb.INSTANCE;
            }
            return WeightUnit.Lb.INSTANCE;
        }
        return WeightUnit.Kg.INSTANCE;
    }
}
