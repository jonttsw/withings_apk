package com.withings.wiscale2.activity.workout.ui.detail;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* compiled from: WorkoutPhoto.kt */
/* loaded from: classes4.dex */
public final class b7 {

    /* renamed from: a  reason: collision with root package name */
    private final a f49136a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView f49137b;

    /* renamed from: c  reason: collision with root package name */
    private final c f49138c;

    /* compiled from: WorkoutPhoto.kt */
    /* loaded from: classes4.dex */
    public interface a {
        void B0(b7 b7Var);

        void G0(b7 b7Var, w0 w0Var, int i11);

        void I0(b7 b7Var, w0 w0Var);
    }

    public b7(LinearLayout linearLayout, a listener) {
        kotlin.jvm.internal.u.j(listener, "listener");
        this.f49136a = listener;
        RecyclerView recyclerView = (RecyclerView) linearLayout.findViewById(C1987R.id.photo_list);
        this.f49137b = recyclerView;
        c cVar = new c(new c7(this), new d7(this), new e7(this));
        this.f49138c = cVar;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(4));
        recyclerView.setAdapter(cVar);
    }

    public final a a() {
        return this.f49136a;
    }

    public final void b(List<? extends x0> photoItems) {
        kotlin.jvm.internal.u.j(photoItems, "photoItems");
        c cVar = this.f49138c;
        cVar.g(photoItems);
        this.f49137b.setAdapter(cVar);
    }
}
