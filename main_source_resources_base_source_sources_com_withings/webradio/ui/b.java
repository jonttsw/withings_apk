package com.withings.webradio.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.withings.features.platform.api.PlatformFeatureHelper;
import com.withings.user.User;
import com.withings.webradio.ui.WsdWebRadioViewHolder;
import com.withings.wiscale2.dashboard.item.FoodSummaryView;
import com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.e;
import com.withings.wiscale2.food.ui.display.FoodActivity;
import com.withings.wiscale2.measure.accountmeasure.unknown.ui.j;
import com.withings.wiscale2.measure.accountmeasure.unknown.ui.k;
import kotlin.jvm.internal.u;
import tb0.v1;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f46844a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f46845b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f46846c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f46844a = i11;
        this.f46845b = obj;
        this.f46846c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f46844a;
        Object obj = this.f46846c;
        Object obj2 = this.f46845b;
        switch (i11) {
            case 0:
                ((WsdWebRadioViewHolder) obj2).lambda$setListener$0((WsdWebRadioViewHolder.Listener) obj, view);
                return;
            case 1:
                FoodSummaryView this$0 = (FoodSummaryView) obj2;
                User user = (User) obj;
                int i12 = FoodSummaryView.P;
                u.j(this$0, "this$0");
                u.j(user, "$user");
                Context context = this$0.getContext();
                FoodActivity.Companion companion = FoodActivity.Companion;
                Context context2 = this$0.getContext();
                u.i(context2, "getContext(...)");
                context.startActivity(FoodActivity.Companion.createIntent$default(companion, context2, user, null, 4, null));
                return;
            case 2:
                ld0.b.W1((PlatformFeatureHelper.RespiratoryScanState) obj2, (ld0.b) obj, view);
                return;
            case 3:
                com.withings.wiscale2.device.wam02.ui.b.t1((com.withings.wiscale2.device.wam02.ui.b) obj2, (v1) obj);
                return;
            case 4:
                e.s1((e) obj2, (ImageView) obj);
                return;
            default:
                j.a callback = (j.a) obj2;
                User user2 = (User) obj;
                int i13 = k.f58362b;
                u.j(callback, "$callback");
                u.j(user2, "$user");
                callback.G2(user2);
                return;
        }
    }
}
