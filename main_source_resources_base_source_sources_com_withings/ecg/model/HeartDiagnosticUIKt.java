package com.withings.ecg.model;

import com.withings.common.compose.component.Status;
import com.withings.ecg.core.HeartDiagnostic;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
/* compiled from: HeartDiagnosticUI.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0006¨\u0006\u0007"}, d2 = {"getStaticUrl", "", "Lcom/withings/ecg/model/HeartDiagnosticUI;", "shouldConsiderInconclusiveDiagnostic", "", "toUI", "Lcom/withings/ecg/core/HeartDiagnostic;", "ecg_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartDiagnosticUIKt {

    /* compiled from: HeartDiagnosticUI.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeartDiagnostic.values().length];
            try {
                HeartDiagnostic heartDiagnostic = HeartDiagnostic.f37984a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HeartDiagnostic heartDiagnostic2 = HeartDiagnostic.f37984a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                HeartDiagnostic heartDiagnostic3 = HeartDiagnostic.f37984a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                HeartDiagnostic heartDiagnostic4 = HeartDiagnostic.f37984a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                HeartDiagnostic heartDiagnostic5 = HeartDiagnostic.f37984a;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                HeartDiagnostic heartDiagnostic6 = HeartDiagnostic.f37984a;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                HeartDiagnostic heartDiagnostic7 = HeartDiagnostic.f37984a;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                HeartDiagnostic heartDiagnostic8 = HeartDiagnostic.f37984a;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                HeartDiagnostic heartDiagnostic9 = HeartDiagnostic.f37984a;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                HeartDiagnostic heartDiagnostic10 = HeartDiagnostic.f37984a;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                HeartDiagnostic heartDiagnostic11 = HeartDiagnostic.f37984a;
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                HeartDiagnostic heartDiagnostic12 = HeartDiagnostic.f37984a;
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                HeartDiagnostic heartDiagnostic13 = HeartDiagnostic.f37984a;
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                HeartDiagnostic heartDiagnostic14 = HeartDiagnostic.f37984a;
                iArr[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                HeartDiagnostic heartDiagnostic15 = HeartDiagnostic.f37984a;
                iArr[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                HeartDiagnostic heartDiagnostic16 = HeartDiagnostic.f37984a;
                iArr[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                HeartDiagnostic heartDiagnostic17 = HeartDiagnostic.f37984a;
                iArr[16] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                HeartDiagnostic heartDiagnostic18 = HeartDiagnostic.f37984a;
                iArr[17] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                HeartDiagnostic heartDiagnostic19 = HeartDiagnostic.f37984a;
                iArr[18] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                HeartDiagnostic heartDiagnostic20 = HeartDiagnostic.f37984a;
                iArr[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                HeartDiagnostic heartDiagnostic21 = HeartDiagnostic.f37984a;
                iArr[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                HeartDiagnostic heartDiagnostic22 = HeartDiagnostic.f37984a;
                iArr[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                HeartDiagnostic heartDiagnostic23 = HeartDiagnostic.f37984a;
                iArr[22] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                HeartDiagnostic heartDiagnostic24 = HeartDiagnostic.f37984a;
                iArr[23] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                HeartDiagnostic heartDiagnostic25 = HeartDiagnostic.f37984a;
                iArr[24] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                HeartDiagnostic heartDiagnostic26 = HeartDiagnostic.f37984a;
                iArr[25] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                HeartDiagnostic heartDiagnostic27 = HeartDiagnostic.f37984a;
                iArr[26] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                HeartDiagnostic heartDiagnostic28 = HeartDiagnostic.f37984a;
                iArr[27] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                HeartDiagnostic heartDiagnostic29 = HeartDiagnostic.f37984a;
                iArr[28] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getStaticUrl(HeartDiagnosticUI heartDiagnosticUI, boolean z5) {
        u.j(heartDiagnosticUI, "<this>");
        if (z5 && heartDiagnosticUI.getValue() == 2) {
            return C1987R.string.vhd_detail_staticUnderstandInconclusiveVhdMeasurementUrl;
        }
        if (heartDiagnosticUI.getValue() < 0) {
            return C1987R.string.vhd_detail_staticVhdBootstrapUrl;
        }
        return C1987R.string.vhd_detail_staticUnderstandVhdMeasurementUrl;
    }

    public static /* synthetic */ int getStaticUrl$default(HeartDiagnosticUI heartDiagnosticUI, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z5 = false;
        }
        return getStaticUrl(heartDiagnosticUI, z5);
    }

    public static final HeartDiagnosticUI toUI(HeartDiagnostic heartDiagnostic) {
        u.j(heartDiagnostic, "<this>");
        switch (heartDiagnostic.ordinal()) {
            case 0:
                return new HeartDiagnosticUI(heartDiagnostic, 1, 0, C1987R.color.statusGood, C1987R.drawable.icon_medium_status_good, Status.Icon.f33327a);
            case 1:
                return new HeartDiagnosticUI(heartDiagnostic, 1, 1, C1987R.color.statusBad, C1987R.drawable.icon_medium_status_bad, Status.Icon.f33329c);
            case 2:
                return new HeartDiagnosticUI(heartDiagnostic, 1, 2, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33330d);
            case 3:
                return new HeartDiagnosticUI(heartDiagnostic, 1, 8, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33330d);
            case 4:
                return new HeartDiagnosticUI(heartDiagnostic, 1, -2, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33330d);
            case 5:
                return new HeartDiagnosticUI(heartDiagnostic, 1, -1, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33330d);
            case 6:
                return new HeartDiagnosticUI(heartDiagnostic, 1, 3, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33330d);
            case 7:
                return new HeartDiagnosticUI(heartDiagnostic, 1, 4, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33330d);
            case 8:
                return new HeartDiagnosticUI(heartDiagnostic, 1, 5, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33330d);
            case 9:
                return new HeartDiagnosticUI(heartDiagnostic, 1, 6, C1987R.color.statusModerate, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33328b);
            case 10:
                return new HeartDiagnosticUI(heartDiagnostic, 1, 7, C1987R.color.statusModerate, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33328b);
            case 11:
                return new HeartDiagnosticUI(heartDiagnostic, 1, 10, C1987R.color.statusModerate, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33328b);
            case 12:
                return new HeartDiagnosticUI(heartDiagnostic, 1, 9, C1987R.color.statusGood, C1987R.drawable.icon_medium_status_good, Status.Icon.f33327a);
            case 13:
                return new HeartDiagnosticUI(heartDiagnostic, 1, 12, C1987R.color.statusBad, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33329c);
            case 14:
                return new HeartDiagnosticUI(heartDiagnostic, 1, 11, C1987R.color.statusBad, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33329c);
            case 15:
                return new HeartDiagnosticUI(heartDiagnostic, 2, 0, C1987R.color.statusGood, C1987R.drawable.icon_medium_status_good, Status.Icon.f33327a);
            case 16:
                return new HeartDiagnosticUI(heartDiagnostic, 2, 1, C1987R.color.statusBad, C1987R.drawable.icon_medium_status_bad, Status.Icon.f33329c);
            case 17:
                return new HeartDiagnosticUI(heartDiagnostic, 2, 2, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33330d);
            case 18:
                return new HeartDiagnosticUI(heartDiagnostic, 2, 3, C1987R.color.statusUndefined, C1987R.drawable.icon_medium_status_bad, Status.Icon.f33330d);
            case 19:
                return new HeartDiagnosticUI(heartDiagnostic, 2, 4, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33330d);
            case 20:
                return new HeartDiagnosticUI(heartDiagnostic, 2, 5, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33330d);
            case 21:
                return new HeartDiagnosticUI(heartDiagnostic, 2, 6, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33330d);
            case 22:
                return new HeartDiagnosticUI(heartDiagnostic, 2, 7, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33330d);
            case 23:
                return new HeartDiagnosticUI(heartDiagnostic, 2, -1, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, Status.Icon.f33334h);
            case 24:
                return new HeartDiagnosticUI(heartDiagnostic, 2, -6, C1987R.color.statusUndefined, C1987R.drawable.ic_stock_heart2, Status.Icon.f33330d);
            case 25:
                return new HeartDiagnosticUI(heartDiagnostic, 2, -5, C1987R.color.statusUndefined, C1987R.drawable.ic_stock_heart2, Status.Icon.f33330d);
            case 26:
                return new HeartDiagnosticUI(heartDiagnostic, 2, -4, C1987R.color.statusUndefined, C1987R.drawable.ic_stock_heart2, Status.Icon.f33330d);
            case 27:
                return new HeartDiagnosticUI(heartDiagnostic, 2, -3, C1987R.color.statusUndefined, C1987R.drawable.ic_stock_heart2, Status.Icon.f33330d);
            case 28:
                return new HeartDiagnosticUI(heartDiagnostic, 2, -2, C1987R.color.statusUndefined, C1987R.drawable.ic_stock_heart2, Status.Icon.f33330d);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
