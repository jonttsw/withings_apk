package com.withings.wiscale2.profile;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
/* compiled from: ProfileTargetView.kt */
/* loaded from: classes5.dex */
public final class h1 extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f59352a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f59353b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f59354c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f59355d;

    /* compiled from: ProfileTargetView.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f59356a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.f59356a = view;
        }

        @Override // ym0.a
        public final View invoke() {
            return this.f59356a.findViewById(C1987R.id.goal_cell_container);
        }
    }

    /* compiled from: ProfileTargetView.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<ImageView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f59357a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.f59357a = view;
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) this.f59357a.findViewById(C1987R.id.target_glyph);
        }
    }

    /* compiled from: ProfileTargetView.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f59358a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.f59358a = view;
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) this.f59358a.findViewById(C1987R.id.target_title);
        }
    }

    /* compiled from: ProfileTargetView.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f59359a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.f59359a = view;
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) this.f59359a.findViewById(C1987R.id.target_value);
        }
    }

    public h1(View view) {
        super(view);
        this.f59352a = nm0.h.b(new a(view));
        this.f59353b = nm0.h.b(new b(view));
        this.f59354c = nm0.h.b(new c(view));
        this.f59355d = nm0.h.b(new d(view));
    }

    public final View a() {
        return (View) this.f59352a.getValue();
    }

    public final ImageView b() {
        return (ImageView) this.f59353b.getValue();
    }

    public final TextView c() {
        return (TextView) this.f59354c.getValue();
    }

    public final TextView d() {
        return (TextView) this.f59355d.getValue();
    }
}
