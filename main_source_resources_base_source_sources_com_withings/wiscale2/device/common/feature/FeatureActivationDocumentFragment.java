package com.withings.wiscale2.device.common.feature;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: FeatureActivationDocumentFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/FeatureActivationDocumentFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class FeatureActivationDocumentFragment extends r {

    /* renamed from: h  reason: collision with root package name */
    private ConstraintLayout f50863h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f50864i;

    /* renamed from: j  reason: collision with root package name */
    private ProgressBar f50865j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f50866k;

    /* renamed from: l  reason: collision with root package name */
    private a f50867l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public ch.d f50868m;

    /* renamed from: n  reason: collision with root package name */
    private final r8.g f50869n;

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f50870o;

    /* renamed from: p  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f50871p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f50872q;

    /* renamed from: r  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f50873r;

    /* compiled from: FeatureActivationDocumentFragment.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void F2();
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements ym0.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f50874a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f50874a = fragment;
        }

        @Override // ym0.a
        public final Bundle invoke() {
            Fragment fragment = this.f50874a;
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(androidx.fragment.app.o.c("Fragment ", fragment, " has null arguments"));
        }
    }

    /* compiled from: FeatureActivationDocumentFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<p> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final p invoke() {
            FeatureActivationDocumentFragment featureActivationDocumentFragment = FeatureActivationDocumentFragment.this;
            return (p) new k1(featureActivationDocumentFragment, new g(featureActivationDocumentFragment)).a(p.class);
        }
    }

    public FeatureActivationDocumentFragment() {
        super(C1987R.layout.fragment_device_feature_document);
        this.f50869n = new r8.g(q0.b(h.class), new b(this));
        this.f50870o = nm0.h.b(new c());
        this.f50871p = new androidx.constraintlayout.widget.b();
        this.f50872q = new androidx.constraintlayout.widget.b();
        this.f50873r = new androidx.constraintlayout.widget.b();
    }

    public static void s1(FeatureActivationDocumentFragment this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ((p) this$0.f50870o.getValue()).i0();
    }

    public static final h t1(FeatureActivationDocumentFragment featureActivationDocumentFragment) {
        return (h) featureActivationDocumentFragment.f50869n.getValue();
    }

    public static final void v1(FeatureActivationDocumentFragment featureActivationDocumentFragment) {
        featureActivationDocumentFragment.y1(false);
        TextView textView = featureActivationDocumentFragment.f50866k;
        if (textView != null) {
            textView.setText(featureActivationDocumentFragment.getString(C1987R.string.checkInternet_tryAgain));
            ConstraintLayout constraintLayout = featureActivationDocumentFragment.f50863h;
            if (constraintLayout != null) {
                androidx.transition.w.a(constraintLayout, null);
                ConstraintLayout constraintLayout2 = featureActivationDocumentFragment.f50863h;
                if (constraintLayout2 != null) {
                    featureActivationDocumentFragment.f50873r.e(constraintLayout2);
                    return;
                } else {
                    kotlin.jvm.internal.u.s("root");
                    throw null;
                }
            }
            kotlin.jvm.internal.u.s("root");
            throw null;
        }
        kotlin.jvm.internal.u.s("errorDescription");
        throw null;
    }

    public static final void w1(FeatureActivationDocumentFragment featureActivationDocumentFragment, Bitmap bitmap) {
        a aVar = featureActivationDocumentFragment.f50867l;
        if (aVar != null) {
            aVar.F2();
        }
        featureActivationDocumentFragment.y1(false);
        ImageView imageView = featureActivationDocumentFragment.f50864i;
        if (imageView != null) {
            imageView.setVisibility(0);
            ImageView imageView2 = featureActivationDocumentFragment.f50864i;
            if (imageView2 != null) {
                imageView2.setImageBitmap(bitmap);
                ConstraintLayout constraintLayout = featureActivationDocumentFragment.f50863h;
                if (constraintLayout != null) {
                    androidx.transition.w.a(constraintLayout, null);
                    ConstraintLayout constraintLayout2 = featureActivationDocumentFragment.f50863h;
                    if (constraintLayout2 != null) {
                        featureActivationDocumentFragment.f50872q.e(constraintLayout2);
                        return;
                    } else {
                        kotlin.jvm.internal.u.s("root");
                        throw null;
                    }
                }
                kotlin.jvm.internal.u.s("root");
                throw null;
            }
            kotlin.jvm.internal.u.s("documentPreview");
            throw null;
        }
        kotlin.jvm.internal.u.s("documentPreview");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1(boolean z5) {
        int i11;
        ProgressBar progressBar = this.f50865j;
        if (progressBar != null) {
            if (z5) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            progressBar.setVisibility(i11);
            return;
        }
        kotlin.jvm.internal.u.s("progressBar");
        throw null;
    }

    @Override // com.withings.wiscale2.device.common.feature.r, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f50867l = (a) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f50867l = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C1987R.id.root);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f50863h = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.title);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        r8.g gVar = this.f50869n;
        ((TextView) findViewById2).setText(((h) gVar.getValue()).b());
        View findViewById3 = view.findViewById(C1987R.id.description);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        ((TextView) findViewById3).setText(((h) gVar.getValue()).a());
        View findViewById4 = view.findViewById(C1987R.id.progress);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f50865j = (ProgressBar) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.error_description);
        kotlin.jvm.internal.u.i(findViewById5, "findViewById(...)");
        this.f50866k = (TextView) findViewById5;
        View findViewById6 = view.findViewById(C1987R.id.preview);
        kotlin.jvm.internal.u.i(findViewById6, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById6;
        this.f50864i = imageView;
        imageView.setOnClickListener(new com.google.android.material.search.g(this, 7));
        ConstraintLayout constraintLayout = this.f50863h;
        if (constraintLayout != null) {
            androidx.constraintlayout.widget.b bVar = this.f50871p;
            bVar.k(constraintLayout);
            androidx.constraintlayout.widget.b bVar2 = this.f50872q;
            bVar2.l(bVar);
            bVar2.Q(C1987R.id.preview, 0);
            bVar2.Q(C1987R.id.progress, 8);
            androidx.constraintlayout.widget.b bVar3 = this.f50873r;
            bVar3.l(bVar);
            bVar3.Q(C1987R.id.progress, 8);
            bVar3.Q(C1987R.id.preview, 0);
            bVar3.Q(C1987R.id.no_network, 0);
            p pVar = (p) this.f50870o.getValue();
            xw.d.c(this, pVar.g0(), new e(this));
            xw.d.c(this, pVar.f0(), new f(this));
            return;
        }
        kotlin.jvm.internal.u.s("root");
        throw null;
    }
}
