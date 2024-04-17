package com.withings.wiscale2.measure.list;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.views.view.SectionView;
import com.withings.wiscale2.C1987R;
/* compiled from: MeasureListActivity.kt */
/* loaded from: classes5.dex */
final class j extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final SectionView f58559a;

    /* renamed from: b  reason: collision with root package name */
    private final View f58560b;

    public j(View view) {
        super(view);
        View findViewById = view.findViewById(C1987R.id.section);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f58559a = (SectionView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.separator);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f58560b = findViewById2;
    }

    public final void a(String title) {
        kotlin.jvm.internal.u.j(title, "title");
        this.f58559a.setTitle(title);
    }

    public final void b(boolean z5) {
        int i11;
        if (!z5) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        this.f58560b.setVisibility(i11);
    }
}
