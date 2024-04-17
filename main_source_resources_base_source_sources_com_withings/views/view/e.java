package com.withings.views.view;

import android.content.Context;
import android.view.View;
import com.withings.user.User;
import com.withings.views.view.HorizontalSausageWithLegendsView;
import com.withings.wiscale2.activity.logging.ui.EditWorkoutActivity;
import com.withings.wiscale2.activity.workout.ui.detail.k5;
import com.withings.wiscale2.activity.workout.ui.detail.l7;
import com.withings.workout.category.model.WorkoutCategory;
import kotlin.jvm.internal.u;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f46755a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f46756b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f46757c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f46758d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i11) {
        this.f46755a = i11;
        this.f46756b = obj;
        this.f46757c = obj2;
        this.f46758d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f46755a;
        Object obj = this.f46758d;
        Object obj2 = this.f46757c;
        Object obj3 = this.f46756b;
        switch (i11) {
            case 0:
                HorizontalSausageWithLegendsView.t((HorizontalSausageWithLegendsView) obj3, (ExpandableLineCellView) obj2, (HorizontalSausageWithLegendsView.b) obj);
                return;
            default:
                l7 previewInfo = (l7) obj3;
                Context context = (Context) obj2;
                com.google.android.material.bottomsheet.k bottomSheetDialog = (com.google.android.material.bottomsheet.k) obj;
                int i12 = k5.f49366g;
                u.j(previewInfo, "$previewInfo");
                u.j(bottomSheetDialog, "$bottomSheetDialog");
                User i13 = m70.i.b().i(previewInfo.j().getUserId());
                int i14 = EditWorkoutActivity.S;
                u.g(context);
                u.g(i13);
                WorkoutCategory a11 = previewInfo.a();
                Long id2 = previewInfo.j().getId();
                u.g(id2);
                context.startActivity(EditWorkoutActivity.a.a(context, i13, a11, id2.longValue(), false));
                bottomSheetDialog.dismiss();
                return;
        }
    }
}
