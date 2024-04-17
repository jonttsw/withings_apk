package com.withings.wiscale2.activity.workout.ui.detail;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
/* compiled from: AllWorkoutsActivity.kt */
/* loaded from: classes4.dex */
public final class m1 extends RecyclerView.z {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f49433c = 0;

    /* renamed from: a  reason: collision with root package name */
    private final TextView f49434a;

    /* renamed from: b  reason: collision with root package name */
    private final View f49435b;

    public m1(View view) {
        super(view);
        View findViewById = view.findViewById(C1987R.id.section_title);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f49434a = (TextView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.divider);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f49435b = findViewById2;
    }

    public final void a(sg0.a aVar, boolean z5) {
        int i11;
        if (!aVar.b() && !z5) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        this.f49435b.setVisibility(i11);
        this.f49434a.setText(aVar.a());
    }
}
