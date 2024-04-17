package com.withings.reminder.discovery.views;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.reminder.R;
import com.withings.reminder.model.ReminderType;
import ga.f;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Bind;
import w9.g;
import wq.a;
/* compiled from: ReminderCarousel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n \r*\u0004\u0018\u00010\u00100\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/withings/reminder/discovery/views/ReminderTypeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$z;", "Lcom/withings/reminder/model/ReminderType;", "reminderType", "Lnm0/y;", Bind.ELEMENT, "(Lcom/withings/reminder/model/ReminderType;)V", "Lcom/withings/reminder/discovery/views/Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/withings/reminder/discovery/views/Listener;", "getListener", "()Lcom/withings/reminder/discovery/views/Listener;", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "titleTextView", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;Lcom/withings/reminder/discovery/views/Listener;)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class ReminderTypeViewHolder extends RecyclerView.z {
    public static final int $stable = 8;
    private ImageView imageView;
    private final Listener listener;
    private TextView titleTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderTypeViewHolder(View view, Listener listener) {
        super(view);
        u.j(view, "view");
        u.j(listener, "listener");
        this.listener = listener;
        this.titleTextView = (TextView) view.findViewById(R.id.title);
        this.imageView = (ImageView) view.findViewById(R.id.image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(ReminderTypeViewHolder this$0, ReminderType reminderType, View view) {
        u.j(this$0, "this$0");
        u.j(reminderType, "$reminderType");
        this$0.listener.onReminderTypeClicked(reminderType);
    }

    public final void bind(ReminderType reminderType) {
        u.j(reminderType, "reminderType");
        Context context = this.itemView.getContext();
        TextView textView = this.titleTextView;
        u.g(context);
        textView.setText(a.i(context, reminderType.getName()));
        int d11 = a.d(context, reminderType.getImage());
        ImageView imageView = this.imageView;
        u.i(imageView, "imageView");
        Integer valueOf = Integer.valueOf(d11);
        g a11 = w9.a.a(imageView.getContext());
        f.a aVar = new f.a(imageView.getContext());
        aVar.d(valueOf);
        aVar.q(imageView);
        a11.d(aVar.b());
        this.itemView.setOnClickListener(new k40.a(0, this, reminderType));
    }

    public final Listener getListener() {
        return this.listener;
    }
}
