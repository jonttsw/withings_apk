package com.withings.reminder.ringing;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.reminder.model.ReminderRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
/* compiled from: ReminderRingingActivity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/withings/reminder/ringing/ReminderRingingViewModel;", "Landroidx/lifecycle/g1;", "Lnm0/y;", "onMuteClicked", "()V", "Lcom/withings/reminder/model/ReminderRepository;", "reminderRepository", "Lcom/withings/reminder/model/ReminderRepository;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "_finish", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "finish", "Lkotlinx/coroutines/flow/SharedFlow;", "getFinish", "()Lkotlinx/coroutines/flow/SharedFlow;", "<init>", "(Lcom/withings/reminder/model/ReminderRepository;)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderRingingViewModel extends g1 {
    public static final int $stable = 8;
    private final MutableSharedFlow<Boolean> _finish;
    private final SharedFlow<Boolean> finish;
    private final ReminderRepository reminderRepository;

    @Inject
    public ReminderRingingViewModel(ReminderRepository reminderRepository) {
        u.j(reminderRepository, "reminderRepository");
        this.reminderRepository = reminderRepository;
        MutableSharedFlow<Boolean> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._finish = MutableSharedFlow$default;
        this.finish = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final SharedFlow<Boolean> getFinish() {
        return this.finish;
    }

    public final void onMuteClicked() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new ReminderRingingViewModel$onMuteClicked$1(this, null), 3, null);
    }
}
