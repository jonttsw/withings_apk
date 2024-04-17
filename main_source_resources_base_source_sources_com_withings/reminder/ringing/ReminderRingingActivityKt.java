package com.withings.reminder.ringing;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.v;
import k1.o1;
import k1.r0;
import kotlin.Metadata;
import yk.o;
/* compiled from: ReminderRingingActivity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0011\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/reminder/ringing/ReminderRingingViewModel;", "viewModel", "", "title", "", "imageRes", "Lkotlin/Function0;", "Lnm0/y;", "onBackClick", "onSettingsClick", "onReminderDone", "ReminderRingingScreen", "(Lcom/withings/reminder/ringing/ReminderRingingViewModel;Ljava/lang/String;ILym0/a;Lym0/a;Lym0/a;Landroidx/compose/runtime/a;II)V", "ReminderRingingScreenPreview", "(Landroidx/compose/runtime/a;I)V", "", "muteLoading", "finish", "reminder_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderRingingActivityKt {
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ReminderRingingScreen(com.withings.reminder.ringing.ReminderRingingViewModel r24, java.lang.String r25, int r26, ym0.a<nm0.y> r27, ym0.a<nm0.y> r28, ym0.a<nm0.y> r29, androidx.compose.runtime.a r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.reminder.ringing.ReminderRingingActivityKt.ReminderRingingScreen(com.withings.reminder.ringing.ReminderRingingViewModel, java.lang.String, int, ym0.a, ym0.a, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ReminderRingingScreen$lambda$1(r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ReminderRingingScreen$lambda$2(r0<Boolean> r0Var, boolean z5) {
        r0Var.setValue(Boolean.valueOf(z5));
    }

    private static final boolean ReminderRingingScreen$lambda$3(o1<Boolean> o1Var) {
        return o1Var.getValue().booleanValue();
    }

    public static final void ReminderRingingScreenPreview(a aVar, int i11) {
        b g11 = aVar.g(694793705);
        if (i11 == 0 && g11.h()) {
            g11.C();
        } else {
            o.b(false, ComposableSingletons$ReminderRingingActivityKt.INSTANCE.m31getLambda1$reminder_release(), g11, 48, 1);
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new ReminderRingingActivityKt$ReminderRingingScreenPreview$1(i11));
        }
    }
}
