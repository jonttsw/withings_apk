package com.withings.reminder.discovery;

import android.content.Context;
import android.view.View;
import androidx.core.view.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.reminder.R;
import com.withings.reminder.discovery.views.Listener;
import com.withings.reminder.discovery.views.ReminderTypeAdapter;
import com.withings.reminder.model.ReminderType;
import com.withings.views.view.SectionView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Bind;
import wq.a;
import zq.b;
/* compiled from: RemindersDiscoveryActivity.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\n \u0013*\u0004\u0018\u00010\u00160\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/withings/reminder/discovery/ReminderCategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$z;", "Lcom/withings/reminder/discovery/views/Listener;", "", "title", "", "Lcom/withings/reminder/model/ReminderType;", "reminderTypes", "Lnm0/y;", Bind.ELEMENT, "(Ljava/lang/String;Ljava/util/List;)V", "reminderType", "onReminderTypeClicked", "(Lcom/withings/reminder/model/ReminderType;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/withings/reminder/discovery/views/Listener;", "getListener", "()Lcom/withings/reminder/discovery/views/Listener;", "Lcom/withings/views/view/SectionView;", "kotlin.jvm.PlatformType", "titleTextView", "Lcom/withings/views/view/SectionView;", "Landroidx/recyclerview/widget/RecyclerView;", "remindersRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/withings/reminder/discovery/views/ReminderTypeAdapter;", "remindersAdapter$delegate", "Lnm0/g;", "getRemindersAdapter", "()Lcom/withings/reminder/discovery/views/ReminderTypeAdapter;", "remindersAdapter", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;Lcom/withings/reminder/discovery/views/Listener;)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderCategoryViewHolder extends RecyclerView.z implements Listener {
    public static final int $stable = 8;
    private final Listener listener;
    private final g remindersAdapter$delegate;
    private RecyclerView remindersRecyclerView;
    private SectionView titleTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderCategoryViewHolder(View view, Listener listener) {
        super(view);
        u.j(view, "view");
        u.j(listener, "listener");
        this.listener = listener;
        this.titleTextView = (SectionView) view.findViewById(R.id.reminder_category_title);
        this.remindersRecyclerView = (RecyclerView) view.findViewById(R.id.reminders_carousel);
        this.remindersAdapter$delegate = h.b(new ReminderCategoryViewHolder$remindersAdapter$2(this));
        RecyclerView recyclerView = this.remindersRecyclerView;
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        recyclerView.setAdapter(getRemindersAdapter());
        b.a(recyclerView, R.drawable.reminder_carousel_spacer, 0);
        recyclerView.setHasFixedSize(false);
        u0.o0(recyclerView);
    }

    private final ReminderTypeAdapter getRemindersAdapter() {
        return (ReminderTypeAdapter) this.remindersAdapter$delegate.getValue();
    }

    public final void bind(String title, List<ReminderType> reminderTypes) {
        u.j(title, "title");
        u.j(reminderTypes, "reminderTypes");
        SectionView sectionView = this.titleTextView;
        Context context = sectionView.getContext();
        u.i(context, "getContext(...)");
        sectionView.setTitle(a.i(context, title));
        getRemindersAdapter().setReminders(reminderTypes);
    }

    public final Listener getListener() {
        return this.listener;
    }

    @Override // com.withings.reminder.discovery.views.Listener
    public void onReminderTypeClicked(ReminderType reminderType) {
        u.j(reminderType, "reminderType");
        this.listener.onReminderTypeClicked(reminderType);
    }
}
