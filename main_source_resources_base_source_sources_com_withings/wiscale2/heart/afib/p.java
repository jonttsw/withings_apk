package com.withings.wiscale2.heart.afib;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
/* compiled from: AFibMeasurements.kt */
/* loaded from: classes5.dex */
public final class p extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final View f57221a;

    /* renamed from: b  reason: collision with root package name */
    private final View f57222b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f57223c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f57224d;

    /* renamed from: e  reason: collision with root package name */
    private final ImageView f57225e;

    public p(View view) {
        super(view);
        this.f57221a = view;
        View findViewById = view.findViewById(C1987R.id.circle);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f57222b = findViewById;
        View findViewById2 = view.findViewById(C1987R.id.status);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f57223c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.date);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f57224d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.value);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        TextView textView = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.check);
        kotlin.jvm.internal.u.i(findViewById5, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(C1987R.id.indicator);
        kotlin.jvm.internal.u.i(findViewById6, "findViewById(...)");
        this.f57225e = (ImageView) findViewById6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0075, code lost:
        if (r10 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(ky.d r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.afib.p.a(ky.d, boolean):void");
    }
}
