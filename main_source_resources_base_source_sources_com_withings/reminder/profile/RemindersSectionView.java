package com.withings.reminder.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.media3.ui.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.R;
import com.withings.reminder.model.Reminder;
import com.withings.views.view.SectionView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.spo2.m;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
/* compiled from: RemindersSectionView.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR#\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0019\u001a\n \u000f*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001e\u001a\n \u000f*\u0004\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010#¨\u0006-"}, d2 = {"Lcom/withings/reminder/profile/RemindersSectionView;", "Landroid/widget/LinearLayout;", "Lnm0/y;", "updateViews", "()V", "Lcom/withings/reminder/profile/ReminderListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/withings/reminder/profile/ReminderListener;)V", "", "Lcom/withings/reminder/model/Reminder;", "reminders", "setReminders", "(Ljava/util/List;)V", "Lcom/withings/views/view/SectionView;", "kotlin.jvm.PlatformType", "headerSectionView$delegate", "Lnm0/g;", "getHeaderSectionView", "()Lcom/withings/views/view/SectionView;", "headerSectionView", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/view/View;", "emptyView$delegate", "getEmptyView", "()Landroid/view/View;", "emptyView", "Lcom/withings/reminder/profile/ReminderListener;", "Lcom/withings/reminder/profile/RemindersAdapter;", "remindersAdapter$delegate", "getRemindersAdapter", "()Lcom/withings/reminder/profile/RemindersAdapter;", "remindersAdapter", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemindersSectionView extends LinearLayout {
    public static final int $stable = 8;
    private final g emptyView$delegate;
    private final g headerSectionView$delegate;
    private ReminderListener listener;
    private final g recyclerView$delegate;
    private final g remindersAdapter$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RemindersSectionView(Context context) {
        this(context, null, 0, 6, null);
        u.j(context, "context");
    }

    public static final void _init_$lambda$0(RemindersSectionView this$0, View view) {
        u.j(this$0, "this$0");
        ReminderListener reminderListener = this$0.listener;
        if (reminderListener != null) {
            reminderListener.onDiscoveryClick();
        } else {
            u.s(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
    }

    public static /* synthetic */ void b(RemindersSectionView remindersSectionView, View view) {
        _init_$lambda$0(remindersSectionView, view);
    }

    private final View getEmptyView() {
        return (View) this.emptyView$delegate.getValue();
    }

    private final SectionView getHeaderSectionView() {
        return (SectionView) this.headerSectionView$delegate.getValue();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView$delegate.getValue();
    }

    private final RemindersAdapter getRemindersAdapter() {
        return (RemindersAdapter) this.remindersAdapter$delegate.getValue();
    }

    private final void updateViews() {
        int i11;
        i iVar;
        int i12;
        boolean isEmpty = getRemindersAdapter().getReminders().isEmpty();
        View emptyView = getEmptyView();
        int i13 = 8;
        if (isEmpty) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        emptyView.setVisibility(i11);
        View emptyView2 = getEmptyView();
        if (isEmpty) {
            iVar = new i(this, 6);
        } else {
            iVar = null;
        }
        emptyView2.setOnClickListener(iVar);
        RecyclerView recyclerView = getRecyclerView();
        if (!isEmpty) {
            i13 = 0;
        }
        recyclerView.setVisibility(i13);
        SectionView headerSectionView = getHeaderSectionView();
        if (isEmpty) {
            i12 = C1987R.string.profile_addReminder;
        } else {
            i12 = C1987R.string._MORE_;
        }
        headerSectionView.setAction(m.h(this, i12));
    }

    public static final void updateViews$lambda$2(RemindersSectionView this$0, View view) {
        u.j(this$0, "this$0");
        ReminderListener reminderListener = this$0.listener;
        if (reminderListener != null) {
            reminderListener.onDiscoveryClick();
        } else {
            u.s(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
    }

    public final void setListener(ReminderListener listener) {
        u.j(listener, "listener");
        this.listener = listener;
        getRemindersAdapter().setListener(listener);
    }

    public final void setReminders(List<Reminder> reminders) {
        u.j(reminders, "reminders");
        getRemindersAdapter().setReminders(x.D0(reminders, new Comparator() { // from class: com.withings.reminder.profile.RemindersSectionView$setReminders$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return pm0.a.b(((Reminder) t12).getCreatedDate(), ((Reminder) t11).getCreatedDate());
            }
        }));
        updateViews();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RemindersSectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        u.j(context, "context");
    }

    public /* synthetic */ RemindersSectionView(Context context, AttributeSet attributeSet, int i11, int i12, kotlin.jvm.internal.m mVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemindersSectionView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.headerSectionView$delegate = h.b(new RemindersSectionView$headerSectionView$2(this));
        this.recyclerView$delegate = h.b(new RemindersSectionView$recyclerView$2(this));
        this.emptyView$delegate = h.b(new RemindersSectionView$emptyView$2(this));
        this.remindersAdapter$delegate = h.b(RemindersSectionView$remindersAdapter$2.INSTANCE);
        LayoutInflater.from(context).inflate(R.layout.view_section_reminders, this);
        getHeaderSectionView().setActionClickListener(new androidx.media3.ui.h(this, 5));
        getRecyclerView().setLayoutManager(new LinearLayoutManager(1));
        getRecyclerView().setAdapter(getRemindersAdapter());
        getRecyclerView().setNestedScrollingEnabled(false);
        updateViews();
    }
}
