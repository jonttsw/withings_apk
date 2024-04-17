package com.withings.wiscale2.partner.ui;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import tb0.t2;
/* compiled from: GoogleFitCompleteFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/partner/ui/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class h extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f59092d = {androidx.camera.core.v.c(h.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentGooglefitCompleteBinding;", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f59093e = 0;

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f59094c;

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<h, t2> {
        @Override // ym0.l
        public final t2 invoke(h hVar) {
            h fragment = hVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return t2.a(fragment.requireView());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public h() {
        super(C1987R.layout.fragment_googlefit_complete);
        this.f59094c = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        fn0.k<?>[] kVarArr = f59092d;
        fn0.k<?> kVar = kVarArr[0];
        LifecycleViewBindingProperty lifecycleViewBindingProperty = this.f59094c;
        ConstraintLayout b10 = ((t2) lifecycleViewBindingProperty.getValue(this, kVar)).b();
        kotlin.jvm.internal.u.i(b10, "getRoot(...)");
        ay.b.n(b10, false, true, 23);
        ((t2) lifecycleViewBindingProperty.getValue(this, kVarArr[0])).f99515b.setOnClickListener(new com.withings.alarm.ui.f(this, 13));
    }
}
