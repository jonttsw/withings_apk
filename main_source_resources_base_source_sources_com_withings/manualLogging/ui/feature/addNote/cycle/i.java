package com.withings.manualLogging.ui.feature.addNote.cycle;

import android.content.Context;
import com.withings.manualLogging.core.entity.cycle.ContraceptiveType;
import com.withings.manualLogging.core.entity.cycle.CycleManualLoggingFactor;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: CycleFactorUi.kt */
/* loaded from: classes4.dex */
public final class i {
    public static List a(Context context, long j5, long j11) {
        zm.d entryPoint = (zm.d) ah.o.c(context, zm.d.class);
        kotlin.jvm.internal.u.j(entryPoint, "entryPoint");
        an.b bVar = new an.b(entryPoint.e(), entryPoint.r(), entryPoint.l(), entryPoint.t(), entryPoint.P(), entryPoint.M(), entryPoint.x(), entryPoint.D(), entryPoint.y(), entryPoint.F());
        return kotlin.collections.x.W(bVar.d(j5, j11), bVar.a(j5, j11), bVar.c(j5, j11), bVar.b(j5, j11));
    }

    public static final int b(ContraceptiveType contraceptiveType) {
        kotlin.jvm.internal.u.j(contraceptiveType, "<this>");
        switch (contraceptiveType.ordinal()) {
            case 0:
                return C1987R.string.cycle_tracking_factors_contraceptive_contraceptiveImplants;
            case 1:
                return C1987R.string.cycle_tracking_factors_contraceptive_contraceptivePatch;
            case 2:
                return C1987R.string.cycle_tracking_factors_contraceptive_cropperIUD;
            case 3:
                return C1987R.string.cycle_tracking_factors_contraceptive_hormonalInjection;
            case 4:
                return C1987R.string.cycle_tracking_factors_contraceptive_hormonalIUD;
            case 5:
                return C1987R.string.cycle_tracking_factors_contraceptive_oestroProgestPills;
            case 6:
                return C1987R.string.cycle_tracking_factors_contraceptive_oestroProgestPillsExtend;
            case 7:
                return C1987R.string.cycle_tracking_factors_contraceptive_progestPillsMicro;
            case 8:
                return C1987R.string.cycle_tracking_factors_contraceptive_vaginalRing;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int c(CycleManualLoggingFactor cycleManualLoggingFactor) {
        kotlin.jvm.internal.u.j(cycleManualLoggingFactor, "<this>");
        int ordinal = cycleManualLoggingFactor.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return C1987R.string.cycle_tracking_factors_pregnancy;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return C1987R.string.cycle_tracking_factors_postPartumOrBreastFeeding;
                }
                return C1987R.string.cycle_tracking_factors_perimenopause;
            }
            return C1987R.string.cycle_tracking_factors_contraceptive;
        }
        return C1987R.string.cycle_tracking_factors_noFactor;
    }
}
