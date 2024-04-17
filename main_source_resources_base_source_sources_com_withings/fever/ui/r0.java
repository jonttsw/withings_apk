package com.withings.fever.ui;

import com.withings.common.compose.component.Status;
import com.withings.fever.core.model.FeverLevel;
import com.withings.wiscale2.C1987R;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: FeverLevelUi.kt */
/* loaded from: classes3.dex */
public final class r0 {
    public static final int a(FeverLevel feverLevel) {
        kotlin.jvm.internal.u.j(feverLevel, "<this>");
        int ordinal = feverLevel.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return C1987R.color.backgroundSecondaryPressed;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return C1987R.color.statusBad;
            }
            return C1987R.color.statusModerate;
        }
        return C1987R.color.statusGood;
    }

    public static final Status.Icon b(FeverLevel feverLevel, androidx.compose.runtime.a aVar) {
        Status.Icon icon;
        kotlin.jvm.internal.u.j(feverLevel, "<this>");
        aVar.s(68177346);
        int ordinal = feverLevel.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        icon = null;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    icon = Status.Icon.f33329c;
                }
            } else {
                icon = Status.Icon.f33328b;
            }
        } else {
            icon = Status.Icon.f33327a;
        }
        aVar.J();
        return icon;
    }

    public static final int c(FeverLevel feverLevel) {
        kotlin.jvm.internal.u.j(feverLevel, "<this>");
        int ordinal = feverLevel.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return C1987R.color.onActionPrimary;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return C1987R.color.statusBad;
            }
            return C1987R.color.statusModerate;
        }
        return C1987R.color.statusGood;
    }

    public static final int d(FeverLevel feverLevel) {
        kotlin.jvm.internal.u.j(feverLevel, "<this>");
        int ordinal = feverLevel.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return C1987R.string.sleepApnea_ahiStatusError;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return C1987R.string._TEMPERATURE_DETAILS_HIGH_FEVER_;
            }
            return C1987R.string._TEMPERATURE_DETAILS_MILD_FEVER_;
        }
        return C1987R.string._TEMPERATURE_DETAILS_NORMAL_;
    }

    public static final long e(FeverLevel feverLevel, androidx.compose.runtime.a aVar) {
        long a11;
        kotlin.jvm.internal.u.j(feverLevel, "<this>");
        aVar.s(1110784238);
        int ordinal = feverLevel.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        aVar.s(-1443061875);
                        a11 = s2.b.a(C1987R.color.textPrimary, aVar);
                        aVar.J();
                    } else {
                        throw a0.a.c(aVar, -1443063510);
                    }
                } else {
                    aVar.s(-1443061953);
                    a11 = s2.b.a(C1987R.color.backgroundSecondary, aVar);
                    aVar.J();
                }
            } else {
                aVar.s(-1443062020);
                a11 = s2.b.a(C1987R.color.textPrimary, aVar);
                aVar.J();
            }
        } else {
            aVar.s(-1443062095);
            a11 = s2.b.a(C1987R.color.backgroundSecondary, aVar);
            aVar.J();
        }
        aVar.J();
        return a11;
    }
}
