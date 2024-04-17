package com.withings.wiscale2.device.common.tutorial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
/* compiled from: Tutorial.kt */
/* loaded from: classes5.dex */
public final class a extends i {

    /* renamed from: b  reason: collision with root package name */
    private int f53540b;

    /* renamed from: c  reason: collision with root package name */
    private int f53541c;

    /* renamed from: d  reason: collision with root package name */
    private int f53542d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f53543e;

    /* renamed from: f  reason: collision with root package name */
    private final C0718a f53544f;

    /* compiled from: Tutorial.kt */
    /* renamed from: com.withings.wiscale2.device.common.tutorial.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static final class C0718a {

        /* renamed from: a  reason: collision with root package name */
        public ImageView f53545a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f53546b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f53547c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.withings.wiscale2.device.common.tutorial.a$a, java.lang.Object] */
    public a(int i11, int i12, int i13, int i14) {
        super(null);
        boolean z5;
        if ((i14 & 16) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f53540b = i11;
        this.f53541c = i12;
        this.f53542d = i13;
        this.f53543e = z5;
        this.f53544f = new Object();
    }

    @Override // com.withings.wiscale2.device.common.tutorial.i
    public final void a() {
        boolean z5 = this.f53543e;
        C0718a c0718a = this.f53544f;
        if (!z5) {
            ImageView imageView = c0718a.f53545a;
            if (imageView != null) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                u.s("imageView");
                throw null;
            }
        }
        ImageView imageView2 = c0718a.f53545a;
        if (imageView2 != null) {
            imageView2.setImageResource(this.f53540b);
            TextView textView = c0718a.f53546b;
            if (textView != null) {
                textView.setText(this.f53541c);
                TextView textView2 = c0718a.f53547c;
                if (textView2 != null) {
                    textView2.setText(this.f53542d);
                    return;
                } else {
                    u.s("descriptionView");
                    throw null;
                }
            }
            u.s("titleView");
            throw null;
        }
        u.s("imageView");
        throw null;
    }

    @Override // com.withings.wiscale2.device.common.tutorial.i
    public final View b(LayoutInflater inflater, ViewGroup viewGroup) {
        u.j(inflater, "inflater");
        View inflate = inflater.inflate(C1987R.layout.fragment_headered_tutorial, viewGroup, false);
        View findViewById = inflate.findViewById(C1987R.id.image);
        u.i(findViewById, "findViewById(...)");
        C0718a c0718a = this.f53544f;
        c0718a.getClass();
        c0718a.f53545a = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(C1987R.id.title);
        u.i(findViewById2, "findViewById(...)");
        c0718a.getClass();
        c0718a.f53546b = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C1987R.id.description);
        u.i(findViewById3, "findViewById(...)");
        c0718a.getClass();
        c0718a.f53547c = (TextView) findViewById3;
        return inflate;
    }
}
