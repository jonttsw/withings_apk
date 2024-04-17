package com.withings.wiscale2.activity.workout.ui.detail;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
public final class r6 {

    /* renamed from: a  reason: collision with root package name */
    private final a f49591a;

    /* renamed from: b  reason: collision with root package name */
    private final View f49592b;

    /* renamed from: c  reason: collision with root package name */
    private final z5 f49593c;

    /* compiled from: WorkoutNotification.kt */
    /* loaded from: classes4.dex */
    public interface a {
        void h1(r6 r6Var, x5 x5Var);
    }

    /* compiled from: WorkoutNotification.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<x5, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(x5 x5Var) {
            x5 it = x5Var;
            kotlin.jvm.internal.u.j(it, "it");
            r6 r6Var = r6.this;
            a aVar = r6Var.f49591a;
            if (aVar != null) {
                aVar.h1(r6Var, it);
            }
            return nm0.y.f85009a;
        }
    }

    public r6(View view, a aVar) {
        kotlin.jvm.internal.u.j(view, "view");
        this.f49591a = aVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1987R.id.notification_list);
        this.f49592b = view.findViewById(C1987R.id.section_notifications);
        z5 z5Var = new z5(new b());
        this.f49593c = z5Var;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(z5Var);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
    }

    public final void b(List<? extends x5> notifications) {
        int i11;
        kotlin.jvm.internal.u.j(notifications, "notifications");
        View notificationSectionView = this.f49592b;
        kotlin.jvm.internal.u.i(notificationSectionView, "notificationSectionView");
        if (!notifications.isEmpty()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        notificationSectionView.setVisibility(i11);
        this.f49593c.e(notifications);
    }
}
