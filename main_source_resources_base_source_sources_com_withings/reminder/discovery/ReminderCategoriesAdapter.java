package com.withings.reminder.discovery;

import android.view.ViewGroup;
import androidx.collection.c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.reminder.R;
import com.withings.reminder.discovery.views.Listener;
import com.withings.reminder.model.ReminderType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: RemindersDiscoveryActivity.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J'\u0010\t\u001a\u00020\b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006\""}, d2 = {"Lcom/withings/reminder/discovery/ReminderCategoriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$z;", "", "", "", "Lcom/withings/reminder/model/ReminderType;", "remindersByCategory", "Lnm0/y;", "setData", "(Ljava/util/Map;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$z;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$z;I)V", "getItemCount", "()I", "Lcom/withings/reminder/discovery/views/Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/withings/reminder/discovery/views/Listener;", "getListener", "()Lcom/withings/reminder/discovery/views/Listener;", "", "Ljava/util/Map;", "<init>", "(Lcom/withings/reminder/discovery/views/Listener;)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderCategoriesAdapter extends RecyclerView.Adapter<RecyclerView.z> {
    public static final int $stable = 8;
    private final Listener listener;
    private final Map<String, List<ReminderType>> remindersByCategory;

    public ReminderCategoriesAdapter(Listener listener) {
        u.j(listener, "listener");
        this.listener = listener;
        this.remindersByCategory = new LinkedHashMap();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.remindersByCategory.size() + 1;
    }

    public final Listener getListener() {
        return this.listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.z holder, int i11) {
        u.j(holder, "holder");
        if (holder.getItemViewType() > 0) {
            Map.Entry entry = (Map.Entry) x.E(this.remindersByCategory.entrySet(), i11 - 1);
            ((ReminderCategoryViewHolder) holder).bind((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        u.j(parent, "parent");
        if (i11 == 0) {
            return new ReminderTitleViewHolder(c.n(parent, R.layout.view_reminder_category_item_title));
        }
        return new ReminderCategoryViewHolder(c.n(parent, R.layout.view_reminder_category_item), this.listener);
    }

    public final void setData(Map<String, ? extends List<ReminderType>> remindersByCategory) {
        u.j(remindersByCategory, "remindersByCategory");
        this.remindersByCategory.clear();
        this.remindersByCategory.putAll(remindersByCategory);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        return i11;
    }
}
