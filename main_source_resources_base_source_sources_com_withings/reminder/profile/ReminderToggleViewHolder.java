package com.withings.reminder.profile;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b50.b;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderKt;
import com.withings.reminder.notification.ReminderNotificationBuilder;
import com.withings.views.view.ToggleCellView;
import com.withings.views.view.m;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Bind;
import pm.d;
import un.n;
import vh.h;
import vh.o;
/* compiled from: RemindersSectionView.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/withings/reminder/profile/ReminderToggleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$z;", "Lcom/withings/reminder/model/Reminder;", ReminderNotificationBuilder.NOTIFICATION_TAG, "Lnm0/y;", "bindName", "(Lcom/withings/reminder/model/Reminder;)V", Bind.ELEMENT, "Lcom/withings/views/view/ToggleCellView;", "view", "Lcom/withings/views/view/ToggleCellView;", "getView", "()Lcom/withings/views/view/ToggleCellView;", "Lcom/withings/reminder/profile/ReminderListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/withings/reminder/profile/ReminderListener;", "getListener", "()Lcom/withings/reminder/profile/ReminderListener;", "<init>", "(Lcom/withings/views/view/ToggleCellView;Lcom/withings/reminder/profile/ReminderListener;)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class ReminderToggleViewHolder extends RecyclerView.z {
    public static final int $stable = 8;
    private final ReminderListener listener;
    private final ToggleCellView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderToggleViewHolder(ToggleCellView view, ReminderListener listener) {
        super(view);
        u.j(view, "view");
        u.j(listener, "listener");
        this.view = view;
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(ReminderToggleViewHolder this$0, Reminder reminder, View view) {
        u.j(this$0, "this$0");
        u.j(reminder, "$reminder");
        this$0.listener.onReminderClicked(reminder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$1(ReminderToggleViewHolder this$0, Reminder reminder, View view) {
        u.j(this$0, "this$0");
        u.j(reminder, "$reminder");
        this$0.listener.onReminderDelete(reminder);
        return true;
    }

    private final void bindName(Reminder reminder) {
        h.b(this);
        o d11 = h.h().d(new ReminderToggleViewHolder$bindName$1(reminder));
        d11.s(new ReminderToggleViewHolder$bindName$2(this));
        d11.p(this);
    }

    public final void bind(final Reminder reminder) {
        boolean z5;
        u.j(reminder, "reminder");
        Context context = this.itemView.getContext();
        u.g(context);
        this.view.setValueText(context.getString(C1987R.string._RMNDR_REPEAT__s_DAYS__s_TIME_, d.c(context, reminder.getDays()), b.t(context, reminder.getTime())));
        ToggleCellView toggleCellView = this.view;
        if (!ReminderKt.isMuted(reminder) && reminder.getEnabled()) {
            z5 = true;
        } else {
            z5 = false;
        }
        toggleCellView.setChecked(z5);
        this.view.setToggleListener(new m() { // from class: com.withings.reminder.profile.ReminderToggleViewHolder$bind$1
            @Override // com.withings.views.view.m
            public void onCellSwitched(ToggleCellView toggleView, boolean z11) {
                u.j(toggleView, "toggleView");
                ReminderToggleViewHolder.this.getListener().onReminderSwitched(reminder, z11);
            }
        });
        this.itemView.setOnClickListener(new n(1, this, reminder));
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.withings.reminder.profile.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean bind$lambda$1;
                bind$lambda$1 = ReminderToggleViewHolder.bind$lambda$1(ReminderToggleViewHolder.this, reminder, view);
                return bind$lambda$1;
            }
        });
        bindName(reminder);
    }

    public final ReminderListener getListener() {
        return this.listener;
    }

    public final ToggleCellView getView() {
        return this.view;
    }
}
