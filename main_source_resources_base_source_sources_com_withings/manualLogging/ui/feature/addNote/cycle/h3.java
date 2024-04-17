package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.common.compose.picker.SurveyDateValidator;
import com.withings.manualLogging.core.entity.cycle.ContraceptiveType;
import org.joda.time.LocalDate;
/* compiled from: CycleSurveyFormField.kt */
/* loaded from: classes4.dex */
public final class h3 {
    public static final SurveyDateValidator a(g3 g3Var, Long l5) {
        return new SurveyDateValidator(l5, Long.valueOf(g3Var.j().toDate().getTime()));
    }

    public static final gx.c b(g3 g3Var, LocalDate startDate) {
        kotlin.jvm.internal.u.j(startDate, "startDate");
        return new gx.c(g3Var.c(), g3Var.k(), startDate);
    }

    public static final boolean c(ContraceptiveType contraceptiveType) {
        kotlin.jvm.internal.u.j(contraceptiveType, "<this>");
        return kotlin.collections.x.W(ContraceptiveType.f40669c, ContraceptiveType.f40667a).contains(contraceptiveType);
    }

    public static final SurveyDateValidator d(g3 g3Var) {
        kotlin.jvm.internal.u.j(g3Var, "<this>");
        return new SurveyDateValidator(null, Long.valueOf(g3Var.j().toDate().getTime()));
    }
}
