package com.withings.wiscale2.device.wpm.ui;

import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
/* compiled from: PickExistingUserFragment.kt */
/* loaded from: classes5.dex */
final class e extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f55732a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f55733b;

    /* compiled from: PickExistingUserFragment.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<ComposeView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f55734a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.f55734a = view;
        }

        @Override // ym0.a
        public final ComposeView invoke() {
            return (ComposeView) this.f55734a.findViewById(C1987R.id.image);
        }
    }

    /* compiled from: PickExistingUserFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f55735a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.f55735a = view;
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) this.f55735a.findViewById(C1987R.id.name);
        }
    }

    public e(View view) {
        super(view);
        this.f55732a = nm0.h.b(new a(view));
        this.f55733b = nm0.h.b(new b(view));
    }

    public final ComposeView a() {
        return (ComposeView) this.f55732a.getValue();
    }

    public final TextView b() {
        return (TextView) this.f55733b.getValue();
    }
}
