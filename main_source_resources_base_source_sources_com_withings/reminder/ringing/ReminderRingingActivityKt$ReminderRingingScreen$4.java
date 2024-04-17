package com.withings.reminder.ringing;

import ah.o;
import androidx.compose.runtime.a;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReminderRingingActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReminderRingingActivityKt$ReminderRingingScreen$4 extends w implements p<a, Integer, y> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $imageRes;
    final /* synthetic */ ym0.a<y> $onBackClick;
    final /* synthetic */ ym0.a<y> $onReminderDone;
    final /* synthetic */ ym0.a<y> $onSettingsClick;
    final /* synthetic */ String $title;
    final /* synthetic */ ReminderRingingViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderRingingActivityKt$ReminderRingingScreen$4(ReminderRingingViewModel reminderRingingViewModel, String str, int i11, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, int i12, int i13) {
        super(2);
        this.$viewModel = reminderRingingViewModel;
        this.$title = str;
        this.$imageRes = i11;
        this.$onBackClick = aVar;
        this.$onSettingsClick = aVar2;
        this.$onReminderDone = aVar3;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        ReminderRingingActivityKt.ReminderRingingScreen(this.$viewModel, this.$title, this.$imageRes, this.$onBackClick, this.$onSettingsClick, this.$onReminderDone, aVar, o.g(this.$$changed | 1), this.$$default);
    }
}
