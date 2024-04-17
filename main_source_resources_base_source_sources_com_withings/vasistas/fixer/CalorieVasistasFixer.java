package com.withings.vasistas.fixer;

import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import em.a;
/* loaded from: classes4.dex */
public class CalorieVasistasFixer {
    public static final int MAX_CALORIES_BY_MINUTE = 50;
    private final User user;

    public CalorieVasistasFixer(User user) {
        this.user = user;
    }

    private boolean needFix(Vasistas vasistas) {
        float durationMillis = (vasistas.getDurationMillis() * 50.0f) / 60000.0f;
        if (vasistas.getType() == Vasistas.VasistasType.DAY && vasistas.getDistance() > 0.0f && (vasistas.getEarnedCalories() == 0.0f || vasistas.getEarnedCalories() > durationMillis)) {
            return true;
        }
        return false;
    }

    public void fix(Vasistas vasistas) {
        boolean z5;
        float f11;
        if (needFix(vasistas)) {
            float distance = (vasistas.getDistance() / (vasistas.getDurationMillis() / 3600000.0f)) / 1000.0f;
            if (vasistas.getActivityType() == Vasistas.ActivityType.RUN) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            vasistas.setMet((f11 * distance) + 1.0f);
            vasistas.setEarnedCalories((((vasistas.getMet() - 1.0f) * new a.C0888a(sw.a.z()).a(this.user, vasistas.getStartDate())) * vasistas.getDurationMillis()) / 8.64E7f);
        }
    }
}
