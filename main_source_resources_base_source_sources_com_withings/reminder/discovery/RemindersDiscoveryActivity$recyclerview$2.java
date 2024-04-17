package com.withings.reminder.discovery;

import androidx.recyclerview.widget.RecyclerView;
import com.withings.reminder.R;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.a;
/* compiled from: RemindersDiscoveryActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RemindersDiscoveryActivity$recyclerview$2 extends w implements a<RecyclerView> {
    final /* synthetic */ RemindersDiscoveryActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemindersDiscoveryActivity$recyclerview$2(RemindersDiscoveryActivity remindersDiscoveryActivity) {
        super(0);
        this.this$0 = remindersDiscoveryActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final RecyclerView invoke() {
        return (RecyclerView) this.this$0.findViewById(R.id.reminder_categories_recyclerview);
    }
}
