package com.withings.zendesk.ui;

import android.view.View;
import androidx.activity.ComponentActivity;
import com.withings.zendesk.databinding.ActivityHelpCenterBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: ActivityViewBindings.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh9/a;", "T", "Landroidx/activity/ComponentActivity;", "activity", "invoke", "(Landroidx/activity/ComponentActivity;)Lh9/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HelpCenterActivity$special$$inlined$viewBindingActivity$1 extends w implements l<ComponentActivity, ActivityHelpCenterBinding> {
    final /* synthetic */ int $viewBindingRootId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterActivity$special$$inlined$viewBindingActivity$1(int i11) {
        super(1);
        this.$viewBindingRootId = i11;
    }

    @Override // ym0.l
    public final ActivityHelpCenterBinding invoke(ComponentActivity activity) {
        u.j(activity, "activity");
        View e11 = androidx.core.app.a.e(activity, this.$viewBindingRootId);
        u.i(e11, "requireViewById(this, id)");
        return ActivityHelpCenterBinding.bind(e11);
    }
}
