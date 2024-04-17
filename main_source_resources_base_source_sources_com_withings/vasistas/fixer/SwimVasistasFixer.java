package com.withings.vasistas.fixer;

import androidx.compose.material.n3;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.webservices.legacy.withings.model.session.DeviceSession;
import em.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.joda.time.DateTimeConstants;
/* loaded from: classes4.dex */
public class SwimVasistasFixer {
    public static final int KM_TO_METERS = 1000;
    private static final HashMap<Float, Float> MET_BY_SPEED;
    public static final float MOVEMENTS_PER_LAP = 15.0f;
    private static final float STROKE_SPEED_COEF_MAX = 0.8f;
    private static final float STROKE_SPEED_COEF_MIN = 0.2f;
    public static final float SWIMING_POOL_LENGTH = 25.0f;
    private Float previousStrokeSpeed;
    private Long previousVasistasEnd;
    private User user;

    static {
        HashMap<Float, Float> hashMap = new HashMap<>();
        MET_BY_SPEED = hashMap;
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(2.0f);
        hashMap.put(valueOf, valueOf2);
        hashMap.put(valueOf2, Float.valueOf(4.3f));
        hashMap.put(Float.valueOf(2.5f), Float.valueOf(6.8f));
        hashMap.put(Float.valueOf(3.0f), Float.valueOf(8.9f));
        hashMap.put(Float.valueOf(3.5f), Float.valueOf(11.5f));
        hashMap.put(Float.valueOf(4.0f), Float.valueOf(13.6f));
    }

    public SwimVasistasFixer(User user) {
        this.user = user;
    }

    private void cleanPreviousVasistasDataIfToOld(Vasistas vasistas) {
        if (this.previousVasistasEnd != null && vasistas.getStartDate().getMillis() - this.previousVasistasEnd.longValue() > DeviceSession.DEVICE_SESSION_TTL) {
            this.previousVasistasEnd = null;
            this.previousStrokeSpeed = null;
        }
    }

    private float computeDistance(Vasistas vasistas) {
        return (vasistas.getSwimMovements() * 25.0f) / 15.0f;
    }

    private float computeStrokeSpeed(Vasistas vasistas) {
        float f11;
        float swimMovements = vasistas.getSwimMovements() / (vasistas.getDurationMillis() / 1000);
        Float f12 = this.previousStrokeSpeed;
        if (f12 != null) {
            if (swimMovements > f12.floatValue()) {
                f11 = STROKE_SPEED_COEF_MAX;
            } else {
                f11 = STROKE_SPEED_COEF_MIN;
            }
            return n3.a(1.0f, f11, swimMovements, this.previousStrokeSpeed.floatValue() * f11);
        }
        return swimMovements;
    }

    private int getVasistasDurationWithHoleFilled(Vasistas vasistas) {
        int durationMillis = vasistas.getDurationMillis();
        if (this.previousVasistasEnd != null) {
            long millis = vasistas.getStartDate().getMillis() - this.previousVasistasEnd.longValue();
            if (millis < 120000 && millis > 0) {
                return (int) (durationMillis + millis);
            }
            return durationMillis;
        }
        return durationMillis;
    }

    private void setPreviousVasistasData(Vasistas vasistas, float f11) {
        this.previousVasistasEnd = Long.valueOf(vasistas.getEnd().getMillis());
        this.previousStrokeSpeed = Float.valueOf(f11);
    }

    public void fixCalories(Vasistas vasistas) {
        if (vasistas.getActivityType() == Vasistas.ActivityType.SWIM && vasistas.getDurationMillis() != 0 && vasistas.getCalories() <= 0.0f) {
            cleanPreviousVasistasDataIfToOld(vasistas);
            vasistas.setDurationMillis(getVasistasDurationWithHoleFilled(vasistas));
            float computeStrokeSpeed = computeStrokeSpeed(vasistas);
            int durationMillis = vasistas.getDurationMillis() / 1000;
            vasistas.setSwimMovements((int) (durationMillis * computeStrokeSpeed));
            float computeDistance = (computeDistance(vasistas) / 1000.0f) / (durationMillis / DateTimeConstants.SECONDS_PER_HOUR);
            float a11 = new a.C0888a(sw.a.z()).a(this.user, vasistas.getStartDate());
            vasistas.setMet(getMetForSpeed(computeDistance));
            vasistas.setEarnedCalories((((vasistas.getMet() - 1.0f) * a11) * vasistas.getDurationMillis()) / 8.64E7f);
            vasistas.setCalories(((a11 * vasistas.getDurationMillis()) / 8.64E7f) + vasistas.getEarnedCalories());
            setPreviousVasistasData(vasistas, computeStrokeSpeed);
        }
    }

    float getMetForSpeed(float f11) {
        HashMap<Float, Float> hashMap = MET_BY_SPEED;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList);
        int binarySearch = Collections.binarySearch(arrayList, Float.valueOf(f11));
        if (binarySearch >= 0) {
            return hashMap.get(arrayList.get(binarySearch)).floatValue();
        }
        int i11 = -binarySearch;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return hashMap.get(arrayList.get(i12)).floatValue();
        }
        if (i12 == arrayList.size()) {
            return hashMap.get(arrayList.get(i11 - 2)).floatValue();
        }
        Float f12 = (Float) arrayList.get(i11 - 2);
        float floatValue = f12.floatValue();
        float floatValue2 = hashMap.get(f12).floatValue();
        Float f13 = (Float) arrayList.get(i12);
        return (((f11 - floatValue) * (hashMap.get(f13).floatValue() - floatValue2)) / (f13.floatValue() - floatValue)) + floatValue2;
    }
}
