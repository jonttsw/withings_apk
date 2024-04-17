package com.withings.reminder.discovery.views;

import android.view.ViewGroup;
import androidx.collection.c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.reminder.R;
import com.withings.reminder.model.ReminderType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ReminderCarousel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/withings/reminder/discovery/views/ReminderTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/withings/reminder/discovery/views/ReminderTypeViewHolder;", "", "Lcom/withings/reminder/model/ReminderType;", "reminderTypes", "Lnm0/y;", "setReminders", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/withings/reminder/discovery/views/ReminderTypeViewHolder;", "holder", "position", "onBindViewHolder", "(Lcom/withings/reminder/discovery/views/ReminderTypeViewHolder;I)V", "getItemCount", "()I", "Lcom/withings/reminder/discovery/views/Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/withings/reminder/discovery/views/Listener;", "getListener", "()Lcom/withings/reminder/discovery/views/Listener;", "", "Ljava/util/List;", "<init>", "(Lcom/withings/reminder/discovery/views/Listener;)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class ReminderTypeAdapter extends RecyclerView.Adapter<ReminderTypeViewHolder> {
    public static final int $stable = 8;
    private final Listener listener;
    private final List<ReminderType> reminderTypes;

    public ReminderTypeAdapter(Listener listener) {
        u.j(listener, "listener");
        this.listener = listener;
        this.reminderTypes = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.reminderTypes.size();
    }

    public final Listener getListener() {
        return this.listener;
    }

    public final void setReminders(List<ReminderType> reminderTypes) {
        u.j(reminderTypes, "reminderTypes");
        this.reminderTypes.clear();
        this.reminderTypes.addAll(reminderTypes);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ReminderTypeViewHolder holder, int i11) {
        u.j(holder, "holder");
        holder.bind(this.reminderTypes.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ReminderTypeViewHolder onCreateViewHolder(ViewGroup parent, int i11) {
        u.j(parent, "parent");
        return new ReminderTypeViewHolder(c.n(parent, R.layout.view_reminder_item), this.listener);
    }
}
