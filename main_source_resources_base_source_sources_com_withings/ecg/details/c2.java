package com.withings.ecg.details;

import android.app.Dialog;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.withings.views.view.SectionView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: EcgOptionSheetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/ecg/details/c2;", "Lcom/google/android/material/bottomsheet/l;", "<init>", "()V", "a", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class c2 extends com.google.android.material.bottomsheet.l {

    /* renamed from: c  reason: collision with root package name */
    private View f38155c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f38156d = nm0.h.b(new c());

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f38157e = nm0.h.b(new b());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f38158f = nm0.h.b(new f());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f38159g = nm0.h.b(new e());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f38160h = nm0.h.b(new d());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f38161i = nm0.h.b(new g());

    /* renamed from: j  reason: collision with root package name */
    private a f38162j;

    /* compiled from: EcgOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void C0(c2 c2Var);

        void M0(c2 c2Var);
    }

    /* compiled from: EcgOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            View view = c2.this.f38155c;
            if (view != null) {
                return (LineCellView) view.findViewById(C1987R.id.dialog_debug_compute_ecg_lib);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: EcgOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            View view = c2.this.f38155c;
            if (view != null) {
                return (LineCellView) view.findViewById(C1987R.id.dialog_ecg_delete);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: EcgOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<ComposeView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final ComposeView invoke() {
            View view = c2.this.f38155c;
            if (view != null) {
                return (ComposeView) view.findViewById(C1987R.id.dialog_ecg_articles_container);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: EcgOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<SectionView> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final SectionView invoke() {
            View view = c2.this.f38155c;
            if (view != null) {
                return (SectionView) view.findViewById(C1987R.id.ecg_learn_more_section_view);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: EcgOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<View> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            View view = c2.this.f38155c;
            if (view != null) {
                return view.findViewById(C1987R.id.section_view_divider);
            }
            kotlin.jvm.internal.u.s("contentView");
            throw null;
        }
    }

    /* compiled from: EcgOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(yq.b.a(c2.this).getBoolean("with_delete"));
        }
    }

    public static void s1(c2 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        a aVar = this$0.f38162j;
        if (aVar != null) {
            aVar.M0(this$0);
        }
    }

    public static void t1(c2 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        a aVar = this$0.f38162j;
        if (aVar != null) {
            aVar.C0(this$0);
        }
    }

    public static final ComposeView v1(c2 c2Var) {
        return (ComposeView) c2Var.f38160h.getValue();
    }

    public static final SectionView w1(c2 c2Var) {
        return (SectionView) c2Var.f38159g.getValue();
    }

    public static final View x1(c2 c2Var) {
        return (View) c2Var.f38158f.getValue();
    }

    @Override // androidx.appcompat.app.u, androidx.fragment.app.m
    public final void setupDialog(Dialog dialog, int i11) {
        int i12;
        kotlin.jvm.internal.u.j(dialog, "dialog");
        super.setupDialog(dialog, i11);
        View inflate = View.inflate(getContext(), C1987R.layout.dialog_ecg, null);
        kotlin.jvm.internal.u.i(inflate, "inflate(...)");
        this.f38155c = inflate;
        dialog.setContentView(inflate);
        nm0.g gVar = this.f38156d;
        LineCellView lineCellView = (LineCellView) gVar.getValue();
        kotlin.jvm.internal.u.i(lineCellView, "<get-deleteSignal>(...)");
        if (((Boolean) this.f38161i.getValue()).booleanValue()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        lineCellView.setVisibility(i12);
        ((LineCellView) gVar.getValue()).setOnClickListener(new vn.d(this, 1));
        if (androidx.compose.foundation.lazy.layout.d.h()) {
            nm0.g gVar2 = this.f38157e;
            LineCellView lineCellView2 = (LineCellView) gVar2.getValue();
            kotlin.jvm.internal.u.i(lineCellView2, "<get-computeEcgDiagnosticForDebugButton>(...)");
            lineCellView2.setVisibility(0);
            ((LineCellView) gVar2.getValue()).setOnClickListener(new io.j(this, 1));
        }
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new f2(this, null), 3, null);
    }

    public final void y1(a aVar) {
        this.f38162j = aVar;
    }
}
