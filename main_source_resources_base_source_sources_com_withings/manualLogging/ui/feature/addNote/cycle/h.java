package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.cycletracking.core.model.CycleEntry;
import com.withings.wiscale2.C1987R;
import kotlin.NoWhenBranchMatchedException;
import qk.d6;
import qk.f5;
import qk.k5;
import qk.y5;
/* compiled from: CycleEntryUiResources.kt */
/* loaded from: classes4.dex */
public final class h {
    public static final int a(CycleEntry cycleEntry) {
        kotlin.jvm.internal.u.j(cycleEntry, "<this>");
        int ordinal = cycleEntry.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return C1987R.color.categorySexualhealthBackgroundCard;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return C1987R.color.categorySexualhealthBackgroundCard;
                }
                if (ordinal == 4) {
                    return C1987R.color.categorySymptomsBackgroundCard;
                }
                throw new NoWhenBranchMatchedException();
            }
            return C1987R.color.categoryMindfulnessBackgroundCard;
        }
        return C1987R.color.categoryHeartBackgroundCard;
    }

    public static final int b(CycleEntry cycleEntry) {
        kotlin.jvm.internal.u.j(cycleEntry, "<this>");
        int ordinal = cycleEntry.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return C1987R.color.categorySexualhealthIcon;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return C1987R.color.categorySexualhealthIcon;
                }
                if (ordinal == 4) {
                    return C1987R.color.categorySymptomsIcon;
                }
                throw new NoWhenBranchMatchedException();
            }
            return C1987R.color.categoryMindfulnessIcon;
        }
        return C1987R.color.datavizCyclePeriod;
    }

    public static final qk.a c(CycleEntry cycleEntry) {
        kotlin.jvm.internal.u.j(cycleEntry, "<this>");
        int ordinal = cycleEntry.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return y5.f93211a;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return qk.m3.f93029a;
                }
                return d6.f92890a;
            }
            return k5.f93001a;
        }
        return f5.f92921a;
    }

    public static final int d(CycleEntry cycleEntry) {
        kotlin.jvm.internal.u.j(cycleEntry, "<this>");
        int ordinal = cycleEntry.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return C1987R.string.cycleTracking_cycleLogs_symptoms;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return C1987R.string.cycleTracking_cycleLogs_sexualActivity;
                }
                return C1987R.string.cycleTracking_cycleLogs_mood;
            }
            return C1987R.string.cycleTracking_cycleLogs_cervicalMucus;
        }
        return C1987R.string.cycleTracking_cycleLogs_period;
    }

    public static final int e(CycleEntry cycleEntry) {
        kotlin.jvm.internal.u.j(cycleEntry, "<this>");
        int ordinal = cycleEntry.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return C1987R.color.categorySexualhealthTextPrimary;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return C1987R.color.categorySexualhealthTextPrimary;
                }
                if (ordinal == 4) {
                    return C1987R.color.categorySymptomsTextPrimary;
                }
                throw new NoWhenBranchMatchedException();
            }
            return C1987R.color.categoryMindfulnessTextPrimary;
        }
        return C1987R.color.categoryHeartTextPrimary;
    }
}
