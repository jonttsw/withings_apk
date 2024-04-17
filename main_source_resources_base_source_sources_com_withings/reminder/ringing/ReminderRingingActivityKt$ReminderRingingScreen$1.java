package com.withings.reminder.ringing;

import androidx.compose.runtime.a;
import com.withings.common.compose.component.a3;
import com.withings.common.compose.component.c5;
import com.withings.common.compose.component.l2;
import d1.e;
import d1.m;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReminderRingingActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderRingingActivityKt$ReminderRingingScreen$1 extends w implements p<a, Integer, y> {
    final /* synthetic */ ym0.a<y> $onBackClick;
    final /* synthetic */ ym0.a<y> $onSettingsClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderRingingActivityKt$ReminderRingingScreen$1(ym0.a<y> aVar, ym0.a<y> aVar2) {
        super(2);
        this.$onSettingsClick = aVar;
        this.$onBackClick = aVar2;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
        } else {
            c5.c(null, null, null, e.a(), x.V(new a3.a(new l2.a(m.a()), this.$onSettingsClick)), null, null, this.$onBackClick, false, aVar, 0, 359);
        }
    }
}
