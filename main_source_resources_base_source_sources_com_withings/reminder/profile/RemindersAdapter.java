package com.withings.reminder.profile;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.reminder.model.Reminder;
import com.withings.views.view.ToggleCellView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: RemindersSectionView.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001f¨\u0006\""}, d2 = {"Lcom/withings/reminder/profile/RemindersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/withings/reminder/profile/ReminderToggleViewHolder;", "Lcom/withings/reminder/profile/ReminderListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lnm0/y;", "setListener", "(Lcom/withings/reminder/profile/ReminderListener;)V", "", "Lcom/withings/reminder/model/Reminder;", "reminders", "setReminders", "(Ljava/util/List;)V", "", "getReminders", "()Ljava/util/List;", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/withings/reminder/profile/ReminderToggleViewHolder;", "holder", "onBindViewHolder", "(Lcom/withings/reminder/profile/ReminderToggleViewHolder;I)V", "getItemCount", "()I", "Lcom/withings/reminder/profile/ReminderListener;", "Ljava/util/List;", "<init>", "()V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class RemindersAdapter extends RecyclerView.Adapter<ReminderToggleViewHolder> {
    public static final int $stable = 8;
    private ReminderListener listener;
    private final List<Reminder> reminders = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.reminders.size();
    }

    public final List<Reminder> getReminders() {
        return this.reminders;
    }

    public final void setListener(ReminderListener listener) {
        u.j(listener, "listener");
        this.listener = listener;
    }

    public final void setReminders(List<Reminder> reminders) {
        u.j(reminders, "reminders");
        this.reminders.clear();
        this.reminders.addAll(reminders);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ReminderToggleViewHolder holder, int i11) {
        u.j(holder, "holder");
        holder.bind(this.reminders.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ReminderToggleViewHolder onCreateViewHolder(ViewGroup parent, int i11) {
        u.j(parent, "parent");
        Context context = parent.getContext();
        u.i(context, "getContext(...)");
        ToggleCellView toggleCellView = new ToggleCellView(context, null, 6, 0);
        ReminderListener reminderListener = this.listener;
        if (reminderListener != null) {
            return new ReminderToggleViewHolder(toggleCellView, reminderListener);
        }
        u.s(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        return i11;
    }
}
