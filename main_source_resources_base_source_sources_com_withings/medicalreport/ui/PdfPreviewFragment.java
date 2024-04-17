package com.withings.medicalreport.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.withings.medicalreport.ui.f0;
import com.withings.webservices.legacy.common.exception.TooManyRequestException;
import com.withings.webservices.legacy.common.exception.UnspecifiedException;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import retrofit.RetrofitError;
/* compiled from: PdfPreviewFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/medicalreport/ui/PdfPreviewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "medicalreport_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PdfPreviewFragment extends p {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f42193u = 0;

    /* renamed from: h  reason: collision with root package name */
    private ConstraintLayout f42194h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f42195i;

    /* renamed from: j  reason: collision with root package name */
    private ProgressBar f42196j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f42197k;
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public ch.d f42198l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public a0 f42199m;
    @Inject

    /* renamed from: n  reason: collision with root package name */
    public m70.i f42200n;

    /* renamed from: o  reason: collision with root package name */
    private final r8.g f42201o;

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f42202p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f42203q;

    /* renamed from: r  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f42204r;

    /* renamed from: s  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f42205s;

    /* renamed from: t  reason: collision with root package name */
    private a f42206t;

    /* compiled from: PdfPreviewFragment.kt */
    /* loaded from: classes4.dex */
    public interface a {
        void B0();

        void e0();
    }

    /* compiled from: PdfPreviewFragment.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<f0, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(f0 f0Var) {
            f0 pdfData = f0Var;
            kotlin.jvm.internal.u.j(pdfData, "pdfData");
            boolean z5 = pdfData instanceof f0.b;
            PdfPreviewFragment pdfPreviewFragment = PdfPreviewFragment.this;
            if (z5) {
                pdfPreviewFragment.x1(true);
            } else if (pdfData instanceof f0.c) {
                PdfPreviewFragment.v1(pdfPreviewFragment, ((f0.c) pdfData).a());
            } else if (pdfData instanceof f0.a) {
                PdfPreviewFragment.u1(pdfPreviewFragment, ((f0.a) pdfData).a());
            }
            ImageView imageView = pdfPreviewFragment.f42195i;
            if (imageView != null) {
                imageView.setEnabled(pdfData instanceof f0.c);
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("bitmapPdfView");
            throw null;
        }
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f42208a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f42208a = fragment;
        }

        @Override // ym0.a
        public final Bundle invoke() {
            Fragment fragment = this.f42208a;
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(androidx.fragment.app.o.c("Fragment ", fragment, " has null arguments"));
        }
    }

    /* compiled from: PdfPreviewFragment.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<z> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final z invoke() {
            PdfPreviewFragment pdfPreviewFragment = PdfPreviewFragment.this;
            a0 a0Var = pdfPreviewFragment.f42199m;
            if (a0Var != null) {
                m70.i iVar = pdfPreviewFragment.f42200n;
                if (iVar != null) {
                    return a0Var.a(iVar.e().q(), PdfPreviewFragment.s1(pdfPreviewFragment).a(), PdfPreviewFragment.s1(pdfPreviewFragment).c(), PdfPreviewFragment.s1(pdfPreviewFragment).b());
                }
                kotlin.jvm.internal.u.s("userManager");
                throw null;
            }
            kotlin.jvm.internal.u.s("viewModelFactory");
            throw null;
        }
    }

    public PdfPreviewFragment() {
        super(C1987R.layout.fragment_pdf_preview);
        this.f42201o = new r8.g(q0.b(v.class), new c(this));
        this.f42202p = nm0.h.b(new d());
        this.f42203q = new androidx.constraintlayout.widget.b();
        this.f42204r = new androidx.constraintlayout.widget.b();
        this.f42205s = new androidx.constraintlayout.widget.b();
    }

    public static final v s1(PdfPreviewFragment pdfPreviewFragment) {
        return (v) pdfPreviewFragment.f42201o.getValue();
    }

    public static final void u1(PdfPreviewFragment pdfPreviewFragment, Exception exc) {
        int i11;
        pdfPreviewFragment.x1(false);
        TextView textView = pdfPreviewFragment.f42197k;
        if (textView != null) {
            if ((exc instanceof RetrofitError) && ((RetrofitError) exc).getKind() == RetrofitError.Kind.NETWORK) {
                i11 = C1987R.string.profile_medicalReport_reviewScreen_noConnectivityAlertDescription;
            } else if (exc instanceof UnspecifiedException) {
                i11 = C1987R.string.profile_medicalReport_reviewScreen_generationFailureAlertDescription;
            } else if (exc instanceof TooManyRequestException) {
                i11 = C1987R.string._NETWORK_ERROR_;
            } else {
                i11 = C1987R.string.profile_medicalReport_reviewScreen_generationFailureTooLongDescription;
            }
            textView.setText(i11);
            ConstraintLayout constraintLayout = pdfPreviewFragment.f42194h;
            if (constraintLayout != null) {
                androidx.transition.w.a(constraintLayout, null);
                ConstraintLayout constraintLayout2 = pdfPreviewFragment.f42194h;
                if (constraintLayout2 != null) {
                    pdfPreviewFragment.f42205s.e(constraintLayout2);
                    a aVar = pdfPreviewFragment.f42206t;
                    if (aVar != null) {
                        aVar.B0();
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.u.s("root");
                throw null;
            }
            kotlin.jvm.internal.u.s("root");
            throw null;
        }
        kotlin.jvm.internal.u.s("errorDescription");
        throw null;
    }

    public static final void v1(PdfPreviewFragment pdfPreviewFragment, Bitmap bitmap) {
        pdfPreviewFragment.x1(false);
        ImageView imageView = pdfPreviewFragment.f42195i;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
            ConstraintLayout constraintLayout = pdfPreviewFragment.f42194h;
            if (constraintLayout != null) {
                androidx.transition.w.a(constraintLayout, null);
                ConstraintLayout constraintLayout2 = pdfPreviewFragment.f42194h;
                if (constraintLayout2 != null) {
                    pdfPreviewFragment.f42204r.e(constraintLayout2);
                    a aVar = pdfPreviewFragment.f42206t;
                    if (aVar != null) {
                        aVar.e0();
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.u.s("root");
                throw null;
            }
            kotlin.jvm.internal.u.s("root");
            throw null;
        }
        kotlin.jvm.internal.u.s("bitmapPdfView");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(boolean z5) {
        int i11;
        ProgressBar progressBar = this.f42196j;
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

    @Override // com.withings.medicalreport.ui.p, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f42206t = (a) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f42206t = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C1987R.id.root);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f42194h = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.pdf);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f42195i = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.progress);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f42196j = (ProgressBar) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.error_description);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f42197k = (TextView) findViewById4;
        ConstraintLayout constraintLayout = this.f42194h;
        if (constraintLayout != null) {
            androidx.constraintlayout.widget.b bVar = this.f42203q;
            bVar.k(constraintLayout);
            androidx.constraintlayout.widget.b bVar2 = this.f42204r;
            bVar2.l(bVar);
            bVar2.Q(C1987R.id.pdf, 0);
            bVar2.Q(C1987R.id.progress, 8);
            androidx.constraintlayout.widget.b bVar3 = this.f42205s;
            bVar3.l(bVar);
            bVar3.Q(C1987R.id.progress, 8);
            bVar3.Q(C1987R.id.pdf, 0);
            bVar3.Q(C1987R.id.no_network, 0);
            xw.d.c(this, ((z) this.f42202p.getValue()).j0(), new b());
            ImageView imageView = this.f42195i;
            if (imageView != null) {
                imageView.setOnClickListener(new androidx.media3.ui.i(this, 5));
                return;
            } else {
                kotlin.jvm.internal.u.s("bitmapPdfView");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("root");
        throw null;
    }
}
