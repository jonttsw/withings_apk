package com.withings.ecg.heartsound;

import android.app.Dialog;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.withings.views.view.SectionView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: HeartSoundOptionSheetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/ecg/heartsound/p0;", "Lcom/google/android/material/bottomsheet/l;", "<init>", "()V", "a", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class p0 extends com.google.android.material.bottomsheet.l {

    /* renamed from: c  reason: collision with root package name */
    private View f38493c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f38494d = nm0.h.b(new b());

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f38495e = nm0.h.b(new e());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f38496f = nm0.h.b(new d());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f38497g = nm0.h.b(new c());

    /* renamed from: h  reason: collision with root package name */
    private a f38498h;

    /* compiled from: HeartSoundOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void B(p0 p0Var);
    }

    /* compiled from: HeartSoundOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            View view = p0.this.f38493c;
            if (view != null) {
                return (LineCellView) view.findViewById(C1987R.id.dialog_heart_sound_delete);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: HeartSoundOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<ComposeView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final ComposeView invoke() {
            View view = p0.this.f38493c;
            if (view != null) {
                return (ComposeView) view.findViewById(C1987R.id.dialog_heart_sound_articles_container);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: HeartSoundOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<SectionView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final SectionView invoke() {
            View view = p0.this.f38493c;
            if (view != null) {
                return (SectionView) view.findViewById(C1987R.id.heart_sound_learn_more_section_view);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: HeartSoundOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<View> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            View view = p0.this.f38493c;
            if (view != null) {
                return view.findViewById(C1987R.id.section_view_divider);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    public static void s1(p0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        a aVar = this$0.f38498h;
        if (aVar != null) {
            aVar.B(this$0);
        }
    }

    public static final ComposeView u1(p0 p0Var) {
        return (ComposeView) p0Var.f38497g.getValue();
    }

    public static final SectionView v1(p0 p0Var) {
        return (SectionView) p0Var.f38496f.getValue();
    }

    public static final View w1(p0 p0Var) {
        return (View) p0Var.f38495e.getValue();
    }

    @Override // androidx.appcompat.app.u, androidx.fragment.app.m
    public final void setupDialog(Dialog dialog, int i11) {
        kotlin.jvm.internal.u.j(dialog, "dialog");
        super.setupDialog(dialog, i11);
        View inflate = View.inflate(getContext(), C1987R.layout.dialog_heart_sound, null);
        kotlin.jvm.internal.u.i(inflate, "inflate(...)");
        this.f38493c = inflate;
        dialog.setContentView(inflate);
        ((LineCellView) this.f38494d.getValue()).setOnClickListener(new gi.f(this, 4));
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new s0(this, null), 3, null);
    }

    public final void x1(a aVar) {
        this.f38498h = aVar;
    }
}
