package com.withings.reminder.details;

import androidx.lifecycle.h0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.model.ReminderRepository;
import com.withings.reminder.model.ReminderType;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: ReminderDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h0;", "Lcom/withings/reminder/model/ReminderType;", "Lnm0/y;", "<anonymous>", "(Landroidx/lifecycle/h0;)V"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.reminder.details.ReminderDetailsViewModel$createBackgroundReminderTypeLiveData$1", f = "ReminderDetailsActivity.kt", l = {ConstantsWs.WS_STATUS_UNKNOWN_MEASGRP}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ReminderDetailsViewModel$createBackgroundReminderTypeLiveData$1 extends i implements p<h0<ReminderType>, qm0.d<? super y>, Object> {
    final /* synthetic */ ReminderRepository $reminderRepository;
    final /* synthetic */ Long $reminderTypeWsId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderDetailsViewModel$createBackgroundReminderTypeLiveData$1(Long l5, ReminderRepository reminderRepository, qm0.d<? super ReminderDetailsViewModel$createBackgroundReminderTypeLiveData$1> dVar) {
        super(2, dVar);
        this.$reminderTypeWsId = l5;
        this.$reminderRepository = reminderRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        ReminderDetailsViewModel$createBackgroundReminderTypeLiveData$1 reminderDetailsViewModel$createBackgroundReminderTypeLiveData$1 = new ReminderDetailsViewModel$createBackgroundReminderTypeLiveData$1(this.$reminderTypeWsId, this.$reminderRepository, dVar);
        reminderDetailsViewModel$createBackgroundReminderTypeLiveData$1.L$0 = obj;
        return reminderDetailsViewModel$createBackgroundReminderTypeLiveData$1;
    }

    @Override // ym0.p
    public final Object invoke(h0<ReminderType> h0Var, qm0.d<? super y> dVar) {
        return ((ReminderDetailsViewModel$createBackgroundReminderTypeLiveData$1) create(h0Var, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ReminderType reminderTypeByWsId;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            h0 h0Var = (h0) this.L$0;
            Long l5 = this.$reminderTypeWsId;
            if (l5 != null && (reminderTypeByWsId = this.$reminderRepository.getReminderTypeByWsId(l5.longValue())) != null) {
                this.label = 1;
                if (h0Var.emit(reminderTypeByWsId, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                Long l6 = this.$reminderTypeWsId;
                throw new IllegalArgumentException("No reminder type with ws id : " + l6);
            }
        }
        return y.f85009a;
    }
}
