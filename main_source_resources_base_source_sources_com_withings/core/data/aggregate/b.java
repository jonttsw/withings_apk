package com.withings.core.data.aggregate;

import android.view.MenuItem;
import androidx.appcompat.widget.g0;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.user.User;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.ShareWithMyDoctorActivity;
import u70.h;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements h.a, g0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f35310a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f35311b;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f35310a = obj;
        this.f35311b = obj2;
    }

    @Override // u70.h.a
    public final void e(Object obj) {
        ActivityAggregateManager.update$lambda$2((User) this.f35310a, (ActivityAggregate) this.f35311b, (ActivityAggregateManager.Listener) obj);
    }

    @Override // androidx.appcompat.widget.g0.a
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ShareWithMyDoctorActivity.A3((ShareWithMyDoctorActivity) this.f35310a, (LineCellView) this.f35311b, menuItem);
        return true;
    }
}
